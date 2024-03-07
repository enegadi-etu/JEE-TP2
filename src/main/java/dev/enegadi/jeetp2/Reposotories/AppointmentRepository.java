package dev.enegadi.jeetp2.Reposotories;

import dev.enegadi.jeetp2.Entities.Appointment;
import dev.enegadi.jeetp2.Entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
