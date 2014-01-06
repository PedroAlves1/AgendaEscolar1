package br.com.agenda.controller;


import br.com.agenda.model.Agenda;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author pedro
 */
@ManagedBean(name="Agenda")
@SessionScoped
public class AgendaController {
	            	
    private List<Agenda> agenda ;

        public AgendaController(){
            agenda = new ArrayList<Agenda>();
            
               
}
        public void Adicionar(){
            Agenda n;
            n = new Agenda();
            n.setAssunto("Assunto sobre qual será o trabalho/tarefa");
            n.setMateria("Matéria");
            n.setComentarios("Comentários sobre o trabalho/tarefa");
            n.setStatus("Status (Finalizado, em andamento, cancelado...) ");
            agenda.add(n);
        }
		
	public List<Agenda> getList() {
				return agenda;

	}
        
}


