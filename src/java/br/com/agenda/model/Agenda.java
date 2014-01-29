package br.com.agenda.model;

import br.com.agenda.dao.AgendaDao;
import br.com.agenda.dao.JpaUtil;
import java.io.Serializable;
import java.util.Calendar;  
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Agenda implements Serializable {
        @Id @GeneratedValue
        private Integer id;
	private String assunto;
	private String materia;
        private String comentarios;
        private String status;
        @Temporal(TemporalType.DATE)
        private Calendar datae;
    @ManyToOne
    private Pessoa pessoa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

  
        
    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Calendar getDatae() {
        return datae;
    }

    public void setDatae(Calendar datae) {
        this.datae = datae;
    }


	
}
