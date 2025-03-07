package phonereport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phonereport.ReportApplication;

@Entity
@Table(name = "LostDeviceReport_table")
@Data
//<<< DDD / Aggregate Root
public class LostDeviceReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reportId;

    private String imei;

    private Long userId;

    private String status;

    private Long reviewerId;

    public static LostDeviceReportRepository repository() {
        LostDeviceReportRepository lostDeviceReportRepository = ReportApplication.applicationContext.getBean(
            LostDeviceReportRepository.class
        );
        return lostDeviceReportRepository;
    }

    //<<< Clean Arch / Port Method
    public void reportDevice(ReportDeviceCommand reportDeviceCommand) {
        //implement business logic here:

        PhoneReported phoneReported = new PhoneReported(this);
        phoneReported.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void reviewReport(ReviewReportCommand reviewReportCommand) {
        //implement business logic here:

        ReportReviewed reportReviewed = new ReportReviewed(this);
        reportReviewed.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void cancelReport(CancelReportCommand cancelReportCommand) {
        //implement business logic here:

        CancelReport cancelReport = new CancelReport(this);
        cancelReport.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void changeReportStatus(DeviceActivated deviceActivated) {
        //implement business logic here:

        /** Example 1:  new item 
        LostDeviceReport lostDeviceReport = new LostDeviceReport();
        repository().save(lostDeviceReport);

        */

        /** Example 2:  finding and process
        

        repository().findById(deviceActivated.get???()).ifPresent(lostDeviceReport->{
            
            lostDeviceReport // do something
            repository().save(lostDeviceReport);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeReportStatus(DeviceDeactivated deviceDeactivated) {
        //implement business logic here:

        /** Example 1:  new item 
        LostDeviceReport lostDeviceReport = new LostDeviceReport();
        repository().save(lostDeviceReport);

        */

        /** Example 2:  finding and process
        

        repository().findById(deviceDeactivated.get???()).ifPresent(lostDeviceReport->{
            
            lostDeviceReport // do something
            repository().save(lostDeviceReport);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
