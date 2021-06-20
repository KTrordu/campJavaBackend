package system.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.hrms.business.abstracts.MernisApprovedJobSeekerService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.MernisApprovedJobSeeker;

@RestController
@RequestMapping("/api/mernis_approved_job_seekers")
public class MernisApprovedJobSeekersController {
    
    private MernisApprovedJobSeekerService mernisApprovedJobSeekerService;

    @Autowired
    public MernisApprovedJobSeekersController(MernisApprovedJobSeekerService mernisApprovedJobSeekerService) {
        this.mernisApprovedJobSeekerService = mernisApprovedJobSeekerService;
    }
    
    @GetMapping("/getall")
    public DataResult<List<MernisApprovedJobSeeker>> getAll(){
        return this.mernisApprovedJobSeekerService.getAll();
    }
    
    @PostMapping("/add")
    public Result add(@RequestBody MernisApprovedJobSeeker mernisApprovedJobSeeker){
        return this.mernisApprovedJobSeekerService.add(mernisApprovedJobSeeker);
    }
}
