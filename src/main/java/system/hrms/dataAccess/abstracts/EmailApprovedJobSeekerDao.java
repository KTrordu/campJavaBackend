package system.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import system.hrms.entities.concretes.EmailApprovedJobSeeker;

public interface EmailApprovedJobSeekerDao extends JpaRepository<EmailApprovedJobSeeker, Integer>{
    
}
