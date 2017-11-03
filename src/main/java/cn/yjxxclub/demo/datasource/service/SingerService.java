package cn.yjxxclub.demo.datasource.service;

import cn.yjxxclub.demo.datasource.model.Singer;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-11-2
 * Time: 下午4:08
 * Describe:SingerService
 */
public interface SingerService {
    Singer findByName(String name);
}
