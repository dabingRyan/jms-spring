package com.bing.jms.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @package：com.bing.jms.consumer
 * @des：
 * @autor ：王兵【wb38113】
 * @createTime： 2018/2/12-15:35
 */
public class AppConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
    }
}
