package dev.layseiras.jarvis.domoney.service;

import dev.layseiras.jarvis.domoney.dtos.ActivityDTO;
import dev.layseiras.jarvis.domoney.entities.Activity;
import dev.layseiras.jarvis.domoney.mappers.ActivityDTOMapper;
import dev.layseiras.jarvis.domoney.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ActivityService {
    private final ActivityRepository repository;
    private final ActivityDTOMapper mapper;

    public ActivityService(ActivityRepository repository, ActivityDTOMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ActivityDTO create(ActivityDTO dto) {
        Activity activity = mapper.toDomain(dto);
        activity.setCreatedAt(LocalDateTime.now());
        activity.setUpdatedAt(LocalDateTime.now());
        Activity saved = repository.save(activity);
        return mapper.toDTO(saved);
    }

    public List<ActivityDTO> getAll() {
        List<Activity> activities = repository.findAll();
        return activities.stream().map(mapper::toDTO).collect(Collectors.toList());
    }
}
