package br.com.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mc.models.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long>{
    
}
