package cn.yjxxclub.demo.datasource.dao.db2;


import cn.yjxxclub.demo.datasource.model.Book;

import java.util.List;

/**
 * Author: 遇见小星
 * Email: tengxing7452@163.com
 * Date: 17-5-12
 * Time: 下午3:54
 * Describe: mapper接口
 */
public interface BookMapper {

    /**
     * 所有书籍
     * @return
     */
    List<Book> list();

    /**
     *  增加书籍
     * @param book
     * @return
     */
    Integer add(Book book);

    /**
     * 修改书籍
     * @param book
     * @return
     */
    Integer update(Book book);

    /**
     * 删除书籍通过id
     * @param id
     * @return
     */
    Integer deleteById(Integer id);

    /**
     * 通过id 找书籍
     * @param id
     * @return
     */
    Book findById(Integer id);
}
