import java.util.Scanner;

public class CalculandoDiasMeses {

	public static void main(String[] args) {
		
		
		Scanner leitorMes = new Scanner(System.in);
		
		int n = Integer.parseInt(leitorMes.nextLine());
		int diasMes = 30;
		int totalDiasMes = n * diasMes;

		System.out.println("o total de dias de " + n + " meses são " + (totalDiasMes));
		
		leitorMes.close();
	}

}
