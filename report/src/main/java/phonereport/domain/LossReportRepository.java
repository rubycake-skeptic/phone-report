package phonereport.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phonereport.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "lossReports",
    path = "lossReports"
)
public interface LossReportRepository
    extends PagingAndSortingRepository<LossReport, Long> {}
