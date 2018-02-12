package com.bing.jms.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @package：com.bing.jms.producer
 * @des：
 * @autor ：王兵【wb38113】
 * @createTime： 2018/2/12-15:20
 */
public class AppProducer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService producerService = applicationContext.getBean(ProducerService.class);
        for (int i = 1; i <= 100; i++) {
            producerService.sendMessage("message" + i);
        }
        applicationContext.close();
    }
}
