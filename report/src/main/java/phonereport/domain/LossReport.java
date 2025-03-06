package phonereport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phonereport.ReportApplication;
import phonereport.domain.CancelReport;

@Entity
@Table(name = "LossReport_table")
@Data
//<<< DDD / Aggregate Root
public class LossReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reportId;

    private String imei;

    private Long userId;

    private String status;

    private Long reviewerId;

    @PostPersist
    public void onPostPersist() {
        // CancelReport cancelReport = new CancelReport(this);
        // cancelReport.publishAfterCommit();
    }

    public static LossReportRepository repository() {
        LossReportRepository lossReportRepository = ReportApplication.applicationContext.getBean(
            LossReportRepository.class
        );
        return lossReportRepository;
    }

    //<<< Clean Arch / Port Method
    public void reportPhone(ReportPhoneCommand reportPhoneCommand) {
        //implement business logic here:
        this.setReportId(reportPhoneCommand.getReportId());
        this.setImei(reportPhoneCommand.getImei());
        this.setUserId(reportPhoneCommand.getUserId());

        repository().save(this);
        
        PhoneReported phoneReported = new PhoneReported(this);
        phoneReported.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void inspectReport() {
        //implement business logic here:

        ReportReviewed reportReviewed = new ReportReviewed(this);
        reportReviewed.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void checkStatus() {
        //implement business logic here:

        StatusChecked statusChecked = new StatusChecked(this);
        statusChecked.publishAfterCommit();
    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void changeReportStatus(DeviceActivated deviceActivated) {
        //implement business logic here:

        /** Example 1:  new item 
        LossReport lossReport = new LossReport();
        repository().save(lossReport);

        */

        /** Example 2:  finding and process
        

        repository().findById(deviceActivated.get???()).ifPresent(lossReport->{
            
            lossReport // do something
            repository().save(lossReport);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void changeReportStatus(DeviceDeactivated deviceDeactivated) {
        //implement business logic here:

        /** Example 1:  new item 
        LossReport lossReport = new LossReport();
        repository().save(lossReport);

        */

        /** Example 2:  finding and process
        

        repository().findById(deviceDeactivated.get???()).ifPresent(lossReport->{
            
            lossReport // do something
            repository().save(lossReport);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
