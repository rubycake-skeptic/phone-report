package phonereport.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import phonereport.domain.*;

@Component
public class LostDeviceReportHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<LostDeviceReport>> {

    @Override
    public EntityModel<LostDeviceReport> process(
        EntityModel<LostDeviceReport> model
    ) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/reportdevice")
                .withRel("reportdevice")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/reviewreport")
                .withRel("reviewreport")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/cancelreport")
                .withRel("cancelreport")
        );

        return model;
    }
}
