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
public class cacheDados {
    
    /*Vamos ter um endereço de 32 bits
        4 palavras por bloco
        → 8 bytes por palavra:: bits para offset de byte = log2 8 =4
        → bits para offset de palavra = log2 4 = 2
        → bits para indice = log2 numCache
        → tag = 32 - 8 - 2 - indice
    
      int val = (int) (Math.log(64)/Math.log(2));
    */
    
    public bloco [][]instrucao;
    public int offsetByte;
    public int offsetPalavra;
    public int tamIndice;
    public int tamanhoCache;
    public int numVias;
    
    
    public cacheDados(int tamanho, int via) {
        
        bloco[][] aux = new bloco[tamanho][via];
        
        
        for(int i = 0; i<tamanho; i++){
            for(int j = 0; j<via; j++){
               
                aux[i][j] = new bloco();
                aux[i][j].id=j;
                aux[i][j].validade=0;
                aux[i][j].via=0;
            }
        }
        
        this.tamanhoCache = tamanho;
        this.numVias=via;
        this.offsetByte =(int)  (Math.log(8)/Math.log(2));//  int val = (int) (Math.log(64)/Math.log(2));
  //      System.out.println("Offset de byte="+getOffsetByte());
        this.offsetPalavra =(int)  (Math.log(4)/Math.log(2));//  int val = (int) (Math.log(64)/Math.log(2));
   //     System.out.println("Offset de palavra="+getOffsetPalavra());
        this.tamIndice = (int) (Math.log(tamanho)/Math.log(2));
   //     System.out.println("Índice="+getTamIndice());
        this.instrucao = aux;
    }

    
    public int getOffsetByte() {
        return offsetByte;
    }

    public int getOffsetPalavra() {
        return offsetPalavra;
    }

    public int getTamIndice() {
        return tamIndice;
    }

    public int getTamanhoCache() {
        return tamanhoCache;
    }

    public void setTamanhoCache(int tamanhoCache) {
        this.tamanhoCache = tamanhoCache;
    }

    public int getNumVias() {
        return numVias;
    }

    
    public void inserir(int endereco, memory mem){
        
        
        int num = getOffsetByte()+getOffsetPalavra()+getTamIndice();
        int tamTag = 32 - num;
    //    System.out.println("Valor da tag="+tamTag);
        int auxEnd=0;
        auxEnd = endereco;
        int condicao = 0;
        
        String tag = verificaTam(conversorDecimalBinario(endereco));
        
        tag = tag.substring(0, tamTag);
        
        
        int conjunto = restoDivisao(endereco, getTamanhoCache());//vai retornar o conj aonde tenho que salvar o bloco
    //    System.out.println("Valor do conj do endereço:"+endereco+" é="+conjunto);
        int via = encontrarVia(endereco);
     //   System.out.println("A via foi="+via);
        bloco aux = this.instrucao[conjunto][via];
        
            aux.setP1(mem.procurar(auxEnd));
            palavra p1 = mem.procurar(auxEnd);
      //      System.out.println("Memoria="+p1.getEndereco()+";"+p1.getConteudo());
            auxEnd = auxEnd + 4;
            aux.setP2(mem.procurar(auxEnd));
            palavra p2 = mem.procurar(auxEnd);
     //       System.out.println("Memoria="+p2.getEndereco()+";"+p2.getConteudo());
            auxEnd = auxEnd + 4;
            aux.setP3(mem.procurar(auxEnd));
            palavra p3 = mem.procurar(auxEnd);
     //       System.out.println("Memoria="+p3.getEndereco()+";"+p3.getConteudo());
            auxEnd = auxEnd + 4;
            aux.setP4(mem.procurar(auxEnd));
            palavra p4 = mem.procurar(auxEnd);
    //        System.out.println("Memoria="+p4.getEndereco()+";"+p4.getConteudo());
            aux.validade=1;
            aux.tag=Integer.parseInt(tag, 2);
            aux.via=1;
            
    }
    
    
    public void especialImpressao(){
       int conjunto = 0;
        System.out.println("via=0");
        bloco b1 = instrucao[0][0];
        palavra p1;
        palavra p2;
        palavra p3;
        palavra p4;
        
        p1=b1.getP1();
        System.out.println("Valores de p1="+p1.getEndereco()+";"+p1.getConteudo());
        p2=b1.getP2();
        System.out.println("Valores de p2="+p2.getEndereco()+";"+p2.getConteudo());
        p3=b1.getP3();
        System.out.println("Valores de p3="+p3.getEndereco()+";"+p3.getConteudo());
        p4=b1.getP4();
        System.out.println("Valores de p4="+p4.getEndereco()+";"+p4.getConteudo());
        System.out.println("Tag="+b1.getTag());
        bloco b2=instrucao[0][1];
        
//        p1=b2.getP1();
//        System.out.println("Valores de p1="+p1.getEndereco()+";"+p1.getConteudo());
//        p2=b2.getP2();
//        System.out.println("Valores de p2="+p2.getEndereco()+";"+p2.getConteudo());
//        p3=b2.getP3();
//        System.out.println("Valores de p3="+p3.getEndereco()+";"+p3.getConteudo());
//        p4=b2.getP4();
//        System.out.println("Valores de p4="+p4.getEndereco()+";"+p4.getConteudo());
//        System.out.println("Tag="+b2.getTag());
        
    }
    
