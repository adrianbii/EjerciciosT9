package t9_ejercicios;


import java.text.ParseException;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;



public class Persona {

	private  String dni;
	private  String apellidos;
	private  String nombre;
	private  String sexo;
	private  LocalDate fecha_nac;
	private  double peso;
	private  double altura;

	public Persona(String dni, String apellidos, String nombre, String sexo, LocalDate fecha_nac, double peso,
			double altura) {
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sexo = sexo;
		this.fecha_nac = fecha_nac;
		this.peso = peso;
		this.altura = altura;

	}
	
	
	public Persona() {
		
		dni="-1";
		apellidos="sin especificar";
		nombre="sin especificar";
		sexo="v";
		this.fecha_nac=LocalDate.now();
		peso=50;
		altura=170;
	}
	
	public Persona(String nombre, String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}

	public Persona(String nombre, String apellidos, String sexo) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.sexo=sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDate getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public  void VerDatosPersona() {

		System.out.println("El dni es: " + dni + " los apellidos: " + apellidos + " el nombre: " + nombre + " el sexo: "
				+ sexo + " la fecha de nacimiento: " + fecha_nac + " el peso: " + peso + " y la altura: " + altura);

	}

	public  void LeerDatosPersona() throws ParseException {

		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el dni");
		this.dni = input.nextLine();
		System.out.println("Introduce los apellidos");
		this.apellidos = input.nextLine();
		System.out.println("Introduce el nombre");
		this.nombre = input.nextLine();
		System.out.println("Introduce el sexo");
		 do {
		System.out.println("Introduce v para masculino o m para femenino");
		this.sexo = input.nextLine();
		}while (!(sexo.equals("v") || sexo.equals("m")));
		
		System.out.println("introduce tu peso");
		this.peso = input.nextDouble();
		System.out.println("introduce tu altura");
		this.altura = input.nextDouble();
	}

}
