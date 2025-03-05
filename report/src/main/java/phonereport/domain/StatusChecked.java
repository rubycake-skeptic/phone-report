package phonereport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phonereport.domain.*;
import phonereport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StatusChecked extends AbstractEvent {

    private Long reportId;
    private String imei;
    private Long userId;
    private String status;

    public StatusChecked(LossReport aggregate) {
        super(aggregate);
    }

    public StatusChecked() {
        super();
    }
}
//>>> DDD / Domain Event
