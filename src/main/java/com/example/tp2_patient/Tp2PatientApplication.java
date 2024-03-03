package com.example.tp2_patient;

import com.example.tp2_patient.Repository.IPatient;
import com.example.tp2_patient.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Tp2PatientApplication implements CommandLineRunner {
	@Autowired()
	private IPatient iPatient;
	public static void main(String[] args) {
		SpringApplication.run(Tp2PatientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		iPatient.save(Patient.builder()
				.nom("oussama")
				.score(100)
				.malade(true)
				.date(new Date(100,9,21))
				.build());
		iPatient.save(Patient.builder()
				.nom("yassine")
				.score(100)
				.malade(true)
				.date(new Date(100,10,11))
				.build());
		System.out.println(iPatient.findById(1L).toString());
		iPatient.save(Patient.builder()
				.nom("reda")
				.score(100)
				.malade(false)
				.date(new Date(100,9,21))
				.build());
		iPatient.findAll().forEach(
				patient -> System.out.println(patient.toString())
		);
		System.out.println(iPatient.findById(1L));
		System.out.println("eeeeeee");
		iPatient.findByNomContaining("ss").forEach(
				patient -> System.out.println(patient.toString())
		);
		iPatient.deletePatientById(3L);
	}

}
