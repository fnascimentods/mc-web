package br.com.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mc.models.UnidadeDeSaude;

public interface UnidadeDeSaudeRepository extends JpaRepository<UnidadeDeSaude, Long>{
    
}
