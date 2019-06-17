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
public class unidadeControle {
    
    public int LerMem=0;
    public int IREsc=0;
    public int IouD=0;
    public int ULAFonteA=0;
    public int ULAFonteB=0;
    public int ULAOp=0;
    public int FontePC=0;
    public int PCEsc=0;
    public int PCEscCond=0;
    public int EscMem=0;
    public int MemParaReg=0;
    public int RegDst=0;
    public int EscReg=0;
    public int estado = 0;
    public int instrucao = 0;
    public int CausaInt = 0;
    public int EscCause = 0;
    public int EscEPC= 0;
    
    public int getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(int instrucao) {
        this.instrucao = instrucao;
    }
    
    
    public int indicaSinais(int clock){
        switch(clock){
            case 0://busca da instrução
                LerMem = 1;
                ULAFonteA = 0;
                IouD = 0;
                IREsc = 1;
                ULAFonteB = 1;//vou usar em decimal, mas binário é 01
                ULAOp = 0;
                PCEsc = 1;
                FontePC = 0;
                estado = 0;
                break;
                
            case 1://Decodificação da instrução; Leitura dos registradores Rs e Rt
                ULAFonteA = 0;
                ULAFonteB = 3;//vou usar em decimal, mas binário é 11
                ULAOp = 0;
                estado = 1;
                break;
            
            case 2://Cálculo do endereço de acesso à memória lw ou sw
                ULAFonteA = 1;
                ULAFonteB = 2;//vou usar em decimal, mas binário é 10
                ULAOp = 0;
                estado = 2;
                break;
            
            case 3://Acesso a memória lw
                LerMem = 1;
                IouD = 1;
                estado = 3;
                break;
            
            case 4://Escrita no registrador RT 
                EscReg = 1;
                MemParaReg = 1;
                RegDst = 0;
                estado = 4;
                break;
            
            case 5://acesso a memória sw
                EscMem = 1;
                IouD = 1;
                estado = 5;
                break;
            
            case 6://execução tipo R
                ULAFonteA = 1;
                ULAFonteB = 0;
                ULAOp = 2;//vou usar em decimal, mas binário é 10
                estado = 6;
                break;
            
            case 7://término da instrução tipo R escrita em RD
                RegDst = 1;
                EscReg = 1;
                MemParaReg = 0;
                estado = 7;
                break;
            
            case 8://término do desvio condicional beq
                ULAFonteA = 1;
                ULAFonteB = 0;
                ULAOp = 1;//vou usar em decimal, mas binário é 01
                PCEscCond = 1;
                PCEsc = 0;
                FontePC = 1;//vou usar em decimal, mas binário é 01
                estado = 8;
                break;
            
            case 9://Término do desvio incondicional jump
                PCEsc = 1;
                FontePC = 2;//vou usar em decimal, mas binário é 10
                estado = 9;
                break;
            
            case 10://Término do desvio incondicional jump
                CausaInt = 0;
                EscCause = 1;
                EscEPC= 1;
                ULAFonteA = 0;
                ULAFonteB = 1;
                ULAOp = 1;
                PCEsc = 1;
                FontePC = 3;
                estado = 10;
                break;
                
            case 11:
                CausaInt = 0;
                EscCause = 1;
                EscEPC= 1;
                ULAFonteA = 0;
                ULAFonteB = 1;
                ULAOp = 1;
                PCEsc = 1;
                FontePC = 3;
                estado = 11;
                break;
        }
                
   return estado;
 
    }
    
}
