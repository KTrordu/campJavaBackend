package system.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.hrms.business.abstracts.ApprovedEmployeeService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.ApprovedEmployee;

@RestController
@RequestMapping("/api/approved_employees")
public class ApprovedEmployeesController {
    
    private ApprovedEmployeeService approvedEmployeeService;

    @Autowired
    public ApprovedEmployeesController(ApprovedEmployeeService approvedEmployeeService) {
        this.approvedEmployeeService = approvedEmployeeService;
    }
    
    @GetMapping("/getall")
    public DataResult<List<ApprovedEmployee>> getAll(){
        return this.approvedEmployeeService.getAll();
    }
    
    @PostMapping("/add")
    public Result add(@RequestBody ApprovedEmployee approvedEmployee){
        return this.approvedEmployeeService.add(approvedEmployee);
    }
}
