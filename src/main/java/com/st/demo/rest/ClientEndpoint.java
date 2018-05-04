package com.st.demo.rest;

import com.st.demo.ejb.ClientRepositoryBean;
import com.st.demo.entity.Client;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/clients")
public class ClientEndpoint {
    @EJB
    private ClientRepositoryBean repository;

    @GET
    @Produces("application/json")
    public List<Client> getClients() {
        return repository.getClients();
    }

    @GET()
    @Path("add/{name}")
    @Produces("application/json")
    public List<Client> addClient(@PathParam("name") String name) {
        repository.addClient(name);
        return repository.getClients();
    }
}
