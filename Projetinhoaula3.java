
package projetinhoaula3;

import java.util.Scanner;


public class Projetinhoaula3 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declarando variavel
        String nome;
        int idade;
        float peso;
        char genero;
        boolean matricula;
        
        //Inicio 
        
        System.out.print("Digite seu nome por favor: "); //escreva
        nome = input.nextLine(); //leia
        
        System.out.print("Digite sua idade por favor: "); //escreva
        idade = Integer.valueOf(input.nextLine()); //leia
        
        System.out.print("Digite seu peso por favor: "); //escreva
        peso = Float.valueOf(input.nextLine()); //leia
        
        System.out.print("Digite seu genero por favor (M ou F): "); //escreva
        genero = input.nextLine().charAt(0); //leia
        
        System.out.print("Voce esta matriculado? (true ou false) "); //escreva
        matricula = Boolean.valueOf(input.nextLine()); //leia
        
        
        
        System.out.println();
        System.out.println("Dados Digitados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Genero: " + genero);
        System.out.println("Matriculado: " + matricula);
    }
    
}
