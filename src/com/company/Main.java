package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner a = new Scanner(System.in);
        System.out.println("INFORME A QUANTIDADE DE PACIENTES: ");
        int quantidadePaciente = a.nextInt();
        int idadePaciente;
        int idadeMaisVelho = 0;
        for (int i=1; i<=quantidadePaciente; i++){
            System.out.println("INFORME A IDADE: " +i);
            idadePaciente = a.nextInt();
            if(idadePaciente>idadeMaisVelho){
                idadeMaisVelho = idadePaciente;
            }
        }
        System.out.println("A IDADE DO MAIS VELHO É: " + idadeMaisVelho);
    }
}
