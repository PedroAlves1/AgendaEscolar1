package br.com.agenda.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author pedro
 */
@ManagedBean(name="Pessoa")
public class PessoaController {
private String nome;
private String senha;
private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
public String clique(){
    if (nome.equals("a")&&
     senha.equals("a")){
        return "agenda.xhtml";
    }
    else{
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Senha ou Usuário Incorreto(s) ", "O usuário e a senha não correspondem a nenhuma conta cadastrada.")); 
        return"";
    }
}
    public String registro(){
    return "";
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    
    
    
}
