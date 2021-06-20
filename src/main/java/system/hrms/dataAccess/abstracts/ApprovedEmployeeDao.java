package system.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import system.hrms.entities.concretes.ApprovedEmployee;

public interface ApprovedEmployeeDao extends JpaRepository<ApprovedEmployee,Integer>{

}
