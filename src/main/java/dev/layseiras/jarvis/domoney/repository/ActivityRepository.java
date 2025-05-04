package dev.layseiras.jarvis.domoney.repository;

import dev.layseiras.jarvis.domoney.entities.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, UUID> {
    @Override
    List<Activity> findAll();
}
