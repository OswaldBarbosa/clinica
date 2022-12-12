package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicoDialog() {

    }

    public MedicoDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherEspecialidades();

        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(getClass()
                        .getResource("/br/senai/sp/jandira/img/calendario.png")));
    }

    public MedicoDialog(java.awt.Frame parent, boolean modal, Medico m, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        medico = m;
        this.operacao = operacao;

        preencherFormulario();
        preencherTitulo();
        preencherEspecialidades();
        preencherEspecialidadesDoMedico();
        setIconImage(Toolkit.getDefaultToolkit()
                .getImage(getClass()
                        .getResource("/br/senai/sp/jandira/img/agenda.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        labelCrm = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        textFieldNomeDoMedico = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        labelNomeDoMedico = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        formattedTextDataDeNascimento = new javax.swing.JFormattedTextField();
        textFieldCrm = new javax.swing.JTextField();
        labelEspecialideDoMedico = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        buttonRemoverEspecialidadeDaLista = new javax.swing.JButton();
        buttonAdicionarEspecialidadeNaLista = new javax.swing.JButton();
        labelDataDeNascimento = new javax.swing.JLabel();
        labelListaDeEspecialidade = new javax.swing.JLabel();
        jScrollListaDeEspecialidadeDoMedico = new javax.swing.JScrollPane();
        jListEspecialidadeDoMedico = new javax.swing.JList<>();
        jScrollListaDeEspecialidades = new javax.swing.JScrollPane();
        jListEspecialidade = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        panelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelTitulo.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTitulo.setText("Médico - ADICIONAR");
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

        labelCrm.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelCrm.setText("CRM:");
        panelDetalhes.add(labelCrm);
        labelCrm.setBounds(140, 10, 70, 22);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelCodigo.setText("Código:");
        panelDetalhes.add(labelCodigo);
        labelCodigo.setBounds(10, 10, 70, 22);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelDetalhes.add(textFieldCodigo);
        textFieldCodigo.setBounds(10, 40, 120, 20);

        textFieldNomeDoMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelDetalhes.add(textFieldNomeDoMedico);
        textFieldNomeDoMedico.setBounds(270, 40, 360, 20);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar ");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonCancelar);
        buttonCancelar.setBounds(490, 250, 60, 50);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salvar.png"))); // NOI18N
        buttonSalvar.setToolTipText("Gravar especialidade");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonSalvar);
        buttonSalvar.setBounds(560, 250, 60, 50);

        labelNomeDoMedico.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelNomeDoMedico.setText("Nome do(a) médico:");
        panelDetalhes.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(270, 10, 150, 22);

        textFieldEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelDetalhes.add(textFieldEmail);
        textFieldEmail.setBounds(160, 100, 320, 20);

        labelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelTelefone.setText("Telefone:");
        panelDetalhes.add(labelTelefone);
        labelTelefone.setBounds(10, 70, 70, 22);

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelEmail.setText("E-mail:");
        panelDetalhes.add(labelEmail);
        labelEmail.setBounds(160, 70, 50, 22);

        formattedTextDataDeNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        formattedTextDataDeNascimento.setColumns(8);
        try {
            formattedTextDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        panelDetalhes.add(formattedTextDataDeNascimento);
        formattedTextDataDeNascimento.setBounds(490, 100, 120, 20);

        textFieldCrm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelDetalhes.add(textFieldCrm);
        textFieldCrm.setBounds(140, 40, 120, 20);

        labelEspecialideDoMedico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEspecialideDoMedico.setText("Especialidade do Médico:");
        panelDetalhes.add(labelEspecialideDoMedico);
        labelEspecialideDoMedico.setBounds(250, 140, 160, 20);

        textFieldTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panelDetalhes.add(textFieldTelefone);
        textFieldTelefone.setBounds(10, 100, 140, 20);

        buttonRemoverEspecialidadeDaLista.setBackground(new java.awt.Color(255, 0, 0));
        buttonRemoverEspecialidadeDaLista.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        buttonRemoverEspecialidadeDaLista.setForeground(new java.awt.Color(255, 255, 255));
        buttonRemoverEspecialidadeDaLista.setText("<");
        buttonRemoverEspecialidadeDaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverEspecialidadeDaListaActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonRemoverEspecialidadeDaLista);
        buttonRemoverEspecialidadeDaLista.setBounds(170, 230, 60, 40);

        buttonAdicionarEspecialidadeNaLista.setBackground(new java.awt.Color(0, 153, 0));
        buttonAdicionarEspecialidadeNaLista.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        buttonAdicionarEspecialidadeNaLista.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdicionarEspecialidadeNaLista.setText(">");
        buttonAdicionarEspecialidadeNaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeNaListaActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonAdicionarEspecialidadeNaLista);
        buttonAdicionarEspecialidadeNaLista.setBounds(170, 180, 60, 40);

        labelDataDeNascimento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDataDeNascimento.setText("Data Nascimento:");
        panelDetalhes.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(490, 70, 130, 22);

        labelListaDeEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelListaDeEspecialidade.setText("Lista de Especialidade:");
        panelDetalhes.add(labelListaDeEspecialidade);
        labelListaDeEspecialidade.setBounds(10, 140, 140, 20);

        jScrollListaDeEspecialidadeDoMedico.setViewportView(jListEspecialidadeDoMedico);

        panelDetalhes.add(jScrollListaDeEspecialidadeDoMedico);
        jScrollListaDeEspecialidadeDoMedico.setBounds(250, 170, 140, 140);

        jScrollListaDeEspecialidades.setViewportView(jListEspecialidade);

        panelDetalhes.add(jScrollListaDeEspecialidades);
        jScrollListaDeEspecialidades.setBounds(10, 170, 140, 140);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(10, 100, 640, 320);

        setSize(new java.awt.Dimension(676, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void buttonAdicionarEspecialidadeNaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeNaListaActionPerformed

        if (jListEspecialidade.isSelectionEmpty() == false) {

            ArrayList<Especialidade> novaLista = new ArrayList<>();
            int tamanho = jListEspecialidadeDoMedico.getModel().getSize();
            for (int i = 0; i < tamanho; i++) {
                novaLista.add(jListEspecialidadeDoMedico.getModel().getElementAt(i));
            }

            if (novaLista.contains(jListEspecialidade.getSelectedValue()) == false) {
                novaLista.add(jListEspecialidade.getSelectedValue());

                DefaultListModel<Especialidade> especialidadesLista = new DefaultListModel<Especialidade>();
                for (Especialidade percorrer : novaLista) {
                    especialidadesLista.addElement(percorrer);
                }
                jListEspecialidadeDoMedico.setModel(especialidadesLista);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Especialidade já existente",
                        "Médico - Editar",
                        JOptionPane.WARNING_MESSAGE, null);
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione a especialidade desejada!",
                    "Editar - Médico",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonAdicionarEspecialidadeNaListaActionPerformed

    private void buttonRemoverEspecialidadeDaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverEspecialidadeDaListaActionPerformed

        if (jListEspecialidadeDoMedico.isSelectionEmpty() == false) {
            ArrayList<Especialidade> novaLista = new ArrayList<>();
            int tamanho = jListEspecialidadeDoMedico.getModel().getSize();
            for (int o = 0; o < tamanho; o++) {
                novaLista.add(jListEspecialidadeDoMedico.getSelectedValue());
            }
            novaLista.remove(jListEspecialidadeDoMedico.getSelectedValue());

            DefaultListModel<Especialidade> especialidadeLista = new DefaultListModel<Especialidade>();
            for (Especialidade percorrer : novaLista) {
                especialidadeLista.addElement(percorrer);
            }
            jListEspecialidadeDoMedico.setModel(especialidadeLista);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione uma especialidade para ser removida",
                    "Editando Médico",
                    JOptionPane.WARNING_MESSAGE, null);
        }
        
    }//GEN-LAST:event_buttonRemoverEspecialidadeDaListaActionPerformed

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed

    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void preencherFormulario() {
        textFieldCrm.setText(medico.getCrm());
        textFieldEmail.setText(medico.getEmail());
        textFieldNomeDoMedico.setText(medico.getNome());
        textFieldTelefone.setText(medico.getTelefoneMedico());
        textFieldCodigo.setText(medico.getCodigo().toString());
        formattedTextDataDeNascimento.setText(medico.getDataFormatada());
    }

    private void preencherTitulo() {
        labelTitulo.setText("Médico - " + operacao);
    }

    private ArrayList<Especialidade> pegarEspecialidades(JList<Especialidade> lista) {

        int tamanho = lista.getModel().getSize();

        ArrayList<Especialidade> novaLista = new ArrayList<>();

        for (int i = 0; i < tamanho; i++) {
            novaLista.add(lista.getModel().getElementAt(i));
        }

        return novaLista;

    }

    private void editar() {

        medico.setCrm(textFieldCrm.getText());
        medico.setNome(textFieldNomeDoMedico.getText());
        medico.setTelefoneMedico(textFieldTelefone.getText());
        medico.setEmail(textFieldEmail.getText());
        medico.setDataFormatada(formattedTextDataDeNascimento.getText());
        medico.setEspecialidades(pegarEspecialidades(jListEspecialidadeDoMedico));

        MedicoDAO.atualizar(medico);
        JOptionPane.showMessageDialog(null,
                "Detalhes do médico editados com sucesso!",
                "Editar", JOptionPane.INFORMATION_MESSAGE);

        dispose();

    }

    private void preencherEspecialidades() {
        jListEspecialidade.setModel(EspecialidadeDAO.getModelEspecialidade());
    }

    private void preencherEspecialidadesDoMedico() {

        DefaultListModel<Especialidade> especialidadesMedico = new DefaultListModel<>();
        for (Especialidade percorrer : medico.getEspecialidades()) {
            especialidadesMedico.addElement(percorrer);
        }
        jListEspecialidadeDoMedico.setModel(especialidadesMedico);
    }

    private void adicionar() {
        
        CharSequence branco = " ";

        // Espaços em branco
        if (textFieldCrm.getText().contains(branco)
                || textFieldNomeDoMedico.getText().isEmpty()
                || textFieldNomeDoMedico.getText().contains(branco)
                || textFieldEmail.getText().isEmpty()
                || formattedTextDataDeNascimento.getText().contains(branco)) {

            JOptionPane.showMessageDialog(this,
                    "Todos os campos são obrigatórios!!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
            textFieldCrm.requestFocus();
            
        } else {
            Medico medicos = new Medico();
            medicos.setCrm(textFieldCrm.getText());
            medicos.setNome(textFieldNomeDoMedico.getText());
            medicos.setTelefoneMedico(textFieldTelefone.getText());
            medicos.setEmail(textFieldEmail.getText());
            medicos.setDataFormatada(formattedTextDataDeNascimento.getText());
            medicos.setEspecialidades(pegarEspecialidades(jListEspecialidadeDoMedico));

            MedicoDAO.gravar(medicos);
            
            JOptionPane.showMessageDialog(this,
                    "Médico gravado com sucesso!",
                    "Médico",
                    JOptionPane.INFORMATION_MESSAGE);
            
            dispose();
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidadeNaLista;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonRemoverEspecialidadeDaLista;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JFormattedTextField formattedTextDataDeNascimento;
    private javax.swing.JList<Especialidade> jListEspecialidade;
    private javax.swing.JList<Especialidade> jListEspecialidadeDoMedico;
    private javax.swing.JScrollPane jScrollListaDeEspecialidadeDoMedico;
    private javax.swing.JScrollPane jScrollListaDeEspecialidades;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCrm;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEspecialideDoMedico;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelListaDeEspecialidade;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldCrm;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNomeDoMedico;
    private javax.swing.JTextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
