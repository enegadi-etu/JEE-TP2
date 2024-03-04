package dev.enegadi.jeetp2;

import dev.enegadi.jeetp2.Entities.Patient;
import dev.enegadi.jeetp2.Reposotories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class JeeTp2Application implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(JeeTp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// add some patients to database
		// patientRepository.save(new Patient(null, "Ismail Enegadi", new Date(), 1000, false ));
		// patientRepository.save(new Patient(null, "Idriss Merzak", new Date(), 1000, true ));
		// get all the patients from the db
		System.out.println("-----------Those are all the Patient in the db---------------");
		List<Patient> patients = patientRepository.findAll();
		for (Patient patient : patients) {
			System.out.println(patient.toString());
		}
		// trying to get a Patient by Id
		System.out.println("---------------This is a Patient with an id equal to 2-----------------");
        Patient patientById = patientRepository.findById(2L).get();
        System.out.println(patientById.toString());
        // trying to get a Patient by Name using PatientRepository
        System.out.println("---------------This is a Patient with name equal to 'Ismail Enegadi'-----------------");
        List<Patient> patientList =  patientRepository.findPatientByName("Ismail Enegadi");
        patientList.forEach(patient -> {
            System.out.println(patient.toString());
        });
        // trying to get a Patient by Name using PatientRepository using my query
        System.out.println("---------------This is a Patient with name equal to 'Enegadi' using my function-----------------");
        List<Patient> patientList1 =  patientRepository.findPatientByQuery("Ismail Enegadi");
        patientList1.forEach(patient -> {
            System.out.println(patient.toString());
        });
        // trying ot get all the patients who have a score grather than 500
        System.out.println("---------------------- Those are the patient who have score greater than 500 --------------------");
        List<Patient> patientsByScore  = patientRepository.getPatientByScoreGreaterThan(500);
        patientsByScore.forEach(patient -> {
            System.out.println(patient.toString());
        });
	}
}
