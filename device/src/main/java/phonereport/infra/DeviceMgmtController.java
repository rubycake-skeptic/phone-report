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
// @RequestMapping(value="/deviceMgmts")
@Transactional
public class DeviceMgmtController {

    @Autowired
    DeviceMgmtRepository deviceMgmtRepository;

    @RequestMapping(
        value = "/deviceMgmts/adddevice",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public DeviceMgmt addDevice(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody AddDeviceCommand addDeviceCommand
    ) throws Exception {
        System.out.println("##### /deviceMgmt/addDevice  called #####");
        DeviceMgmt deviceMgmt = new DeviceMgmt();
        deviceMgmt.addDevice(addDeviceCommand);
        deviceMgmtRepository.save(deviceMgmt);
        return deviceMgmt;
    }
}
//>>> Clean Arch / Inbound Adaptor
