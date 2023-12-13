package cn.edulinks.springbootdemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LOG.debug("this is debug message ... ");
        LOG.info("this is debug message ... ");
        System.out.println( "Hello World Again!" );

    }
}
