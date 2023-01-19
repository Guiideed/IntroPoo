package poo;
import Entites.Triangulo;
import java.util.Scanner;
import java.util.Locale;


public class Program {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);	
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		System.out.println("Coloque a medida do triangulo X");
		x.a = leitor.nextDouble();
		x.b = leitor.nextDouble();
		x.c = leitor.nextDouble();
		System.out.println("Colo que a medida do triangulo Y");
		y.a = leitor.nextDouble();
		y.b = leitor.nextDouble();
		y.c = leitor.nextDouble();
		
		double p = (x.a+x.b+x.c) /2.0;
		double areaX = Math.sqrt(p * (p-x.a)*(p-x.b)*(p-x.c));
		
		p = (y.a +y.b+y.c) / 2.0;
		double areaY = Math.sqrt(p * (p-y.a)*(p-y.b)*(p-y.c));
		
		System.out.printf("Triangulo X tem a area igual a %.4f%n", areaX);
		System.out.printf("Triangulo Y tem a area igual a %4f%n", areaY);
		
		if(areaX>areaY){
			System.out.println("A area do triangulo X é a maior dentre os dois");
		}else {
			System.out.println("A area do triangulo Y é a maior dentre os dois");
		}
		leitor.close();
	}

}
