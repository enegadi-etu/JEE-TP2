package dev.enegadi.jeetp2.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
@Entity @AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date birthday;
    private int score;
    private boolean isSick;
}
