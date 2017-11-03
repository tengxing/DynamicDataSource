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
 * Describe:
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    private static final Logger log = LoggerFactory.getLogger(DynamicDataSource.class);

    @Override
    protected Object determineCurrentLookupKey() {
        log.debug("数据源为{}", DataSourceContextHolder.getDB());

        return DataSourceContextHolder.getDB();
    }
}
