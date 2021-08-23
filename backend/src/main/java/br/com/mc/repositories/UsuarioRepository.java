package br.com.mc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mc.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
