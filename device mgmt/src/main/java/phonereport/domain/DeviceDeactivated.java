package phonereport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phonereport.domain.*;
import phonereport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeviceDeactivated extends AbstractEvent {

    private Long deviceId;
    private String imei;
    private Long userId;
    private status status;
    private Date updatedAt;

    public DeviceDeactivated(DeviceMgmt aggregate) {
        super(aggregate);
    }

    public DeviceDeactivated() {
        super();
    }
}
//>>> DDD / Domain Event
