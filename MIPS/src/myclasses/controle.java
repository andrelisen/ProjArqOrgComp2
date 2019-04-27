
package myclasses;

/**
 *
 * @author andrelise
 */
public class controle {
    
    private int LerMem;
    private int IREsc;
    private int IouD;
    private int ULAFonteA;
    private int ULAFonteB;
    private int ULAOp;
    private int FontePC;
    private int PCEsc;

    
    public void operacao(String instrucao)
    {
        switch(instrucao)
        {
            case "vazio":
                this.LerMem = 1;
                this.IREsc = 1;
                this.IouD = 0;
                this.ULAFonteA = 0;
                this.ULAFonteB = 1;
                this.ULAOp = 0;
                this.FontePC = 0;
                this.PCEsc = 1;
            break;
            case "load":
                
            break;
            case "add":
                
            break;
                
        }
    }

    public int getLerMem() {
        return LerMem;
    }

    public int getIREsc() {
        return IREsc;
    }

    public int getIouD() {
        return IouD;
    }

    public int getULAFonteA() {
        return ULAFonteA;
    }

    public int getULAFonteB() {
        return ULAFonteB;
    }

    public int getULAOp() {
        return ULAOp;
    }

    public int getFontePC() {
        return FontePC;
    }

    public int getPCEsc() {
        return PCEsc;
    }
    
    
    
}
