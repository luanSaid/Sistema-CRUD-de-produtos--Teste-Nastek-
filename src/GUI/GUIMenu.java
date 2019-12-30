package GUI;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luan Said Meira Moreira
 */
public class GUIMenu extends javax.swing.JFrame {
    
    public GUIMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadastrarProdutos = new javax.swing.JMenuItem();
        CadastrarCategoria = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        listarNome = new javax.swing.JMenuItem();
        listarQuantidade = new javax.swing.JMenuItem();
        listarMaiorQuantidade = new javax.swing.JMenuItem();
        listarCategoria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        deletarProduto = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seja bem vind@!  - Selecione o que deseja ser feito na barra de menu acima. ");

        jMenu1.setText("Cadastrar");

        CadastrarProdutos.setText("Produtos");
        CadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(CadastrarProdutos);

        CadastrarCategoria.setText("Categorias");
        CadastrarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarCategoriaActionPerformed(evt);
            }
        });
        jMenu1.add(CadastrarCategoria);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listar");

        listarNome.setText("Prod. por nome");
        listarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarNomeActionPerformed(evt);
            }
        });
        jMenu2.add(listarNome);

        listarQuantidade.setText("Prod. por quantidade");
        listarQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarQuantidadeActionPerformed(evt);
            }
        });
        jMenu2.add(listarQuantidade);

        listarMaiorQuantidade.setText("Maior/Menor quantidade");
        listarMaiorQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMaiorQuantidadeActionPerformed(evt);
            }
        });
        jMenu2.add(listarMaiorQuantidade);

        listarCategoria.setText("Por categoria");
        listarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarCategoriaActionPerformed(evt);
            }
        });
        jMenu2.add(listarCategoria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Deletar");

        deletarProduto.setText("Produtos");
        deletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(deletarProduto);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarProdutosActionPerformed
        GUICadastroProduto janela = null;
        try {
            janela = new GUICadastroProduto();
        } catch (SQLException ex) {
            Logger.getLogger(GUIMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastrarProdutosActionPerformed

    private void deletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarProdutoActionPerformed
        GUIDeletarProduto janela = new GUIDeletarProduto();
        janela.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_deletarProdutoActionPerformed

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
            Logger.getLogger(GUIMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        janela.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_listarCategoriaActionPerformed

    private void CadastrarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarCategoriaActionPerformed
        GUICadastrarCategoria janela = new GUICadastrarCategoria();
        janela.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CadastrarCategoriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastrarCategoria;
    private javax.swing.JMenuItem CadastrarProdutos;
    private javax.swing.JMenuItem deletarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem listarCategoria;
    private javax.swing.JMenuItem listarMaiorQuantidade;
    private javax.swing.JMenuItem listarNome;
    private javax.swing.JMenuItem listarQuantidade;
    // End of variables declaration//GEN-END:variables
}
