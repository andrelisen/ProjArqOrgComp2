
package myclasses;

/**
 *
 * @author andrelise
 */
public class tdsReg {
     //Registradores - na primeira execução eles são zeros
        
        public int PC;
        public int IR;
        public int MDR;
        public int regA;
        public int regB;
        public int regSaidaUla;
        public int []bancoRegistradores = new int[32];

    public tdsReg(int PC, int IR, int MDR, int regA, int regB, int regSaidaUla) {
        this.PC = PC;
        this.IR = IR;
        this.MDR = MDR;
        this.regA = regA;
        this.regB = regB;
        for(int i = 0; i < 32; i++)
        {
            this.bancoRegistradores[i] = 0;
        }
    }

        
    public int getPC() {
        return PC;
    }

    public void setPC(int PC) {
        this.PC = PC;
    }

    public int getIR() {
        return IR;
    }

    public void setIR(int IR) {
        this.IR = IR;
    }

    public int getMDR() {
        return MDR;
    }

    public void setMDR(int MDR) {
        this.MDR = MDR;
    }

    public int getRegA() {
        return regA;
    }

    public void setRegA(int regA) {
        this.regA = regA;
    }

    public int getRegB() {
        return regB;
    }

    public void setRegB(int regB) {
        this.regB = regB;
    }

    public int getRegSaidaUla() {
        return regSaidaUla;
    }

    public void setRegSaidaUla(int regSaidaUla) {
        this.regSaidaUla = regSaidaUla;
    }

    public int[] getBancoRegistradores() {
        return bancoRegistradores;
    }

    public void setBancoRegistradores(int[] bancoRegistradores) {
        this.bancoRegistradores = bancoRegistradores;
    }
        
    
        
        
}
