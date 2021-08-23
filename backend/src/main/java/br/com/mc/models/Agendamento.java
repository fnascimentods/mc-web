package br.com.mc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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

    @ManyToOne(fetch = FetchType.LAZY)
    private Paciente paciente;

    @OneToOne(mappedBy = "Medico", fetch = FetchType.LAZY)
    private Medico medico;

    @OneToOne(mappedBy = "UnidadeDeSaude", fetch = FetchType.LAZY)
    private UnidadeDeSaude unidadeDeSaude;
    
    @OneToOne(mappedBy = "Agenda", fetch = FetchType.LAZY)
    private Agenda agenda;    

    @Column
    private Date dataHoraCriacao;

    @Column
    private Integer status;
}
