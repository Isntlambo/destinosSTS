package destinos.servicios.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import destinos.modelo.Cliente;
import destinos.repositorio.ClienteRepositorio;
import destinos.servicios.ClienteServicio;

@Service

public class ClienteServiceImp implements ClienteServicio{
	
	@Autowired
	private ClienteRepositorio repositorio;

	@Override
	public List<Cliente> listarCliente() {

		return (List<Cliente>) repositorio.findAll();
	}

	@Override
	public Cliente crearCliente(Cliente cliente) {
		cliente.setId(cliente.getId());
		return repositorio.save(cliente);
	}

	@Override
	public Cliente editarCliente(Cliente cliente) {

		return repositorio.save(cliente);
	}

	@Override
	public Cliente buscarCliente(int id) {

		return repositorio.findById(id).get();
	}

	@Override
	public void eliminarCliente(int id) {
		repositorio.deleteById(id);
		
	}

}
