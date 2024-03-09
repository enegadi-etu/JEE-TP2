package dev.enegadi.jeetp2;

import dev.enegadi.jeetp2.Entities.Appointment;
import dev.enegadi.jeetp2.Entities.Doctor;
import dev.enegadi.jeetp2.Entities.Patient;
import dev.enegadi.jeetp2.Entities.STATUS;
import dev.enegadi.jeetp2.Reposotories.AppointmentRepository;
import dev.enegadi.jeetp2.Reposotories.DoctorRepository;
import dev.enegadi.jeetp2.Reposotories.PatientRepository;
import dev.enegadi.jeetp2.Services.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JeeTp2Application {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(JeeTp2Application.class, args);
    }

    @Bean
    CommandLineRunner start(IHospitalService hospitalServiceImpl) {
        return args -> {

//            Patient patient = hospitalServiceImpl.getPatientById(1L);
//            Doctor doctor = hospitalServiceImpl.getDoctorById(1L);
//            Appointment appointment = new Appointment();
//            appointment.setDate(new Date());
//            appointment.setStatus(STATUS.PENDING);
//            appointment.setDoctor(doctor);
//            appointment.setPatient(patient);
//            hospitalServiceImpl.saveAppointment(appointment);

        };
    }
}
