package br.com.mc.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class UnidadeDeSaude {
    
    @Id
    private Long id;

    @ManyToMany(mappedBy = "Medico", fetch = FetchType.LAZY)
    private List<Medico> medicos;

    @ManyToMany(mappedBy = "Agenda", fetch = FetchType.LAZY)
    private List<Agenda> agendas;

    @Column
    private String nome;
    
    @Column
    private String logradouro;        

    @Column
    private Integer numero;

    @Column
    private String bairro;

    @Column
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
