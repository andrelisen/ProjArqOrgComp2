/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

/**
 *
 * @author andrelise
 */
public class cacheDados {
    
    
    public bloco [][]conjBlocos ;//cada bloco com 4 palavras

    public cacheDados(int tamanho, int associatividade) { //cache de tamanho
        bloco[][] aux = new bloco[tamanho][associatividade];
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < associatividade; j++) {
                aux[i][j] = new bloco();
                aux[i][j].id = j;//0, 1, 2...
            }
        }
     
        this.conjBlocos = aux;
    }
    
    public void inserirBloco(int endereco, memory memoria){ //como o endereço é de 32 bits
        //cada bloco tem uma tag
        //para achar onde preciso colocar meu bloco eu uso o indice que é os bits mais significativos
        
        
    }
    
    public palavra verificaCache(String endereco){
        
        
        palavra p=new palavra(0, "a");
        return p;
        
        
    }
    
    // indice = (endereco >> 2) & ((int) (pow(2, Mips_Multiciclo.indiceTam))) - 1;
    
    
    /*public int buscarEnd(int endereco) {
        int indice, tag;
        tag = endereco >> (2 + Mips_Multiciclo.indiceTam);
        indice = (endereco >> 2) & ((int) (pow(2, Mips_Multiciclo.indiceTam))) - 1;
        for (int bloco = 0; bloco < Mips_Multiciclo.vias; bloco++) {
            if (this.Blocos[indice][bloco].Tag == tag && this.Blocos[indice][bloco].Validade) {
                return bloco;
            }
        }
        return -1;
    }
*/
    
    
}
