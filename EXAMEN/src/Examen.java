import java.util.Scanner;
public class Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Escoje una de las siguientes opciones: ");
			System.out.println("1.-Decir si un numero es binario o no");
			System.out.println("2.-Pasar de decimal a binario");
			System.out.println("3.-Pasar de binario a decimal");
			System.out.println("4.-Finalizará el programa");
			opcion=teclado.nextInt();
		}
		while(opcion<1 || opcion>4);
		//Programa 1
		if(opcion==1) {
			boolean binario=true;
			System.out.println("dame un numero y te dire si el numero es binaro o no");
			int numero=teclado.nextInt();
			int digito;
			while(numero>0) {
				digito=numero%10;
				numero=numero/10;
				if(digito!=1 && digito!=0) {
					binario=false;
				}
			}
			if(binario==false) {
				System.out.println("El numero introducido no es binario");
			}
			else {
				System.out.println("El numero introducido si es binario");
			}
		}
		//Programa2
		else if(opcion==2) {
			System.out.println("Dame un numero en decimal y lo pasare a binario:");
			int numero=teclado.nextInt();
			int copia=numero;
			int digito=0;
			int multiplicador=1;
			int respuesta=0;;
			while(numero>0) {
				digito=numero%2;
				numero=numero/2;
				respuesta=respuesta+digito*multiplicador;
				multiplicador=multiplicador*10;
			}
			System.out.println("tu numero en binario es: "+respuesta);
		}
		//Programa 3
		else if(opcion==3) {
			System.out.println("Dame un numero en binario y lo pasare a decimal:");
			int numero = teclado.nextInt();
			int copia=numero;
			int digito;
			int digitcal;
			int elevar=0;
			int numf=0;
			
			boolean binario=true;
			while(copia>0) {
				digito=copia%10;
				copia=copia/10;
				if(digito!=1 && digito!=0) {
					binario=false;
				}
			}
			if(binario==false) {
				System.out.println("El numero introducido no es binario");
			}
			else {
				while(numero>0) {
					digitcal=numero%10;
					numero=numero/10;
					if (digitcal==1) {
						int elevaresult=1;
						for (int cont=0;cont<elevar;cont++) {
							elevaresult=elevaresult*2;
						
						}
						numf=numf+elevaresult;
					}
					
					elevar++;
				}
				System.out.println(numf);
			}
		}
		else if(opcion==4) {
			System.out.println("Saliendo...");
		}
	}

}
