package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {

    private int linha;

    public PanelMedico() {
        initComponents();
        MedicoDAO.criarListaDeMedico();
        preencherTabela();
    }

    private int getLinha() {
        linha = tableMedico.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMedico = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        labelTituloMedico = new javax.swing.JLabel();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(780, 300));
        setRequestFocusEnabled(false);
        setLayout(null);

        panelMedico.setBackground(new java.awt.Color(255, 255, 255));
        panelMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelMedico.setLayout(null);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tableMedico);

        panelMedico.add(jScrollPane3);
        jScrollPane3.setBounds(10, 40, 760, 190);

        labelTituloMedico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTituloMedico.setText("Lista de Médicos");
        panelMedico.add(labelTituloMedico);
        labelTituloMedico.setBounds(20, 10, 210, 25);

        buttonExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonExcluir.setToolTipText("Excluir");
        buttonExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });
        panelMedico.add(buttonExcluir);
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
        panelMedico.add(buttonEditar);
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
        panelMedico.add(buttonAdicionar);
        buttonAdicionar.setBounds(680, 240, 80, 50);

        add(panelMedico);
        panelMedico.setBounds(0, 0, 780, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        if (getLinha() != -1) {
            excluirMedico();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o plano que você deseja excluir.",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        
        if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o médico que deseja editar.",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        MedicoDialog addTela = new MedicoDialog(null, true, OperacaoEnum.ADICIONAR);
        addTela.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelTituloMedico;
    private javax.swing.JPanel panelMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables

    private void excluirMedico() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            MedicoDAO.excluir(getCodigo());
            preencherTabela();
        }
    }

    private void editarMedico() {

        Medico medico = MedicoDAO.getMedico(getCodigo());
        MedicoDialog medicoDialog = new MedicoDialog(null, true, medico, OperacaoEnum.EDITAR);
        medicoDialog.setVisible(true);
        preencherTabela();
    }

    private Integer getCodigo() {

        String codigoStr = tableMedico.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    private void preencherTabela() {

        tableMedico.setModel(MedicoDAO.getTabelaMedico());
        ajustarTabela();
    }

    private void ajustarTabela() {

        //Impedir que o usuario movimente as colunas
        tableMedico.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        tableMedico.setDefaultEditor(Object.class, null);

        //Definir largura das colunas
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(110);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(110);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(330);
        tableMedico.getColumnModel().getColumn(3).setPreferredWidth(207);
    }
}
