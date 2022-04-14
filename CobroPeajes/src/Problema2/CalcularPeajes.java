/** NOMBRE: DARREN A. ARAÚZ S. 
 * 	CEDULA: 4-800-552 **/
package Problema2;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularPeajes {

	static Vehiculos vehiculos = new Vehiculos(); //conexion a clase vehiculos
	static Scanner leer = new Scanner(System.in); 
	static DecimalFormat df = new DecimalFormat("#.##");
	
/*********************MENU***********************/
	public static void main(String[] args) { 

		int opcion; //variable que almacena la opcion de menu
		do {
		System.out.println();
		System.out.println("SISTEMA DE PEAJES");
		System.out.println("1- Nuevo peaje: ");
		System.out.println("2- Mostar peajes: ");
		System.out.println("3- Salir: ");
		System.out.print("Elija una opción: ");
		opcion = leer.nextInt();
		
		switch(opcion)//switch que envia a la funcion Insertar o Mostar
		{
		case 1: Insertar(); Mostrar();break; //caso 1 muestra la opcion Insertar y al finalizar ejecuta la opcion Mostar
		case 2: Mostrar();break;
		default: if(opcion!=3)System.out.println("Opción no válida."); break;
		}
		}while (opcion!=3);
	}
	
	/*********************************Insertar***************************************/
	public static void Insertar()//Metodo que inserta cada vez que un vehiculo nuevo ingresa por la estación de peaje
	{
		int tipo;
		int tamano = vehiculos.getTipos().length;//cuenta la cantidad de miembros de la case vehiculos
		System.out.println();
		
		//for que imprime los miebros de la clase vehiculo
		for(int i = 0; i <= tamano; i++)
		{
			if(tamano==i)//si tamaño es igual a i, el ciclo se detiene y pide elegir
			{
				System.out.print("Elija una opción: ");
				break;
			}
			System.out.println(i+1 +"- "+ vehiculos.getTipos()[i]+": ");
			System.out.println(" \t\t$"+df.format(vehiculos.getTarifas()[i]));
		}
		tipo = leer.nextInt();
		System.out.println();
		
		do {
			if(tipo==1)
			{
				vehiculos.setVlivianos(vehiculos.getVlivianos()+1);//almacena el paso de un vehiculo liviano
				vehiculos.setTotalvl(vehiculos.getTarifas()[0]+vehiculos.getTotalvl());
				System.out.println("Se ha actualizado los peajes!"); break;}
			if(tipo==2) {
				vehiculos.setBuses(vehiculos.getBuses()+1);//almacena el paso de un bus
				vehiculos.setTotalb(vehiculos.getTarifas()[1]+vehiculos.getTotalb());
				System.out.println("Se ha actualizado los peajes!");break;}
			if(tipo==3) {
				vehiculos.setClivianos(vehiculos.getClivianos()+1);//almacena el paso de un camion ligero
				vehiculos.setTotalcl(vehiculos.getTarifas()[2]+vehiculos.getTotalcl());
				System.out.println("Se ha actualizado los peajes!");break;}
			if(tipo==4) {
				vehiculos.setCpesados(vehiculos.getCpesados()+1);//almacena el paso de un camion pesado
				vehiculos.setTotalcp(vehiculos.getTarifas()[3]+vehiculos.getTotalcp());
				System.out.println("Se ha actualizado los peajes!");break;}
			else
				System.out.println("Opción no valida.");
		}while(tipo!=5);
		

	}
	
	/*******************************MOSTRAR*************************************/
	public static void Mostrar()//muestra los datos almacenados
	{
		System.out.println();
		System.out.println("PASOS DE VEHICULOS");
		System.out.println();
		System.out.println(vehiculos.getTipos()[0] +": "+ vehiculos.getVlivianos());
		System.out.println("Total por vehiculos livianos: $"+vehiculos.getTotalvl());
		System.out.println();
		System.out.println(vehiculos.getTipos()[1]+": "+vehiculos.getBuses());
		System.out.println("Total por buses: $"+vehiculos.getTotalb());
		System.out.println();
		System.out.println(vehiculos.getTipos()[2]+": "+vehiculos.getClivianos());
		System.out.println("Total por camiones ligeros: $"+vehiculos.getTotalcl());
		System.out.println();
		System.out.println(vehiculos.getTipos()[3]+": "+vehiculos.getCpesados());
		System.out.println("Total por camiones pesados: $"+vehiculos.getTotalcp());
		System.out.println();
		//muestra la suma total de todos los miebros de la clase vehiculo
		System.out.print("Total de vehiculos: ");
		System.out.println(vehiculos.getVlivianos()+vehiculos.getBuses()+vehiculos.getClivianos()+vehiculos.getCpesados());
		System.out.print("Total de ingresos: $");
		System.out.println(df.format(vehiculos.getTotalvl()+vehiculos.getTotalb()+vehiculos.getTotalcl()+vehiculos.getTotalcp()));
		
	}

}
