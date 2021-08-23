package br.com.mc.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Medico {
    
    @Id
    private Long id;

    @OneToOne(mappedBy = "Usuario", fetch = FetchType.LAZY)
    private Usuario usuario;

    @ManyToMany(mappedBy = "Especialidade", fetch = FetchType.LAZY)
    private List<Especialidade> especialidades;

    @ManyToMany(mappedBy = "Agenda", fetch = FetchType.LAZY)
    private List<Agenda> agendas;

    @ManyToMany(mappedBy = "UnidadeDeSaude", fetch = FetchType.LAZY)
    private List<UnidadeDeSaude> unidadeDeSaudes;    

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
