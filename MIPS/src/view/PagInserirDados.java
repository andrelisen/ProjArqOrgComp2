
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import myclasses.cacheDados;
import myclasses.cacheInstrucao;
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
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInstrucoes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtInstrucao = new javax.swing.JTextField();
        btnAdicionarInstrucao = new javax.swing.JButton();
        btnExcluirInstrucao = new javax.swing.JButton();
        btnAlterarInstrucao = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDado = new javax.swing.JTextField();
        btnAdicionarDados = new javax.swing.JButton();
        btnAlterarDados = new javax.swing.JButton();
        btnExcluirDados = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtValordoPc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClock = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTamCache = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAssociatividade = new javax.swing.JTextField();
        btnCache = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnExecucaoCompleta = new javax.swing.JButton();
        btnImprimirMem = new javax.swing.JButton();
        btnExecucaoPasso = new javax.swing.JButton();
        btnImprimeCaches = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        radioPC = new javax.swing.JRadioButton();
        radioCACHEINSTRUCOES = new javax.swing.JRadioButton();
        radioMP = new javax.swing.JRadioButton();
        radioBREGISTRADORES = new javax.swing.JRadioButton();
        radioULA = new javax.swing.JRadioButton();
        radioCONTROLE = new javax.swing.JRadioButton();
        radioCACHEDADOS = new javax.swing.JRadioButton();

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

        btnAdicionarInstrucao.setText("Adicionar");
        btnAdicionarInstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarInstrucaoActionPerformed(evt);
            }
        });

        btnExcluirInstrucao.setText("Excluir");
        btnExcluirInstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirInstrucaoActionPerformed(evt);
            }
        });

        btnAlterarInstrucao.setText("Alterar");
        btnAlterarInstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarInstrucaoActionPerformed(evt);
            }
        });

        jLabel11.setText("*NÃO INSERIR PARÊNTESES OU CIFRÃO");

        jLabel13.setText("*APENAS ESPAÇOS");

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

        jLabel2.setText("Endereço");

        jLabel3.setText("Dado");

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

        jLabel9.setText("*Endereços a partir de 512");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9)
                                .addComponent(txtDado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAlterarDados)
                            .addComponent(btnExcluirDados)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionarDados)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarDados)
                .addGap(150, 150, 150))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarDados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel6.setText("Valor do PC");

        jLabel10.setText("CLOCK ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClock, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValordoPc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtValordoPc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtClock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Qual será o tamanho da cache?");

        jLabel12.setText("Sua associatividade?");

        btnCache.setText("Criar caches");
        btnCache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCacheActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(txtTamCache, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(txtAssociatividade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnCache)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTamCache, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAssociatividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCache)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnExecucaoCompleta.setText("EXECUÇÃO COMPLETA");
        btnExecucaoCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecucaoCompletaActionPerformed(evt);
            }
        });

        btnImprimirMem.setText("IMPRIMIR MEMÓRIA");
        btnImprimirMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirMemActionPerformed(evt);
            }
        });

        btnExecucaoPasso.setText("EXECUÇÃO PASSO A PASSO");
        btnExecucaoPasso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecucaoPassoActionPerformed(evt);
            }
        });

        btnImprimeCaches.setText("IMPRIMIR CACHES");
        btnImprimeCaches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimeCachesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExecucaoPasso)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnImprimirMem)
                            .addComponent(btnImprimeCaches)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExecucaoCompleta)))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExecucaoCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExecucaoPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimirMem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnImprimeCaches)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        radioPC.setText("PC");

        radioCACHEINSTRUCOES.setText("CACHE DE INSTRUÇÕES");

        radioMP.setText("MEMÓRIA PRINCIPAL");

        radioBREGISTRADORES.setText("BANCO DE REGISTRADORES");

        radioULA.setText("ULA");

        radioCONTROLE.setText("UNIDADE DE CONTROLE");

        radioCACHEDADOS.setText("CACHE DE DADOS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioPC)
                    .addComponent(radioCACHEINSTRUCOES)
                    .addComponent(radioMP)
                    .addComponent(radioBREGISTRADORES))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioCONTROLE)
                    .addComponent(radioCACHEDADOS)
                    .addComponent(radioULA))
                .addGap(157, 157, 157))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPC)
                    .addComponent(radioULA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioCACHEINSTRUCOES)
                    .addComponent(radioCONTROLE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMP)
                    .addComponent(radioCACHEDADOS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBREGISTRADORES)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3)
                                .addComponent(txtInstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdicionarInstrucao))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExcluirInstrucao)
                                    .addComponent(btnAlterarInstrucao))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(btnExcluirInstrucao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterarInstrucao)
                                .addGap(85, 85, 85)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtInstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionarInstrucao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
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
    clock clockTotal = new clock();
   // public int falhas = 0;
    cacheInstrucao cacheInstruction;
    cacheDados cacheDate;
    int coloqueiValores = 0;
    List<Integer> falhas = new ArrayList<Integer>();
    int ultimaInstInserida = 0;
   // int ultimoDadoInserida = 0;
    
    
    
    private void btnAdicionarInstrucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarInstrucaoActionPerformed
        
      //Para a instrução
        DefaultTableModel dtmInstrucao = (DefaultTableModel) jTableInstrucoes.getModel(); 
        Object[] dados;
       
        int somalinhas = jTableInstrucoes.getModel().getRowCount(); //retorna número de linhas inseridas na tabela
        
        if(somalinhas == 128)
        {
            JOptionPane.showMessageDialog(null, "MEMÓRIA CHEIA!");
        }else{
            Object[] aux = {endereco, txtInstrucao.getText()}; 
            dados = aux;
            dtmInstrucao.addRow(dados);
            
           String instrucaoFormatada = lerInstrucao(txtInstrucao.getText());
        //   memoria.setMemoriaInstrucao(instrucaoFormatada);
            //System.out.println("o valor de soma linhas e="+somalinhas);
            palavra novaPalavra = new palavra(endereco, instrucaoFormatada);
            memoria.inserir(endereco, instrucaoFormatada);
            endereco = endereco + 4;
            ultimaInstInserida = endereco;
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
          
           //           System.out.println("Vamos ver a memoria");
           // memoria.imprimir();
          //  System.out.println("---");
       
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
        memoria.imprimir();
        System.out.println("---------------------------------------------");
        
    }//GEN-LAST:event_btnImprimirMemActionPerformed

    private void btnExecucaoPassoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecucaoPassoActionPerformed
        
      if(coloqueiValores == 1){
            
                //qual estado da máquina de estados eu to com esse clock?
                int estado = controle.indicaSinais(clockExt.getCounter());//estado 0 tenho q ler determinados sinais
                txtClock.setText(Integer.toString(clockTotal.getCounter()));
                txtValordoPc.setText(bancoRegistrador.getPC());

                int instrucao =0;
                String conteudo;
                String operacao;
                String reg1;
                String reg2;
                String estSignal;
                int resultado=0;
                String constante;
                String destino;
                palavra p;
                int ocorreuFalha = 0;
                
                        
                //System.out.println("Ultima instrucao = "+ultimaInstInserida);
    
                if(ultimaInstInserida+4 <= Integer.parseInt(bancoRegistrador.getPC())){
                    estado = -1;
                }
                
                switch(estado){

                    case 0: //INCREMENTO O PC AQUI
                   
                        //Esse é os locais que estou acessando nesse estado, liga eles
                        radioPC.setSelected(true);
                        radioCACHEINSTRUCOES.setSelected(true);
                        radioBREGISTRADORES.setSelected(true);
                        
                        
                        
                        p = cacheInstruction.encontrarElemento(Integer.parseInt(bancoRegistrador.getPC()));
                        
                        
                        if(p.endereco==0 && p.getConteudo()=="0"){
                        //   System.out.println("Cache miss no ciclo="+clockTotal.getCounter());
                           falhas.add(clockTotal.getCounter());
                           clockTotal.setCounter(clockTotal.getCounter()+50);
                           cacheInstruction.inserir(Integer.parseInt(bancoRegistrador.getPC()), memoria);
                           radioMP.setSelected(true);
                           p = cacheInstruction.encontrarElemento(Integer.parseInt(bancoRegistrador.getPC()));
                        }
                        
                        
                        String dadoLido = p.getConteudo();
                
                        bancoRegistrador.setIR(dadoLido); //liga memoria, reg inst
                        
                    //    System.out.println("Lido="+bancoRegistrador.getIR());
                        
                        ula.setValorA(Integer.parseInt(bancoRegistrador.getPC()));
                        System.out.println("-ESTADO0- ULA VALOR A="+ula.getValorA());
                        ula.setValorB(4);
                        System.out.println("-ESTADO0- ULA VALOR B="+ula.getValorB());
                        ula.setOperacao("add"); 
                        ula.executarOperacao();//liga ula
                        bancoRegistrador.setPC(Integer.toString(ula.getSaida())); //liga pc
                        clockExt.contar();
                        System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                        clockTotal.contar();
                        break;

                    case 1:
                         conteudo = bancoRegistrador.getIR();//retorna o conteudo do reg. instruções
                         operacao = conteudo.substring(0, 6);
                         instrucao = Integer.parseInt(operacao, 2);
                         controle.setInstrucao(instrucao);//guardo instrução no controle
                         System.out.println("A instrucao lida é="+controle.getInstrucao());
                             if(instrucao == 43){//é um sw
                            //     System.out.println("É UM SW");
                                     reg1 = conteudo.substring(11, 16); //rt
                                     reg2 = conteudo.substring(16, 32); //constante
                                     int r1 = Integer.parseInt(reg1, 2);
                                    // System.out.println("O reg1 é="+r1);
                                     int r2 = Integer.parseInt(reg2, 2);
                                  //   int r2 = Integer.parseInt(reg2, 2);
                                    // System.out.println("O reg2 é="+r2);
                                 //    System.out.println("Valor do reg1="+r1+"; reg2="+r2);

                                     bancoRegistrador.setRegA(bancoRegistrador.getBancoRegistradores(r1));
                                  //   System.out.println("Dentro da decodificacao, BANCO REG A="+bancoRegistrador.getRegA());
                                   //  bancoRegistrador.setRegB(bancoRegistrador.getBancoRegistradores(r2));
                                 //    System.out.println("Dentro da decodificacao, BANCO REG ="+bancoRegistrador.getRegB());

                                     ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                                     ula.setValorB(r2);
                                     ula.setOperacao("add");
                                     ula.executarOperacao();
                                     bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                                 //    System.out.println("Saida da ula="+bancoRegistrador.getRegSaidaUla());
                                     String rB = conteudo.substring(0, 11);
                                     int b = Integer.parseInt(rB, 2);
                                 //    System.out.println("O destino="+b);
                                    //  bancoRegistrador.setRegB(rB);
                                   //  System.out.println("Valor a ser inserido caso de certo="+bancoRegistrador.getBancoRegistradores(Integer.parseInt(bancoRegistrador.getRegB())));
                             }else{
                                 reg1 = conteudo.substring(6, 11);
                                 reg2 = conteudo.substring(11, 16);
                                 int r1 = Integer.parseInt(reg1, 2);
                              //   System.out.println("O reg1 é="+r1);
                                 int r2 = Integer.parseInt(reg2, 2);
                            //     System.out.println("O reg2 é="+r2);
                             //    System.out.println("Valor do reg1="+r1+"; reg2="+r2);

                                 bancoRegistrador.setRegA(bancoRegistrador.getBancoRegistradores(r1));
                                 System.out.println("ESTADO 1, BANCO REG A="+bancoRegistrador.getRegA());
                                 bancoRegistrador.setRegB(bancoRegistrador.getBancoRegistradores(r2));
                                 System.out.println("ESTADO 1, BANCO REG B="+bancoRegistrador.getRegA());
                            //     System.out.println("Dentro da decodificacao, BANCO REG ="+bancoRegistrador.getRegB());

                                 estSignal = conteudo.substring(16,32);

                                 estSignal = extensaoSinalComDesloc(estSignal);
                                 ula.setValorA(Integer.parseInt(bancoRegistrador.getPC()));
                                 ula.setValorB(Integer.parseInt(estSignal, 2));
                                 ula.setOperacao("add");
                                 ula.executarOperacao();
                                 bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                             }
                         

                             if(instrucao == 0){//tipo r
                                 clockExt.setCounter(6);
                             }
                             if(instrucao == 4){//beq
                                 clockExt.setCounter(8);
                             }
                             if(instrucao == 2 || instrucao == 3){//jump
                                 clockExt.setCounter(9);
                             }
                             if(instrucao == 5){//bne
                                 clockExt.setCounter(10);
                             }
                             if(instrucao == 35 || instrucao == 43){ //lw ou sw
                                 clockExt.contar();
                             }
      

                       // System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                        break;
                    case 2:

                        ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                     //   System.out.println("RegA="+ula.getValorA());
                        conteudo = bancoRegistrador.getIR();
                        estSignal = conteudo.substring(16,32);
                      //  System.out.println("valor de estSignal="+estSignal);
                        ula.setValorB(Integer.parseInt(estSignal, 2));
                   //     System.out.println("RegB="+ula.getValorB());
                        ula.setOperacao("add");
                        ula.executarOperacao();
                     //   System.out.println("Valor a="+ula.getValorA());
                      //  System.out.println("Valor b="+ula.getValorB());
                      //  System.out.println("Valor saída="+ula.getSaida());
                        bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));

                      //  System.out.println("Registrador saida da ula é:"+bancoRegistrador.getRegSaidaUla());
                        //controle da operação para cuidar a máquina de estados
                            if(controle.getInstrucao()==35){ //lw
                                clockExt.setCounter(3);//meu próximo estado
                            }

                            if(controle.getInstrucao()==43){//sw
                       //         System.out.println("Vamos fazer um sw");
                                clockExt.setCounter(5);//meu próximo estado
                            }
                      //  System.out.println("A instrucao é="+controle.getInstrucao());
                   //     System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                        break;

                    case 3://estou fazendo um lw
                    
                        palavra auxiliar = cacheDate.encontrarElemento(Integer.parseInt(bancoRegistrador.getRegSaidaUla()));
                   
                        if(auxiliar.getConteudo()=="0" && auxiliar.getEndereco()==0){
                            falhas.add(clockTotal.getCounter());
                            clockTotal.setCounter(clockTotal.getCounter()+50);
                   //         System.out.println("Para carregar da memoria, o endereço é="+Integer.parseInt(bancoRegistrador.getRegSaidaUla()));
                            cacheDate.inserir(Integer.parseInt(bancoRegistrador.getRegSaidaUla()), memoria);
                            auxiliar = cacheDate.encontrarElemento(Integer.parseInt(bancoRegistrador.getRegSaidaUla())); 
                        }
                         //   System.out.println("CONTEUDO DA CACHE DE DADOS="+auxiliar.getConteudo()+"e endereço="+auxiliar.getEndereco());
                                conteudo = auxiliar.getConteudo();
                                bancoRegistrador.setMDR(conteudo);
                             //   System.out.println("Minha memória de dados é="+bancoRegistrador.getMDR());
                      
                        
                         clockExt.contar();
                 //       System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                        break;
                    
                    
                    case 4:
                        
                        conteudo = bancoRegistrador.getIR();
                        String registradorDestino = conteudo.substring(6, 11);
                        bancoRegistrador.setBancoRegistradores(Integer.parseInt(registradorDestino, 2), bancoRegistrador.getMDR());
                        clockExt.setCounter(0);
                  //      System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                        break;
                        
                        
                    case 5://estou fazendo um sw
                        conteudo = bancoRegistrador.getIR();
                        destino = conteudo.substring(6, 11);
                        
                    //    System.out.println("Vou guardar no endereço "+Integer.parseInt(bancoRegistrador.getRegSaidaUla())+", o seguinte conteudo="+bancoRegistrador.getBancoRegistradores(Integer.parseInt(destino, 2)));
                        
                        ocorreuFalha = cacheDate.escrever(Integer.parseInt(bancoRegistrador.getRegSaidaUla()), bancoRegistrador.getBancoRegistradores(Integer.parseInt(destino, 2)), memoria);
                        //memoria.inserir();
                            if(ocorreuFalha == 0){
                                System.out.println("Não");
                            }else{ //bloco não tava mais teve q carregr ele para a memória
                                falhas.add(clockTotal.getCounter());
                                clockTotal.setCounter(clockTotal.getCounter()+50);
                                System.out.println("Sim");
                            }
                        
                        clockExt.setCounter(0);
                        zerarReg();
                    //    System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                        clockTotal.contar();
                        break;
                        
                        
                    case 6:
                        ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                        System.out.println("ULA VALOR A="+ula.getValorA());
                        ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                        System.out.println("ULA VALOR B="+ula.getValorB());
                        String funct = bancoRegistrador.getIR();
                        funct = funct.substring(26, 32);
                    //    System.out.println("Funct é="+funct);
                        funct = retornaFunct(Integer.parseInt(funct, 2));

                        if(funct == "jr"){
                            System.out.println("UAU JR FUNCIONANDO");
                           clockExt.setCounter(13);
                        }else{

                           //     System.out.println("Valor de funct="+funct);
                                ula.setOperacao(funct);
                                ula.executarOperacao();
                                bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                                System.out.println("Resultado da operação de "+funct+"="+bancoRegistrador.getRegSaidaUla());    
                                clockExt.contar();
                        }
                   //     System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                        break;
                        
                    case 7:
                        
                        conteudo = bancoRegistrador.getIR();
                        destino = conteudo.substring(16, 21);
                        
                  //      System.out.println("O reg de destino é"+Integer.parseInt(destino, 2));
                        bancoRegistrador.setBancoRegistradores(Integer.parseInt(destino, 2), bancoRegistrador.getRegSaidaUla());//salvei no reg destino
                        clockExt.setCounter(0);
                 //       System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                        break;

                    case 8:

                        constante = bancoRegistrador.getRegSaidaUla();

                        ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                        ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                        ula.setOperacao("beq");
                        ula.executarOperacao();
                         resultado = ula.getSaida();

                            if(resultado == 1){
                                bancoRegistrador.setPC(constante);
                            }else{
                                ula.setValorA(Integer.parseInt(bancoRegistrador.getPC()));
                                ula.setValorB(4);
                                ula.setOperacao("add");
                                ula.executarOperacao();
                                bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                                bancoRegistrador.setPC(bancoRegistrador.getRegSaidaUla());
                            }
                        clockExt.setCounter(0);
                //        System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                        break;

                    case 9://jump, jal


                        conteudo = bancoRegistrador.getIR();
                        conteudo = conteudo.substring(6, 32);
               //         System.out.println("Este é o meu endereço de desvio do jump="+Integer.parseInt(conteudo, 2));

                        ula.setValorA(Integer.parseInt(conteudo, 2));
                        ula.setValorB(Integer.parseInt(bancoRegistrador.getPC()));
                        ula.setOperacao("sub");
                        ula.executarOperacao();

                        bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                        bancoRegistrador.setPC(bancoRegistrador.getRegSaidaUla());
                        clockExt.setCounter(0);

                  //      System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                        break;

                    case 10: //bne
                        constante = bancoRegistrador.getRegSaidaUla();

                        ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                        ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                        ula.setOperacao("beq");
                        ula.executarOperacao();
                        resultado = ula.getSaida();

                            if(resultado == 1){
                                bancoRegistrador.setPC(constante);
                            }else{
                                ula.setValorA(Integer.parseInt(bancoRegistrador.getPC()));
                                ula.setValorB(4);
                                ula.setOperacao("add");
                                ula.executarOperacao();
                                bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                                bancoRegistrador.setPC(bancoRegistrador.getRegSaidaUla());
                            }
                        clockExt.setCounter(0);

               //         System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                        break;

                    case 11: //andi

                          conteudo = bancoRegistrador.getIR();

                          constante = conteudo.substring(16,32);
                          ula.setValorA(Integer.parseInt(constante));
                          ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                          ula.setOperacao("andi");
                          ula.executarOperacao();

                          bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));

                          reg1 = bancoRegistrador.getIR();
                          destino = reg1.substring(6,11);

                          bancoRegistrador.setBancoRegistradores(Integer.parseInt(destino, 2), bancoRegistrador.getRegSaidaUla());
                          clockExt.setCounter(0);

             //           System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                    break;

                     case 12: //ori

                          conteudo = bancoRegistrador.getIR();

                          constante = conteudo.substring(16,32);


                          ula.setValorA(Integer.parseInt(constante));
                          ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                          ula.setOperacao("ori");
                          ula.executarOperacao();

                          bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));

                          reg1 = bancoRegistrador.getIR();
                          destino = reg1.substring(6,11);

                          bancoRegistrador.setBancoRegistradores(Integer.parseInt(destino, 2), bancoRegistrador.getRegSaidaUla());
                          clockExt.setCounter(0);

