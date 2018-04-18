package com.st.demo.ejb;

import com.st.demo.entity.Client;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Named
@Stateless
public class ClientRepositoryBean implements Serializable {
    @PersistenceContext(unitName = "MyPU")
    private EntityManager entityManager;

    public void addClient(String name) {
        entityManager.persist(new Client(name));
    }

    public List<Client> getClients() {
        return entityManager.createNamedQuery("Client.findAll", Client.class).getResultList();
    }

    public Client getClientWithId(int clientId) {
        return entityManager.createNamedQuery("Client.findById", Client.class).setParameter("id", clientId)
                .getSingleResult();
    }
}
