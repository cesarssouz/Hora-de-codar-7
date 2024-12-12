import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Por qual exercício você deseja navegar? (1 a 15)");
        int exercicio = entradaDados.nextInt();

        switch (exercicio) {
            case 1:
                // Exercício 1
                String planeta = "Plutão";
                System.out.println(planeta);
                break;

            case 2:
            case 3:
                // Exercício 2 e 3

                String text = " ";
                int idade = 0;
                int area = 0;

                System.out.println("Digite seu nome: ");
                text = entradaDados.next();
                System.out.println(" Olá " + text);
                System.out.println("Digite sua idade: ");
                idade = entradaDados.nextInt();
                System.out.println(" Olá " + text + " sua idade " + idade);
                break;

            case 4:
                // Exercício 4.1 - Retângulo
                System.out.println("Digite a base: ");
                double base = entradaDados.nextDouble();
                System.out.println("Digite a altura: ");
                double altura = entradaDados.nextDouble();
                System.out.println(" O resultado é " + base * altura);

                // Exercício 4.2 - Quadrado
                System.out.println("Digite a lado: ");
                double lado = entradaDados.nextInt();
                System.out.println("o valor é: " + lado * lado);

                // Exercício 4.3 Losango
                System.out.println("digite o diagonal maior: ");
                double diagonal = entradaDados.nextDouble();
                System.out.println("digite o valor da diagonal menor: ");
                double diagonalMenor = entradaDados.nextDouble();
                System.out.println("digite o valor da altura: ");
                double altura2 = entradaDados.nextDouble();
                System.out.println("o valor é: " + (diagonal + diagonalMenor) * altura2 / 2);

                // Exercício 4.4 Trapezio
                System.out.println("Digite a base maior: ");
                double baseMaior = entradaDados.nextDouble();
                System.out.println("Digite a base menor: ");
                double baseMenor = entradaDados.nextDouble();
                System.out.println("Digite a altura: ");
                double altura1 = entradaDados.nextDouble();
                System.out.println(" O resultado é " + (baseMaior + baseMenor) * altura1 / 2);

                // Exercício 4.5 Paraletogramo
                System.out.println("Digite a base2: ");
                double base2 = entradaDados.nextDouble();
                System.out.println("Digite a altura: ");
                double altura3 = entradaDados.nextDouble();
                System.out.println(" O resultado é " + base2 * altura3);

                // Exercício 4.6 Triângulo
                System.out.println("Digite a base3: ");
                double base3 = entradaDados.nextDouble();
                System.out.println("Digite a altura: ");
                double altura4 = entradaDados.nextDouble();
                System.out.println(" O resultado é " + base3 * altura4 / 2);

                // Exercício 4.7 Circulo
                System.out.println("Digite o raio da área : ");
                double raio = entradaDados.nextDouble();
                System.out.println("o valor da círculo é " + raio * raio * 3.14f);
                break;

            case 5:
                // Exercício 5
                System.out.println("Digite um número: ");
                double numero = entradaDados.nextDouble();

                if (numero < 0) {
                    System.out.println("O número é negativo");
                } else if (numero > 0) {
                    System.out.println("O número é positivo");
                } else {
                    System.out.println("O número é neutro");
                }

                System.out.println("Digite o segundo número: ");
                double numero2 = entradaDados.nextDouble();
                if (numero2 < 0) {
                    System.out.println("O número é negativo");
                } else if (numero2 > 0) {
                    System.out.println("O número é positivo");
                } else {
                    System.out.println("O número é neutro");
                }
                System.out.println("Digite o terceiro número: ");
                double numero3 = entradaDados.nextDouble();
                if (numero3 < 0) {
                    System.out.println("O número é negativo");
                } else if (numero3 > 0) {
                    System.out.println("O número é positivo");
                } else {
                    System.out.println("O número é neutro");
                }
                break;

            case 6:
                // Exercício 6
                System.out.println("Digite o primeiro número: ");
                double primeironumero = entradaDados.nextDouble();
                System.out.println("Digite o segundo número: ");
                double segundonumero = entradaDados.nextDouble();
                while (segundonumero == primeironumero) {
                    System.out.println("Digite um número diferente do primeiro: ");
                    segundonumero = entradaDados.nextDouble();
                }
                System.out.println("Digite o terceiro número: ");
                double terceironumero = entradaDados.nextDouble();
                while (terceironumero == primeironumero || terceironumero == segundonumero) {
                    System.out.println("Digite um número diferente dos dois primeiros: ");
                    terceironumero = entradaDados.nextDouble();
                }
                if (primeironumero > segundonumero && primeironumero > terceironumero) {
                    System.out.println("O maior número é: " + primeironumero);
                } else if (segundonumero > primeironumero && segundonumero > terceironumero) {
                    System.out.println("O maior número é: " + segundonumero);
                } else {
                    System.out.println("O maior número é: " + terceironumero);
                }

                // Exercício 6.1
                System.out.println("Digite o primeiro número: ");
                double primeironumero1 = entradaDados.nextDouble();
                System.out.println("Digite o segundo número: ");
                double segundonumero1 = entradaDados.nextDouble();
                while (segundonumero1 == primeironumero1) {
                    System.out.println("Digite um número diferente do primeiro: ");
                    segundonumero1 = entradaDados.nextDouble();
                }
                System.out.println("Digite o terceiro número: ");
                double terceironumero1 = entradaDados.nextDouble();
                while (terceironumero1 == primeironumero1 || terceironumero1 == segundonumero1) {
                    System.out.println("Digite um número diferente dos dois primeiros: ");
                    terceironumero1 = entradaDados.nextDouble();
                }
                System.out.println("Digite o quarto número: ");
                double quartonumero1 = entradaDados.nextDouble();
                while (quartonumero1 == primeironumero1 || quartonumero1 == segundonumero1 || quartonumero1 == terceironumero1) {
                    System.out.println("Digite um número diferente dos três primeiros: ");
                    quartonumero1 = entradaDados.nextDouble();
                }
                if (primeironumero1 > segundonumero1 && primeironumero1 > terceironumero1 && primeironumero1 > quartonumero1) {
                    System.out.println("O maior número é: " + primeironumero1);
                } else if (segundonumero1 > primeironumero1 && segundonumero1 > terceironumero1 && segundonumero1 > quartonumero1) {
                    System.out.println("O maior número é: " + segundonumero1);
                } else if (terceironumero1 > primeironumero1 && terceironumero1 > segundonumero1 && terceironumero1 > quartonumero1) {
                    System.out.println("O maior número é: " + terceironumero1);
                } else {
                    System.out.println("O maior número é: " + quartonumero1);
                }
                break;

            case 7:
                // Exercício 7
                System.out.println("Digite o primeiro número: ");
                double primeironumero2 = entradaDados.nextDouble();
                System.out.println("Digite o segundo número: ");
                double segundonumero2 = entradaDados.nextDouble();
                while (segundonumero2 == primeironumero2) {
                    System.out.println("Digite um número diferente do primeiro: ");
                    segundonumero2 = entradaDados.nextDouble();
                }
                System.out.println("Digite o terceiro número: ");
                double terceironumero2 = entradaDados.nextDouble();
                while (terceironumero2 == primeironumero2 || terceironumero2 == segundonumero2) {
                    System.out.println("Digite um número diferente dos dois primeiros: ");
                    terceironumero2 = entradaDados.nextDouble();
                }
                if (primeironumero2 > terceironumero2 && segundonumero2 > terceironumero2) {
                    System.out.println("A soma dos dois números maiores é igual a: " + primeironumero2 + segundonumero2);
                } else if (primeironumero2 > segundonumero2 && terceironumero2 > segundonumero2) {
                    System.out.println("A soma dos dois números maiores é igual a: " + primeironumero2 + terceironumero2);
                } else {
                    System.out.println("A soma dos dois números maiores é igual a: " + segundonumero2 + terceironumero2);
                }

                // Exercício 7.1
                System.out.println("Digite o primeiro número: ");
                double primeironumero3 = entradaDados.nextDouble();
                System.out.println("Digite o segundo número: ");
                double segundonumero3 = entradaDados.nextDouble();
                while (segundonumero3 == primeironumero3) {
                    System.out.println("Digite um número diferente do primeiro: ");
                    segundonumero3 = entradaDados.nextDouble();
                }
                System.out.println("Digite o terceiro número: ");
                double terceironumero3 = entradaDados.nextDouble();
                while (terceironumero3 == primeironumero3 || terceironumero3 == segundonumero3) {
                    System.out.println("Digite um número diferente dos dois primeiros: ");
                    terceironumero3 = entradaDados.nextDouble();
                }
                System.out.println("Digite o quarto número: ");
                double quartonumero3 = entradaDados.nextDouble();
                while (quartonumero3 == primeironumero3 || quartonumero3 == segundonumero3 || quartonumero3 == terceironumero3) {
                    System.out.println("Digite um número diferente dos três primeiros: ");
                    quartonumero3 = entradaDados.nextDouble();
                }
                System.out.println("Digite o quinto número: ");
                double quintonumero3 = entradaDados.nextDouble();
                while (quintonumero3 == primeironumero3 || quintonumero3 == segundonumero3 || quintonumero3 == terceironumero3 || quintonumero3 == quartonumero3) {
                    System.out.println("Digite um número diferente dos quatro primeiros: ");
                    quintonumero3 = entradaDados.nextDouble();
                }
                if (primeironumero3 > segundonumero3 && primeironumero3 > terceironumero3 && primeironumero3 > quartonumero3 && primeironumero3 > quintonumero3) {
                    System.out.println("O maior número é: " + primeironumero3);
                } else if (segundonumero3 > primeironumero3 && segundonumero3 > terceironumero3 && segundonumero3 > quartonumero3 && segundonumero3 > quintonumero3) {
                    System.out.println("O maior número é: " + segundonumero3);
                } else if (terceironumero3 > primeironumero3 && terceironumero3 > segundonumero3 && terceironumero3 > quartonumero3 && terceironumero3 > quintonumero3) {
                    System.out.println("O maior número é: " + terceironumero3);
                } else if (quartonumero3 > primeironumero3 && quartonumero3 > segundonumero3 && quartonumero3 > terceironumero3 && quartonumero3 > quintonumero3) {
                    System.out.println("O maior número é: " + quartonumero3);
                } else {
                    System.out.println("O maior número é: " + quintonumero3);
                }
                break;

            case 8:
                // Exercício 8
                System.out.println("Digite o primeiro número: ");
                double primeironumero4 = entradaDados.nextDouble();
                System.out.println("Digite o segundo número: ");
                double segundonumero4 = entradaDados.nextDouble();
                if (segundonumero4 <= 0) {
                    System.out.println("Digite um número maior que 0");
                    segundonumero4 = entradaDados.nextDouble();
                }
                System.out.println("A divisão dos números é: " + primeironumero4 / segundonumero4);
                break;

            case 9:
                // Exercício 9
                System.out.println("Digite o primeiro número: ");
                double primeironumero5 = entradaDados.nextDouble();
                System.out.println("Digite o segundo número: ");
                double segundonumero5 = entradaDados.nextDouble();
                System.out.println("Digite o terceiro número: ");
                double terceironumero5 = entradaDados.nextDouble();
                System.out.println("Digite o quarto número: ");
                double quartonumero5 = entradaDados.nextDouble();
                System.out.println("Digite o quinto número: ");
                double quintonumero5 = entradaDados.nextDouble();
                System.out.println("Digite o sexto número: ");
                double sextonumero5 = entradaDados.nextDouble();
                System.out.println("Digite o sétimo número: ");
                double setimonumero5 = entradaDados.nextDouble();
                System.out.println("Digite o oitavo número: ");
                double oitavonumero5 = entradaDados.nextDouble();
                System.out.println("Digite o nono número: ");
                double nononumero5 = entradaDados.nextDouble();
                System.out.println("Digite o décimo número: ");
                double decimonumero5 = entradaDados.nextDouble();
                System.out.println("A média aritmética dos 10 números é: " + (primeironumero5 + segundonumero5 + terceironumero5 + quartonumero5 + quintonumero5 + sextonumero5 + setimonumero5 + oitavonumero5 + nononumero5 + decimonumero5) / 10);
                break;

            case 10:

                // Exercício 10
                System.out.println("Digite o primeiro número: ");
                double primeironumero6 = entradaDados.nextDouble();
                if (primeironumero6 < 0 || primeironumero6 > 10) {
                    System.out.println("Digite um número entre 0 e 10");
                    primeironumero6 = entradaDados.nextDouble();
                }
                System.out.println("Digite o segundo número: ");
                double segundonumero6 = entradaDados.nextDouble();
                if (segundonumero6 < 0 || segundonumero6 > 10) {
                    System.out.println("Digite um número entre 0 e 10");
                    segundonumero6 = entradaDados.nextDouble();
                }
                System.out.println("Digite o terceiro número: ");
                double terceironumero6 = entradaDados.nextDouble();
                if (terceironumero6 < 0 || terceironumero6 > 10) {
                    System.out.println("Digite um número entre 0 e 10");
                    terceironumero6 = entradaDados.nextDouble();
                }
                System.out.println("Digite o quarto número: ");
                double quartonumero6 = entradaDados.nextDouble();
                if (quartonumero6 < 0 || quartonumero6 > 10) {
                    System.out.println("Digite um número entre 0 e 10");
                    quartonumero6 = entradaDados.nextDouble();
                }
                int mediadoaluno = (int) ((primeironumero6 + segundonumero6 + terceironumero6 + quartonumero6) / 4);
                if (mediadoaluno >= 6) {
                    System.out.println("Aluno foi aprovado");
                } else {
                    System.out.println("Aluno foi reprovado");
                }
                break;

            case 11:
                // Exercício 11
                int inicio = 30;
                int fim = 0;
                while (inicio >= fim) {
                    System.out.println("A bomba vai explodir em " + inicio);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        inicio--;
                    }
                }
                System.out.println("BOOOOMMM. A BOMBA EXPLODIU!");
                break;

            case 12:
                // Exercício 12
                int inicio2 = 10;

                while (inicio2 >= 10) {
                    System.out.println(inicio2);
                    inicio2--;

                }
                break;

            case 13:
                // Exercício 13
                System.out.println("Digite um número");
                int primeironumerointeiro = entradaDados.nextInt();

                System.out.println("Digite um número");
                int segundonumerointeiro = entradaDados.nextInt();

                while (segundonumerointeiro < primeironumerointeiro) {
                    System.out.println("Escreva um número maior que o primeiro");
                    segundonumerointeiro = entradaDados.nextInt();
                }

                double media = ((primeironumerointeiro + segundonumerointeiro) / 2.0);

                System.out.println("A média dos números " + primeironumerointeiro + " e " + segundonumerointeiro + " é " + media);

                while (segundonumerointeiro >= primeironumerointeiro) {
                    System.out.println(segundonumerointeiro);
                    segundonumerointeiro--;
                }
                break;

            case 14:
                // Exercício 14
                boolean continuar = true;
                int alunosAprovados = 0;

                while (continuar) {
                    // Entrada das notas
                    System.out.println("Digite a primeira nota");
                    double nota1 = entradaDados.nextDouble();

                    System.out.println("Digite a segunda nota");
                    double nota2 = entradaDados.nextDouble();

                    System.out.println("Digite a terceira nota");
                    double nota3 = entradaDados.nextDouble();

                    System.out.println("Digite a quarta nota");
                    double nota4 = entradaDados.nextDouble();

                    System.out.println("Digite a quinta nota");
                    double nota5 = entradaDados.nextDouble();

                    System.out.println("Digite a sexta nota");
                    double nota6 = entradaDados.nextDouble();

                    // Calculando a média
                    double mediaNotas = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6;

                    // Verificando se o aluno foi aprovado ou reprovado
                    if (mediaNotas >= 6.5) {
                        System.out.println("Aluno aprovado!");
                        alunosAprovados++;
                    } else {
                        System.out.println("Aluno reprovado!");
                    }

                    // Perguntando se deseja continuar
                    System.out.println("Você deseja calcular a média de outro aluno? (Sim/Não)");
                    entradaDados.nextLine(); // Limpar o buffer de entrada
                    String resposta = entradaDados.nextLine().trim().toLowerCase();

                    if (resposta.equals("sim") || resposta.equals("s")) {
                        System.out.println("Continuando...");
                    } else if (resposta.equals("não") || resposta.equals("n") || resposta.equals("nao")) {
                        System.out.println("Parando...");
                        continuar = false;
                        System.out.println("Número de alunos aprovados: " + alunosAprovados);
                    } else {
                        System.out.println("Resposta inválida. Digite Sim ou Não.");
                    }
                }
                break;

            case 15:
                // Exercício 15
                double anacleto = 1.50;
                double felisberto = 1.10;

                int anospassados = 0;

                while (felisberto < anacleto) {

                    System.out.println("Felisberto tem " + felisberto + " de altura");
                    System.out.println("Anacleto tem " + anacleto + " de altura");

                    anospassados++;
                    System.out.println("Passou 1 ano");

                    anacleto += 0.2;
                    felisberto += 0.3;
                }

                System.out.println("Para Felisberto ser maior que Anacleto, é necessário " + anospassados + " anos.");

                break;

            default:
                System.out.println("Exercício inválido.");
        }



    }
}