package phonereport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phonereport.DevicemgmtApplication;
import phonereport.domain.DeviceActivated;
import phonereport.domain.DeviceAdded;
import phonereport.domain.DeviceDeactivated;

@Entity
@Table(name = "DeviceMgmt_table")
@Data
//<<< DDD / Aggregate Root
public class DeviceMgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deviceId;

    private String imei;

    private Long userId;

    private status status;

    private Date updatedAt;

    private Date createdAt;

    public static DeviceMgmtRepository repository() {
        DeviceMgmtRepository deviceMgmtRepository = DevicemgmtApplication.applicationContext.getBean(
            DeviceMgmtRepository.class
        );
        return deviceMgmtRepository;
    }

    //<<< Clean Arch / Port Method
    public static void deactivateDevice(ReportReviewed reportReviewed) {
        //implement business logic here:

        /** Example 1:  new item 
        DeviceMgmt deviceMgmt = new DeviceMgmt();
        repository().save(deviceMgmt);

        DeviceDeactivated deviceDeactivated = new DeviceDeactivated(deviceMgmt);
        deviceDeactivated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(reportReviewed.get???()).ifPresent(deviceMgmt->{
            
            deviceMgmt // do something
            repository().save(deviceMgmt);

            DeviceDeactivated deviceDeactivated = new DeviceDeactivated(deviceMgmt);
            deviceDeactivated.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void 단말기정지해제(CancelReport cancelReport) {
        //implement business logic here:

        /** Example 1:  new item 
        DeviceMgmt deviceMgmt = new DeviceMgmt();
        repository().save(deviceMgmt);

        DeviceActivated deviceActivated = new DeviceActivated(deviceMgmt);
        deviceActivated.publishAfterCommit();
        */

        /** Example 2:  finding and process
        

        repository().findById(cancelReport.get???()).ifPresent(deviceMgmt->{
            
            deviceMgmt // do something
            repository().save(deviceMgmt);

            DeviceActivated deviceActivated = new DeviceActivated(deviceMgmt);
            deviceActivated.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
