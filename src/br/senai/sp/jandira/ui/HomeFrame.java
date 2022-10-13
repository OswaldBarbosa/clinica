package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/calendario.png")));
        initPanels();
    }
    
    //Atributos da classe
    PanelEspecialidades panelEspecialidades;
    
    //Constantes
    private final int POS_X = 10;
    private final int POS_Y = 200;
    private final int LARGURA = 780;
    private final int ALTURA = 300;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCalendario = new javax.swing.JLabel();
        buttonEspecialidade = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedico = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        buttonPlanoDeSaude1 = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelTropa1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        jPanel1.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabelTitulo);
        jLabelTitulo.setBounds(110, 30, 470, 40);

        jLabelCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/calendario.png"))); // NOI18N
        jPanel1.add(jLabelCalendario);
        jLabelCalendario.setBounds(20, 20, 70, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 780, 100);

        buttonEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/especialidade.png"))); // NOI18N
        buttonEspecialidade.setToolTipText("Cadastrar Especialidade");
        buttonEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidade);
        buttonEspecialidade.setBounds(320, 120, 60, 50);

        buttonAgenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/agenda.png"))); // NOI18N
        buttonAgenda.setToolTipText("Novo Agendamento");
        buttonAgenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(110, 120, 60, 50);

        buttonPacientes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/paciente.png"))); // NOI18N
        buttonPacientes.setToolTipText("Cadastrar Paciente");
        buttonPacientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(250, 120, 60, 50);

        buttonMedico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/medico.png"))); // NOI18N
        buttonMedico.setToolTipText("Cadastrar Médico");
        buttonMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedico);
        buttonMedico.setBounds(180, 120, 60, 50);

        buttonHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/inicio.png"))); // NOI18N
        buttonHome.setToolTipText("Cadastrar Plano de Saúde");
        buttonHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 120, 60, 50);

        buttonSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/sair.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do Aplicativo");
        buttonSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(730, 120, 60, 50);

        buttonPlanoDeSaude1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonPlanoDeSaude1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plano-de-saude.png"))); // NOI18N
        buttonPlanoDeSaude1.setToolTipText("Cadastrar Plano de Saúde");
        buttonPlanoDeSaude1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonPlanoDeSaude1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaude1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude1);
        buttonPlanoDeSaude1.setBounds(390, 120, 60, 50);

        panelHome.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Site: www.tropadomantem.com.br");
        panelHome.add(jLabel9);
        jLabel9.setBounds(560, 140, 207, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText(" Sistema para Agendamento de Consultas");
        panelHome.add(jLabel1);
        jLabel1.setBounds(0, 40, 230, 20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Dados para Contato:");
        panelHome.add(jLabel10);
        jLabel10.setBounds(590, 70, 180, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Email: oswaldinhozika@gmail.com");
        panelHome.add(jLabel8);
        jLabel8.setBounds(560, 100, 210, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Telefone: (11) 4002-8922");
        panelHome.add(jLabel7);
        jLabel7.setBounds(610, 120, 156, 20);

        labelTropa1.setBackground(new java.awt.Color(255, 255, 255));
        labelTropa1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTropa1.setText("TROPADOMANTEM");
        panelHome.add(labelTropa1);
        labelTropa1.setBounds(0, 0, 340, 48);

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 2));
        jPanel3.setLayout(null);
        panelHome.add(jPanel3);
        jPanel3.setBounds(0, 60, 770, 3);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 200, 780, 300);

        setSize(new java.awt.Dimension(816, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadeActionPerformed
        
        panelEspecialidades.setVisible(true);
        panelHome.setVisible(false);
        
    }//GEN-LAST:event_buttonEspecialidadeActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelEspecialidades.setVisible(false);
        panelHome.setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonMedicoActionPerformed

    private void buttonPlanoDeSaude1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaude1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPlanoDeSaude1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidade;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedico;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoDeSaude1;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCalendario;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelTropa1;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        
            panelEspecialidades = new PanelEspecialidades();
            panelEspecialidades.setBounds(POS_X, 
                POS_Y,
                LARGURA,
                ALTURA);
        
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
    } 
}
