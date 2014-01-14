package br.com.agenda.controller;

import br.com.agenda.model.Pessoa;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author pedro
 */
@ManagedBean(name="Pessoa")
public class PessoaController {
    private Pessoa p;

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }
    
    
public String clique(){
    if (p.getNome().equals("a")&&
     p.getSenha().equals("a")){
        return "agenda?faces-redirect=true";
    }
    else{
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Senha ou Usuário Incorreto(s) ", "O usuário e a senha não correspondem a nenhuma conta cadastrada.")); 
        return"";
    }
}
    public String registro(){
    return "";
        
    }



    
    
    
}
