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
    LostDeviceReportRepository lostDeviceReportRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeviceActivated'"
    )
    public void wheneverDeviceActivated_ChangeReportStatus(
        @Payload DeviceActivated deviceActivated
    ) {
        DeviceActivated event = deviceActivated;
        System.out.println(
            "\n\n##### listener ChangeReportStatus : " +
            deviceActivated +
            "\n\n"
        );

        // Sample Logic //
        LostDeviceReport.changeReportStatus(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='DeviceDeactivated'"
    )
    public void wheneverDeviceDeactivated_ChangeReportStatus(
        @Payload DeviceDeactivated deviceDeactivated
    ) {
        DeviceDeactivated event = deviceDeactivated;
        System.out.println(
            "\n\n##### listener ChangeReportStatus : " +
            deviceDeactivated +
            "\n\n"
        );

        // Sample Logic //
        LostDeviceReport.changeReportStatus(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
