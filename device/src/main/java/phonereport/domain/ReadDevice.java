package phonereport.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "ReadDevice_table")
@Data
public class ReadDevice {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long deviceId;
}
