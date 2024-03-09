package dev.enegadi.jeetp2.Services;

import dev.enegadi.jeetp2.Entities.Appointment;
import dev.enegadi.jeetp2.Entities.Consultation;
import dev.enegadi.jeetp2.Entities.Doctor;
import dev.enegadi.jeetp2.Entities.Patient;

import java.util.List;

public interface IHospitalService {
    Doctor saveDoctor(Doctor doctor);
    Doctor getDoctorById(Long id);
    List<Doctor> getAllDoctors();
    Patient savePatient(Patient patient);
    Patient getPatientById(Long id);
    List<Patient> getAllPatients();
    Appointment saveAppointment(Appointment appointment);
    Appointment getAppointmentById(Long id);
    List<Appointment> getAllAppointments();
    Consultation saveConsultation(Consultation consultation);
    Consultation getConsultationById(Long id);
    List<Consultation> getAllConsultations();
}
