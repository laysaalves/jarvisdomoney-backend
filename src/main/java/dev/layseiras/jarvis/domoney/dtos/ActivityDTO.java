package dev.layseiras.jarvis.domoney.dtos;

import dev.layseiras.jarvis.domoney.entities.PaymentMethod;
import dev.layseiras.jarvis.domoney.entities.PaymentStatus;
import dev.layseiras.jarvis.domoney.entities.PaymentType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record ActivityDTO
        (UUID id,
        String title,
        BigDecimal price,
        PaymentType paymentType,
        PaymentMethod method,
        PaymentStatus status,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        LocalDateTime deletedAt) {}
