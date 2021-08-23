package br.com.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mc.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
    
}
