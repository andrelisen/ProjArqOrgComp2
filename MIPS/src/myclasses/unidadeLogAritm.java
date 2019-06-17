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
public class unidadeLogAritm {
    private String operacao;
    private int valorA;
    private int valorB;
    private int saida;

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    public void setSaida(int saida) {
        this.saida = saida;
    }

    public void executarOperacao() //vão vir valores inteiros e operação com nome
    {
        int resultado = 0;
        switch(operacao){
            case "add":
            resultado = valorA + valorB;
            setSaida(resultado);    
            break;
            
            case "sll":
                resultado = valorA * valorB;
                break;
            
            case "sub":
                resultado = valorA - valorB;
                break;
                
            case "and":
                resultado = valorA & valorB;
                break;
                
            case "or":
                resultado = valorA | valorB;
                break;
                
            case "nor":
                resultado = ~(valorA | valorB);
                break;
                
            case "srl":
                resultado = valorA / valorB;
                break;
                
            case "slt":
                if(valorA < valorB){
                    resultado = 1;
                }else{
                    resultado = 0;
                }
                break;
                
            case "jr":
                resultado = valorA; //ir para a posição de memória 
                break;
                
            case "addi":
                resultado = valorA + valorB;
                break;
                
            case "ori":
                resultado = valorA | valorB;
                
            case "andi":
                resultado = valorA | valorB;
                break;
            
                
//            case "sub":
//            resultado = a - b;
//            setSaida(resultado);
//            break;
//            
//            case "addi":
//             resultado = a + b;
//             setSaida(resultado);
//            break;
            
        }
    }

    public int getSaida() {
        return saida;
    }

    public int getValorA() {
        return valorA;
    }

    public int getValorB() {
        return valorB;
    }
   
    
    
}
