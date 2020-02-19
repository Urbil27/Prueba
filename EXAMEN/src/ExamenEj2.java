import java.util.Scanner;
public class ExamenEj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿Cuantos portales hay en el barrio?");
		int nportales = teclado.nextInt();
		int vecinos=0;
		int portalgrande=0;
		for(int cont=0;cont<nportales;cont++) {
			int grande=0;
			int calmedia=0;
			System.out.println("Dame el numero de portal:");
			int numportal=teclado.nextInt();
			System.out.println("¿Cuantas alturas tiene el edificio?");
			int numalturas = teclado.nextInt();
			System.out.println("¿Cuantas viviendas hay en el edificio?");
			int numviviendas=teclado.nextInt();
			for(int cont1=0; cont1<numviviendas;cont1++) {
				System.out.println("Dame el identificador de la vivienda:");
				int id=teclado.nextInt();
				System.out.println("Dame la superficie que tiene la vivienda:");
				int superficie=teclado.nextInt();
				calmedia=calmedia+superficie;
				int minusvalidos=2;
				if (superficie>70) {
					grande++;
				}
				while(minusvalidos!=1&&minusvalidos!=0) {
					System.out.println("¿Está la vivienda adaptada para minusvalidos?");
					minusvalidos=teclado.nextInt();
				}
				System.out.println("¿Cuantas personas viven en la vivienda?");
				int personas=teclado.nextInt();
				vecinos = vecinos+personas;
				
				if(minusvalidos==1) {
					int media=calmedia/numviviendas;
					System.out.println("La vivienda está adaptada y por eso saco la siguiente información:");
					System.out.println("La media de la superficie de las viviendas adaptadas es: "+media);
					
					}
					
					
			}
				if(numalturas>=4) {
				System.out.println("El portal "+numportal+"tiene 4 o mas alturas y por lo tanto saco la siguiente información:");
				System.out.println("El numero de portal es "+ numportal+" y el numero de vecinos es: "+vecinos);
			}
			if(numviviendas/2<grande) {
				portalgrande++;
			}
			System.out.println("El numero de portales que mas de la mitad de sus viviendas son grandes es de "+portalgrande);
		}
	}

}
