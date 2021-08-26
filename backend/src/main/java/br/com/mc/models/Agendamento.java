package br.com.mc.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Agendamento {
    
    @Id
    private Long id;

    @ManyToOne
    private Paciente paciente;
    
    @ManyToOne
    private Medico medico;

    @ManyToOne
    private UnidadeDeSaude unidadeDeSaude;
    
    @ManyToOne
    private Agenda agenda;    

    @OneToOne(mappedBy = "agendamento")
    private Consulta consulta;    

    @Column
    private Date dataHoraCriacao;

    @Column
    private Integer status;
}
