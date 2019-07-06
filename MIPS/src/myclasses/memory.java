
package myclasses;

import java.util.ArrayList;
import java.util.List;

public class memory {
    
      List<palavra> m = new ArrayList<palavra>();   //List<segmentos> ocupados = new ArrayList<segmentos>();
      int dadoLido=0;
      
      
       public int getDadoLido() {
            return dadoLido;
       }

       public void setDadoLido(int dadoLido) {
            this.dadoLido = dadoLido;
       }

       public memory() {
           int endereco = 0;
           
           for(int i = 0; i<256; i++){//inicializar a memória
                 palavra novaPalavra = new palavra(endereco, "0"); 
                 endereco = endereco + 4;
                 m.add(novaPalavra);
           }
           
       }

      
      
       
      
      public palavra procurar(int endereco)
      {
          //pc mandou endereço
          int tamanho = m.size();
          
          for(int i = 0; i<tamanho; i++){
              palavra auxiliar = m.get(i);
                  if(auxiliar.endereco == endereco)
                  {
                      //encontrei a palavra solicitada pelo CONTROLE do MIPS para executar alguma coisa
                      return auxiliar;
                  }
          }
         
          palavra erro = new palavra(0, "0");
          return erro;//vai dar um print de programa invalido
          
      }
      
      public void inserir(int endereco, String conteudo){
                    int tamanho = m.size();
          int nao=0;
          
                   System.out.println("Endereço="+endereco+";Cont="+conteudo);
          for(int i = 0; i<tamanho; i++){
              palavra aux = m.get(i);
                if(aux.getEndereco()==endereco){
                    aux.setConteudo(conteudo);
                    m.set(i, aux);
                    return;
                }else{
                    nao = 1;
                }
          }
          
          if(nao == 1){
              System.out.println("Nao tinha esse endereço na memória!!!!!!");
            //  inserir(endereco, conteudo);
          }
      }
      
      public void imprimir(){
          int tamanho = m.size();
          
          for(int i = 0; i< tamanho; i++){
              palavra aux = m.get(i);
              System.out.println("Minha memoria tem o seguinte conteudo na posição="+aux.getEndereco()+";"+aux.getConteudo());
          }
      }
      
      public void modificar(int endereco, String conteudo){
          int tamanho = m.size();
          int nao=0;
          
          for(int i = 0; i<tamanho; i++){
              palavra aux = m.get(i);
                if(aux.getEndereco()==endereco){
                    aux.setConteudo(conteudo);
                    m.set(i, aux);
                    return;
                }else{
                    nao = 1;
                }
          }
          
          if(nao == 1){
              System.out.println("Nao tinha esse endereço na memória!!!!!!");
              inserir(endereco, conteudo);
          }
          
      }
    
}
