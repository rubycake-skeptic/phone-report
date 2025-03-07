package phonereport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ReportDeviceCommand {

    private Long reportId;
    private String imei;
    private Long userId;
    private String status;
    private Long reviewerId;
}
