package com.example.tp2_patient.entities;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
@Entity @Getter @Setter @ToString @Builder @AllArgsConstructor @NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    @DateTimeFormat
    private Date date;
    private int score;
    private boolean malade;
}
