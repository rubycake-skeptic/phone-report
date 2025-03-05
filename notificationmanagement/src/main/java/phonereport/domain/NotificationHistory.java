package phonereport.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import phonereport.NotificationmanagementApplication;

@Entity
@Table(name = "NotificationHistory_table")
@Data
//<<< DDD / Aggregate Root
public class NotificationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long historyId;

    private String message;

    private Long userId;

    private Date notifiedAt;

    public static NotificationHistoryRepository repository() {
        NotificationHistoryRepository notificationHistoryRepository = NotificationmanagementApplication.applicationContext.getBean(
            NotificationHistoryRepository.class
        );
        return notificationHistoryRepository;
    }

    //<<< Clean Arch / Port Method
    public static void reportNotify(PhoneReported phoneReported) {
        //implement business logic here:

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        

        repository().findById(phoneReported.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void reportNotify(DeviceDeactivated deviceDeactivated) {
        //implement business logic here:

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        

        repository().findById(deviceDeactivated.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void reportNotify(DeviceActivated deviceActivated) {
        //implement business logic here:

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        

        repository().findById(deviceActivated.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
