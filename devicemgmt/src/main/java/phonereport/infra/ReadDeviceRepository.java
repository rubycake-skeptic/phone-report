package phonereport.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phonereport.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "readDevices",
    path = "readDevices"
)
public interface ReadDeviceRepository
    extends PagingAndSortingRepository<ReadDevice, Long> {}
