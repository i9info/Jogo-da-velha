
package jogo;

import java.util.Scanner;


public class Jogo {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
            int Ganhou = 0, escolheJogador = 0;
            char Posicao;
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
            for(int i=0; i<3; i++){
                
                 for(int j=0; j<3; j++){
                       
                        System.out.printf("   "+m[i][j]);
                  }
                 
                  System.out.println("\n");
            }
            do{
            escolheJogador=escolheJogador%2;
                 
            if(escolheJogador == 0){    
                 
            System.out.println("Jogador '1', Escolha uma posição");
            Posicao=scanner.nextLine().charAt(0);
            
            for (int i=0; i<3; i++){ 
                for(int j=0; j<3; j++){
            
                if(Posicao==m[i][j]){
                    m[i][j]='x';
                    escolheJogador=escolheJogador+1;
                }
            }
            } 
            
            if(escolheJogador==0){
                System.out.println("\n\n\n\n\nposicao invalida\n");
                
            for(int i=0; i<3; i++){       
                 
                  for(int j=0 ; j<3 ; j++){
                             if(Posicao==m[i][j]){
                                   m[i][j]='O';
                                   escolheJogador=escolheJogador+1;
            }
    }        
            }if(escolheJogador==0){
                             System.out.println("\n\n\n\n\nPosição Inválida\n");       
                        }
                       
                  }
               
            for(int i=0; i<3 ; i++){      
                 
                  for(int j=0 ; j<3 ; j++){
                       
                        System.out.printf("   "+m[i][j]);
                  }
                 
                  System.out.println("\n");
            }
           
            if(m[0][0]=='X'&&m[0][1]=='X'&&m[0][2]=='X' || m[1][0]=='X'&&m[1][1]=='X'&&m[1][2]=='X' || m[2][0]=='X'&&m[2][1]=='X'&&m[2][2]=='X' || m[0][0]=='X'&&m[1][0]=='X'&&m[2][0]=='X' || m[0][1]=='X'&&m[1][1]=='X'&&m[2][1]=='X'|| m[0][2]=='X'&&m[1][2]=='X'&&m[2][2]=='X'|| m[0][0]=='X'&&m[1][1]=='X'&&m[2][2]=='X'|| m[2][0]=='X'&&m[1][1]=='X'&&m[0][2]=='X'){
                  System.out.println("\n\n\n\n\njogador 1 ganhou\n\n\n\n\n\n\n\n");
                Ganhou=1;
            }
                 
           
              if(m[0][0]=='O'&&m[0][1]=='O'&&m[0][2]=='O' || m[1][0]=='O'&&m[1][1]=='O'&&m[1][2]=='O' || m[2][0]=='O'&&m[2][1]=='O'&&m[2][2]=='O' || m[0][0]=='O'&&m[1][0]=='O'&&m[2][0]=='O' || m[0][1]=='O'&&m[1][1]=='O'&&m[2][1]=='O'|| m[0][2]=='O'&&m[1][2]=='O'&&m[2][2]=='O'|| m[0][0]=='O'&&m[1][1]=='O'&&m[2][2]=='O'|| m[2][0]=='O'&&m[1][1]=='O'&&m[0][2]=='O'){
                  System.out.println("\n\n\n\n\njogador 2 ganhou\n\n\n\n\n\n\n\n");
                  Ganhou=1;
            }
            }
            }while(Ganhou!=1);
            }
            }