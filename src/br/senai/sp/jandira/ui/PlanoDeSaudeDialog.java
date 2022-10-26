package br.senai.sp.jandira.ui;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {


    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelEspecialidade = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        textFieldNomeDaEspecilialidade = new javax.swing.JTextField();
        textFieldDescricao = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelNomeDaEspecialidade1 = new javax.swing.JLabel();
        textFieldNomeDaEspecilialidade1 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        labelDescricao1 = new javax.swing.JLabel();
        labelDescricao2 = new javax.swing.JLabel();
        labelDescricao3 = new javax.swing.JLabel();
        labelDescricao4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel1.setLayout(null);

        labelEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelEspecialidade.setText("Plano de Saúde - ADICIONAR");
        jPanel1.add(labelEspecialidade);
        labelEspecialidade.setBounds(120, 30, 350, 30);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        jPanel1.add(labelIcon);
        labelIcon.setBounds(20, 10, 70, 64);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 640, 80);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel2.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelCodigo.setText("Número:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(10, 10, 70, 22);

        textFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCodigo);
        textFieldCodigo.setBounds(10, 40, 130, 20);

        labelNomeDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelNomeDaEspecialidade.setText("Código:");
        jPanel2.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(300, 10, 70, 22);

        textFieldNomeDaEspecilialidade.setEditable(false);
        textFieldNomeDaEspecilialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        textFieldNomeDaEspecilialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDaEspecilialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeDaEspecilialidade);
        textFieldNomeDaEspecilialidade.setBounds(300, 40, 120, 20);

        textFieldDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel2.add(textFieldDescricao);
        textFieldDescricao.setBounds(10, 160, 230, 20);

        labelDescricao.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDescricao.setText("Ano");
        jPanel2.add(labelDescricao);
        labelDescricao.setBounds(470, 130, 30, 22);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar ");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(480, 210, 60, 50);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salvar.png"))); // NOI18N
        buttonSalvar.setToolTipText("Gravar especialidade");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(550, 210, 60, 50);

        labelNomeDaEspecialidade1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelNomeDaEspecialidade1.setText("Operadora:");
        jPanel2.add(labelNomeDaEspecialidade1);
        labelNomeDaEspecialidade1.setBounds(10, 70, 80, 22);

        textFieldNomeDaEspecilialidade1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        textFieldNomeDaEspecilialidade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDaEspecilialidade1ActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldNomeDaEspecilialidade1);
        textFieldNomeDaEspecilialidade1.setBounds(10, 100, 230, 20);

        jSpinner1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel2.add(jSpinner1);
        jSpinner1.setBounds(470, 160, 64, 22);

        jSpinner2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel2.add(jSpinner2);
        jSpinner2.setBounds(280, 160, 64, 22);

        jSpinner3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel2.add(jSpinner3);
        jSpinner3.setBounds(370, 160, 64, 22);

        labelDescricao1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDescricao1.setText("Categoria:");
        jPanel2.add(labelDescricao1);
        labelDescricao1.setBounds(10, 130, 70, 22);

        labelDescricao2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDescricao2.setText("Validade:");
        jPanel2.add(labelDescricao2);
        labelDescricao2.setBounds(280, 100, 70, 22);

        labelDescricao3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDescricao3.setText("Dia");
        jPanel2.add(labelDescricao3);
        labelDescricao3.setBounds(280, 130, 30, 22);

        labelDescricao4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDescricao4.setText("Mês");
        jPanel2.add(labelDescricao4);
        labelDescricao4.setBounds(370, 130, 70, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 100, 640, 280);

        setBounds(0, 0, 676, 428);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeDaEspecilialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDaEspecilialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDaEspecilialidadeActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldNomeDaEspecilialidade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDaEspecilialidade1ActionPerformed

    }//GEN-LAST:event_textFieldNomeDaEspecilialidade1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PlanoDeSaudeDialog dialog = new PlanoDeSaudeDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelDescricao1;
    private javax.swing.JLabel labelDescricao2;
    private javax.swing.JLabel labelDescricao3;
    private javax.swing.JLabel labelDescricao4;
    private javax.swing.JLabel labelEspecialidade;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelNomeDaEspecialidade1;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricao;
    private javax.swing.JTextField textFieldNomeDaEspecilialidade;
    private javax.swing.JTextField textFieldNomeDaEspecilialidade1;
    // End of variables declaration//GEN-END:variables
}
