package com.medicamentos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicamentos.api.model.Medicamentos;

public interface MedicamentosRepository extends JpaRepository<Medicamentos, Long> {

}
