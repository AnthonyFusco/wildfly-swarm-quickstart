# Wildfly Swarm Quickstart

this repository has the purpose to enable a quick start on an J2EE project that uses JAX-RS and JPA.

## Functionalities

### REST Endpoints

Add REST endpoints in src/main/java/com/st/pccwildfly/rest, it uses the common JAX-RS API.

All new endpoints will be registered at the root http://localhost:8080/api/

### EJB

The EJBs are located in src/main/java/com/st/pccwildfly/ejb.

### JPA

The persistence modules uses h2 drivers and the database is the default base from Wildfly (not recommenced in 
production).

The persistence.xml file is located in src/main/resources/META-INF/persistence.xml, it uses the default configuration 
and load a .sql file into the database a launch.

### Dependency Injection

The EJBs can be injected using @Inject or other contextual annotations, like @PersistenceContext

The EJB ClientRepositoryBean is injected through @PersistenceContext. It is available because persistence.xml 
is available.

## How to run

```bash
# to build the .war file
mvn clean package

# to run in an embedded wildfly server
mvn wildfly-swarm:run
```

Go to http://localhost:8080 to see the index page.

Go to http://localhost:8080/api/clients to get the data from the embedded database.

## References

http://wildfly-swarm.io/