package dev.enegadi.jeetp2.Reposotories;

import dev.enegadi.jeetp2.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,  Long> {
}
