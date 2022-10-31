package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planosDeSaude;
    private OperacaoEnum operacao;

    public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
        public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(getClass()
                        .getResource("/br/senai/sp/jandira/img/agenda.png")));
    }

        public PlanoDeSaudeDialog(java.awt.Frame parent, boolean modal, PlanoDeSaude p, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        planosDeSaude = p;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();

        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(getClass()
                        .getResource("/br/senai/sp/jandira/img/agenda.png")));
    }

    private void preencherFormulario() {

        textFieldCategoria.setText(planosDeSaude.getCategoria());
        formattedTextNumero.setText(planosDeSaude.getNumero());
        textFieldOperadora.setText(planosDeSaude.getOperadora());
        formattedTextValidade.setText(planosDeSaude.getDataFormatada());
    
    }
    
     private void preencherTitulo() {
        labelTitulo.setText("Plano de Saúde - " + operacao);
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        labelNumero = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldCategoria = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelOperadora = new javax.swing.JLabel();
        textFieldOperadora = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        labelValidade = new javax.swing.JLabel();
        formattedTextValidade = new javax.swing.JFormattedTextField();
        formattedTextNumero = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        panelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelTitulo.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setText("Plano de Saúde - ADICIONAR");
        panelTitulo.add(labelTitulo);
        labelTitulo.setBounds(120, 30, 350, 30);

        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/add.png"))); // NOI18N
        panelTitulo.add(labelIcon);
        labelIcon.setBounds(20, 10, 70, 64);

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(10, 10, 640, 80);

        panelDetalhes.setBackground(new java.awt.Color(255, 255, 255));
        panelDetalhes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelDetalhes.setLayout(null);

        labelNumero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelNumero.setText("Número:");
        panelDetalhes.add(labelNumero);
        labelNumero.setBounds(10, 10, 70, 22);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelCodigo.setText("Código:");
        panelDetalhes.add(labelCodigo);
        labelCodigo.setBounds(300, 10, 70, 22);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldCodigo);
        textFieldCodigo.setBounds(300, 40, 120, 20);

        textFieldCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelDetalhes.add(textFieldCategoria);
        textFieldCategoria.setBounds(10, 160, 230, 20);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar ");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonCancelar);
        buttonCancelar.setBounds(480, 210, 60, 50);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salvar.png"))); // NOI18N
        buttonSalvar.setToolTipText("Gravar especialidade");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonSalvar);
        buttonSalvar.setBounds(550, 210, 60, 50);

        labelOperadora.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelOperadora.setText("Operadora:");
        panelDetalhes.add(labelOperadora);
        labelOperadora.setBounds(10, 70, 80, 22);

        textFieldOperadora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        textFieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOperadoraActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldOperadora);
        textFieldOperadora.setBounds(10, 100, 230, 20);

        labelCategoria.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelCategoria.setText("Categoria:");
        panelDetalhes.add(labelCategoria);
        labelCategoria.setBounds(10, 130, 70, 22);

        labelValidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelValidade.setText("Validade:");
        panelDetalhes.add(labelValidade);
        labelValidade.setBounds(300, 100, 70, 22);

        formattedTextValidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        formattedTextValidade.setColumns(8);
        try {
            formattedTextValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTextValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextValidadeActionPerformed(evt);
            }
        });
        panelDetalhes.add(formattedTextValidade);
        formattedTextValidade.setBounds(300, 140, 90, 18);

        formattedTextNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255), null));
        formattedTextNumero.setColumns(12);
        try {
            formattedTextNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelDetalhes.add(formattedTextNumero);
        formattedTextNumero.setBounds(10, 40, 134, 18);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(10, 100, 640, 280);

        setBounds(0, 0, 676, 428);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void textFieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOperadoraActionPerformed

    }//GEN-LAST:event_textFieldOperadoraActionPerformed

    private void formattedTextValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextValidadeActionPerformed

    private void editar() {
        planosDeSaude.setCategoria(textFieldCategoria.getText());
        planosDeSaude.setNumero(formattedTextNumero.getText());
        planosDeSaude.setOperadora(textFieldOperadora.getText());
        planosDeSaude.setDataFormatada(formattedTextValidade.getText());

        PlanoDeSaudeDAO.atualizar(planosDeSaude);
        JOptionPane.showMessageDialog(null, "Plano de saúde editado com sucesso!", "EDITAR", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }

    private void adicionar() {
        
        CharSequence branco = " ";
        
        //Espaços em branco
        if (formattedTextValidade.getText().contains(branco) == true || formattedTextNumero.getText().contains(branco) == true || textFieldOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, " Os campos: Operadora, número e validade são obrigatórios!!", "Atenção!!", JOptionPane.WARNING_MESSAGE);
            textFieldCategoria.requestFocus();
        } else {

            PlanoDeSaude planoDeSaude = new PlanoDeSaude();
            planoDeSaude.setCategoria(textFieldCategoria.getText());
            planoDeSaude.setNumero(formattedTextNumero.getText());
            planoDeSaude.setOperadora(textFieldOperadora.getText());
            planoDeSaude.setDataFormatada(formattedTextValidade.getText());

            PlanoDeSaudeDAO.gravar(planoDeSaude);

            JOptionPane.showMessageDialog(this,
                    "Plano de saúde gravado com sucesso!",
                    "Plano de saúde",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }

        //Criar objeto
        //Grava objeto
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField formattedTextNumero;
    private javax.swing.JFormattedTextField formattedTextValidade;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField textFieldCategoria;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldOperadora;
    // End of variables declaration//GEN-END:variables
}
