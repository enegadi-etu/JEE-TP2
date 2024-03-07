package dev.enegadi.jeetp2.Reposotories;

import dev.enegadi.jeetp2.Entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
