package com.example.customerservice.kafka;


import com.alibaba.fastjson.JSON;
import org.example.model.CustomerOrder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import javax.annotation.Resource;

@Component
public class KafkaProducer {

    @Resource
    private KafkaTemplate<String, Object> kafkaTemplate;
    public static final String TOPIC_INVOICE = "order";


    public ListenableFuture<SendResult<String, Object>> sendLotteryInvoice(CustomerOrder invoice) {

        String objJson = JSON.toJSONString(invoice);

        return kafkaTemplate.send(TOPIC_INVOICE, objJson);
    }
}
