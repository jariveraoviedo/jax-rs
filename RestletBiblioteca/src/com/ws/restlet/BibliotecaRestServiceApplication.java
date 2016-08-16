package com.ws.restlet;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class BibliotecaRestServiceApplication extends Application {

	@Override
	public synchronized Restlet createInboundRoot() {
		
		// Create a router Restlet that routes each call to a
		Router router = new Router(getContext());
		//router.attach("/usuario/{id}", UsuarioRestService.class);
		router.attach("/usuario", UsuarioRestService.class);
		router.attach("/libro", LibroRestService.class);
		return router;
	}
}
