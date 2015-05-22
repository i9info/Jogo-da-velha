
package jogo;

import java.util.Scanner;


public class Jogo {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
            int ganhou = 0, escolheJogador = 0;
            char posicao;
            char m[][]=new char [3][3];
            m[0][0]='1';
            m[0][1]='2';
            m[0][2]='3';
            m[1][0]='4';
            m[1][1]='5';
            m[1][2]='6';
            m[2][0]='7';
            m[2][1]='8';
            m[2][2]='9';
            for(int i=0; i<3 ; i++){
                
                 for(int j=0 ; j<3 ; j++){
                       
                        System.out.printf("   "+m[i][j]);
                  }
                 
                  System.out.println("\n");
            }
            do{
            escolheJogador=escolheJogador%2;
                 
            if(escolheJogador == 0){    
                 
            System.out.println("Jogador '1', Escolha uma posição");
            posicao=scanner.nextLine().charAt(0);
                
            }
    }
    
            //
            //test 2
