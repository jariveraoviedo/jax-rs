package com.ws.restlet;

import org.restlet.data.Form;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;
import org.restlet.representation.Representation;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;

@Path("/usuario")
public class UsuarioRestService extends ServerResource {

	private static final Logger logger = Logger.getLogger(UsuarioRestService.class);
	
	@Get
    @Produces(MediaType.TEXT_PLAIN)
	public String getSomething() {
		String id=getQuery().getValues("id");
		if (logger.isDebugEnabled()) {
			logger.debug("Start getSomething");
			logger.debug("data: '" + id + "'");
		}

		String result = null;
		result = "Se consulto el usuario : " + id;

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + result + "'");
			logger.debug("End getSomething");
		}
		return result;
	}
	
	@Post
	public String postSomething(Representation entity) {

		String nombre;
		String edad;
		String categoria;
		Form form = new Form(entity);
		nombre = form.getValues("nombre");
		edad= form.getValues("edad");
		categoria= form.getValues("categoria");

		if (logger.isDebugEnabled()) {
			logger.debug("Start postSomething");
			logger.debug("data: '" + nombre+ "'");
		}
		
		
		String result = null;
		result = "Se ingreso el usuario : " + nombre+"";

		if (logger.isDebugEnabled()) {
			logger.debug("result: '" + result + "'");
			logger.debug("End postSomething");
		}
		return result;
	}


}
