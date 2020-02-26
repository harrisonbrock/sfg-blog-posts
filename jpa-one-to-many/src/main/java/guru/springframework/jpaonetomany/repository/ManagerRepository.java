package guru.springframework.jpaonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import guru.springframework.jpaonetomany.model.Manager;
public interface ManagerRepository extends JpaRepository<Manager, Long> {
}
