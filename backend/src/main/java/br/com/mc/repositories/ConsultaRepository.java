package br.com.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mc.models.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
    
}
