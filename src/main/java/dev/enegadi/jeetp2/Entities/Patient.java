package dev.enegadi.jeetp2.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;
@Entity @AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Patient {
    @Id
    private long id;
    private String name;
    private Date birthday;
    private int score;
    private boolean isSick;
}
