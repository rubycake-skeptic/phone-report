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
    DeviceMgmtRepository deviceMgmtRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='ReportReviewed'"
    )
    public void wheneverReportReviewed_DeactivateDevice(
        @Payload ReportReviewed reportReviewed
    ) {
        ReportReviewed event = reportReviewed;
        System.out.println(
            "\n\n##### listener DeactivateDevice : " + reportReviewed + "\n\n"
        );

        // Sample Logic //
        DeviceMgmt.deactivateDevice(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='CancelReport'"
    )
    public void wheneverCancelReport_ReactivateDevice(
        @Payload CancelReport cancelReport
    ) {
        CancelReport event = cancelReport;
        System.out.println(
            "\n\n##### listener ReactivateDevice : " + cancelReport + "\n\n"
        );

        // Sample Logic //
        DeviceMgmt.reactivateDevice(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
