package t9_ejercicio;

import java.util.Scanner;

public class Almacen {


		
		
		Producto[] inventario= new Producto[10];
		int tamano;
		String direccion;
		String encargado;
		
		 public Almacen() {}
		 
		 public Almacen (int capacidad) {this.tamano=capacidad;}
		 
		 public Almacen (int capacidad, String direccion, String encargado) {this.tamano=capacidad; this.direccion=direccion; this.encargado=encargado;
		 
		 
		 }

		public Producto[] getInventario() {
			return inventario;
		}

		public void setInventario(Producto[] inventario) {
			this.inventario = inventario;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getEncargado() {
			return encargado;
		}

		public void setEncargado(String encargado) {
			this.encargado = encargado;
		}

		public int getTamano() {
			return tamano;
		}
		
	

}
