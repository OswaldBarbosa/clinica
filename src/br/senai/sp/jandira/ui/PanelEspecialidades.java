package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PanelEspecialidades extends javax.swing.JPanel {

    private int linha;
    
    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidade();
        prencherTabela();
    }

    private int getLinha() {
        linha = tableEspecialidade.getSelectedRow();
        return linha;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEspecialidade = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableEspecialidade = new javax.swing.JTable();
        labelEspecialidade = new javax.swing.JLabel();
        buttonExcluir = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

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

        labelEspecialidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEspecialidade.setText("Lista de Especialidades");
        panelEspecialidade.add(labelEspecialidade);
        labelEspecialidade.setBounds(20, 10, 210, 25);

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
        panelEspecialidade.add(buttonEditar);
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
        panelEspecialidade.add(buttonAdicionar);
        buttonAdicionar.setBounds(680, 240, 80, 50);

        add(panelEspecialidade);
        panelEspecialidade.setBounds(0, 0, 780, 300);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed

        EspecialidadesDialog especilaidadeDialog = new EspecialidadesDialog(null, true);
        especilaidadeDialog.setVisible(true);
        prencherTabela();

    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed

        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione a especialidade que vcoê deseja editar",
                "Especialidades",
                JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed

        if (getLinha() != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(this,
                "Por favor, selecione a especialidade que você deseja excluir!",
                "Atenção",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirActionPerformed

    
    private void editarEspecialidade () {
         
        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        EspecialidadesDialog especialidadeDialog = new EspecialidadesDialog(null, true);
        especialidadeDialog.setVisible(true);
        prencherTabela();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelEspecialidade;
    private javax.swing.JPanel panelEspecialidade;
    private javax.swing.JTable tableEspecialidade;
    // End of variables declaration//GEN-END:variables
    
    private void prencherTabela() {
        
    tableEspecialidade.setModel(EspecialidadeDAO.getTabelaEspecialidades());
    ajustarTabela();

    }

    private void ajustarTabela() {
        
        //Impedir que o usuario movimente as colunas
        tableEspecialidade.getTableHeader().setReorderingAllowed(false);
        
        //Bloquear a edição das células da tabela
        tableEspecialidade.setDefaultEditor(Object.class, null);
        
        //Definir largura das colunas
        tableEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(70);
        tableEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(390);
    }
    
    private Integer getCodigo() {
        
        String codigoStr = tableEspecialidade.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
        
    }
    
        private void excluirEspecialidade() {
        
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        
        if (resposta == 0) {
           EspecialidadeDAO.excluir(getCodigo());
           prencherTabela();
        }
        
    }
       
}

