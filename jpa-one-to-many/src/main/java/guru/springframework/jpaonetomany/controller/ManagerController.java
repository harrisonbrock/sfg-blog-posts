package guru.springframework.jpaonetomany.controller;

import guru.springframework.jpaonetomany.model.Manager;
import guru.springframework.jpaonetomany.repository.ManagerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/manager")
public class ManagerController {

    private final ManagerRepository managerRepository;

    public ManagerController(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @PostMapping
    public Manager create(@Valid @RequestBody Manager manager) {
        return managerRepository.save(manager);
    }

    @GetMapping
    public Page<Manager> getAll(Pageable pageable) {
        return managerRepository.findAll(pageable);
    }
}
