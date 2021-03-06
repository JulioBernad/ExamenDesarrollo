package es.salesianos.edu.webpages;

import java.awt.Container; 
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.wicket.markup.html.basic.Label;

import es.salesianos.edu.models.Desayuno;
import es.salesianos.edu.repository.Repository;
import es.salesianos.edu.service.ServiceTeam;

public class ListDesayunoPage extends WebPage{
	
	private static final long serialVersionUID = -1935854748907274886L;
	
	@SpringBean
	ServiceTeam service;
	
	@Autowired
	Repository repository;

	private List<Desayuno> listDesayuno = Collections.emptyList();
	

	public ListDesayunoPage() {
		initC();
	}
	
	/*public void addFormList() {
		Form form = new Form("formListTeam", new CompoundPropertyModel(new Team())) {
			
		};
		add(form);
	}*/
	
	public void initC(){
		//addFormList();
		addViewListForm();
	}
	
	
	
	
	
	public void addViewListForm() {
		Desayuno desayuno = new Desayuno();
		listDesayuno = service.addListDesayuno();
		ListView<Desayuno> desayunos = new ListView<Desayuno>("desayuno-group", listDesayuno) {
			@Override
			protected void populateItem(ListItem item) {
				Desayuno desayuno = (Desayuno) item.getModelObject();
				item.add(new Label("alumno", desayuno.getAlumno()));
				item.add(new Label("bocadillo", desayuno.getBocadillo()));
				item.add(new Label("naranja", desayuno.getNaranja()));
			}
		};
		add(desayunos);
	}
}
