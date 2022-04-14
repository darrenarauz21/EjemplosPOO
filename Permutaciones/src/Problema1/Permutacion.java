package Problema1;

import java.io.IOException;

public class Permutacion {

public static void main(String[] args)throws IOException {
/*******Por si la cadena se desea ingresar por teclado**********/
	//define la cadena predeterminaria
	/*String cadena="";
	InputStreamReader leer = new InputStreamReader(System.in);
	BufferedReader buffer = new BufferedReader(leer);
	System.out.print("Ingrese Cadena: ");
	//lee el String llamado "cadena"
	cadena = buffer.readLine();
	//llama la función ImpCadena*/
/***********************************************************/	
	Permutacion permutacion = new Permutacion();
	permutacion.ImpCadena("abcd", "");
}

/**********************************IMPRIME LA CADENA Y SUS COMBINACIONES***********************************************/
//funcion recursiva que recibe el String cadena y res el resultado de sí mismo
public void ImpCadena(String cadena, String res){
	//revisa si la cadena se encuentra vacia
	if (cadena.length() == 0) {
		//imprime el resultado
		System.out.print(res + " ");
    }

    for (int i = 0; i < cadena.length(); i++) {
    	//recibe el caracter de la pocision i
        char aux = cadena.charAt(i);
        //resta la cadena luego de excluir a i
        String aux2 = cadena.substring(0, i)+cadena.substring(i + 1);
        //llamada recursiva
        ImpCadena(aux2, res + aux);
    }
	
}
}
