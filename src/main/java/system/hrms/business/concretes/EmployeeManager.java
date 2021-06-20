package system.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import system.hrms.business.abstracts.EmployeeService;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;
import system.hrms.core.utilites.results.SuccessDataResult;
import system.hrms.core.utilites.results.SuccessResult;
import system.hrms.dataAccess.abstracts.EmployeeDao;
import system.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
        super();
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<List<Employee>>
                (this.employeeDao.findAll(),"Data listelendi.");
    }

    @Override
    public Result add(Employee product) {
        this.employeeDao.save(product);
        return new SuccessResult("Çalışan eklendi");
    }

    
}
