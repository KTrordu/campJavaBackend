package system.hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import system.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer>{
    List<JobSeeker> findByNationalIdentityNo(String national_identity_no);
    List<JobSeeker> findByEmail(String email);
}
