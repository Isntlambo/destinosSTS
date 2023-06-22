package destinos.repositorio;

import org.springframework.data.repository.CrudRepository;

import destinos.modelo.Cliente;

public interface ClienteRepositorio extends CrudRepository<Cliente, Integer>{

}
