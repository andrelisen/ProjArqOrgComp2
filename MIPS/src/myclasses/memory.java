
package myclasses;

/**
 *
 * @author andrelise
 */
public class memory {
     public int []memoria = new int [256];

    public int getMemoria(int posicao) {
        return memoria[posicao];
    }

    public void setMemoria(int posicao, int valor) {
        this.memoria[posicao] = valor;
    }
}
