package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelPlanodeSaude extends javax.swing.JPanel {
    
    private int linha;

    public PanelPlanodeSaude() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanoDeSaude();
        prencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPlanoDeSaude = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        labelTituloPlanoDeSaude = new javax.swing.JLabel();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setLayout(null);

        panelPlanoDeSaude.setBackground(new java.awt.Color(255, 255, 255));
        panelPlanoDeSaude.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelPlanoDeSaude.setLayout(null);

        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablePlanoDeSaude);

        panelPlanoDeSaude.add(jScrollPane3);
        jScrollPane3.setBounds(10, 40, 760, 190);

        labelTituloPlanoDeSaude.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloPlanoDeSaude.setText("Lista de Planos de Saúde");
        panelPlanoDeSaude.add(labelTituloPlanoDeSaude);
        labelTituloPlanoDeSaude.setBounds(20, 10, 210, 25);

        buttonExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonExcluir.setToolTipText("Excluir");
        buttonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        panelPlanoDeSaude.add(buttonExcluir);
        buttonExcluir.setBounds(500, 240, 80, 50);

        buttonEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png"))); // NOI18N
        buttonEditar.setToolTipText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });
        panelPlanoDeSaude.add(buttonEditar);
        buttonEditar.setBounds(590, 240, 80, 50);

        buttonAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar.png"))); // NOI18N
        buttonAdicionar.setToolTipText("Adicionar");
        buttonAdicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });
        panelPlanoDeSaude.add(buttonAdicionar);
        buttonAdicionar.setBounds(680, 240, 80, 50);

        add(panelPlanoDeSaude);
        panelPlanoDeSaude.setBounds(0, 0, 780, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed

    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

    }//GEN-LAST:event_buttonAdicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelTituloPlanoDeSaude;
    private javax.swing.JPanel panelPlanoDeSaude;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables

    private void prencherTabela() {
        
    tablePlanoDeSaude.setModel(EspecialidadeDAO.getTabelaEspecialidades());
    ajustarTabela();

    }
    
        private void ajustarTabela() {
        
        //Impedir que o usuario movimente as colunas
        tablePlanoDeSaude.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear a edição das células da tabela
        tablePlanoDeSaude.setDefaultEditor(Object.class, null);
        
        //Definir largura das colunas
        tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(70);
        tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(300);
        tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(390);
    } 

}
