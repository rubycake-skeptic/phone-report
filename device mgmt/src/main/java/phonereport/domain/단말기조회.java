package phonereport.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "단말기조회_table")
@Data
public class 단말기조회 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long deviceId;
}
