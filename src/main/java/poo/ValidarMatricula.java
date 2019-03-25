package poo;

import java.util.Scanner;

public class ValidarMatricula {
    public static void main(String[] args) {

        long matricula;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua matrícula:");
        matricula = teclado.nextLong();

        //tem que fazer o mod para pegar o ultimo numero
        //mod == %
        //usa mod 10

       // long DigVer = matricula%10;
       // int digver = (int) DigVer;

//tonar long em int
        int digver = (int) matricula%10;

        int soma = 0;

        //System.out.println(DigVer);
        matricula = matricula/10;

        for(int i = 2; i < 11; i ++){

            int aux = (int) matricula%10;
            aux = aux * i;
            soma = soma + aux;
            matricula = matricula/10;

        }

        soma = soma * 10;
        soma = soma%11;

        if(soma == digver){
            System.out.println("Digito verificador correto");
        }
        else System.out.println("Digito verificador errado, o correto é: "+ soma);



    }
}
