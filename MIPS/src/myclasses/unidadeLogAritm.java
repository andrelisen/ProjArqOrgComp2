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

    public int potencia(int y){
       int pot = 2; // Inicia pot
       int x = 2; // Inicia pot
        for (int i = 1; i < y; i++ ) // Comeca em 1 pois 'pot' ja foi inicializado
        {
             pot *= x; 
        }
     return pot;   
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
            valorB = potencia(valorB);
            resultado = valorA << valorB;
                
            setSaida(resultado);
                break;
            
            case "sub":
                resultado = valorA - valorB;
            setSaida(resultado);
                break;
                
            case "and":
                resultado = valorA & valorB;
             //   System.out.println("Dentro da ULA ="+resultado);
            setSaida(resultado);
                break;
                
            case "or":
                resultado = valorA | valorB;
            setSaida(resultado);
                break;
                
            case "nor":
                resultado = ~(valorA | valorB);
            setSaida(resultado);
                break;
                
            case "srl":
                valorB = potencia(valorB);
                resultado = valorA >> valorB;
            
                setSaida(resultado);
                break;
                
            case "slt":
                if(valorA < valorB){
                    resultado = 1;
                }else{
                    resultado = 0;
                }
            setSaida(resultado);
                break;
            
            case "slti":
                if(valorA < valorB){
                    resultado = 1;
                }else{
                    resultado = 0;
                }
            setSaida(resultado);
                break;    
                
            case "jr":
                resultado = valorA; //ir para a posição de memória 
            setSaida(resultado);
                break;
                
            case "addi":
             //   System.out.println("Valor de a="+valorA+"; valor de b="+valorB);
                resultado = valorA + valorB;
            setSaida(resultado);
                break;
                
            case "ori":
                resultado = valorA | valorB;
            setSaida(resultado);
                break;
                
            case "andi":
                resultado = valorA & valorB;
            setSaida(resultado);
                break;
            
            case "jump":
                resultado = valorA;
            setSaida(resultado);
                break;
                
            case "jump register":
                    resultado = Integer.parseInt("ra");
            setSaida(resultado);
                break;
                
            case "jump and link":
                resultado = valorA;
            setSaida(resultado);
                break;
                
            case "beq":
                if(valorA == valorB)//se x == y
                {//desvia para constante 
                    resultado = 1;
                }else{
                    resultado = 0;
                }
            setSaida(resultado);
                break;
                
            case "bne":
                if(valorA != valorB)//se x != y
                {//desvia para constante 
                    resultado = 1;
                }else{
                    resultado = 0;
                }
            setSaida(resultado);
                break;
                
            case "mult":
                    
                    resultado = valorA * valorB;
                    
                    setSaida(resultado);
                    
                    break;
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
