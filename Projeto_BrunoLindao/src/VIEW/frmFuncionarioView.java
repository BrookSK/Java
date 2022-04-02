package VIEW;
import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class frmFuncionarioView extends javax.swing.JFrame {

    /**
     * Creates new form frmFuncionarioView
     */
    public frmFuncionarioView() {
        initComponents();
        preenche_busca();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btbCarregarCampos = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FUNCIONARIO");

        jLabel2.setText("Digite o Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel6.setText("Digite a Cidade:");

        jLabel7.setText("Digite o Estado:");

        jLabel5.setText("Digite o Telefone:");

        jLabel9.setText("Digite o Endereço:");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite o Salário:");

        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        tblFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Cidade", "Salario", "Endereco", "Estado", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tblFuncionario);

        jLabel4.setText("ID:");

        btbCarregarCampos.setText("CARREGAR CAMPOS");
        btbCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCarregarCamposActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btbCarregarCampos)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(txtEstado)
                            .addComponent(txtId)
                            .addComponent(txtNome)
                            .addComponent(txtCidade)
                            .addComponent(txtSalario)
                            .addComponent(txtTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOk)
                            .addComponent(btnLimpar))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbCarregarCampos)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        Funcionario();
        preenche_busca();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
        preenche_busca();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void btbCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCarregarCamposActionPerformed
        setarCampos();
        preenche_busca();
    }//GEN-LAST:event_btbCarregarCamposActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarCampos();
        preenche_busca();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirCampos();
        preenche_busca();
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(frmFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFuncionarioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbCarregarCampos;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void Funcionario(){
        String nome, endereco, cidade, estado, salario, telefone;
        
        nome=txtNome.getText();
        endereco=txtEndereco.getText();
        telefone=txtTelefone.getText();
        cidade=txtCidade.getText();
        estado=txtEstado.getText();
        salario=txtSalario.getText();
        
        FuncionarioDTO objfuncionarioDTO=new FuncionarioDTO();
        objfuncionarioDTO.setCidade(cidade);
        objfuncionarioDTO.setEndereco(endereco);
        objfuncionarioDTO.setEstado(estado);
        objfuncionarioDTO.setNome(nome);
        objfuncionarioDTO.setTelefone(telefone);
        objfuncionarioDTO.setSalario(salario);
        
        FuncionarioDAO objFuncionarioDAO=new FuncionarioDAO();
        objFuncionarioDAO.cadastrarFuncionario(objfuncionarioDTO);
    }
    
    private void limparCampos(){
        txtCidade.setText("");
        txtEndereco.setText("");
        txtEstado.setText("");
        txtNome.setText("");
        txtTelefone.setText("");
        txtSalario.setText("");
        txtId.setText("");
        
        txtNome.requestFocus();
    }

    public void preenche_busca(){
        try{
            FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
            FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
            
            ResultSet rsFuncionarioDAO = objFuncionarioDAO.ListaBusca(objFuncionarioDTO);
            
            String[] todos = {"Id", "Nome", "Endereco", "Cidade", "Estado", "Salario", "Telefone"};
            String[][] linhas = {};
            DefaultTableModel tableModel = new DefaultTableModel(linhas, todos){
                public boolean isCellEditable(int row, int col){
                    return false;
                }
            };
            
            Vector<Vector> dados = new Vector<>();
            while(rsFuncionarioDAO.next()){
                Vector regVetor = new Vector();
                regVetor.add(rsFuncionarioDAO.getInt("id_funcionario"));
                regVetor.add(rsFuncionarioDAO.getString("nome_funcionario"));
                regVetor.add(rsFuncionarioDAO.getString("endereco_funcionario"));
                regVetor.add(rsFuncionarioDAO.getString("cidade_funcionario"));
                regVetor.add(rsFuncionarioDAO.getString("estado_funcionario"));
                regVetor.add(rsFuncionarioDAO.getString("salario_funcionario"));
                regVetor.add(rsFuncionarioDAO.getString("telefone_funcionario"));
                
                dados.add(regVetor);
                tableModel.addRow(regVetor);
            }
            tblFuncionario.setModel(tableModel);
        }
        catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void setarCampos(){
        int setar = tblFuncionario.getSelectedRow();
        txtId.setText(tblFuncionario.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tblFuncionario.getModel().getValueAt(setar, 1).toString());
        txtEndereco.setText(tblFuncionario.getModel().getValueAt(setar, 2).toString());
        txtCidade.setText(tblFuncionario.getModel().getValueAt(setar, 3).toString());
        txtEstado.setText(tblFuncionario.getModel().getValueAt(setar, 4).toString());
        txtSalario.setText(tblFuncionario.getModel().getValueAt(setar, 5).toString());
        txtTelefone.setText(tblFuncionario.getModel().getValueAt(setar, 6).toString());
    }
    
    public void AlterarCampos(){
        String nome, endereco, cidade, estado, salario, telefone;
        int id;
        
        nome = txtNome.getText();
        endereco = txtEndereco.getText();
        id = Integer.parseInt(txtId.getText());
        telefone=txtTelefone.getText();
        cidade=txtCidade.getText();
        estado=txtEstado.getText();
        salario=txtSalario.getText();
        
        FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
        objFuncionarioDTO.setCidade(cidade);
        objFuncionarioDTO.setEndereco(endereco);
        objFuncionarioDTO.setEstado(estado);
        objFuncionarioDTO.setNome(nome);
        objFuncionarioDTO.setTelefone(telefone);
        objFuncionarioDTO.setSalario(salario);
        objFuncionarioDTO.setId(id);
        
        FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
        objFuncionarioDAO.AlterarFuncionario(objFuncionarioDTO);
    }
    
    public void ExcluirCampos(){
        int id;
        
        id = Integer.parseInt(txtId.getText());
        
        FuncionarioDTO objFuncionarioDTO = new FuncionarioDTO();
        objFuncionarioDTO.setId(id);
        
        FuncionarioDAO objFuncionarioDAO = new FuncionarioDAO();
        objFuncionarioDAO.ExcluirFuncionario(objFuncionarioDTO);
        
        preenche_busca();
    }
}