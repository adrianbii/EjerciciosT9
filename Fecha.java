package t9_ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Fecha {
	
	Scanner in= new Scanner(System.in);
	private int dia;
	private int mes;
	private int ano;
	
	public Fecha() {};
	public Fecha(int dia, int mes, int ano) {}
	
	public  boolean EsFechaCorrecta () {
		dia=in.nextInt();
		mes=in.nextInt();
		ano=in.nextInt();
		while (!false) {
		System.out.println("Introduce la fecha dia/mes/ano");
		System.out.println("dia:");
		if(dia>0 && dia<31) {dia=in.nextInt();}
		System.out.println("mes");
		if(mes>0 && mes<13) {mes=in.nextInt();}
		System.out.println("año:");
		if(ano>1900 && ano<2021) {ano=in.nextInt();}
		System.out.println("Fecha correcta"+ dia+"/"+mes+"/"+ano);
		return false;
	}}
	
	public  String DiaSemana(int dia, int mes, int ano) {
		
		TimeZone timezone = TimeZone.getDefault();
		 Calendar calendar = new GregorianCalendar(timezone);
	        calendar.set(ano, mes-1, dia);
	        String letraD="";
	        int d=calendar.get(Calendar.DAY_OF_WEEK);
	        
	        switch (d){
            case 1: letraD = "Domingo";
                break;
            case 2: letraD = "Lunes";
                break;
            case 3: letraD = "Martes";
                break;
            case 4: letraD = "Miercoles";
                break;
            case 5: letraD = "Jueves";
                break;
            case 6: letraD = "Viernes";
                break;
            case 7: letraD = "Sabado";
                break;
                
	        }
	        System.out.println("A dia: "+dia+" del mes "+mes+" del año "+ano+" es "+letraD);
		return letraD;
	}
	
	public String DiaSiguiente(int dia, int mes, int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
		String diaS= "el dia siguiente es: ";
		System.out.println(diaS+(dia+1)+"/"+mes+"/"+ano);
		return diaS;
		
	}
	
	public void Verfecha () {
		Calendar calendar= new GregorianCalendar();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatter.format(calendar.getTime()));
		
	}
	//Cogido mejorado para añadir mas tiempo a alguna fecha
	public void MesSiguiente () {
		Calendar calendar= new GregorianCalendar();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		calendar.set(Calendar.MONTH,2);
		System.out.println(formatter.format(calendar.getTime()));
		
	}
	
	public void AvanzaDias (int nd) {
		
		Calendar calendar= new GregorianCalendar();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		calendar.set(Calendar.DAY_OF_MONTH,nd+1);
		System.out.println(formatter.format(calendar.getTime()));
		
	}
	
	public boolean FechaMayor () throws ParseException {
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha1 = formatter.parse("30/05/1997");
		Date fecha2 = formatter.parse("30/05/1995");
		
		
		return (fecha1.before(fecha2));
	
		
		
	}
	
public boolean FechaMenor () throws ParseException {
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha1 = formatter.parse("30/05/1997");
		Date fecha2 = formatter.parse("30/05/1995");
		
		
		return (fecha1.after(fecha2));
	
		
		
	}
	
public boolean FechaIgual () throws ParseException {
	
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	Date fecha1 = formatter.parse("30/05/1997");
	Date fecha2 = formatter.parse("30/05/1995");
	
	
	return (fecha1.equals(fecha2));

	
	
}
	

}
