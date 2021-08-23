package br.com.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mc.models.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{
    
}
