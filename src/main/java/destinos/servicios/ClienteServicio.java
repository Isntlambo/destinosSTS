package destinos.servicios;

import java.util.List;

import destinos.modelo.Cliente;

public interface ClienteServicio {
	
	public List<Cliente> listarCliente();
	
	public Cliente crearCliente(Cliente cliente);
	
	public Cliente editarCliente(Cliente cliente);
	
	public Cliente buscarCliente(int id);
	
	public void eliminarCliente(int id);

}
