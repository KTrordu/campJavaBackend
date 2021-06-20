package system.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.hrms.business.abstracts.ApprovedEmployerService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.ApprovedEmployer;

@RestController
@RequestMapping("/api/approved_employers")
public class ApprovedEmployersController {
    
    private ApprovedEmployerService approvedEmployerService;

    @Autowired
    public ApprovedEmployersController(ApprovedEmployerService approvedEmployerService) {
        this.approvedEmployerService = approvedEmployerService;
    }
    
    @GetMapping("/getall")
    public DataResult<List<ApprovedEmployer>> getAll(){
        return this.approvedEmployerService.getAll();
    }
    
    @PostMapping("/add")
    public Result add(@RequestBody ApprovedEmployer approvedEmployer){
        return this.approvedEmployerService.add(approvedEmployer);
    }
}
