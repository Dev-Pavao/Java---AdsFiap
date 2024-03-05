import java.util.Scanner;
public class ExercicioMediaMultiplicacao {
	public static void main(String[] args){
		
Scanner leitorDeDados = new Scanner(System.in);
System.out.println("Digite o numero1: ");
int num1= leitorDeDados.nextInt();	
System.out.println("Digite o numero2: ");
	int num2= leitorDeDados.nextInt();

	System.out.println("Digite o numero3: ");
	int num3= leitorDeDados.nextInt();

	leitorDeDados.close();

	int média = (num1 + num2 + num3) /3 ;
	int multiplicacao = num1 * num2 * num3;
	System.out.println("A média foi " + média + ", "
			+ "já a multiplicação foi de " + multiplicacao);
}
}
