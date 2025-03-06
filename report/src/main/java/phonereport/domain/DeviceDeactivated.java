package phonereport.domain;

import java.util.*;
import lombok.*;
import phonereport.domain.*;
import phonereport.infra.AbstractEvent;

@Data
@ToString
public class DeviceDeactivated extends AbstractEvent {

    private Long deviceId;
    private String imei;
    private Long userId;
    private String status;
    private Date updatedAt;
}
