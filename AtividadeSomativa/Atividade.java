package AtividadeSomativa;

import java.util.Scanner;

public class Atividade {
    Scanner sc =  new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite um número: ");
        double numeroUm = sc.nextDouble();
        System.out.println("Digite outro número: ");
        double numeroDois = sc.nextDouble();
        System.out.println("Qual operação aritimética você quer que seja executada entre eles: Adição, Subtração, Divisão ou Multiplicação? Digite a primeira letra maiúscula e sem acentuações");
        String N = sc.next();

        if(N.equalsIgnoreCase("Adicao")) {
            double adicao = numeroUm + numeroDois;
            System.out.println("A soma entre os dois números é: " + adicao);
        }
        else if (N.equalsIgnoreCase("Subtracao")) {
            double subtracao = numeroUm - numeroDois;
            System.out.println("A subtração entre os dois números é: " + subtracao);
        }
        else if(N.equalsIgnoreCase("Multiplicacao")) {
            double multiplicacao = numeroUm * numeroDois;
            System.out.println("A multiplicação entre os dois é: " + multiplicacao);
        }
        else if(N.equalsIgnoreCase("Divisao")) {
            double divisao = numeroUm / numeroDois;
            System.out.println("A divisão entre os dois é: " + divisao);
        }
    }
}