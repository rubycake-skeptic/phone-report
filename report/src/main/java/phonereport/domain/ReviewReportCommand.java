package phonereport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class ReviewReportCommand {

    private Long reportId;
    private String status;
    private Long reviewerId;
}
