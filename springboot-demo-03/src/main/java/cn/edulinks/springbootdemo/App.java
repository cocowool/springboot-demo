package cn.edulinks.springbootdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{

    private static final Logger LOG = LoggerFactory.getLogger(App.class);

//    @Override
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LOG.debug("this is debug message ... ");

    }
}
