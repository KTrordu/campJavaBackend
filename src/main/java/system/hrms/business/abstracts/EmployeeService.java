package system.hrms.business.abstracts;

import java.util.List;
import system.hrms.core.utilites.results.DataResult;
import system.hrms.core.utilites.results.Result;

import system.hrms.entities.concretes.Employee;

public interface EmployeeService {
    DataResult<List<Employee>> getAll();
    Result add(Employee product);
}
