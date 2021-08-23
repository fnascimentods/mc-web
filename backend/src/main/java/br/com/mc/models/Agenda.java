package br.com.mc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.apache.tomcat.jni.Time;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Agenda {
    
    @Id
    private Long id;

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
