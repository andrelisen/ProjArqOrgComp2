
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
        /*O que é cada posição do meu banco de registradores?
        [0]=$zero
        [2 a 3]=$vo e $v1
        [4 a 7]=$a0 a $a3
        [8 a 15]=$t0 a $t7
        [16 a 23]=$s0 a $s7
        [24 a 25]=$t8 a $t9
        [28]= $gp(ponteiro global)
        [29]=$sp(stack pointer)
        [30]=$fp(frame pointer)
        [31]=$ra(endereço de retorno)
        */
        

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
