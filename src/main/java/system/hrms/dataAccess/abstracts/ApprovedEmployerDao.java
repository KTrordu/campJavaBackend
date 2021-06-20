package system.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import system.hrms.entities.concretes.ApprovedEmployer;

public interface ApprovedEmployerDao extends JpaRepository<ApprovedEmployer,Integer>{

}
