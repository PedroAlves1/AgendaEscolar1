package br.com.agenda.dao;

import br.com.agenda.model.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author pedro
 */
public class PessoaDao extends Dao<Pessoa> {
    private EntityManager em;
    public PessoaDao(EntityManager em) {
        super(Pessoa.class, em);
        this.em=em;
    }
    /**
     * 
     * @param nome
     * @param senha
     * @return 
     */
    
    public Pessoa login (String nome, String senha){
        Query q = em.createQuery("Select u from Pessoa as u where u.nome=:n1 and u.senha=:s1");
        q.setParameter("n1", nome);
        q.setParameter("s1", senha);
        List<Pessoa>res = q.getResultList();
        if(res.size() >0 ){
            return res.get(0);
        }
        else
        {
            return null;
        }
        
            }
}