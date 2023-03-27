package AtividadeSomativa;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

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
        else {

        }
    }
    public void exercicio2() {
        System.out.println("Informe o seu nº de matrícula: ");
        double numeroMatricula = sc.nextDouble();
        if (numeroMatricula % 4 == 0) {
            System.out.println("Você caiu no time de Chris");
        }

        else if (numeroMatricula % 4 == 1) {
            System.out.println("Você caiu no time de Greg");
        }
        
        else if (numeroMatricula % 4 == 2) {
            System.out.println("Você caiu no time de Caruso");
        }
        
        else if (numeroMatricula % 4 == 3) {
            System.out.println("Você caiu no time de Jerome");
        }
        else {

        }
    } 
    public void exercicio3() {
      System.out.println("Informe a quantidade (em kg) de maças compradas");
      double maca = sc.nextDouble();

      System.out.println("Informe a quantidade (em kg) de bananas compradas");
      double banana = sc.nextDouble();

      System.out.println("Informe a quantidade (em kg) de morangos comprados");
      double morango = sc.nextDouble();

      double valorTotal = morango * 3.5 + maca * 2.3 + banana * 1.8;

      if (morango + maca + banana > 15 || valorTotal > 30) {
        valorTotal *= 0.9;
        // aplica o desconto de 10%
      }
      System.out.println("O valor total da compra é: " + valorTotal + "R$");
      }  
    }