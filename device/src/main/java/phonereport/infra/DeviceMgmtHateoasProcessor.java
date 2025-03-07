package phonereport.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import phonereport.domain.*;

@Component
public class DeviceMgmtHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DeviceMgmt>> {

    @Override
    public EntityModel<DeviceMgmt> process(EntityModel<DeviceMgmt> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/adddevice")
                .withRel("adddevice")
        );

        return model;
    }
}
