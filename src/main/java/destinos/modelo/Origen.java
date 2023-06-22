package destinos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Origen")
public class Origen {

@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int Id_Origen;
@Column
private int Nro_Aeropuerto;
@Column
private String Ciudad;
@Column
private String Cod_Ciudad;
@Column
private int Estado;


public int getId_Origen() {
	return Id_Origen;
}
public void setId_Origen(int id_Origen) {
	this.Id_Origen = id_Origen;
}
public int getNro_Aeropuerto() {
	return Nro_Aeropuerto;
}
public void setNro_Aeropuerto(int nro_Aeropuerto) {
	this.Nro_Aeropuerto = nro_Aeropuerto;
}
public String getCiudad() {
	return Ciudad;
}
public void setCiudad(String ciudad) {
	this.Ciudad = ciudad;
}
public String getCod_Ciudad() {
	return Cod_Ciudad;
}
public void setCod_Ciudad(String cod_Ciudad) {
	this.Cod_Ciudad = cod_Ciudad;
}
public int isEstado() {
	return Estado;
}
public void setEstado(int estado) {
	this.Estado = estado;
}




}
