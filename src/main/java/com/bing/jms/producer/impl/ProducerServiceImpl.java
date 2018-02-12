package com.bing.jms.producer.impl;

import com.bing.jms.producer.ProducerService;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * @package：com.bing.jms.producer.impl
 * @des：
 * @autor ：王兵【wb38113】
 * @createTime： 2018/2/12-15:05
 */
public class ProducerServiceImpl implements ProducerService {

    @Resource
    private JmsTemplate jmsTemplate;
    @Resource(name = "queueDestination")
    private Destination destination;
    @Override
    public void sendMessage(final String message) {
        jmsTemplate.send(destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
            }
        });
        System.out.println("发送消息：" + message);
    }
}
