import java.util.Scanner;
public class ExercicioSalarioAumentado {
public static void main(String[] args) {
	Scanner leitorDeDados = new Scanner(System.in);
	System.out.println("Digite seu nome");

	String nome = leitorDeDados.next();

	System.out.println("Digite seu salário");

	double salario = leitorDeDados.nextDouble();

	double salarioAumentado = salario * 1.10;
	
	leitorDeDados.close();
	
	String resposta = ("Olá " + nome + "! Seu novo salário será de RS" + 
	String.format("%.2f",salarioAumentado));

	System.out.println(resposta);
	}
}
