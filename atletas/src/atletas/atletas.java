package atletas;

import java.util.Scanner;

public class atletas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;
		String nome = "";
		char sexo = '0';
		double altura = 0;
		double peso = 0;
		double pesoMedio = 0;
		double somaPeso = 0;
		double maisAlto = 0;
		int qtdH = 0;
		String nomeMaisAlto = "";
		double altF = 0;
		int qtdMulheres = 0;
		double altMediaF= 0;
		String cadM = "N�o h� mulheres cadastradas!!!";
		

		System.out.print("Qual a quantidade de atletas? ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Digite os dados do atleta n�mero " + i + ":");

			System.out.print("Nome: ");
			nome = sc.nextLine();

			System.out.print("Sexo: ");
			sexo = sc.next().charAt(0);
			if (sexo == 'M') {
				qtdH += 1;
			}
			else {
				qtdMulheres += 1;
			}

			System.out.print("Altura: ");
			altura = sc.nextDouble();
			if (altura > maisAlto) {
				maisAlto = altura;
				nomeMaisAlto = nome;
			}
			if(sexo == 'F') {
				altF = altura;
			}

			System.out.print("Peso: ");
			peso = sc.nextDouble();
			somaPeso = somaPeso + peso;

		}
	
		pesoMedio = somaPeso / n;
		double porH = ((double)qtdH / (double)n * 100);
		altMediaF = altF / qtdMulheres;

		System.out.println("Relat�rio:");
		System.out.println("Peso m�dio dos atletas: " + pesoMedio);
		System.out.println("Atleta mais alto: " + nomeMaisAlto);
		System.out.println("Porcentagem de Homens: " + porH + " %");
		if(qtdMulheres > 0) {
			System.out.println("Altura m�dia das mulheres: " + altMediaF);
		}
		else {
			System.out.println(cadM);
		}
		sc.close();
	}
}
