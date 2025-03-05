package phonereport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import phonereport.domain.*;
import phonereport.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeviceAdded extends AbstractEvent {

    private Long deviceId;
    private String imei;
    private Long userId;
    private status status;
    private Date updatedAt;
    private Date createdAt;

    public DeviceAdded(DeviceMgmt aggregate) {
        super(aggregate);
    }

    public DeviceAdded() {
        super();
    }
}
//>>> DDD / Domain Event
