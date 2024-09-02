package apresentacao;

import eda.Banco;
import eda.Conta;
import javax.swing.JOptionPane;

public class TelaMenu extends javax.swing.JFrame {
    Conta contaAtual;
    Banco bancoAtual;
    
    public TelaMenu(Banco banco,Conta conta, int id) {
        initComponents();
        this.contaAtual = conta;
        this.bancoAtual = banco;
        
        switch (id){
            case 0: 
                this.botaoConsultar.setEnabled(false);
                this.botaoExtrato.setEnabled(false);
                this.botaoSacar.setEnabled(false);
                this.botaoTransferencia.setEnabled(false);
                this.botaoPagamento.setEnabled(false);
                break;
            case 1: 
                this.botaoConsultar.setEnabled(false);
                this.botaoExcluir.setEnabled(false);
                this.botaoExtrato.setEnabled(false);
                this.botaoSacar.setEnabled(false);
                this.botaoTransferencia.setEnabled(false);
                this.botaoPagamento.setEnabled(false);
                break;
            case 2: 
                this.botaoExcluir.setEnabled(false);
                this.botaoAlterar.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoAlterar = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        botaoExtrato = new javax.swing.JButton();
        botaoPagamento = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoSacar = new javax.swing.JButton();
        botaoTransferencia = new javax.swing.JButton();
        botaoLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        botaoAlterar.setBackground(new java.awt.Color(255, 102, 102));
        botaoAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoAlterar.setText("Alterar Conta");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoConsultar.setBackground(new java.awt.Color(255, 102, 102));
        botaoConsultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoConsultar.setText("Consultar Saldo");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        botaoExtrato.setBackground(new java.awt.Color(255, 102, 102));
        botaoExtrato.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoExtrato.setText("Extrato");
        botaoExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExtratoActionPerformed(evt);
            }
        });

        botaoPagamento.setBackground(new java.awt.Color(255, 102, 102));
        botaoPagamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoPagamento.setText("Pagamento");
        botaoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPagamentoActionPerformed(evt);
            }
        });

        botaoExcluir.setBackground(new java.awt.Color(255, 102, 102));
        botaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoExcluir.setText("Excluir Conta");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoSacar.setBackground(new java.awt.Color(255, 102, 102));
        botaoSacar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoSacar.setText("Sacar");
        botaoSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSacarActionPerformed(evt);
            }
        });

        botaoTransferencia.setBackground(new java.awt.Color(255, 102, 102));
        botaoTransferencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoTransferencia.setText("Transferência");
        botaoTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTransferenciaActionPerformed(evt);
            }
        });

        botaoLogout.setBackground(new java.awt.Color(255, 102, 102));
        botaoLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoLogout.setText("Logout");
        botaoLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLogoutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Multibanco");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoExtrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPagamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoTransferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(botaoLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSacarActionPerformed
        dispose();
        TelaSaque saque = new TelaSaque(bancoAtual, contaAtual);
        saque.setVisible(true);
    }//GEN-LAST:event_botaoSacarActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        dispose();
        TelaConsultar consulta = new TelaConsultar(bancoAtual, contaAtual);
        consulta.setVisible(true);
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void botaoExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExtratoActionPerformed
        dispose();
        TelaExtrato pag = new TelaExtrato(contaAtual,bancoAtual);
        pag.setVisible(true);
    }//GEN-LAST:event_botaoExtratoActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        dispose();
        TelaAlterar pag = new TelaAlterar(contaAtual, bancoAtual);
        pag.setVisible(true);
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTransferenciaActionPerformed
        dispose();
        TelaTransferencia pag = new TelaTransferencia(this.bancoAtual, this.contaAtual);
        pag.setVisible(true);
    }//GEN-LAST:event_botaoTransferenciaActionPerformed

    private void botaoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPagamentoActionPerformed
        dispose();
        TelaPagamento pag = new TelaPagamento(this.bancoAtual, this.contaAtual);
        pag.setVisible(true);
    }//GEN-LAST:event_botaoPagamentoActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        dispose();
        TelaExcluir pag = new TelaExcluir(contaAtual, bancoAtual);
        pag.setVisible(true);
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLogoutActionPerformed
        JOptionPane.showMessageDialog(null, "Você foi desconectado!");
        dispose();
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
    }//GEN-LAST:event_botaoLogoutActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoExtrato;
    private javax.swing.JButton botaoLogout;
    private javax.swing.JButton botaoPagamento;
    private javax.swing.JButton botaoSacar;
    private javax.swing.JButton botaoTransferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
