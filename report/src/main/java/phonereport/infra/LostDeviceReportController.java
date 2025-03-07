package phonereport.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import phonereport.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/lostDeviceReports")
@Transactional
public class LostDeviceReportController {

    @Autowired
    LostDeviceReportRepository lostDeviceReportRepository;

    @RequestMapping(
        value = "/lostDeviceReports/reportdevice",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public LostDeviceReport reportDevice(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody ReportDeviceCommand reportDeviceCommand
    ) throws Exception {
        System.out.println(
            "##### /lostDeviceReport/reportDevice  called #####"
        );
        LostDeviceReport lostDeviceReport = new LostDeviceReport();
        lostDeviceReport.reportDevice(reportDeviceCommand);
        lostDeviceReportRepository.save(lostDeviceReport);
        return lostDeviceReport;
    }

    @RequestMapping(
        value = "/lostDeviceReports/{id}/reviewreport",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public LostDeviceReport reviewReport(
        @PathVariable(value = "id") Long id,
        @RequestBody ReviewReportCommand reviewReportCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /lostDeviceReport/reviewReport  called #####"
        );
        Optional<LostDeviceReport> optionalLostDeviceReport = lostDeviceReportRepository.findById(
            id
        );

        optionalLostDeviceReport.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        LostDeviceReport lostDeviceReport = optionalLostDeviceReport.get();
        lostDeviceReport.reviewReport(reviewReportCommand);

        lostDeviceReportRepository.save(lostDeviceReport);
        return lostDeviceReport;
    }

    @RequestMapping(
        value = "/lostDeviceReports/{id}/cancelreport",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public LostDeviceReport cancelReport(
        @PathVariable(value = "id") Long id,
        @RequestBody CancelReportCommand cancelReportCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /lostDeviceReport/cancelReport  called #####"
        );
        Optional<LostDeviceReport> optionalLostDeviceReport = lostDeviceReportRepository.findById(
            id
        );

        optionalLostDeviceReport.orElseThrow(() ->
            new Exception("No Entity Found")
        );
        LostDeviceReport lostDeviceReport = optionalLostDeviceReport.get();
        lostDeviceReport.cancelReport(cancelReportCommand);

        lostDeviceReportRepository.save(lostDeviceReport);
        return lostDeviceReport;
    }
}
//>>> Clean Arch / Inbound Adaptor
