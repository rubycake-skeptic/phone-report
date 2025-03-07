package phonereport.domain;

import java.util.*;
import lombok.*;
import phonereport.domain.*;
import phonereport.infra.AbstractEvent;

@Data
@ToString
public class CancelReport extends AbstractEvent {

    private Long reportId;
    private String imei;
    private Long userId;
    private String status;
    private Long reviewerId;
}
