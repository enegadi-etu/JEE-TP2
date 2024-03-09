package dev.enegadi.jeetp2.web;

import dev.enegadi.jeetp2.Entities.Doctor;
import dev.enegadi.jeetp2.Entities.Patient;
import dev.enegadi.jeetp2.Services.IHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.print.Doc;
import java.util.List;

@RestController
public class DoctorRestService {
    @Autowired
    private IHospitalService hospitalServiceImpl;

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors(){
        return hospitalServiceImpl.getAllDoctors() ;
    }

    @GetMapping("/doctors/{id}")
    public Doctor getDoctorById(@PathVariable long id){
        return hospitalServiceImpl.getDoctorById(id);
    }
}
