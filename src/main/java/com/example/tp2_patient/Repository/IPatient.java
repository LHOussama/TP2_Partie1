package com.example.tp2_patient.Repository;
import com.example.tp2_patient.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
public interface IPatient extends JpaRepository<Patient,Long> {
    List<Patient> findByNomContaining(String motcle);
    @Transactional
    void deletePatientById(long id);
}
