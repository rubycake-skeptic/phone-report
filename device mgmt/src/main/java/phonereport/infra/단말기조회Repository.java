package phonereport.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import phonereport.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "단말기조회",
    path = "단말기조회"
)
public interface 단말기조회Repository
    extends PagingAndSortingRepository<단말기조회, Long> {}
