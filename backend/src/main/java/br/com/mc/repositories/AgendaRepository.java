package br.com.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mc.models.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{
    
}
