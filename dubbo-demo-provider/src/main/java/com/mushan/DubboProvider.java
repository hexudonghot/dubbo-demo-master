package com.mushan;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/1/16.
 */
public class DubboProvider {

    private static final Log log = LogFactory.getLog(DubboProvider.class);

    public static void main(String[] args) throws InterruptedException {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring.xml");
            context.start();
        } catch (Exception e) {
            log.error("== DubboProvider context start error:",e);
        }
        synchronized (DubboProvider.class) {

            DubboProvider.class.wait();

        }
    }

}