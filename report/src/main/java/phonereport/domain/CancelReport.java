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

    public CancelReport(LossReport aggregate) {
        super(aggregate);
    }

    public CancelReport() {
        super();
    }
}
//>>> DDD / Domain Event
