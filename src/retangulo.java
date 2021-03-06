
import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a largura do retangulo: ");
		double largura = sc.nextDouble();
		while (largura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		System.out.print("Digite a altura do retangulo: ");
		double altura = sc.nextDouble();
		while (altura <= 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
		}
		System.out.println();
		int opcao = 0;
		while (opcao != 3) {
			System.out.println("MENU: ");
			System.out.println("1 - Mostrar area ");
			System.out.println("2 - Mostrar perimetro ");
			System.out.println("3 - Sair ");
			System.out.print("Digite uma opcao: ");
			opcao = sc.nextInt();
			if (opcao <= 0 || opcao > 3) {
				System.out.println();
				System.out.println("OP��O INVALIDA");
				System.out.println();
			} else if (opcao == 1) {
				double area = largura * altura;
				System.out.println();
				System.out.printf("AREA = %.1f%n", area);
				System.out.println();
			} else if (opcao == 2) {
				double perimetro = 2 * (largura + altura);
				System.out.println();
				System.out.printf("PERIMETRO = %.1f%n", perimetro);
				System.out.println();
			}
		}
		System.out.println();
		System.out.printf("FIM DO PROGRAMA!");
		sc.close();
	}
}
