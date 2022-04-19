package core.gdsbookingengine.booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookingResponse {
    private List<PriceQuote> priceQuotes = new ArrayList<>();
    private PriceComparison priceComparison;
    private List<ReservationItem> reservationItems = new ArrayList<>();

    public List<PriceQuote> getPriceQuotes() {
        return priceQuotes;
    }

    public List<ReservationItem> getReservationItems() {
        return reservationItems;
    }

    public PriceComparison getPriceComparison() {
        return priceComparison;
    }

    public void setPriceComparison(PriceComparison priceComparison) {
        this.priceComparison = priceComparison;
    }

    @Override
    public String toString() {
        return "BookingResponse{" +
                "priceQuotes=" + priceQuotes +
                ", priceComparison=" + priceComparison +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingResponse that = (BookingResponse) o;
        return Objects.equals(priceQuotes, that.priceQuotes) &&
                Objects.equals(priceComparison, that.priceComparison) &&
                Objects.equals(reservationItems, that.reservationItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceQuotes, priceComparison, reservationItems);
    }
}
