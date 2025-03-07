package phonereport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phonereport.domain.*;
import phonereport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PhoneReported extends AbstractEvent {

    private Long reportId;
    private String imei;
    private Long userId;
    private String status;

    public PhoneReported(LostDeviceReport aggregate) {
        super(aggregate);
    }

    public PhoneReported() {
        super();
    }
}
//>>> DDD / Domain Event
