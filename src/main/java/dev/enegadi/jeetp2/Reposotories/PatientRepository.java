package dev.enegadi.jeetp2.Reposotories;

import dev.enegadi.jeetp2.Entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,  Long> {

    List<Patient> findPatientByName(String name);

    @Query("select p from Patient p where p.name like :x")
    List<Patient> findPatientByQuery(@Param("x") String nameQuery);

    List<Patient> getPatientByScoreGreaterThan(int score);
}
