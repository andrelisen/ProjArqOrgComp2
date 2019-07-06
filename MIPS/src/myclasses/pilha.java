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
public class pilha {
    
        public int tam=20;
        public String []sp= new String[20];//--> deveria crescer dinamicamente mas tudo bem
        public int top=-1;


        
     public void push(String x, int posicao) {//inserir
          if (top >= (tam-1)) {
             System.out.println("Estouro de Pilha!");
          }
          else {
             sp[posicao] = x;
             top++;
          }
       }
       
      public  String pop(int posicao) {//retirar
          if (top < 0) {
             System.out.println("Pilha Vazia!");
             return "0";
          }
          else {
              System.out.println("Ta retirando");
             String x = sp[posicao];
             top--;
             return x;
          }
       }
      public String peek() {
          if (top < 0) {
             System.out.println("Pilha Vazia!");
             return "0";
          }
          else {
             return sp[top];
          }
       }
        
  
      public void verPilha(){
          for(int i = 0; i<=tam; i++){
              System.out.println("sp="+sp[i]);
          }
          System.out.println("----------------");
      }
      
}
