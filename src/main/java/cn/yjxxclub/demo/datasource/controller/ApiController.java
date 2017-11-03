package cn.yjxxclub.demo.datasource.controller;

import cn.yjxxclub.demo.datasource.dao.db1.SingerMapper;
import cn.yjxxclub.demo.datasource.dao.db2.BookMapper;
import cn.yjxxclub.demo.datasource.datasource.DB;
import cn.yjxxclub.demo.datasource.model.Book;
import cn.yjxxclub.demo.datasource.model.Singer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-11-1
 * Time: 下午10:07
 * Describe: Api Controller
 */
@Controller
@RequestMapping
public class ApiController {
    final static Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    BookMapper bookMapper;

    @Autowired
    SingerMapper singerMapper;


    public Object getDs1(){

        Singer singer = singerMapper.findByName("陈奕迅");
        logger.info("/n"+singer);
        return null;
    }

    @DB("ds2")
    public Object getDs2(){
        Book book = bookMapper.findById(bookMapper.list().get(0).getId());
        logger.info(book+"/n");
        return null;
    }
}
