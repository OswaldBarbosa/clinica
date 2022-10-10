package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;


public class PanelEspecialidades extends javax.swing.JPanel {


    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidade();
        prencherTabela();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEspecialidade = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableEspecialidade = new javax.swing.JTable();
        jLabelEspecialidade = new javax.swing.JLabel();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonConfirmar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(780, 300));
        setLayout(null);

        panelEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        panelEspecialidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelEspecialidade.setLayout(null);

        tableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(tableEspecialidade);

        panelEspecialidade.add(jScrollPane3);
        jScrollPane3.setBounds(10, 40, 760, 190);

        jLabelEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEspecialidade.setText("Lista de Especialidades");
        panelEspecialidade.add(jLabelEspecialidade);
        jLabelEspecialidade.setBounds(20, 10, 210, 25);

        buttonExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonExcluir.setToolTipText("Excluir");
        buttonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        panelEspecialidade.add(buttonExcluir);
        buttonExcluir.setBounds(590, 240, 80, 50);

        buttonEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        panelEspecialidade.add(buttonEditar);
        buttonEditar.setBounds(680, 240, 80, 50);

        buttonConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar.png"))); // NOI18N
        buttonConfirmar.setToolTipText("Adicionar");
        buttonConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarActionPerformed(evt);
            }
        });
        panelEspecialidade.add(buttonConfirmar);
        buttonConfirmar.setBounds(500, 240, 80, 50);

        add(panelEspecialidade);
        panelEspecialidade.setBounds(0, 0, 780, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarActionPerformed
        EspecialidadesDialog d = new EspecialidadesDialog(null, true);
        d.setVisible(true);
    }//GEN-LAST:event_buttonConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConfirmar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JLabel jLabelEspecialidade;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelEspecialidade;
    private javax.swing.JTable tableEspecialidade;
    // End of variables declaration//GEN-END:variables
private void prencherTabela() {
        
    tableEspecialidade.setModel(EspecialidadeDAO.getTabelaEspecialidades());
    
    }
}