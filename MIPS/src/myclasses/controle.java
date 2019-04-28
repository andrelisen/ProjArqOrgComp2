
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
    private int PCEscCond;
    private int EscMem;
    private int MemParaReg;
    private int RegDst;
    private int EscReg;
    
    public void operacao(String instrucao)
    {
        switch(instrucao)
        {
            case "busca":
                this.LerMem = 1;
                this.IREsc = 1;
                this.IouD = 0;
                this.ULAFonteA = 0;
                this.ULAFonteB = 1;
                this.ULAOp = 0;
                this.FontePC = 0;
                this.PCEsc = 1;
            break;
            case "decodificacao":
                this.ULAFonteA = 0;
                this.ULAFonteB = 3;
                this.ULAOp = 0;
            break;
            case "ExecMemoria":
                /*ExecMemoria,ExecinstTipoR,ExecdesvioCondicional,ExecdesvioIncondicional,AcessoInstRefMem,escritaReg*/
                this.ULAFonteA = 1;
                this.ULAFonteB = 2;
                this.ULAOp=0;
            break;
            case "ExecinstTipoR":
                this.ULAFonteA = 1;
                this.ULAFonteB = 0;
                this.ULAOp = 2;
            break;    
            case "ExecDesvioCondicional":
                this.ULAFonteA = 1;
                this.ULAFonteB = 0;
                this.ULAOp = 1;
                this.PCEscCond = 1;
                this.FontePC = 1;
            break;
            case "ExecdesvioIncondicional":
                this.FontePC=2;
                this.PCEsc=1;
            break;
            case "AcessoInstRefMemLoad":
                this.LerMem = 1; 
                this.IouD = 1;
            break;
            case "AcessoInstRefMemStore":
                this.EscMem = 1; 
                this.IouD = 1;
            break;
            case "escritaReg":
                this.MemParaReg = 1;
                this.EscReg = 1;
                this.RegDst = 0;
            break;
        }
    }

    public int getLerMem() {
        return LerMem;
    }

    public void setLerMem(int LerMem) {
        this.LerMem = LerMem;
    }

    public int getIREsc() {
        return IREsc;
    }

    public void setIREsc(int IREsc) {
        this.IREsc = IREsc;
    }

    public int getIouD() {
        return IouD;
    }

    public void setIouD(int IouD) {
        this.IouD = IouD;
    }

    public int getULAFonteA() {
        return ULAFonteA;
    }

    public void setULAFonteA(int ULAFonteA) {
        this.ULAFonteA = ULAFonteA;
    }

    public int getULAFonteB() {
        return ULAFonteB;
    }

    public void setULAFonteB(int ULAFonteB) {
        this.ULAFonteB = ULAFonteB;
    }

    public int getULAOp() {
        return ULAOp;
    }

    public void setULAOp(int ULAOp) {
        this.ULAOp = ULAOp;
    }

    public int getFontePC() {
        return FontePC;
    }

    public void setFontePC(int FontePC) {
        this.FontePC = FontePC;
    }

    public int getPCEsc() {
        return PCEsc;
    }

    public void setPCEsc(int PCEsc) {
        this.PCEsc = PCEsc;
    }

    public int getPCEscCond() {
        return PCEscCond;
    }

    public void setPCEscCond(int PCEscCond) {
        this.PCEscCond = PCEscCond;
    }

    public int getEscMem() {
        return EscMem;
    }

    public void setEscMem(int EscMem) {
        this.EscMem = EscMem;
    }

    public int getMemParaReg() {
        return MemParaReg;
    }

    public void setMemParaReg(int MemParaReg) {
        this.MemParaReg = MemParaReg;
    }

    public int getRegDst() {
        return RegDst;
    }

    public void setRegDst(int RegDst) {
        this.RegDst = RegDst;
    }

    public int getEscReg() {
        return EscReg;
    }

    public void setEscReg(int EscReg) {
        this.EscReg = EscReg;
    }

    
    
    
}
