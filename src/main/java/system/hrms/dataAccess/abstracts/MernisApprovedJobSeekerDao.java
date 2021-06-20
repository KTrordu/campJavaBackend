package system.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import system.hrms.entities.concretes.MernisApprovedJobSeeker;

public interface MernisApprovedJobSeekerDao extends JpaRepository<MernisApprovedJobSeeker,Integer>{
    
}
