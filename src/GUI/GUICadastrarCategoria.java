/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.CategoriaDAO;
import MODEL.Categoria;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author lulu
 */
public class GUICadastrarCategoria extends javax.swing.JFrame {

    /**
     * Creates new form GUICadastrarCategoria
     */
    public GUICadastrarCategoria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_salvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomeCategoria = new javax.swing.JTextField();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        CadastrarProdutos2 = new javax.swing.JMenuItem();
        CadastrarCategoria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        listarNome = new javax.swing.JMenuItem();
        listarQuantidade = new javax.swing.JMenuItem();
        listarMaiorQuantidade = new javax.swing.JMenuItem();
        listarCategoria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        deletarProduto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_salvar.setText("Cadastrar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Insira o nome da categoria:");

        nomeCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCategoriaActionPerformed(evt);
            }
        });

        jMenu3.setText("Cadastrar");

        CadastrarProdutos2.setText("Produtos");
        CadastrarProdutos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdutos2ActionPerformed(evt);
            }
        });
        jMenu3.add(CadastrarProdutos2);

        CadastrarCategoria.setText("Categorias");
        CadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarCategoriaActionPerformed(evt);
            }
        });
        jMenu3.add(CadastrarCategoria);

        jMenuBar3.add(jMenu3);

        jMenu4.setText("Listar");

        listarNome.setText("Prod. por nome");
        listarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarNomeActionPerformed(evt);
            }
        });
        jMenu4.add(listarNome);

        listarQuantidade.setText("Prod. por quantidade");
        listarQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarQuantidadeActionPerformed(evt);
            }
        });
        jMenu4.add(listarQuantidade);

        listarMaiorQuantidade.setText("Maior/Menor quantidade");
        listarMaiorQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMaiorQuantidadeActionPerformed(evt);
            }
        });
        jMenu4.add(listarMaiorQuantidade);

        listarCategoria.setText("Por categoria");
        listarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(listarCategoria);

        jMenuBar3.add(jMenu4);

        jMenu5.setText("Deletar");

        deletarProduto.setText("Produtos");
        deletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarProdutoActionPerformed(evt);
            }
        });
        jMenu5.add(deletarProduto);

        jMenuBar3.add(jMenu5);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btn_salvar)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(nomeCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btn_salvar)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if (!nomeCategoria.getText().equals("")) {
            Categoria categoria = new Categoria();
            categoria.setNome(nomeCategoria.getText());
            try {
                CategoriaDAO.cadastrarCategoria(categoria);
                JOptionPane.showMessageDialog(null, "Cadastro realizado");
                nomeCategoria.setText("");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir informações no banco");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Certifique-se de preencher todos os campos!", "Fique atento!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void nomeCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCategoriaActionPerformed
    }//GEN-LAST:event_nomeCategoriaActionPerformed

    private void CadastrarProdutos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarProdutos2ActionPerformed
        GUICadastroProduto janela = null;
        try {
            janela = new GUICadastroProduto();
        } catch (SQLException ex) {

        }
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastrarProdutos2ActionPerformed

    private void CadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarCategoriaActionPerformed
        GUICadastrarCategoria janela = new GUICadastrarCategoria();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastrarCategoriaActionPerformed

    private void listarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarNomeActionPerformed
        GUIListarNome janela = new GUIListarNome();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listarNomeActionPerformed

    private void listarQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarQuantidadeActionPerformed
        GUIListarQuantidade janela = new GUIListarQuantidade();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listarQuantidadeActionPerformed

    private void listarMaiorQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarMaiorQuantidadeActionPerformed
        GUIListarMaiorMenorQuantidade janela = new GUIListarMaiorMenorQuantidade();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listarMaiorQuantidadeActionPerformed

    private void listarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarCategoriaActionPerformed
        GUIListarCategoria janela = null;
        try {
            janela = new GUIListarCategoria();
        } catch (SQLException ex) {
            
        }
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listarCategoriaActionPerformed

    private void deletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarProdutoActionPerformed
        GUIDeletarProduto janela = new GUIDeletarProduto();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deletarProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(GUICadastrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICadastrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICadastrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICadastrarCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICadastrarCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastrarCategoria;
    private javax.swing.JMenuItem CadastrarProdutos;
    private javax.swing.JMenuItem CadastrarProdutos1;
    private javax.swing.JMenuItem CadastrarProdutos2;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JMenuItem deletarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem listarCategoria;
    private javax.swing.JMenuItem listarMaiorQuantidade;
    private javax.swing.JMenuItem listarNome;
    private javax.swing.JMenuItem listarQuantidade;
    private javax.swing.JTextField nomeCategoria;
    // End of variables declaration//GEN-END:variables
}
