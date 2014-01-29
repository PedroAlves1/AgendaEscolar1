package br.com.agenda.controller;

import br.com.agenda.dao.JpaUtil;
import br.com.agenda.dao.PessoaDao;
import br.com.agenda.model.Pessoa;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;

/**
 *
 * @author pedro
 */
@ManagedBean(name="Pessoa")
public class PessoaController {
    private Pessoa p;

    public PessoaController() {
        this.p = new Pessoa();
    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }
    
    
public String clique(){
    EntityManager em = JpaUtil.getEntityManager();
    PessoaDao dao = new PessoaDao (em);
    Pessoa u = dao.login(p.getNome(), p.getSenha());
    
    if (u!=null){
            return "agenda?faces-redirect=true";
        }
    else{
    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Senha ou Usuário Incorreto(s) ", "O usuário e a senha não correspondem a nenhuma conta cadastrada."));        
    return "";
    }
}
    public String registro(){
    EntityManager em = JpaUtil.getEntityManager();
    PessoaDao dao = new PessoaDao (em);
    dao.insert(p);
    return "index";
    }



    
    
    
}
//             