package br.com.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mc.models.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{
    
}
