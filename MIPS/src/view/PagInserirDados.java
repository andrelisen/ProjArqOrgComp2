
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import myclasses.clock;
import myclasses.memory;
import myclasses.palavra;
import myclasses.tdsReg;
import myclasses.unidadeControle;
import myclasses.unidadeLogAritm;

/**
 *
 * @author andrelise
 */
public class PagInserirDados extends javax.swing.JFrame {

    
    
    public PagInserirDados() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) jTableDados.getModel();
        jTableDados.setRowSorter(new TableRowSorter(modelo));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInstrucoes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtInstrucao = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtDado = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        btnAdicionarInstrucao = new javax.swing.JButton();
        btnAlterarInstrucao = new javax.swing.JButton();
        btnExcluirInstrucao = new javax.swing.JButton();
        btnAdicionarDados = new javax.swing.JButton();
        btnAlterarDados = new javax.swing.JButton();
        btnExcluirDados = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTamCache = new javax.swing.JTextField();
        btnCache = new javax.swing.JButton();
        btnExecucaoPasso = new javax.swing.JButton();
        btnExecucaoCompleta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtValordoPc = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        btnImprimirMem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jLabel4.setText("jLabel4");

        jTextField4.setText("jTextField4");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton12.setText("jButton12");

        jButton1.setText("Adicionar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MIPS MULTICICLO - AOC 2");
        setResizable(false);

        jTableInstrucoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENDEREÇO", "INSTRUÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableInstrucoes);

        jLabel1.setText("Instrução");

        jLabel2.setText("Endereço");

        jLabel3.setText("Dado");

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENDEREÇO", "DADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableDados);

        btnAdicionarInstrucao.setText("Adicionar");
        btnAdicionarInstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarInstrucaoActionPerformed(evt);
            }
        });

        btnAlterarInstrucao.setText("Alterar");
        btnAlterarInstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarInstrucaoActionPerformed(evt);
            }
        });

        btnExcluirInstrucao.setText("Excluir");
        btnExcluirInstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirInstrucaoActionPerformed(evt);
            }
        });

        btnAdicionarDados.setText("Adicionar");
        btnAdicionarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarDadosActionPerformed(evt);
            }
        });

        btnAlterarDados.setText("Alterar");
        btnAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosActionPerformed(evt);
            }
        });

        btnExcluirDados.setText("Excluir");
        btnExcluirDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirDadosActionPerformed(evt);
            }
        });

        jLabel5.setText("Qual será o tamanho da cache?");

        btnCache.setText("OK");

        btnExecucaoPasso.setText("EXECUÇÃO PASSO A PASSO");
        btnExecucaoPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecucaoPassoActionPerformed(evt);
            }
        });

        btnExecucaoCompleta.setText("EXECUÇÃO COMPLETA");

        jLabel6.setText("Valor do PC");

        jRadioButton1.setText("ULA");

        jRadioButton2.setText("MEMÓRIA");

        jRadioButton5.setText("REGISTRADOR B");

        jRadioButton6.setText("REGISTRADOR DE DADOS DA MEMÓRIA");

        jRadioButton7.setText("REGISTRADOR A");

        jRadioButton8.setText("BANCO DE REGISTRADORES");

        jLabel7.setText("*APENAS ESPAÇO");

        jLabel8.setText("*SEM VÍRGULAS, PARÊNTESES OU CIFRÃO");

        jRadioButton9.setText("REGISTRADOR SAÍDA ULA");

        jRadioButton10.setText("PC");

        jRadioButton11.setText("CONTROLE");

        jRadioButton12.setText("REGISTRADOR DE INSTRUÇÕES");

        btnImprimirMem.setText("IMPRIMIR MEMÓRIA");
        btnImprimirMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirMemActionPerformed(evt);
            }
        });

        jLabel9.setText("Endereços a partir de 512");

        jMenuBar1.setBackground(java.awt.Color.white);
        jMenuBar1.setForeground(java.awt.Color.white);

        jMenu1.setText("Exibir Resultados");
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAdicionarDados)
                                            .addComponent(btnExcluirDados)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAlterarDados))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton10)
                                    .addComponent(jRadioButton6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnImprimirMem)
                                        .addComponent(jRadioButton2)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButton7)
                                        .addComponent(jRadioButton5))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jRadioButton12))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton9)
                                    .addComponent(jRadioButton11))))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionarInstrucao)
                            .addComponent(btnAlterarInstrucao)
                            .addComponent(jLabel7)
                            .addComponent(btnExcluirInstrucao))
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTamCache, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCache))
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValordoPc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExecucaoCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExecucaoPasso, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                        .addGap(97, 97, 97))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnAdicionarInstrucao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarInstrucao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnExecucaoCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnExcluirInstrucao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(213, 213, 213)
                        .addComponent(btnAdicionarDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarDados)
                        .addGap(17, 17, 17)
                        .addComponent(btnExcluirDados)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTamCache, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCache))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtValordoPc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(btnExecucaoPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnImprimirMem)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton8)
                            .addComponent(jRadioButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtInstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    
    //Inicializando a memória do MIPS
    memory memoria = new memory();
    tdsReg bancoRegistrador = new tdsReg();
    unidadeControle controle = new unidadeControle();
    clock clockExt = new clock();
    unidadeLogAritm ula = new unidadeLogAritm();
    public static int endereco = 0;
    
    
    private void btnAdicionarInstrucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarInstrucaoActionPerformed
        
      //Para a instrução
        DefaultTableModel dtmInstrucao = (DefaultTableModel) jTableInstrucoes.getModel(); 
        Object[] dados;
       
        int somalinhas = jTableInstrucoes.getModel().getRowCount(); //retorna número de linhas inseridas na tabela
        
        if(somalinhas == 128)
        {
            JOptionPane.showMessageDialog(null, "MEMÓRIA CHEIA!");
        }else{
            Object[] aux = {somalinhas, txtInstrucao.getText()}; 
            dados = aux;
            dtmInstrucao.addRow(dados);
            
           String instrucaoFormatada = lerInstrucao(txtInstrucao.getText());
        //   memoria.setMemoriaInstrucao(instrucaoFormatada);
            //System.out.println("o valor de soma linhas e="+somalinhas);
            palavra novaPalavra = new palavra(endereco, instrucaoFormatada);
            memoria.inserir(endereco, instrucaoFormatada);
            endereco = endereco + 4;
//            System.out.println("Vamos ver a memoria");
        //    memoria.imprimir();
//            System.out.println("---");
        }
        
        //Limpo caixa de entrada de instrução
        txtInstrucao.setText("");
    }//GEN-LAST:event_btnAdicionarInstrucaoActionPerformed

    private void btnExcluirInstrucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirInstrucaoActionPerformed
        
        int marcado = jTableInstrucoes.getSelectedRow();
        int quantidade = 0;
        
        System.out.println("Meu marcado é:"+marcado);
        
        if(marcado == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um campo para excluir");
        }else{
            DefaultTableModel dtmInstrucao = (DefaultTableModel) jTableInstrucoes.getModel(); 
            dtmInstrucao.removeRow(marcado);
            
            quantidade = jTableInstrucoes.getModel().getRowCount();
            
            int x = marcado;
            
            if(x != quantidade - 1)
            {
                while(x < quantidade) 
                {
                jTableInstrucoes.setValueAt(x, x , 0); //valor que quero colocar, linha, coluna
                x++;
                } 
            }
     
           }
       
    }//GEN-LAST:event_btnExcluirInstrucaoActionPerformed

    private void btnAlterarInstrucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarInstrucaoActionPerformed
        
        int marcado = jTableInstrucoes.getSelectedRow();
        
        System.out.println("Meu marcado é:"+marcado);
        
        if(marcado == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um campo para alterar");
        }else{
         
            jTableInstrucoes.setValueAt(txtInstrucao.getText(), marcado, 1);
            
        }
         txtInstrucao.setText("");
    }//GEN-LAST:event_btnAlterarInstrucaoActionPerformed

    private void btnAdicionarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarDadosActionPerformed
            
        DefaultTableModel dtmDados = (DefaultTableModel) jTableDados.getModel(); 
        Object[] dados;
       
        int somalinhas = jTableDados.getModel().getRowCount(); //retorna número de linhas inseridas na tabela
        
        if(somalinhas == 128)
        {
            JOptionPane.showMessageDialog(null, "MEMÓRIA CHEIA!");
        }else{
            Object[] aux = {txtEndereco.getText(), txtDado.getText()}; 
            dados = aux;
            dtmDados.addRow(dados);
        }
        
          memoria.inserir(Integer.parseInt(txtEndereco.getText()), txtDado.getText());
          
                      System.out.println("Vamos ver a memoria");
            memoria.imprimir();
            System.out.println("---");
       
    }//GEN-LAST:event_btnAdicionarDadosActionPerformed

    private void btnAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosActionPerformed
   
        int marcado = jTableDados.getSelectedRow();
        
        System.out.println("Meu marcado é:"+marcado);
        
        if(marcado == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um campo para alterar");
        }else{
         
            jTableDados.setValueAt(txtDado.getText(), marcado, 1);
            
        }
         txtInstrucao.setText("");
   


    }//GEN-LAST:event_btnAlterarDadosActionPerformed

    private void btnExcluirDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirDadosActionPerformed
        
        int marcado = jTableDados.getSelectedRow();
                
        if(marcado == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione um campo para excluir");
        }else{
            DefaultTableModel dtmDado = (DefaultTableModel) jTableDados.getModel(); 
            dtmDado.removeRow(marcado);
              }

    }//GEN-LAST:event_btnExcluirDadosActionPerformed

    private void btnImprimirMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirMemActionPerformed
        System.out.println("A memória é");
     //   memoria.imprimir();
        
    }//GEN-LAST:event_btnImprimirMemActionPerformed

    private void btnExecucaoPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecucaoPassoActionPerformed
        
        //qual estado da máquina de estados eu to com esse clock?
        int estado = controle.indicaSinais(clockExt.getCounter());//estado 0 tenho q ler determinados sinais
        int instrucao =0;
        String conteudo;
        String operacao;
        String reg1;
        String reg2;
        String estSignal;
        switch(estado){
            
            case 0:
               // String dadoLido = memoria.getMemoria(Integer.parseInt(bancoRegistrador.getPC()));
                palavra p = memoria.procurar(Integer.parseInt(bancoRegistrador.getPC()));
                String dadoLido = p.getConteudo();
             //   String dadoLido="00001010010100111000100000100000";
                System.out.println("Li a memoria="+dadoLido);
           // IMPORTANTE //     int valor =Integer.parseInt(dadoLido, 2) ;
            //    String a = dadoLido.substring(0,6);//pego o opcode da string
             //   System.out.println("valor de a="+a);
                
                bancoRegistrador.setIR(dadoLido); //liga memoria, reg inst
                ula.setValorA(Integer.parseInt(bancoRegistrador.getPC()));
                ula.setValorB(4);
                ula.setOperacao("add"); 
                ula.executarOperacao();//liga ula
                bancoRegistrador.setPC(Integer.toString(ula.getSaida())); //liga pc
                System.out.println("Meu pc é="+bancoRegistrador.getPC());
//                System.out.println("Assim ficou após executar uma BUSCA de instrução na memória");
//                System.out.println("IR="+bancoRegistrador.getIR());
//                System.out.println("ULA FONTE A="+ula.getValorA());
//                System.out.println("ULA FONTE B="+ula.getValorB());
//                System.out.println("ULA SAIDA="+ula.getSaida());
//                System.out.println("PC ATUALIZADO="+bancoRegistrador.getPC());
                clockExt.contar();
                
                break;
            
            case 1:
                 conteudo = bancoRegistrador.getIR();//retorna o conteudo do reg. instruções
                 operacao = conteudo.substring(0, 6);
                System.out.println("Operacao no case 1 é ="+operacao);
                 instrucao = Integer.parseInt(operacao, 2);
                 controle.setInstrucao(instrucao);//guardo instrução no controle
               //  clockExt.setCounter(instrucao);
                System.out.println("A instrucao e="+controle.getInstrucao());
                 reg1 = conteudo.substring(6, 11);//String a = dadoLido.substring(0,6);//pego o opcode da string
                 reg2 = conteudo.substring(11, 16);
                 int r1 = Integer.parseInt(reg1, 2);
                 int r2 = Integer.parseInt(reg2, 2);
             //    System.out.println("Valor do reg1="+r1+"; reg2="+r2);
                 
                 bancoRegistrador.setRegA(bancoRegistrador.getBancoRegistradores(r1));
                 bancoRegistrador.setRegB(bancoRegistrador.getBancoRegistradores(r2));
                 
                 estSignal = conteudo.substring(16,32);
             
                 estSignal = extensaoSinalComDesloc(estSignal);
                 ula.setValorA(Integer.parseInt(bancoRegistrador.getPC()));
                 ula.setValorB(Integer.parseInt(estSignal, 2));
                 ula.setOperacao("add");
                 ula.executarOperacao();
                 bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                 
                     if(instrucao == 0){
                         clockExt.setCounter(6);
                     }
                     if(instrucao == 4){
                         clockExt.setCounter(8);
                     }
                     if(instrucao == 2){
                         clockExt.setCounter(9);
                     }
                     if(instrucao == 35 || instrucao == 43 || instrucao == 12 || instrucao == 13 || instrucao == 4 ||
                             instrucao == 5){
                         System.out.println("Contei");
                         clockExt.contar();
                     }
//                int result = conversorDecimalBinario(ula.getSaida());
//                
//                System.out.println("Meu registrador A="+bancoRegistrador.getRegA());
//                System.out.println("Meu registrador B="+bancoRegistrador.getRegB());
//                System.out.println("A saída da ULA fica como="+result);
                
                break;
            case 2:
                
                ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                conteudo = bancoRegistrador.getIR();
                estSignal = conteudo.substring(16,32);
              //  System.out.println("valor de estSignal="+estSignal);
                ula.setValorB(Integer.parseInt(estSignal, 2));
                ula.setOperacao("add");
                ula.executarOperacao();
             //   System.out.println("Valor a="+ula.getValorA());
              //  System.out.println("Valor b="+ula.getValorB());
              //  System.out.println("Valor saída="+ula.getSaida());
                bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                
               
                //controle da operação para cuidar a máquina de estados
                    if(controle.getInstrucao()==35){
                        clockExt.setCounter(3);//meu próximo estado
                    }
                    
                    if(controle.getInstrucao()==43){
                        clockExt.setCounter(5);//meu próximo estado
                    }
                
                break;
               
            case 3://estou fazendo um lw
             //   System.out.println("Valor do reg saida da ula="+Integer.parseInt(bancoRegistrador.getRegSaidaUla()));
                palavra auxiliar = memoria.procurar(Integer.parseInt(bancoRegistrador.getRegSaidaUla())) ;
                conteudo = auxiliar.getConteudo();
                bancoRegistrador.setMDR(conteudo);
             //   System.out.println("Minha memória de dados é="+bancoRegistrador.getMDR());
                clockExt.contar();
                break;
            case 4:
                conteudo = bancoRegistrador.getIR();
                String registradorDestino = conteudo.substring(6, 11);
                bancoRegistrador.setBancoRegistradores(Integer.parseInt(registradorDestino, 2), bancoRegistrador.getMDR());
                clockExt.setCounter(0);
                break;
            case 5://estou fazendo um sw
                memoria.inserir(Integer.parseInt(bancoRegistrador.getRegSaidaUla()), bancoRegistrador.getRegB());
                clockExt.setCounter(0);
                break;
            case 6:
                ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                String funct = bancoRegistrador.getIR();
                funct = funct.substring(26, 32);
                System.out.println("Funct é="+funct);
                funct = retornaFunct(Integer.parseInt(funct, 2));
                System.out.println("Valor de funct="+funct);
                ula.setOperacao(funct);
                ula.executarOperacao();
                bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                System.out.println("Resultado da operação de "+funct+"="+bancoRegistrador.getRegSaidaUla());
                clockExt.contar();
                break;
            case 7:
                conteudo = bancoRegistrador.getIR();
                conteudo = conteudo.substring(16, 21);
                bancoRegistrador.setBancoRegistradores(Integer.parseInt(conteudo, 2), bancoRegistrador.getRegSaidaUla());
                clockExt.setCounter(0);
                break;
                
        }
       
        System.out.println("Valor do contador="+clockExt.getCounter());
    }//GEN-LAST:event_btnExecucaoPassoActionPerformed
    
   public static String extensaoSinalComDesloc(String numero){
        
        String extend=numero.substring(2, 16);
       // System.out.println("Valor de cort="+extend);
        extend = extend + ""+ "00";
       // System.out.println("Fica como ="+extend);
       return extend;
   }
   
   public String retornaFunct (int numero){
       
       String valor="";
       
       switch(numero)
       {
           case 32:
               valor = "add";
               break;
           case 34:
               valor = "sub";
               break;
           case 36:
               valor = "and";
               break;               
           case 37:
               valor = "or";
               break;
           case 39:
               valor = "nor";
               break;
           case 0:
               valor = "sll";
               break;
           case 2:
               valor = "srl";
               break;
           case 42:
               valor = "slt";
               break;
           case 8:
               valor = "jr";
               break;               
       }
       return valor;
   }
    
    public static int conversorDecimalBinario(int n){//estava estourando se fosse do tipo int 
        //INSTRUÇÃO DO TIPO R - OP|RS|RT|RD|SHAMT|FUNCT
        //INSTRUÇÃO DO TIPO I - OP|RS|RT|CONSTANTE OU ENDEREÇO
        //INSTRUÇÃO DO TIPO J - OP|CONSTANTE OU ENDEREÇO
        
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
       // System.out.println(binario);
        //invertendo meu número
        String invertida = new StringBuilder(binario).reverse().toString();
      //  System.out.println(invertida);
        return Integer.parseInt(invertida);
    }
    
        public static int conversorBinarioDecimal(String binario){//estava estourando se fosse do tipo int 
        //INSTRUÇÃO DO TIPO R - OP|RS|RT|RD|SHAMT|FUNCT
        //INSTRUÇÃO DO TIPO I - OP|RS|RT|CONSTANTE OU ENDEREÇO
        //INSTRUÇÃO DO TIPO J - OP|CONSTANTE OU ENDEREÇO
        int decimal = Integer.parseInt(binario, 2);
        //System.out.println("Resultado é:"+decimal);
        return decimal;
    }
    
    public static void mascaramento(String campo, tdsReg Registradores)
    {
        int i = 0;
        String valor = "";
        switch(campo)
        {
            case "op":
                while(i < 6)
                {
                    valor = valor + campo.charAt(i);
                    i++;
                }
                int op = Integer.parseInt(valor);
            break;
            case "rs":
                i = 5;
                while(i <11)
                {
                    valor = valor + campo.charAt(i);
                    i++;
                }
            break;
            case "rt":
            
            break;
            case "rd":
                
            break;
            case "shamt":
                
            break;
            case "funct":
                
            break;
            case "consEnd":
            
            break;
            case "constante":
                
            break;    
        }
        
    }
    
    public String lerInstrucao(String instrucao)
    {
         
        //INSTRUÇÃO DO TIPO I - OP|RS|RT|CONSTANTE OU ENDEREÇO
        //INSTRUÇÃO DO TIPO J - OP|CONSTANTE OU ENDEREÇO
        //ler a instrução e separar por espaço
        
        //exemplos de códigos
        
        //TIPO I lw s1 100 s2
        //TIPO J j 2500
        
        String[] arrayValores = instrucao.split(" ");
        int tamanho = arrayValores.length;
        String op;
        String rs;
        String rt;
        String constante;
        String rd;
        String shamt;
        String funct;
        String inst = "";
        int zero = 0;
        
        if(tamanho == 4 ){//ou é uma instrução do tipo I ou do tipo R
                
                switch(arrayValores[0]){
                    //ESSAS SÃO DO TIPO I DESDE AQUI <<
                    case "lw":
                        op = Integer.toString(conversorDecimalBinario(35));
                            if(op.length() < 6){
                                int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                    op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                            //System.out.println("DPs"+aux);

                         constante = Integer.toString(conversorDecimalBinario(Integer.parseInt(arrayValores[2])));
                          //  System.out.println("Antes"+aux);
                            if(constante.length() < 16){
                                int sub = 16 - constante.length();
                                for(int i = 0; i< sub;i++){
                                    constante = zero + "" + constante;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[3])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         inst = op +""+rs+""+rt+""+constante;
                //         System.out.println(inst);
                     break;

                    case "sw":
                        op = Integer.toString(conversorDecimalBinario(43));
                            if(op.length() < 6){
                                int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                    op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                            //System.out.println("DPs"+aux);

                         constante = Integer.toString(conversorDecimalBinario(Integer.parseInt(arrayValores[2])));
                          //  System.out.println("Antes"+aux);
                            if(constante.length() < 16){
                                int sub = 16 - constante.length();
                                for(int i = 0; i< sub;i++){
                                    constante = zero + "" + constante;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[3])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         inst = op +""+rs+""+rt+""+constante;
                        // System.out.println(inst);
                     break;                     
                     
                    case "andi":
                        op = Integer.toString(conversorDecimalBinario(12));
                            if(op.length() < 6){
                                int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                    op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                            //System.out.println("DPs"+aux);

                         constante = Integer.toString(conversorDecimalBinario(Integer.parseInt(arrayValores[3])));
                          //  System.out.println("Antes"+aux);
                            if(constante.length() < 16){
                                int sub = 16 - constante.length();
                                for(int i = 0; i< sub;i++){
                                    constante = zero + "" + constante;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         inst = op +""+rs+""+rt+""+constante;
                        // System.out.println(inst);
                     break;   
                    
                    case "ori":
                        op = Integer.toString(conversorDecimalBinario(13));
                            if(op.length() < 6){
                                int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                    op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                            //System.out.println("DPs"+aux);

                         constante = Integer.toString(conversorDecimalBinario(Integer.parseInt(arrayValores[3])));
                          //  System.out.println("Antes"+aux);
                            if(constante.length() < 16){
                                int sub = 16 - constante.length();
                                for(int i = 0; i< sub;i++){
                                    constante = zero + "" + constante;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         inst = op +""+rs+""+rt+""+constante;
                        // System.out.println(inst);
                     break;  
                    case "beq":
                        op = Integer.toString(conversorDecimalBinario(4));
                            if(op.length() < 6){
                                int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                    op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                            //System.out.println("DPs"+aux);

                         constante = Integer.toString(conversorDecimalBinario(Integer.parseInt(arrayValores[3])));
                          //  System.out.println("Antes"+aux);
                            if(constante.length() < 16){
                                int sub = 16 - constante.length();
                                for(int i = 0; i< sub;i++){
                                    constante = zero + "" + constante;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         inst = op +""+rs+""+rt+""+constante;
                        // System.out.println(inst);
                     break;                     
                    
                    case "bne":
                        op = Integer.toString(conversorDecimalBinario(5));
                            if(op.length() < 6){
                                int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                    op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                            //System.out.println("DPs"+aux);

                         constante = Integer.toString(conversorDecimalBinario(Integer.parseInt(arrayValores[3])));
                          //  System.out.println("Antes"+aux);
                            if(constante.length() < 16){
                                int sub = 16 - constante.length();
                                for(int i = 0; i< sub;i++){
                                    constante = zero + "" + constante;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }

                         inst = op +""+rs+""+rt+""+constante;
                        // System.out.println(inst);
                     break;  
                //ESSAS SÃO DO TIPO I ATÉ AQUI >>    
                     
                //AGORA É INS. DO TIPO R >>//TIPO R = add s1 s2 s3 //INSTRUÇÃO DO TIPO R - OP|RS|RT|RD|SHAMT|FUNCT
                    case "add"://rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                          op = Integer.toString(conversorDecimalBinario(0));
                            if(op.length() < 6){
                              int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        
                         rd = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rd.length() < 5){
                                int sub = 5 - rd.length();
                                for(int i = 0; i< sub;i++){
                                    rd = zero + "" +rd;//inserindo zeros na frente para completar os 16 bits
                                }
                            }   
                            
                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                        
                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[3])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                         
                         shamt = Integer.toString(conversorDecimalBinario(0));
                            if(shamt.length() < 5){
                              int sub = 5 - shamt.length();
                                for(int i = 0; i< sub;i++){
                                shamt = zero + "" +shamt;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                            
                         funct = Integer.toString(conversorDecimalBinario(32));
                            if(funct.length() < 6){
                              int sub = 6 - funct.length();
                                for(int i = 0; i< sub;i++){
                                funct = zero + "" +funct;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        inst = op +""+rs+""+rt+""+rd+""+shamt+""+funct;
                        //System.out.println(inst);    
                    break;
                        
                    case "sub":
                          op = Integer.toString(conversorDecimalBinario(0));
                            if(op.length() < 6){
                              int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        
                         rd = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rd.length() < 5){
                                int sub = 5 - rd.length();
                                for(int i = 0; i< sub;i++){
                                    rd = zero + "" +rd;//inserindo zeros na frente para completar os 16 bits
                                }
                            }   
                            
                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                        
                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[3])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                         
                         shamt = Integer.toString(conversorDecimalBinario(0));
                            if(shamt.length() < 5){
                              int sub = 5 - shamt.length();
                                for(int i = 0; i< sub;i++){
                                shamt = zero + "" +shamt;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                            
                         funct = Integer.toString(conversorDecimalBinario(34));
                            if(funct.length() < 6){
                              int sub = 6 - funct.length();
                                for(int i = 0; i< sub;i++){
                                funct = zero + "" +funct;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        inst = op +""+rs+""+rt+""+rd+""+shamt+""+funct;
                        //System.out.println(inst);                      
                    break;
                    
                    case "and":
                          op = Integer.toString(conversorDecimalBinario(0));
                            if(op.length() < 6){
                              int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        
                         rd = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rd.length() < 5){
                                int sub = 5 - rd.length();
                                for(int i = 0; i< sub;i++){
                                    rd = zero + "" +rd;//inserindo zeros na frente para completar os 16 bits
                                }
                            }   
                            
                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                        
                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[3])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                         
                         shamt = Integer.toString(conversorDecimalBinario(0));
                            if(shamt.length() < 5){
                              int sub = 5 - shamt.length();
                                for(int i = 0; i< sub;i++){
                                shamt = zero + "" +shamt;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                            
                         funct = Integer.toString(conversorDecimalBinario(36));
                            if(funct.length() < 6){
                              int sub = 6 - funct.length();
                                for(int i = 0; i< sub;i++){
                                funct = zero + "" +funct;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        inst = op +""+rs+""+rt+""+rd+""+shamt+""+funct;
                        //System.out.println(inst);                      
                    break;
                    
                    case "or":
                          op = Integer.toString(conversorDecimalBinario(0));
                            if(op.length() < 6){
                              int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        
                         rd = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rd.length() < 5){
                                int sub = 5 - rd.length();
                                for(int i = 0; i< sub;i++){
                                    rd = zero + "" +rd;//inserindo zeros na frente para completar os 16 bits
                                }
                            }   
                            
                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                        
                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[3])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                         
                         shamt = Integer.toString(conversorDecimalBinario(0));
                            if(shamt.length() < 5){
                              int sub = 5 - shamt.length();
                                for(int i = 0; i< sub;i++){
                                shamt = zero + "" +shamt;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                            
                         funct = Integer.toString(conversorDecimalBinario(37));
                            if(funct.length() < 6){
                              int sub = 6 - funct.length();
                                for(int i = 0; i< sub;i++){
                                funct = zero + "" +funct;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        inst = op +""+rs+""+rt+""+rd+""+shamt+""+funct;
                        //System.out.println(inst);                      
                    break;
                    
                    case "nor":
                          op = Integer.toString(conversorDecimalBinario(0));
                            if(op.length() < 6){
                              int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        
                         rd = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rd.length() < 5){
                                int sub = 5 - rd.length();
                                for(int i = 0; i< sub;i++){
                                    rd = zero + "" +rd;//inserindo zeros na frente para completar os 16 bits
                                }
                            }   
                            
                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                        
                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[3])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                         
                         shamt = Integer.toString(conversorDecimalBinario(0));
                            if(shamt.length() < 5){
                              int sub = 5 - shamt.length();
                                for(int i = 0; i< sub;i++){
                                shamt = zero + "" +shamt;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                            
                         funct = Integer.toString(conversorDecimalBinario(39));
                            if(funct.length() < 6){
                              int sub = 6 - funct.length();
                                for(int i = 0; i< sub;i++){
                                funct = zero + "" +funct;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        inst = op +""+rs+""+rt+""+rd+""+shamt+""+funct;
                       // System.out.println(inst);                      
                    break;
                    
                    case "sll":
                          op = Integer.toString(conversorDecimalBinario(0));
                            if(op.length() < 6){
                              int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        
                         rd = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rd.length() < 5){
                                int sub = 5 - rd.length();
                                for(int i = 0; i< sub;i++){
                                    rd = zero + "" +rd;//inserindo zeros na frente para completar os 16 bits
                                }
                            }   
                            
                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                        
                         rt = Integer.toString(conversorDecimalBinario(Integer.parseInt(arrayValores[3])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                         
                         shamt = Integer.toString(conversorDecimalBinario(0));
                            if(shamt.length() < 5){
                              int sub = 5 - shamt.length();
                                for(int i = 0; i< sub;i++){
                                shamt = zero + "" +shamt;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                            
                         funct = Integer.toString(conversorDecimalBinario(0));
                            if(funct.length() < 6){
                              int sub = 6 - funct.length();
                                for(int i = 0; i< sub;i++){
                                funct = zero + "" +funct;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        inst = op +""+rs+""+rt+""+rd+""+shamt+""+funct;
                        //System.out.println(inst);                      
                    break;
                    
                    case "srl":
                          op = Integer.toString(conversorDecimalBinario(0));
                            if(op.length() < 6){
                              int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        
                         rd = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rd.length() < 5){
                                int sub = 5 - rd.length();
                                for(int i = 0; i< sub;i++){
                                    rd = zero + "" +rd;//inserindo zeros na frente para completar os 16 bits
                                }
                            }   
                            
                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                        
                         rt = Integer.toString(conversorDecimalBinario(Integer.parseInt(arrayValores[3])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                         
                         shamt = Integer.toString(conversorDecimalBinario(0));
                            if(shamt.length() < 5){
                              int sub = 5 - shamt.length();
                                for(int i = 0; i< sub;i++){
                                shamt = zero + "" +shamt;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                            
                         funct = Integer.toString(conversorDecimalBinario(2));
                            if(funct.length() < 6){
                              int sub = 6 - funct.length();
                                for(int i = 0; i< sub;i++){
                                funct = zero + "" +funct;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        inst = op +""+rs+""+rt+""+rd+""+shamt+""+funct;
                       // System.out.println(inst);                      
                    break;
                    
                    case "slt":
                          op = Integer.toString(conversorDecimalBinario(0));
                            if(op.length() < 6){
                              int sub = 6 - op.length();
                                for(int i = 0; i< sub;i++){
                                op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        
                         rd = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                            //System.out.println("Antes"+aux);
                            if(rd.length() < 5){
                                int sub = 5 - rd.length();
                                for(int i = 0; i< sub;i++){
                                    rd = zero + "" +rd;//inserindo zeros na frente para completar os 16 bits
                                }
                            }   
                            
                         rs = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[2])));
                            //System.out.println("Antes"+aux);
                            if(rs.length() < 5){
                                int sub = 5 - rs.length();
                                for(int i = 0; i< sub;i++){
                                    rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                        
                         rt = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[3])));
                            if(rt.length() < 5){
                                int sub = 5 - rt.length();
                                for(int i = 0; i< sub;i++){
                                    rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                }
                            }
                         
                         shamt = Integer.toString(conversorDecimalBinario(0));
                            if(shamt.length() < 5){
                              int sub = 5 - shamt.length();
                                for(int i = 0; i< sub;i++){
                                shamt = zero + "" +shamt;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                            
                         funct = Integer.toString(conversorDecimalBinario(42));
                            if(funct.length() < 6){
                              int sub = 6 - funct.length();
                                for(int i = 0; i< sub;i++){
                                funct = zero + "" +funct;//inserindo zeros na frente para completar os 16 bits
                              }
                            } 
                        inst = op +""+rs+""+rt+""+rd+""+shamt+""+funct;
                        //System.out.println(inst);                      
                    break;
                    
                    //ATE AQUI DO TIPO R - falta jr que fica com o de 2 campos>>>                                                                                                                                                                
                }
        }
        if(tamanho == 2)
        {
            switch(arrayValores[0]){    
                        case "jr":
                            System.out.println("Oi jr");
                              op = Integer.toString(conversorDecimalBinario(0));
                                if(op.length() < 6){
                                  int sub = 6 - op.length();
                                    for(int i = 0; i< sub;i++){
                                    op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                                  }
                                } 

                             rd = Integer.toString(conversorDecimalBinario(retornaReg(arrayValores[1])));
                                //System.out.println("Antes"+aux);
                                if(rd.length() < 5){
                                    int sub = 5 - rd.length();
                                    for(int i = 0; i< sub;i++){
                                        rd = zero + "" +rd;//inserindo zeros na frente para completar os 16 bits
                                    }
                                }   

                             rs = Integer.toString(conversorDecimalBinario(0));
                                //System.out.println("Antes"+aux);
                                if(rs.length() < 5){
                                    int sub = 5 - rs.length();
                                    for(int i = 0; i< sub;i++){
                                        rs = zero + "" +rs;//inserindo zeros na frente para completar os 16 bits
                                    }
                                }

                             rt = Integer.toString((conversorDecimalBinario(0)));
                                if(rt.length() < 5){
                                    int sub = 5 - rt.length();
                                    for(int i = 0; i< sub;i++){
                                        rt = zero + "" +rt;//inserindo zeros na frente para completar os 16 bits
                                    }
                                }

                             shamt = Integer.toString(conversorDecimalBinario(0));
                                if(shamt.length() < 5){
                                  int sub = 5 - shamt.length();
                                    for(int i = 0; i< sub;i++){
                                    shamt = zero + "" +shamt;//inserindo zeros na frente para completar os 16 bits
                                  }
                                } 

                             funct = Integer.toString(conversorDecimalBinario(8));
                                if(funct.length() < 6){
                                  int sub = 6 - funct.length();
                                    for(int i = 0; i< sub;i++){
                                    funct = zero + "" +funct;//inserindo zeros na frente para completar os 16 bits
                                  }
                                } 
                            inst = op +""+rs+""+rt+""+rd+""+shamt+""+funct;
                          //  System.out.println(inst);                      
                        break;
                        case "j":
                              op = Integer.toString(conversorDecimalBinario(2));
                                if(op.length() < 6){
                                  int sub = 6 - op.length();
                                    for(int i = 0; i< sub;i++){
                                    op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                                  }
                                } 
                             constante = Integer.toString(conversorDecimalBinario(Integer.parseInt(arrayValores[1])));
                             if(constante.length() < 26){
                                  int sub = 26 - op.length();
                                    for(int i = 0; i< sub;i++){
                                    constante = zero + "" +constante;//inserindo zeros na frente para completar os 16 bits
                                  }
                                } 
                            inst = op +""+constante;
                          //  System.out.println(inst);                      
                        break;
                        case "jal":
                             op = Integer.toString(conversorDecimalBinario(3));
                                if(op.length() < 6){
                                  int sub = 6 - op.length();
                                    for(int i = 0; i< sub;i++){
                                    op = zero + "" +op;//inserindo zeros na frente para completar os 16 bits
                                  }
                                } 
                             constante = Integer.toString(conversorDecimalBinario(Integer.parseInt(arrayValores[1])));
                             if(constante.length() < 26){
                                  int sub = 26 - op.length();
                                    for(int i = 0; i< sub;i++){
                                    constante = zero + "" +constante;//inserindo zeros na frente para completar os 16 bits
                                  }
                                } 
                            inst = op +""+constante;
                           // System.out.println(inst);                 
                        break;

            }
        }
        
     return inst;   
    }
    
    public int retornaReg(String valor){
         /*  [2 a 3]=$vo e $v1
        [4 a 7]=$a0 a $a3
        [8 a 15]=$t0 a $t7
        [16 a 23]=$s0 a $s7
        [24 a 25]=$t8 a $t9
        [28]= $gp(ponteiro global)
        [29]=$sp(stack pointer)
        [30]=$fp(frame pointer)
        [31]=$ra(endereço de retorno)
        */
        int registrador=0;
         switch(valor){
             case "v0":
             registrador = 2;
             break;
             
             case "v1":
             registrador = 3;
             break;
             
             case "a0":
             registrador = 4;
             break;
             
             case "a1":
             registrador = 5;
             break;
             
             case "a2":
             registrador = 6;
             break;
             
             case "a3":
             registrador = 7;
             break;
             
             case "t0":
             registrador = 8;
             break;
             
             case "t1":
             registrador = 9;
             break;
             
             case "t2":
             registrador = 10;
             break;
             
             case "t3":
             registrador = 11;
             break;
             
             case "t4":
             registrador = 12;
             break;
             
             case "t5":
             registrador = 13;
             break;
             
             case "t6":
             registrador = 14;
             break;
             
             case "t7":
             registrador = 15;
             break;
             
             case "s0":
             registrador = 16;
             break;
             
             case "s1":
             registrador = 17;
             break;
             
             case "s2":
             registrador = 18;
             break;
             
             case "s3":
             registrador = 19;
             break;
             
             case "s4":
             registrador = 20;
             break;
             
             case "s5":
             registrador = 21;
             break;
             
             case "s6":
             registrador = 22;
             break;
             
             case "s7":
             registrador = 23;
             break;
             
             case "t8":
             registrador = 24;
             break;
             
             case "t9":
             registrador = 25;
             break;
             
             case "gp":
             registrador = 28;
             break;
             
             case "sp":
             registrador = 29;
             break;
             
             case "fp":
             registrador = 30;
             break;
             
             case "ra":
             registrador = 31;
             break;
         }
         
         return registrador;
        
        
    }
 
    
    
//    public static void manipulacao(controle estados, tdsReg banco, memory memoria)
//    {
//        if(estados.getLerMem() == 1 && estados.getIREsc() == 1 && estados.getIouD()==0 && estados.getULAFonteA() == 0 &&
//                estados.getULAFonteB() == 1 && estados.getULAOp() == 0 && estados.getFontePC() == 0 && estados.getPCEsc() ==  1 )
//        {
//            //é a condição de busca da instrução
//            //IR <- MEMORIA[PC]
//            //PC = PC +4
//        }
//        if(estados.getULAFonteA() == 0 && estados.getULAFonteB() == 3 && estados.getULAOp() == 0)
//        {
//            //é as condições para a decodificação da instrução
//            //A <- REG[IR[25:21]]
//            //B <- REG[IR[20:16]]
//            //ULASAIDA <- PC + (extensão de sinal(IR[15:0] << 2))
//        }
//        if(estados.getULAFonteA() == 1 & estados.getULAFonteB() == 2 && estados.getULAOp() == 0){
//            //Execução de instrução: para instruções que fazem referência a memória
//            //ULASaida <- A + extensão de sinal(IR[15:0])
//        }
//        if(estados.getULAFonteA() == 1 && estados.getULAFonteB() == 0 && estados.getULAOp() == 2){
//            //Execução de instrução: tipo R
//            //ULASaida <-A op B
//        }
//        if(estados.getULAFonteA() == 1 && estados.getULAFonteB() == 0 && estados.getULAOp() == 1 && estados.getPCEscCond() == 1 &&
//                estados.getFontePC() == 1)
//        {
//            //Para execução de instrução: desvio condicional
//            //if a == b então pc <-ULASaida
//        }
//        if(estados.getFontePC() == 2 && estados.getPCEsc() == 1)
//        {
//            //Para execução de instrução: desvio incondicional
//            //pc <- pc[31:28],ir[25:0], 2'B00
//        }
//        if(estados.getLerMem() == 1 && estados.getIouD() == 1){
//            //Acesso a memoria: para isntruçoes de ref a memoria LOAD
//            //MDR <- MEMORIA[ULASAIDA]
//        }
//        if(estados.getEscMem()==1 && estados.getIouD() == 1)
//        {
//            //Acesso a memoria: para instruções de ref a memoria STORE
//            //memoria[ULASAIDA] <- B
//        }
//        if(estados.getRegDst()==1 && estados.getEscReg()==1 && estados.getMemParaReg() == 0)
//        {
//            //Acesso a memoria: instruções do tipo R 
//            //REG[IR[15:11]] <- ULASaida
//        }
//        if(estados.getMemParaReg() == 1 && estados.getEscReg() == 1 && estados.getRegDst() == 0)
//        {
//            //Escrita no registrador
//            //Reg[IR[20:16] <- MDR]
//        }
//    }
    

    
    public static void main(String args[]) {
      
        //Criando a parte visual 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagInserirDados().setVisible(true);
            }
        });
    
        
//        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarDados;
    private javax.swing.JButton btnAdicionarInstrucao;
    private javax.swing.JButton btnAlterarDados;
    private javax.swing.JButton btnAlterarInstrucao;
    private javax.swing.JButton btnCache;
    private javax.swing.JButton btnExcluirDados;
    private javax.swing.JButton btnExcluirInstrucao;
    private javax.swing.JButton btnExecucaoCompleta;
    private javax.swing.JButton btnExecucaoPasso;
    private javax.swing.JButton btnImprimirMem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTable jTableInstrucoes;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtDado;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtInstrucao;
    private javax.swing.JTextField txtTamCache;
    private javax.swing.JTextField txtValordoPc;
    // End of variables declaration//GEN-END:variables
}
