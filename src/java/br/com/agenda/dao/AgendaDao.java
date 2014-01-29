package br.com.agenda.dao;

import br.com.agenda.model.Agenda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author pedro
 */
public class AgendaDao extends Dao<Agenda> {
    private EntityManager em;
    public AgendaDao(EntityManager em) {
        super(Agenda.class, em);
        this.em=em;
    }
    /**
     * 
     * @param materia
     * @param assunto
     * @return 
     */
    
    public Agenda abrir (String materia, String assunto){
        Query q = em.createQuery("Select a from Agenda as a where a.materia=:m1 and a.assunto=:as1");
        q.setParameter("m1", materia);
        q.setParameter("as1", assunto);
        List<Agenda>res = q.getResultList();
        if(res.size() >0 ){
            return res.get(0);
        }
        else
        {
            return null;
        }
        
            }
}