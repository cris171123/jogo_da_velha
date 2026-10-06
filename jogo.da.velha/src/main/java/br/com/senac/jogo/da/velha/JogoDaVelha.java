/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.jogo.da.velha;

import java.util.Scanner;

/**
 *
 * @author cristiano61782766
 */
public class JogoDaVelha {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        Tabuleiro tabuleiro = new Tabuleiro ("1 - Cada jogador deve escolher um simbolo;" + "2 - O jogador 1 inicia a partida;");
        
        Jogador jogador1 = new Jogador (1, "Cristiano", 'x');
        Jogador jogador2 = new Jogador (2, "Vitor", 'o');
        
        
        do{
            tabuleiro.mostrarTabuleiro();
            
            if(tabuleiro.getJogadorDaVez()== 1){
                System.out.println("Jogador1, escolha onde jogar");
                String local = entrada.nextLine();
                
                
                
                tabuleiro.marcarJogada(jogador1.getSimbolo(), local);
                tabuleiro.setJogadorDaVez(2);
                
                tabuleiro.mostrarTabuleiro();
                tabuleiro.verificarGanhador(jogador1.getSimbolo());
        }
            else{
                System.out.println("Jogador2, escolha onde jogar");
                String local = entrada.nextLine();
                
                
                
                tabuleiro.marcarJogada(jogador1.getSimbolo(), local);
                tabuleiro.setJogadorDaVez(2);
                
                tabuleiro.mostrarTabuleiro();
                tabuleiro.verificarGanhador(jogador2.getSimbolo());
            }
        } while(tabuleiro.isHouverGanhadorUltimaRodada()== false);
        
        
        
        
    }
}
        
    


