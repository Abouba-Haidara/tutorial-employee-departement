package zinkatech.com.gestionemploidepartment.services;

import zinkatech.com.gestionemploidepartment.entities.Department;

import java.util.List;

public interface DepartmentService {

    void createDepartment(Department d);

    List<Department> findDepartments();

    Department findOneDepartment(long id);
}
