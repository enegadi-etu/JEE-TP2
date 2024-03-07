package dev.enegadi.jeetp2.Reposotories;

import dev.enegadi.jeetp2.Entities.Appointment;
import dev.enegadi.jeetp2.Entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
