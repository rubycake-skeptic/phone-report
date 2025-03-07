package phonereport.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phonereport.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "lostDeviceReports",
    path = "lostDeviceReports"
)
public interface LostDeviceReportRepository
    extends PagingAndSortingRepository<LostDeviceReport, Long> {}
