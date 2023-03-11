package zinkatech.com.gestionemploidepartment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zinkatech.com.gestionemploidepartment.entities.Employee;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
