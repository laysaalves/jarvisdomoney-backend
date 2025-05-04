package dev.layseiras.jarvis.domoney.controllers;

import dev.layseiras.jarvis.domoney.dtos.ActivityDTO;
import dev.layseiras.jarvis.domoney.service.ActivityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/activity")
public class ActivityController {

    private final ActivityService service;

    public ActivityController(ActivityService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ActivityDTO> create(@RequestBody ActivityDTO dto) {
        ActivityDTO created = service.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @GetMapping
    public ResponseEntity<List<ActivityDTO>> getAll() {
        List<ActivityDTO> all = service.getAll();
        return ResponseEntity.ok(all);
    }
}
