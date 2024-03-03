package dev.enegadi.jeetp2.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
@Entity @AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
public class Patient {
    @Id
    private long id;
    private String name;
    private Date birthday;
    private int score;
    private boolean isSick;
}
