package com.example.customerservice.worker;


import com.example.customerservice.kafka.KafkaProducer;

import com.xxl.job.core.handler.annotation.XxlJob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LotteryXxlJob {



    @Autowired
    private KafkaProducer kafkaProducer;


    @XxlJob("OrderStateJobHandler")
    public void OrderStateJobHandler() throws Exception {

    }


}
