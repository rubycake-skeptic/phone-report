package phonereport.domain;

import java.util.*;
import lombok.*;
import phonereport.domain.*;
import phonereport.infra.AbstractEvent;

@Data
@ToString
public class ReportReviewed extends AbstractEvent {

    private Long reportId;
    private String imei;
    private Long userId;
    private String status;
    private Long inspectorId;
    private Long reviewerId;
}
