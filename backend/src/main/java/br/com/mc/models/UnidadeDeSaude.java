package br.com.mc.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.type.TrueFalseType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class UnidadeDeSaude {
    
    @Id
    private Long id;

    @ManyToMany
    @JoinTable(name="unidadedesaude_medico", 
    joinColumns= {@JoinColumn(name="unidadedesaude_id")}, 
    inverseJoinColumns= {@JoinColumn(name="medico_id")})
    private List<Medico> medicos;

    @OneToMany(mappedBy = "unidadeDeSaude", fetch = FetchType.LAZY)
    private List<Agenda> agendas;

    @OneToMany(mappedBy = "unidadeDeSaude", fetch = FetchType.LAZY)
    private List<Agendamento> agendamentos;

    private String nome;
    
    private String logradouro;        

    private Integer numero;

    private String bairro;

    private String cep;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UnidadeDeSaude other = (UnidadeDeSaude) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }     
}
