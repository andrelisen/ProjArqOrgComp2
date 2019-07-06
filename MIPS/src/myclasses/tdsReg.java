
package myclasses;

/**
 *
 * @author andrelise
 */
public class tdsReg {
     //Registradores - na primeira execução eles são zeros
        
        public String PC = "0";
        public String IR= "0";
        public String MDR= "0";
        public String regA= "0";
        public String regB= "0";
        public String regSaidaUla= "0";
        public String []bancoRegistradores = new String[32];
        public pilha sp = new pilha();
        
        
        /*O que é cada posição do meu banco de registradores?
        [0]=$zero
        [2 a 3]=$vo e $v1
        [4 a 7]=$a0 a $a3
        [8 a 15]=$t0 a $t7
        [16 a 23]=$s0 a $s7
        [24 a 25]=$t8 a $t9
        [28]= $gp(ponteiro global)
        [29]=$sp(stack pointer) --> precisa ser uma pilha 
        [30]=$fp(frame pointer)
        [31]=$ra(endereço de retorno)
        */


    public tdsReg() {
        String[] aux = new String[32];
        for(int i = 0; i<32; i++){
            aux[i]= "0";
        }
        
        this.bancoRegistradores=aux;
    
        
    }

        
        
    public String getPC() {
        return PC;
    }

    public void setPC(String PC) {
        this.PC = PC;
    }

    public String getIR() {
        return IR;
    }

    public void setIR(String IR) {
        this.IR = IR;
    }

    public String getMDR() {
        return MDR;
    }

    public void setMDR(String MDR) {
        this.MDR = MDR;
    }

    public String getRegA() {
        return regA;
    }

    public void setRegA(String regA) {
        this.regA = regA;
    }

    public String getRegB() {
        return regB;
    }

    public void setRegB(String regB) {
        this.regB = regB;
    }

    public String getRegSaidaUla() {
        return regSaidaUla;
    }

    public void setRegSaidaUla(String regSaidaUla) {
        this.regSaidaUla = regSaidaUla;
    }

    public String getBancoRegistradores(int posicao) {
        return bancoRegistradores[posicao];
    }

    public void setBancoRegistradores(int posicao, String valor) {
        
     //   System.out.println("A posicao é="+posicao);
        
      //  if(posicao == 29){
    //        criaStackPointer(Integer.parseInt(valor));//criando o stack ponter
        //    System.out.println("Oi criou o stack pointer, que legal!!");
 //       }
//        else{
        bancoRegistradores[posicao] = valor;
  //      }
        
    }

      
}
