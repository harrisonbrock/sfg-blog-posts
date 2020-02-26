package guru.springframework.jpaonetomany.repository;

import guru.springframework.jpaonetomany.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Page<Employee> findByManagerId(Long managerId, Pageable pageable);
}
