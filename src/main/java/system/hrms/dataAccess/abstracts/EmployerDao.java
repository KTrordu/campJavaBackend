package system.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import system.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{
    
}
