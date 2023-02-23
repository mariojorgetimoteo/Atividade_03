import java.util.Scanner;

public class Atividade_00 {

    static int number, number2, quantidade, x, y, z;
    static Scanner inputData = new Scanner(System.in);

    public static void main(String[] args) {

        par_ou_impar();

        divisival_3_quantidade();

        ordenacao();

    }

    static void par_ou_impar() {
        System.out.println("----------PAR OU IMPAR----------");
        System.out.println("");
        System.out.println("\nDigite o número: ");
        number = inputData.nextInt();
        if (number % 2 == 0) {
            System.out.println("\nO número " + number + " é Par");
            System.out.println("");
            System.out.println("--------------------------------\n");
        } else {
            System.out.println("\nO número " + number + " é Impar");
            System.out.println("");
            System.out.println("------------------------------------\n");
        }
    }

    static void divisival_3_quantidade() {
        System.out.println(" ---- Quantidade de números divisiveis por 3 ----\n ");
        System.out.println("Digite um número: \n");
        number2 = inputData.nextInt();
        if (number2 % 3 == 0) {
            System.out.println("Números divisiveis por 3 \n");
            for (int i = 1; i < number2; i++) {

                if (number2 % i == 0) {
                    quantidade++;

                    System.out.println("Os números são: " + i + ";");
                }

            }

        } else {
            System.out.println("Não é divisivel por 3");
        }

        System.out.println("\n Quantidade: " + quantidade);
        System.out.println("----------------------------------------------");
    }

    static void ordenacao() {

        System.out.println("-----------Ordenação-------------\n");
        System.out.println("Digite o primeiro número: \n");
        x = inputData.nextInt();
        System.out.println("Digite o segundo número: \n");
        y = inputData.nextInt();
        System.out.println("Digite o terceiro número: \n");
        z = inputData.nextInt();

        int[] vetorA = { x, y, z };

        for (int i = 0; i < vetorA.length - 1; i++) {
            for (int j = 0; j < vetorA.length - 1 - i; j++) {
                
                if (vetorA[j] > vetorA[j + 1]) {
                    int auxiliar = vetorA[j];
                    vetorA[j] = vetorA[j + 1];
                    vetorA[j + 1] = auxiliar;
                }
            }
        }
        System.out.println("\nNúmeros na ordem crescente:");
	    for(int i = 0; i<vetorA.length; i++){
		System.out.print(" "+vetorA[i]+",");
	}
        
    }

}