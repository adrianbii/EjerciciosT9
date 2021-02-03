package t9_ejercicio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Producto {
	
	private int idProducto;
	private String nombre;
	private String descripcion;
	private LocalDate fecha_cad;
	
	
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/YYY");
	//this.fecha_cad= LocalDate.parse(fecha_nac, formato);
	
	public Producto() {}
	
	public Producto(int id, String nombre, String descripcion) {}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", fecha_cad=" + fecha_cad + ", formato=" + formato + "]";
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFecha_cad() {
		return fecha_cad;
	}

	public void setFecha_cad(CharSequence fecha_cad) {
		this.fecha_cad= LocalDate.parse(fecha_cad, formato);
	}

	public DateTimeFormatter getFormato() {
		return formato;
	}

	public void setFormato(DateTimeFormatter formato) {
		this.formato = formato;
	}
	
	
}
