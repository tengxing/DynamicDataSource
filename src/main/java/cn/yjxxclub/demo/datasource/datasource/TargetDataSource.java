package cn.yjxxclub.demo.datasource.datasource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-11-2
 * Time: 下午3:00
 * Describe: @annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface TargetDataSource {
    String value() default "dataSource1";
}