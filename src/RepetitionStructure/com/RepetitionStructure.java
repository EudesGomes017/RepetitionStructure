package RepetitionStructure.com;

import java.util.Locale;
import java.util.Scanner;

public class RepetitionStructure {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Fazer um programa que lê números inteiros até que um zero seja lido. ao final mostrar a soma
        do números lidos*/
        

       /* int x = sc.nextInt();

        int soma = 0; // o int soma tem que começar com alguma coisa e o zero(0) é o elemento neutro da soma.
        while (x != 0) {
            soma = soma + x; /*antes de pedir para o usuario digitar uma valor,vamos pegar esse valor e acumular
             dentro da variavel soma, soma = soma + x; ou (soma += x;, operador de atrinuição cumulativa)
              da o mesmo resultado
            x = sc.nextInt();
        }
        System.out.println(soma);*/
//------------------------------------------------------------------------------

        /*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/


     /*  int x = sc.nextInt();

        int leituraDeSenha = 0;

        while (x != 2002 ) {

            System.out.println(" Senha invalida " );

            leituraDeSenha = leituraDeSenha ;
            x = sc.nextInt();
        }
        System.out.println(" Acesso permetido " + leituraDeSenha);*/

        //  outra forma de fazer

      /*  int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso Permitido");*/
        //------------------------------------------------------------------

        /*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

     /*   int x = sc.nextInt();
        int y = sc.nextInt();


        while (x != 0.0 &&  y != 0.0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }*/
        //---------------------------------------------------------------

        /*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        exemplo*/

     /*   int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = sc.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            }
            else if (tipo == 2) {
                gasolina = gasolina + 1;
            }
            else if (tipo == 3) {
                diesel = diesel + 1;
            }

            tipo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        */

        /*QUESTÃO
         Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
         Escreva para cada X e Y uma mensagem que indique se estes valores foram
         digitados em ordem crescente ou decrescente.

         ENTRADA
         A entrada contém vários casos de teste. Cada caso contém dois valores
         inteiros X e Y. A leitura deve ser encerrada ao ser fornecido valores
         iguais para X e Y.

         SAÍDA
         Para cada caso de teste imprima “Crescente”, caso os valores tenham sido
         digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.*/


       /* int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != Y) {
            if (X < Y ) {
                System.out.println("Crescente");
            }
            else {
                System.out.println("Decrescente");
            }
            //mandar ler novamente
            X = sc.nextInt();
            Y = sc.nextInt();
        }
            */
//-----------------------------------------------------------------------

        /*Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de indivíduo.
         O último dado, que não entrará nos calculos, contémum valor de idade negativa. Calcular e imprimir a idade
         média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a mensagem "impossivel calcular"*/
        System.out.println("Digite a idade");

        int idade = sc.nextInt();
        int soma = 0 ;
        int cont = 0; // para contar a minhas quantidade de idade, por isso começa com 0.



        while (idade >= 0) {
            soma = soma + idade; // na variavel soma vamos somar a quantidade de idade.
            cont = cont + 1; // na variavel cont, vamos contar a quantidade de idade que digitei que nao sao negativas.

            idade = sc.nextInt();
        }
        /*temos que calcular a média do cont */
        if (cont > 0) {  //  se meu cont for maior q 0, digitei  uma idade valida
            double media = (double) soma / cont; // colocamos um casting (double) para divisão nao truncado
            System.out.printf("%.2f%n", media);
        }
        else {
            System.out.println("Impossivel calcular");
        }

        sc.close();
    }
}
