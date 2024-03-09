package dev.enegadi.jeetp2.web;

import dev.enegadi.jeetp2.Entities.Patient;
import dev.enegadi.jeetp2.Reposotories.PatientRepository;
import dev.enegadi.jeetp2.Services.HospitalServiceImpl;
import dev.enegadi.jeetp2.Services.IHospitalService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientRestService {
    @Autowired
    private IHospitalService hospitalServiceImpl;

    @GetMapping("/patients")
    public List<Patient> getAllPatients(){
        return hospitalServiceImpl.getAllPatients() ;
    }

    @GetMapping("/patients/{id}")
    public Patient getPatientById(@PathVariable long id){
        return hospitalServiceImpl.getPatientById(id);
    }
}
