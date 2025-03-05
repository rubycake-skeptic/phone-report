package phonereport.infra;
import phonereport.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/lossReports")
@Transactional
public class LossReportController {
    @Autowired
    LossReportRepository lossReportRepository;

    @RequestMapping(value = "/lossReports/reportphone",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public LossReport reportPhone(HttpServletRequest request, HttpServletResponse response, 
        ) throws Exception {
            System.out.println("##### /lossReport/reportPhone  called #####");
            LossReport lossReport = new LossReport();
            lossReport.reportPhone();
            lossReportRepository.save(lossReport);
            return lossReport;
    }
    @RequestMapping(value = "/lossReports/{id}/inspectreport",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public LossReport inspectReport(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /lossReport/inspectReport  called #####");
            Optional<LossReport> optionalLossReport = lossReportRepository.findById(id);
            
            optionalLossReport.orElseThrow(()-> new Exception("No Entity Found"));
            LossReport lossReport = optionalLossReport.get();
            lossReport.inspectReport();
            
            lossReportRepository.save(lossReport);
            return lossReport;
            
    }
    @RequestMapping(value = "/lossReports/checkstatus",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public LossReport checkStatus(HttpServletRequest request, HttpServletResponse response, 
        ) throws Exception {
            System.out.println("##### /lossReport/checkStatus  called #####");
            LossReport lossReport = new LossReport();
            lossReport.checkStatus();
            lossReportRepository.save(lossReport);
            return lossReport;
    }
}
//>>> Clean Arch / Inbound Adaptor
