package t9_ejercicios;

import java.text.ParseException;

public class ControladorFecha {

	public static void main(String[] args) throws ParseException {
		
		Fecha fecha= new Fecha();
		//fecha.DiaSemana(30, 5, 1997);
		//fecha.EsFechaCorrecta();
		//fecha.DiaSiguiente(20, 05, 1997);
		//fecha.Verfecha();
		//fecha.MesSiguiente();
		//AvanzaDias(90);
		fecha.FechaMayor();
		System.out.println(fecha.FechaMayor());
		fecha.FechaMenor();
		System.out.println(fecha.FechaMenor());
		fecha.FechaIgual();
		System.out.println(fecha.FechaIgual());
	}

}
