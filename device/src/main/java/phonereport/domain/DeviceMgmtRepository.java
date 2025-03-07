package phonereport.domain;

import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phonereport.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "deviceMgmts",
    path = "deviceMgmts"
)
public interface DeviceMgmtRepository
    extends PagingAndSortingRepository<DeviceMgmt, Long> {}
