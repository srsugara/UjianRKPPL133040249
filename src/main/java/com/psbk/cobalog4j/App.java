package com.psbk.cobalog4j;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger=Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.debug("Ini adalah debug message");
        System.out.println("Debug message telah dijalankan");
        
        logger.info("Ini adalah info message");
        System.out.println("Info message telah dijalankan");
                
        logger.fatal("Ini adalah fatal message");
        System.out.println("Fatal message telah dijalankan");
        
        logger.warn("Ini adalah warn message");
        System.out.println("Warn message telah dijalankan");
        
        logger.error("Ini adalah error message");
        System.out.println("Error message telah dijalankan");
        
        System.out.println("Untuk cara menampilkannya saya menyerah kang untuk kali ini...");
    }
}
