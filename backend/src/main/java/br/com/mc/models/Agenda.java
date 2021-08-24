package br.com.mc.models;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Agenda {
    
    @Id
    private Long id;

    @ManyToMany(mappedBy = "agendas")
    private List<Medico> medicos;        

    //@OneToOne(mappedBy = "agenda")
    //private Agendamento agendamento;        

    //@ManyToOne
    //private UnidadeDeSaude unidadeDeSaude;            

    @Column(name = "datainicio")
    private Date dataInicio;

    @Column(name = "datafim")
    private Date dataFim;
    
    @Column(name = "horainicio")
    private Time horaInicio;

    @Column(name = "horafim")
    private Time horaFim;

    @Column
    private Time duracao;
}
