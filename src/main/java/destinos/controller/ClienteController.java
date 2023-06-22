package destinos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import destinos.modelo.Cliente;
import destinos.servicios.imp.ClienteServiceImp;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ClienteController {
	
	@Autowired
	private ClienteServiceImp service;

	@GetMapping("api/clientes")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> listarCliente(){
		List<Cliente> listaCliente=service.listarCliente();
		return ResponseEntity.ok(listaCliente);
	}

	@PostMapping("api/nuevo")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> crearCliente(@RequestBody Cliente cliente) {
	    try {
	        Cliente clienteCreado = service.crearCliente(cliente);
	        return ResponseEntity.status(HttpStatus.CREATED).body(clienteCreado);
	    } catch (Exception ex) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al crear el cliente.");
	    }
	}

	@PutMapping("api/actualizar")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> editarCliente(@RequestBody Cliente cliente) {
	    try {
	        Cliente clienteEditado = service.editarCliente(cliente);
	        return ResponseEntity.status(HttpStatus.CREATED).body(clienteEditado);
	    } catch (Exception ex) {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error al editar el cliente.");
	    }
	}

	@GetMapping("api/clientes/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> buscarCliente(@PathVariable int id){
		Cliente cliente=service.buscarCliente(id);
		return ResponseEntity.ok(cliente);
	}
	@DeleteMapping("api/eliminar/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> eliinarCliente(@PathVariable int id){
		service.eliminarCliente(id);
		return ResponseEntity.ok().build();
	}
}
