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
        CancelReport cancelReport = new CancelReport(this);
        cancelReport.publishAfterCommit();
    }

    public static LossReportRepository repository() {
        LossReportRepository lossReportRepository = ReportApplication.applicationContext.getBean(
            LossReportRepository.class
        );
        return lossReportRepository;
    }

    //<<< Clean Arch / Port Method
    public void reportPhone() {
        //implement business logic here:

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

}
//>>> DDD / Aggregate Root
