package br.com.mc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Consulta {
    
    @Id
    private Long id;
    
    @OneToOne(mappedBy = "Agendamento", fetch = FetchType.LAZY)
    private Agendamento agendamento;    

    @Column
    private String sintomas;

    @Column
    private String prescricao;    

    @Column
    private Date dataHoraCriacao;

    @Column
    private Integer status;    
}
