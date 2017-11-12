package cn.yjxxclub.demo.datasource.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-11-2
 * Time: 下午2:56
 * Describe: DataSource ContextHolder
 */
public class DataSourceContextHolder {
    public static final Logger log = LoggerFactory.getLogger(DataSourceContextHolder.class);

    /**
     * 默认数据源名称
     */
    public static final String DEFAULT_DS = "dataSource1";

    // 数据源标识保存在线程变量中，避免多线程操作数据源时互相干扰
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    // 设置数据源标识
    public static void setDB(String dbType) {
        Assert.notNull(dbType, "dbType cannot be null");
        log.debug("切换到{}数据源", dbType);
        contextHolder.set(dbType);
    }

    // 获取数据源标识
    public static String getDB() {
        return (contextHolder.get());
    }

    // 清除数据源标识
    public static void clearDB() {
        contextHolder.remove();
    }
}
