package core.crud;

import play.mvc.Result;

/**
 * |
 * | Created by Ibrahim Olanrewaju.
 * | On 11/7/15 11:44 PM
 * |
 **/

public interface CRUDMethodInterface {

    public Result getIndex();

    public Result getCreate(Long id);

    public Result postCreate();

    public Result postDelete(Long id);
}
