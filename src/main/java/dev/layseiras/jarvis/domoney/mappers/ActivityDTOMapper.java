package dev.layseiras.jarvis.domoney.mappers;

import dev.layseiras.jarvis.domoney.dtos.ActivityDTO;
import dev.layseiras.jarvis.domoney.entities.Activity;
import org.springframework.stereotype.Component;

@Component
public class ActivityDTOMapper {

    public ActivityDTO toDTO(Activity activity) {
        return new ActivityDTO(
                activity.getId(),
                activity.getTitle(),
                activity.getPrice(),
                activity.getPaymentType(),
                activity.getMethod(),
                activity.getStatus(),
                activity.getCreatedAt(),
                activity.getUpdatedAt(),
                activity.getDeletedAt()

        );
    }

    public Activity toDomain(ActivityDTO dto) {
        return new Activity(
                dto.id(),
                dto.title(),
                dto.price(),
                dto.paymentType(),
                dto.method(),
                dto.status(),
                dto.createdAt(),
                dto.updatedAt(),
                dto.deletedAt()
        );
    }
}
