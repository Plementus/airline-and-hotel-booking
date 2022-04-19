package core;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 09/03/2016 10:30 AM
 * |
 **/
public class PaginationException extends Exception {

    public PaginationException(String s) throws PaginationException {
        super();
        throw new PaginationException(s);
    }
}