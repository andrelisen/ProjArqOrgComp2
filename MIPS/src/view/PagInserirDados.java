
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import myclasses.controle;
import myclasses.memory;
import myclasses.tdsReg;

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
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
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

        btnExecucaoCompleta.setText("EXECUÇÃO COMPLETA");

        jLabel6.setText("Valor do PC");

        jRadioButton1.setText("ULA");

        jRadioButton2.setText("MEMÓRIA");

        jRadioButton4.setText("REGISTRADOR DE INSTRUÇÕES");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("REGISTRADOR B");

        jRadioButton6.setText("REGISTRADOR DE DADOS DA MEMÓRIA");

        jRadioButton7.setText("REGISTRADOR A");

        jRadioButton8.setText("BANCO DE REGISTRADORES");

        jLabel7.setText("*APENAS ESPAÇO");

        jLabel8.setText("*SEM VÍRGULAS, PARÊNTESES OU CIFRÃO");

        jRadioButton9.setText("REGISTRADOR SAÍDA ULA");

        jRadioButton10.setText("PC");

        jRadioButton11.setText("CONTROLE");

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
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton10)
                                    .addComponent(jRadioButton6))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButton7)
                                        .addComponent(jRadioButton5))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton8))
                                .addGap(77, 77, 77)
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
                        .addGap(141, 141, 141)
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
                        .addGap(139, 139, 139)
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
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton9))
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
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        
        //Limpo caixa de entrada de instrução
        txtInstrucao.setText("");
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

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed
    
    public static String conversorDecimalBinario(int n){//estava estourando se fosse do tipo int 
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
        System.out.println("tamanho"+binario.length());
        while(binario.length() < 32)
        {
            binario = binario + 0;
            System.out.println("sim");
        }
        System.out.println(binario);
        //invertendo meu número
        String invertida = new StringBuilder(binario).reverse().toString();
        System.out.println(invertida);
        return invertida;
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
    
    
    public static void manipulacao(controle estados, tdsReg banco, memory memoria)
    {
        if(estados.getLerMem() == 1 && estados.getIREsc() == 1 && estados.getIouD()==0 && estados.getULAFonteA() == 0 &&
                estados.getULAFonteB() == 1 && estados.getULAOp() == 0 && estados.getFontePC() == 0 && estados.getPCEsc() ==  1 )
        {
            //é a condição de busca da instrução
            //IR <- MEMORIA[PC]
            //PC = PC +4
        }
        if(estados.getULAFonteA() == 0 && estados.getULAFonteB() == 3 && estados.getULAOp() == 0)
        {
            //é as condições para a decodificação da instrução
            //A <- REG[IR[25:21]]
            //B <- REG[IR[20:16]]
            //ULASAIDA <- PC + (extensão de sinal(IR[15:0] << 2))
        }
        if(estados.getULAFonteA() == 1 & estados.getULAFonteB() == 2 && estados.getULAOp() == 0){
            //Execução de instrução: para instruções que fazem referência a memória
            //ULASaida <- A + extensão de sinal(IR[15:0])
        }
        if(estados.getULAFonteA() == 1 && estados.getULAFonteB() == 0 && estados.getULAOp() == 2){
            //Execução de instrução: tipo R
            //ULASaida <-A op B
        }
        if(estados.getULAFonteA() == 1 && estados.getULAFonteB() == 0 && estados.getULAOp() == 1 && estados.getPCEscCond() == 1 &&
                estados.getFontePC() == 1)
        {
            //Para execução de instrução: desvio condicional
            //if a == b então pc <-ULASaida
        }
        if(estados.getFontePC() == 2 && estados.getPCEsc() == 1)
        {
            //Para execução de instrução: desvio incondicional
            //pc <- pc[31:28],ir[25:0], 2'B00
        }
        if(estados.getLerMem() == 1 && estados.getIouD() == 1){
            //Acesso a memoria: para isntruçoes de ref a memoria LOAD
            //MDR <- MEMORIA[ULASAIDA]
        }
        if(estados.getEscMem()==1 && estados.getIouD() == 1)
        {
            //Acesso a memoria: para instruções de ref a memoria STORE
            //memoria[ULASAIDA] <- B
        }
        if(estados.getRegDst()==1 && estados.getEscReg()==1 && estados.getMemParaReg() == 0)
        {
            //Acesso a memoria: instruções do tipo R 
            //REG[IR[15:11]] <- ULASaida
        }
        if(estados.getMemParaReg() == 1 && estados.getEscReg() == 1 && estados.getRegDst() == 0)
        {
            //Escrita no registrador
            //Reg[IR[20:16] <- MDR]
        }
    }
    
    public static void main(String args[]) {
      
        //Criando a parte visual 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagInserirDados().setVisible(true);
            }
        });
  
        int clock= 0;
        
        
        memory memoria = new memory(); //ela vai ter que ser do tipo String por que é mais fácil de manipular
        controle CentralControle = new controle();
        tdsReg registradores = new tdsReg(0,0,0,0,0,0);
        
        //Como estou com dificuldade para enxergar alguns passos
        //Implemento tudo estático 
        switch(clock)
        {
            case 0:
            //primeira execução
            CentralControle.operacao("busca");
            manipulacao(CentralControle, registradores, memoria);
                break;
            case 1:
            CentralControle.operacao("decodificacao");
            manipulacao(CentralControle, registradores, memoria);
                break;
            case 2:
            CentralControle.operacao("ExecMemoria");
            manipulacao(CentralControle, registradores, memoria);
            break;    
            case 3:
            CentralControle.operacao("ExecinstTipoR");
            manipulacao(CentralControle, registradores, memoria);
            break;    
            case 4:
            CentralControle.operacao("ExecdesvioCondicional");
            manipulacao(CentralControle, registradores, memoria);
            break;    
            case 5:
            CentralControle.operacao("ExecdesvioIncondicional");
            manipulacao(CentralControle, registradores, memoria);
            break;    
            case 6:
            CentralControle.operacao("AcessoInstRefMemLoad");
            manipulacao(CentralControle, registradores, memoria);
            break;    
            case 7:
            CentralControle.operacao("AcessoInstRefMemStore");
            manipulacao(CentralControle, registradores, memoria);
            break;    
            case 8:
            CentralControle.operacao("escritaReg");
            manipulacao(CentralControle, registradores, memoria);
            break;    
        }
        
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
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
