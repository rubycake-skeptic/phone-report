package phonereport.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import phonereport.config.kafka.KafkaProcessor;
import phonereport.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    NotificationHistoryRepository notificationHistoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PhoneReported'"
    )
    public void wheneverPhoneReported_ReportNotify(
        @Payload PhoneReported phoneReported
    ) {
        PhoneReported event = phoneReported;
        System.out.println(
            "\n\n##### listener ReportNotify : " + phoneReported + "\n\n"
        );

        // Sample Logic //
        NotificationHistory.reportNotify(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeviceDeactivated'"
    )
    public void wheneverDeviceDeactivated_ReportNotify(
        @Payload DeviceDeactivated deviceDeactivated
    ) {
        DeviceDeactivated event = deviceDeactivated;
        System.out.println(
            "\n\n##### listener ReportNotify : " + deviceDeactivated + "\n\n"
        );

        // Sample Logic //
        NotificationHistory.reportNotify(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeviceActivated'"
    )
    public void wheneverDeviceActivated_ReportNotify(
        @Payload DeviceActivated deviceActivated
    ) {
        DeviceActivated event = deviceActivated;
        System.out.println(
            "\n\n##### listener ReportNotify : " + deviceActivated + "\n\n"
        );

        // Sample Logic //
        NotificationHistory.reportNotify(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
