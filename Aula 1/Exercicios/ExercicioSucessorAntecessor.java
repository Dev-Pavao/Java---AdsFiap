import java.util.Scanner;

public class ExercicioSucessorAntecessor {
public static void main(String[] args) {
	Scanner leitorDeDados = new Scanner(System.in);
	System.out.println("Digite um número :");
	
	int num = leitorDeDados.nextInt();
	
	leitorDeDados.close();
	
	int sucessorNum = num + 1;
	
	int antecessorNum = num - 1;
	
	
System.out.println("O número sucessor do que você digitou é " 
+ sucessorNum + ", já o antecessor é "+ antecessorNum);
	
}
}
