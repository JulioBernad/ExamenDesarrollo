package es.salesianos.edu.webpages;


import java.util.ArrayList;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.wicket.markup.html.basic.Label;

import es.salesianos.edu.models.Desayuno;
import es.salesianos.edu.repository.Repository;
import es.salesianos.edu.service.ServiceTeam;

public class DesayunoPage extends WebPage{
	
	private static final long serialVersionUID = -1935854748907274886L;
	
	@SpringBean 
	ServiceTeam serviceTeam;
	
	@Autowired
	Repository repository;
	
	public DesayunoPage() {
		
		Form form = new Form("formInsertDesayuno", new CompoundPropertyModel(new Desayuno())) {
				
			@Override
			protected void onSubmit() {
				super.onSubmit();
				Desayuno newDesayuno = new Desayuno();
				//casteo para que sepa que es un team. con el getModelObject accedo al valor que haya en los inputs
				newDesayuno.setAlumno(((Desayuno) getModelObject()).getAlumno());
				newDesayuno.setBocadillo(((Desayuno)getModelObject()).getBocadillo());
				newDesayuno.setNaranja(((Desayuno)getModelObject()).getNaranja());
				serviceTeam.insert(newDesayuno);
				//addViewList();
			}
		};
		
		form.add(new Label("nameAlumnoLabel", getString("alumno.name")));
		form.add(new Label("bocadilloLabel", getString("bocadillo")));
		form.add(new Label("naranjaLabel", getString("naranja")));
		form.add(new RequiredTextField("alumno.name"));
		form.add(new RequiredTextField("bocadillo"));
		form.add(new RequiredTextField("naranja"));
		
		add(form);
		
	}
	
	
}