    public int restoDivisao(int x, int y){
        int resultado = x % y;
        
        return resultado;
    }
    
    public static int conversorDecimalBinario(int n){ 
     
        int d = n;
        String binario = ""; // guarda os dados
        while (d > 0) {
                int b = d % 2; 
                binario = binario + b;
                d = d >> 1; 
        }
        while(binario.length() < 32)
        {
            binario = binario + 0;
        }
        String invertida = new StringBuilder(binario).reverse().toString();
        return Integer.parseInt(invertida);
        //return invertida;
    }
    
    public String verificaTam(int n){
        String number = Integer.toString(n);
        
        int tamanho = number.length();
        int inc = 32 - tamanho;
            if(tamanho <32){
                for(int i = 0; i< inc; i++)
                {
                    number = "0" + "" + number;//inserindo zeros na frente
                }
            }
        return number;
    }
    
    public int encontrarVia(int endereco){
        int conjunto = restoDivisao(endereco, getTamanhoCache());
        int cheio = 0;
        int val = 0;
            for(int i = 0; i<getNumVias(); i++){
                if(instrucao[conjunto][i].getVia()==0){//via livre
                    //cheio = 0;
                    //val = i;
                    return i;
                }else{
                    cheio = 1;
                }
            }
     
            //tá cheio preciso remover
            if(cheio == 1){
                   for(int i = 0; i<getNumVias(); i++){
                       if(instrucao[conjunto][i].getId()==0){//é o primeiro né
                          instrucao[conjunto][i].setId(getNumVias()+1); 
                          val = i;
                       }else{
                           int aux = instrucao[conjunto][i].getId();
                           instrucao[conjunto][i].setId(aux--);
                       }
                   } 
            } 
            
        return val;    
    }
    
    public palavra encontrarElemento(int endereco){
        int num = getOffsetByte()+getOffsetPalavra()+getTamIndice();
        int tamTag = 32 - num;
        
        int auxEnd=0;
        auxEnd = endereco;
        
        String tag = verificaTam(conversorDecimalBinario(endereco));
        
        tag = tag.substring(0, tamTag);
        
        int verdade = 0;
        
        int conjunto = restoDivisao(endereco, getTamanhoCache());//vai retornar o conj aonde tenho que salvar o bloco
    //    System.out.println("Valor do conj="+conjunto);
            
        palavra erro = new palavra(0, "0");
        
            for(int i =0;i< getNumVias(); i++){
               // if(instrucao[conjunto][i].getValidade()==1){//pode ser ele 
                    if(instrucao[conjunto][i].getTag() == Integer.parseInt(tag,2)){
                        if(instrucao[conjunto][i].validade==1){
                            bloco auxiliar = instrucao[conjunto][i];
                            palavra p1 = auxiliar.getP1();
                            palavra p2 = auxiliar.getP2();
                            palavra p3 = auxiliar.getP3();
                            palavra p4 = auxiliar.getP4();

                            if(p1.getEndereco()==endereco){
                               // verdade = 1;
                                System.out.println("Oi");
                                return p1;
                            }
                            if(p2.getEndereco()==endereco){
                           //     verdade = 1;
                                System.out.println("Oi2");
                                return p2;
                            }
                            if(p3.getEndereco()==endereco){
                            //    verdade = 1;
                                System.out.println("Oi3");
                                return p3;
                            }
                            if(p4.getEndereco()==endereco){
                            //    verdade = 1;
                                System.out.println("Oi4");
                                return p4;
                            }
                        }else{ 
                            verdade = 0;
                        }
                        
                    }else{
                        verdade = 0;
                    }
            }
   
            if(verdade == 0){
                return erro;
            }
            
            return erro;
    }
    
