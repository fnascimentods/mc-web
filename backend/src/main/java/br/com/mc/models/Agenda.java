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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Agenda {
    
    @Id
    private Long id;

    @ManyToOne
    private Medico medico;        

    @OneToMany(mappedBy = "agenda")
    private List<Agendamento> agendamentos;        

    @ManyToOne
    private UnidadeDeSaude unidadeDeSaude;            

    private Date data;   
    
    private Time horaInicio;

    private Time horaFim;

    private Time intervalo;
}
