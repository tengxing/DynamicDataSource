package cn.yjxxclub.demo.datasource;

import cn.yjxxclub.demo.datasource.controller.ApiController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 *
 */
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class App implements CommandLineRunner
{
    @Autowired
    ApiController apiController;
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
        System.out.println( "Hello World!" );
    }

    @Override
    public void run(String... strings) throws Exception {
        apiController.getDs1();
        apiController.getDs2();
    }
}
