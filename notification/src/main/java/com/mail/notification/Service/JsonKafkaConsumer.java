package com.mail.notification.Service;

import com.mail.notification.Entity.ProductOrder;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "send-mail1",groupId = "group-1")
    public void Consumer(ProductOrder kafkaMail){
        System.out.println("✅✅ Kafka Consumer Triggered ✅✅");
        System.out.println(kafkaMail.toString());
        System.out.println("❌❌❌❌❌✔✔✔✔✔✔✔✔🙂🙂🙂🙂🙂");
    }
}
