package phonereport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phonereport.domain.*;
import phonereport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CancelReport extends AbstractEvent {

    private Long reportId;
    private String imei;
    private Long userId;
    private String status;
    private Long reviewerId;

    public CancelReport(LostDeviceReport aggregate) {
        super(aggregate);
    }

    public CancelReport() {
        super();
    }
}
//>>> DDD / Domain Event
