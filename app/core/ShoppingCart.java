package core;

import core.gdsbookingengine.FlightRequestEnvelopeInterface;
import core.gdsbookingengine.PricedItineraryWSResponse;
import core.security.Auth;
import models.CartAttr;
import models.Users;
import play.cache.Cache;
import play.libs.Json;
import play.mvc.Http;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 12/01/2016 3:47 PM
 * |
 **/
public class ShoppingCart {

    public enum ItemForCart {
        flight,
        hotel,
        flight_product
    }

    public List<FlightRequestEnvelopeInterface> flightRequestEnvelope;

    public List<Carts> cartItems;

    private String SEARCH_ITEM_KEY;

    private String CART_ITEM_KEY;

    private static ShoppingCart shoppingCart;

    private static Users users = Auth.user();

    private Http.Cookie cookies;

    private ShoppingCart(Http.Request request) {
        cookies = request.cookie(Cookies.COOKIE_NAME);
        String uniqueCookieId = "";
        if (cookies != null) {
            uniqueCookieId = cookies.value();
        }
        SEARCH_ITEM_KEY = uniqueCookieId.concat("_search_item");
        CART_ITEM_KEY = uniqueCookieId.concat("_cart_item");
        if (Cache.get(SEARCH_ITEM_KEY) == null || Cache.get(SEARCH_ITEM_KEY) instanceof NullPointerException) {
            Cache.set(SEARCH_ITEM_KEY, new ArrayList<>());
        }
        if (Cache.get(CART_ITEM_KEY) == null || Cache.get(CART_ITEM_KEY) instanceof NullPointerException) {
            Cache.set(CART_ITEM_KEY, new ArrayList<>());
        }
        flightRequestEnvelope = (List<FlightRequestEnvelopeInterface>) Cache.get(SEARCH_ITEM_KEY);
        cartItems = (List<Carts>) Cache.get(CART_ITEM_KEY);
    }

    public static ShoppingCart getInstance(Http.Request request) {
        shoppingCart = new ShoppingCart(request);
        return shoppingCart;
    }

    public void saveFlightSearch(final FlightRequestEnvelopeInterface search) {
        //save the search in a cache using the cookie
        flightRequestEnvelope.add(search);
    }

    public List<FlightRequestEnvelopeInterface> getSaveFlightSearch() {
//        if (Cache.get(SEARCH_ITEM_KEY) == null || Cache.get(SEARCH_ITEM_KEY) instanceof NullPointerException) {
//            return new ArrayList<>();
//        }
//        Collections.reverse(flightRequestEnvelope);
//        if (flightRequestEnvelope.size() != 0) {
//            return Arrays.asList(new FlightRequestEnvelopeInterface[5]);
//        }
        return flightRequestEnvelope;
    }

    public void saveFlightToCart(final PricedItineraryWSResponse itineraryWSResponseInterface, String index, Map postRequestValue, Http.Request request) {
//        //wrap everything in a promise
        Carts cartModel = new Carts();
        cartModel.cart_item = ItemForCart.flight.name();
        cartModel.user_cookie_id = cookies.value();
        cartModel.session_uid = Auth.user();
        cartModel.id = itineraryWSResponseInterface.getCacheIndex();
        cartModel.itemUri = request.uri();

        CartAttr attrItinerary = new CartAttr();
        attrItinerary.attribute = CartAttr.Attr.itinerary.name();
        attrItinerary.value = "" + Json.toJson(itineraryWSResponseInterface);

        CartAttr attrIndex = new CartAttr();
        attrIndex.attribute = CartAttr.Attr.item_index.name();
        attrIndex.value = index;

        CartAttr attrData = new CartAttr();
        attrData.attribute = CartAttr.Attr.post_data.name();
        attrData.value = "" + Json.toJson(postRequestValue);

        cartModel.cartAttrs.add(attrItinerary);
        cartModel.cartAttrs.add(attrIndex);
        cartModel.cartAttrs.add(attrData);

        cartItems.add(cartModel);

        //set the content into the cache for 10Hrs.
        if (!isExistInCart(cartModel)) {
            Cache.set(CART_ITEM_KEY, cartItems, Long.bitCount(TimeUnit.MINUTES.toMinutes(20)));
        }
    }

    public boolean isExistInCart(Carts carts) {
        for (Carts cacheItem : cartItems) {
            if(Objects.equals(cacheItem.hashCode(), carts.hashCode())) {
                return true;
            }
        }
        return false;
    }

    public List<Carts> getCartItem() {
        if (Cache.get(CART_ITEM_KEY) == null || cartItems instanceof NullPointerException) {
            return new ArrayList<>();
        }
        return cartItems;
    }

    public void removeFromCart(int index) {
        flightRequestEnvelope.remove(index);
    }

    public void clearUserCart() {
        Cache.remove(CART_ITEM_KEY);
        Cache.remove(SEARCH_ITEM_KEY);
    }
}