//                        System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                clockTotal.contar();
                    break;

                     case 13:
                        bancoRegistrador.setPC(bancoRegistrador.getBancoRegistradores(31));
                        clockExt.setCounter(0);
               //         System.out.println("PC="+Integer.parseInt(bancoRegistrador.getPC()));
                         break;

                }
             
      }
       // System.out.println("Valor do contador="+clockExt.getCounter());
    }//GEN-LAST:event_btnExecucaoPassoActionPerformed

    private void btnExecucaoCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecucaoCompletaActionPerformed

        int condicao = 1;
        int cont = 0;
        
        while(condicao == 1){
                //qual estado da máquina de estados eu to com esse clock?
                int estado = controle.indicaSinais(clockExt.getCounter());//estado 0 tenho q ler determinados sinais
                txtClock.setText(Integer.toString(clockTotal.getCounter()));
                txtValordoPc.setText(bancoRegistrador.getPC());
                
                
                int instrucao =0;
                String conteudo;
                String operacao;
                String reg1;
                String reg2;
                String estSignal;
                int resultado=0;
                String constante;
                String destino;
                palavra p;
                
              
                switch(estado){

                    case 0:
                        
                        
                        p = memoria.procurar(Integer.parseInt(bancoRegistrador.getPC()));
                
                
                        if(p.endereco==0 && p.getConteudo()=="0"){
                            System.out.println("Execução completa");
                            estado = -1;
                            condicao = 0;
                        }else{

                       // String dadoLido = memoria.getMemoria(Integer.parseInt(bancoRegistrador.getPC()));
                    //    p = memoria.procurar(Integer.parseInt(bancoRegistrador.getPC()));
                        String dadoLido = p.getConteudo();
                     //   String dadoLido="00001010010100111000100000100000";
                 //       System.out.println("Li a memoria="+dadoLido);
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
                        }
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

                             if(instrucao == 0){//tipo r
                                 clockExt.setCounter(6);
                             }
                             if(instrucao == 4){//beq
                                 clockExt.setCounter(8);
                             }
                             if(instrucao == 2 || instrucao == 3){//jump
                                 clockExt.setCounter(9);
                             }
                             if(instrucao == 5){//bne
                                 clockExt.setCounter(10);
                             }
                             if(instrucao == 35 || instrucao == 43){ //lw ou sw
                                 clockExt.contar();
                             }
        //                int result = conversorDecimalBinario(ula.getSaida());
        //                
        //                System.out.println("Meu registrador A="+bancoRegistrador.getRegA());
        //                System.out.println("Meu registrador B="+bancoRegistrador.getRegB());
        //                System.out.println("A saída da ULA fica como="+result);

                        break;
                    case 2:
                        System.out.println("Valor do registrador a="+Integer.parseInt(bancoRegistrador.getRegA()));
                        ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                        conteudo = bancoRegistrador.getIR();
                        constante = conteudo.substring(16,32);
                      //  System.out.println("valor de estSignal="+estSignal);
                        ula.setValorB(Integer.parseInt(constante, 2));
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
                        System.out.println("Vamos ver :ENDERECO="+bancoRegistrador.getRegSaidaUla()+"CONTEUDO"+Integer.parseInt(bancoRegistrador.getRegB()));
                        memoria.inserir(Integer.parseInt(bancoRegistrador.getRegSaidaUla()), bancoRegistrador.getRegB());
                        clockExt.setCounter(0);
                        break;
                    case 6:
                        ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                     //   System.out.println("Valor de regA="+Integer.parseInt(bancoRegistrador.getRegA()));
                        ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                      //  System.out.println("Valor de regB="+Integer.parseInt(bancoRegistrador.getRegB()));
                        String funct = bancoRegistrador.getIR();
                        funct = funct.substring(26, 32);
                     //   System.out.println("Funct é="+funct);
                        funct = retornaFunct(Integer.parseInt(funct, 2));

                        if(funct == "jr"){
                           clockExt.setCounter(13);
                        }else{

                              //  System.out.println("Valor de funct="+funct);
                                ula.setOperacao(funct);
                                ula.executarOperacao();
                              //  System.out.println("Resultadooooo="+ula.getSaida());
                                bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                            //    System.out.println("Resultado da operação de "+funct+"="+bancoRegistrador.getRegSaidaUla());
                                clockExt.contar();
                        }
                        break;
                    case 7:
                        conteudo = bancoRegistrador.getIR();
                        conteudo = conteudo.substring(16, 21);
                        bancoRegistrador.setBancoRegistradores(Integer.parseInt(conteudo, 2), bancoRegistrador.getRegSaidaUla());
                        clockExt.setCounter(0);
                        System.out.println("O pc está valendo isso aqui="+Integer.parseInt(bancoRegistrador.getPC()));
                        break;

                    case 8:

                        constante = bancoRegistrador.getRegSaidaUla();

                        ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                        ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                        ula.setOperacao("beq");
                        ula.executarOperacao();
                         resultado = ula.getSaida();

                            if(resultado == 1){
                                bancoRegistrador.setPC(constante);
                            }else{
                                ula.setValorA(Integer.parseInt(bancoRegistrador.getPC()));
                                ula.setValorB(4);
                                ula.setOperacao("add");
                                ula.executarOperacao();
                                bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                                bancoRegistrador.setPC(bancoRegistrador.getRegSaidaUla());
                            }
                        clockExt.setCounter(0);
                        break;

                    case 9://jump, jal


                        conteudo = bancoRegistrador.getIR();
                        conteudo = conteudo.substring(6, 32);
                        System.out.println("Este é o meu endereço de desvio do jump="+Integer.parseInt(conteudo, 2));

                        ula.setValorA(Integer.parseInt(conteudo, 2));
                        ula.setValorB(Integer.parseInt(bancoRegistrador.getPC()));
                        ula.setOperacao("sub");
                        ula.executarOperacao();

                        bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                        bancoRegistrador.setPC(bancoRegistrador.getRegSaidaUla());
                        clockExt.setCounter(0);

                        break;

                    case 10: //bne
                        constante = bancoRegistrador.getRegSaidaUla();

                        ula.setValorA(Integer.parseInt(bancoRegistrador.getRegA()));
                        ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                        ula.setOperacao("beq");
                        ula.executarOperacao();
                        resultado = ula.getSaida();

                            if(resultado == 1){
                                bancoRegistrador.setPC(constante);
                            }else{
                                ula.setValorA(Integer.parseInt(bancoRegistrador.getPC()));
                                ula.setValorB(4);
                                ula.setOperacao("add");
                                ula.executarOperacao();
                                bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));
                                bancoRegistrador.setPC(bancoRegistrador.getRegSaidaUla());
                            }
                        clockExt.setCounter(0);

                        break;

                    case 11: //andi

                          conteudo = bancoRegistrador.getIR();

                          constante = conteudo.substring(16,32);
                          ula.setValorA(Integer.parseInt(constante));
                          ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                          ula.setOperacao("andi");
                          ula.executarOperacao();

                          bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));

                          reg1 = bancoRegistrador.getIR();
                          destino = reg1.substring(6,11);

                          bancoRegistrador.setBancoRegistradores(Integer.parseInt(destino, 2), bancoRegistrador.getRegSaidaUla());
                          clockExt.setCounter(0);

                    break;

                     case 12: //ori

                          conteudo = bancoRegistrador.getIR();

                          constante = conteudo.substring(16,32);


                          ula.setValorA(Integer.parseInt(constante));
                          ula.setValorB(Integer.parseInt(bancoRegistrador.getRegB()));
                          ula.setOperacao("ori");
                          ula.executarOperacao();

                          bancoRegistrador.setRegSaidaUla(Integer.toString(ula.getSaida()));

                          reg1 = bancoRegistrador.getIR();
                          destino = reg1.substring(6,11);

                          bancoRegistrador.setBancoRegistradores(Integer.parseInt(destino, 2), bancoRegistrador.getRegSaidaUla());
                          clockExt.setCounter(0);

                    break;

                     case 13:
                        bancoRegistrador.setPC(bancoRegistrador.getBancoRegistradores(31));
                        clockExt.setCounter(0);
                         break;

                }
                clockTotal.contar();
        }
    }//GEN-LAST:event_btnExecucaoCompletaActionPerformed

    private void btnCacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCacheActionPerformed
        
        cacheInstruction = new cacheInstrucao(Integer.parseInt(txtTamCache.getText()),Integer.parseInt(txtAssociatividade.getText()) );
        cacheDate = new cacheDados(Integer.parseInt(txtTamCache.getText()),Integer.parseInt(txtAssociatividade.getText()) );
        coloqueiValores = 1;
    }//GEN-LAST:event_btnCacheActionPerformed

    private void btnImprimeCachesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimeCachesActionPerformed
                System.out.println("------------------------------------------------------------------");
                System.out.println("INSTRUÇÕES");
                cacheInstruction.imprimir();
                System.out.println("DADOS");
                cacheDate.imprimir();
                System.out.println("------------------------------------------------------------------");


    }//GEN-LAST:event_btnImprimeCachesActionPerformed
    
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
             case "zero":
                 registrador = 0;
                 break;
                 
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
 
   public void zerarReg(){
       /*  public String PC = "0";
        public String IR= "0";
        public String MDR= "0";
        public String regA= "0";
        public String regB= "0";
        public String regSaidaUla= "0";
        public String []bancoRegistradores = new String[32];*/
       
            for(int i = 0; i<32;i++){
              bancoRegistrador.setBancoRegistradores(i, "0");
            }

            bancoRegistrador.setIR("0");
            bancoRegistrador.setMDR("0");
            bancoRegistrador.setRegA("0");
            bancoRegistrador.setRegB("0");
            bancoRegistrador.setRegSaidaUla("0");
            
   }
    
    
    
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
    private javax.swing.JButton btnImprimeCaches;
    private javax.swing.JButton btnImprimirMem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableDados;
    private javax.swing.JTable jTableInstrucoes;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton radioBREGISTRADORES;
    private javax.swing.JRadioButton radioCACHEDADOS;
    private javax.swing.JRadioButton radioCACHEINSTRUCOES;
    private javax.swing.JRadioButton radioCONTROLE;
    private javax.swing.JRadioButton radioMP;
    private javax.swing.JRadioButton radioPC;
    private javax.swing.JRadioButton radioULA;
    private javax.swing.JTextField txtAssociatividade;
    private javax.swing.JTextField txtClock;
    private javax.swing.JTextField txtDado;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtInstrucao;
    private javax.swing.JTextField txtTamCache;
    private javax.swing.JTextField txtValordoPc;
    // End of variables declaration//GEN-END:variables
}
