package phonereport.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import phonereport.config.kafka.KafkaProcessor;
import phonereport.domain.*;

@Service
public class 단말기조회ViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private 단말기조회Repository 단말기조회Repository;
    //>>> DDD / CQRS
}
