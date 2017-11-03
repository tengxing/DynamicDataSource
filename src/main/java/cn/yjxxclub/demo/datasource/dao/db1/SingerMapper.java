package cn.yjxxclub.demo.datasource.dao.db1;

import cn.yjxxclub.demo.datasource.model.Singer;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-11-1
 * Time: 下午10:23
 * Describe:
 */
public interface SingerMapper {
    Singer findByName(String name);
}
