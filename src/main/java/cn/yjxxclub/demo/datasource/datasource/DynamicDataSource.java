package cn.yjxxclub.demo.datasource.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-11-2
 * Time: 下午2:56
 * Describe: 动态数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    private static final Logger log = LoggerFactory.getLogger(DynamicDataSource.class);

    /**
     * 返回需要使用的DataSource的key值，然后根据这个key从resolvedDataSources这
     * 个map里取出对应的DataSource，如果找不到，则用默认的resolvedDefaultDataSource。
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        log.debug("数据源为===>{}", DataSourceContextHolder.getDB());
        return DataSourceContextHolder.getDB();
    }
}
