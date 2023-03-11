package zinkatech.com.gestionemploidepartment.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {
    private String employeeFirstName;
    private String employeeLastName;
    private String employeePhoneNumber;
    private long departmentId;
}
