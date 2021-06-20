package system.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.hrms.business.abstracts.JobSeekerService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/job_seekers")
public class JobSeekersController {
    
    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekersController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }
    
    @GetMapping("/getall")
    public DataResult<List<JobSeeker>> getAll(){
        return this.jobSeekerService.getAll();
    }
    
    @PostMapping("/add")
    public Result add(@RequestBody JobSeeker jobSeeker){
        return this.jobSeekerService.add(jobSeeker);
    }
}
