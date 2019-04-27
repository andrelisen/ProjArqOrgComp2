
package myclasses;

/**
 *
 * @author andrelise
 */
public class memory {
     //public int [][]memoria = new int[256][2];
     public int [][]memoria;

    public memory(int linha, int coluna) {
        this.memoria = new int [linha][coluna];
    }
    
    public void setMemoria(int valor, int linha, int coluna) {
        this.memoria[linha][coluna] = valor;
    }

    public int endereco(int linha) {
        int valor = memoria[linha][0];
        return valor;
    }
  
    public int conteudo(int linha)
    {
        int valor = memoria[linha][1];
        return valor;
    }
    
     
}
