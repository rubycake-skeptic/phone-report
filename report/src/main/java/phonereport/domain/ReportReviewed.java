package phonereport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phonereport.domain.*;
import phonereport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ReportReviewed extends AbstractEvent {

    private Long reportId;
    private String imei;
    private Long userId;
    private String status;
    private Long inspectorId;
    private Long reviewerId;

    public ReportReviewed(LostDeviceReport aggregate) {
        super(aggregate);
    }

    public ReportReviewed() {
        super();
    }
}
//>>> DDD / Domain Event
