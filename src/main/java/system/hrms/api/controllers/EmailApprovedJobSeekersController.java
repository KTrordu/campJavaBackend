package system.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import system.hrms.business.abstracts.EmailApprovedJobSeekerService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.entities.concretes.EmailApprovedJobSeeker;

@RestController
@RequestMapping("/api/email_approved_job_seekers")
public class EmailApprovedJobSeekersController {
    
    private EmailApprovedJobSeekerService emailApprovedJobSeekerService;

    @Autowired
    public EmailApprovedJobSeekersController(EmailApprovedJobSeekerService emailApprovedJobSeekerService) {
        this.emailApprovedJobSeekerService = emailApprovedJobSeekerService;
    }
    
    @GetMapping("/getall")
    public DataResult<List<EmailApprovedJobSeeker>> getAll(){
        return this.emailApprovedJobSeekerService.getAll();
    }
    
    @PostMapping("/add")
    public Result add(@RequestBody EmailApprovedJobSeeker emailApprovedJobSeeker){
        return this.emailApprovedJobSeekerService.add(emailApprovedJobSeeker);
    }
}
