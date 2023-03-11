package zinkatech.com.gestionemploidepartment.services;

import zinkatech.com.gestionemploidepartment.entities.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    void createEmployee(Employee e);
    List<Employee> getEmployees();
    Employee getOneEmployee(long id);
    Map<String, Object> findAllEmployees(int page, int size);

    void delete(long id);

    Employee update(Employee e, long id);

}
