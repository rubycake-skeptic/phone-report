package phonereport.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phonereport.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "notificationHistories",
    path = "notificationHistories"
)
public interface NotificationHistoryRepository
    extends PagingAndSortingRepository<NotificationHistory, Long> {}
