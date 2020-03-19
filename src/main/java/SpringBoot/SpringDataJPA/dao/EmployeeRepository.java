package SpringBoot.SpringDataJPA.dao;

import SpringBoot.SpringDataJPA.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    
}
