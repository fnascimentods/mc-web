package br.com.mc.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Medico {
    
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(name="medico_especialidade", 
    joinColumns= {@JoinColumn(name="medico_id")}, 
    inverseJoinColumns= {@JoinColumn(name="especialidade_id")})
    private List<Especialidade> especialidades;    

    @OneToMany(mappedBy = "medico")
    private List<Agenda> agendas;    

    @ManyToMany(mappedBy = "medicos")
    private List<UnidadeDeSaude> unidadesDeSaude;    

    @OneToMany(mappedBy = "medico")    
    private List<Agendamento> agendamentos;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private Date dataNascimento;    

    @Column
    private String crm;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Medico other = (Medico) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }     
}
