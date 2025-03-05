package phonereport.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import phonereport.domain.*;

@Component
public class LossReportHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<LossReport>> {

    @Override
    public EntityModel<LossReport> process(EntityModel<LossReport> model) {
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/reportphone")
                .withRel("reportphone")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/inspectreport")
                .withRel("inspectreport")
        );
        model.add(
            Link
                .of(model.getRequiredLink("self").getHref() + "/checkstatus")
                .withRel("checkstatus")
        );

        return model;
    }
}
