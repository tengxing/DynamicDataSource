package cn.yjxxclub.demo.datasource.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Author: Starry.Teng
 * Email: tengxing7452@163.com
 * Date: 17-11-2
 * Time: 下午3:01
 * Describe: 动态数据源代理类
 */
@Aspect
@Component
@Order(value=-1)
public class DynamicDataSourceAspect {

    /**
     * 定义拦截规则
     */
    @Pointcut("within(cn.yjxxclub.demo.datasource.controller.*)")
    public void pointCut(){}

    /**
     * 基于java反射机制实现
     * @param point
     */
    //@Before("@annotation(TargetDataSource)") 这样注解在类上会扫描不到
    @Before("pointCut()")
    public void beforeDynamicDataSource(JoinPoint point){
        /*类*/
        Class<?> targetClass = point.getTarget().getClass();
        /*方法名*/
        String methodName = point.getSignature().getName();
        /*方法的参数的类型*/
        Class[] parameterTypes = ((MethodSignature)point.getSignature()).getParameterTypes();

        String dataSourceType = DataSourceContextHolder.DEFAULT_DS;
        try {
            /*默认使用类型注解*/
            if (targetClass.isAnnotationPresent(TargetDataSource.class)) {
                TargetDataSource annotation = targetClass.getAnnotation(TargetDataSource.class);
                dataSourceType = annotation.value();
            }
            /*由方法名和参数获取该类下的目标方法对象 */
            Method method = targetClass.getMethod(methodName, parameterTypes);
            /*方法注解可以覆盖类型注解*/
            if (method!=null && method.isAnnotationPresent(TargetDataSource.class)) {
                TargetDataSource annotation = method.getAnnotation(TargetDataSource.class);
                dataSourceType = annotation.value();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*切换数据源*/
        DataSourceContextHolder.setDataSource(dataSourceType);

    }

    /**
     * 使用完后清理
     * @param point
     */
    @After("pointCut()")
    public void afterDynamicDataSource(JoinPoint point){
        DataSourceContextHolder.clearDataSource();
    }
}