    public int escrever(int endereco, String conteudo, memory memoria){ //write through 
        
        int num = getOffsetByte()+getOffsetPalavra()+getTamIndice();
        int tamTag = 32 - num;
        
        int auxEnd=0;
        auxEnd = endereco;
        
        String tag = verificaTam(conversorDecimalBinario(endereco));
        
        tag = tag.substring(0, tamTag);
        
        int semTag = 0;
        int entrei = 0;
        
        int conjunto = restoDivisao(endereco, getTamanhoCache());//vai retornar o conj aonde tenho que salvar o bloco
      //  System.out.println("Valor do conj="+conjunto);
        palavra nova;
        
        int resposta = 0;
        
        
            for(int i =0;i< getNumVias(); i++){
               // if(instrucao[conjunto][i].getValidade()==1){//pode ser ele 
                    if(instrucao[conjunto][i].getTag() == Integer.parseInt(tag,2)){
                        bloco auxiliar = instrucao[conjunto][i];
                        palavra p1 = auxiliar.getP1();
                        palavra p2 = auxiliar.getP2();
                        palavra p3 = auxiliar.getP3();
                        palavra p4 = auxiliar.getP4();
                        
                        if(p1.getEndereco()==endereco ||p2.getEndereco() == endereco || p3.getEndereco() == endereco 
                                || p4.getEndereco() == endereco){
                               
                                if(p1.getEndereco()==endereco ){
                                    p1.setConteudo(conteudo);
                                    auxiliar.setP1(p1);
                                    memoria.modificar(endereco, conteudo);
                                    resposta = 0;
                                }
                                if(p2.getEndereco() == endereco){
                                    p2.setConteudo(conteudo);
                                    auxiliar.setP2(p2);
                                    memoria.modificar(endereco, conteudo);
                                    resposta = 0;
                                    
                                }
                                if(p3.getEndereco() == endereco){
                                    p3.setConteudo(conteudo);
                                    auxiliar.setP3(p3);
                                    memoria.modificar(endereco, conteudo);
                                    resposta = 0;
                                    

                                }
                                if(p4.getEndereco() == endereco){
                                    p4.setConteudo(conteudo);
                                    auxiliar.setP4(p4);
                                    memoria.modificar(endereco, conteudo);
                                    resposta = 0;
                                   
                                }
                                    entrei = 1;
                                    semTag = 1;
                                    return 0;
                           
                        }else{
                            entrei = 0;
                        }
                        
                    }else{
                     semTag = 0;   
                    }
                
            }
            
            if(entrei == 0 && semTag ==0){
      //          System.out.println("uhu");
                System.out.println("Entrei para escrever mas, dado não estava na cache nem na memória. DADO NOVO!!");
                memoria.inserir(endereco, conteudo);//inserir na memória
                inserir(endereco, memoria);//inserir conteudo na cache
              //  escrever(endereco, conteudo, memoria); 
               resposta = 1;
                
            }
            
            //if(verifica == 1 || novaPosicao == 1){//não tenho posicao para esse dado, ele é novo preciso inserir ele na cache
            //    inserir(endereco, memoria);
            //    escrever(endereco, conteudo, memoria); 
                
          //  }
            
        return resposta;
    }
    
     public void imprimir(){
        bloco b;
        palavra p1;
        palavra p2;
        palavra p3;
        palavra p4;        
                
        for(int i = 0; i<getTamanhoCache(); i++){
            for(int j = 0; j<getNumVias(); j++){
                b = instrucao[i][j];
                if(b.validade==1){
                        p1 = b.getP1();
                        p2 = b.getP2();
                        p3 = b.getP3();
                        p4 = b.getP4();
                    if(p1 == null || p2 == null || p3 == null || p4 == null){
                        System.out.println("Está vazio!!");
                    }else{
                        System.out.println("Conteúdo do bloco"+i+"da cache...");
                        System.out.println("Palavra 01");
                        System.out.println("End.:"+p1.getEndereco()+";Conteúdo="+p1.getConteudo());
                        System.out.println("Palavra 02");
                        System.out.println("End.:"+p2.getEndereco()+";Conteúdo="+p2.getConteudo());
                        System.out.println("Palavra 03");
                        System.out.println("End.:"+p3.getEndereco()+";Conteúdo="+p3.getConteudo());
                        System.out.println("Palavra 04");
                        System.out.println("End.:"+p4.getEndereco()+";Conteúdo="+p4.getConteudo());
                        System.out.println("Tag="+instrucao[i][j].getTag());
                        System.out.println("ID="+instrucao[i][j].getId());
                    }

                }
            }
        }
    }
    
    
    
    
}
