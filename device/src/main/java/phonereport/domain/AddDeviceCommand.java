package phonereport.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class AddDeviceCommand {

    private Long deviceId;
    private String imei;
    private Long userId;
    private Date updatedAt;
    private Date createdAt;
    private Status status;
}
