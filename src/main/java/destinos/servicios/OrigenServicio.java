package destinos.servicios;
import java.util.List;
import destinos.modelo.Origen;

public interface OrigenServicio {
	
	public List<Origen> listarOrigen();
	
	public Origen crearOrigen(Origen origen);
	
	public Origen editarOrigen(Origen origen);
	
	public Origen buscarOrigen(int Id_Origen);
	
	public void eliminarOrigen(int Id_Origen);
	
	
}
