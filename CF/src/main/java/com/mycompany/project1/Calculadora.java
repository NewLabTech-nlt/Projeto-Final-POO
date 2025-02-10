
package com.mycompany.project1;

import javax.swing.ImageIcon;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/calculatoricon.png")).getImage());
        setTitle("Calculadora");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                   
                Principal TelaPrincipal=new Principal();
                TelaPrincipal.setVisible(true);
                TelaPrincipal.setResizable(false);
                TelaPrincipal.setLocationRelativeTo(null);
                dispose();
                
            }
        });
    }
    
    Double valor1, valor2;
    String operacao;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTFTela = new javax.swing.JTextField();
        BT0 = new javax.swing.JButton();
        BTvirgu = new javax.swing.JButton();
        BTsoma = new javax.swing.JButton();
        BTigual = new javax.swing.JButton();
        BT3 = new javax.swing.JButton();
        BT2 = new javax.swing.JButton();
        BT1 = new javax.swing.JButton();
        BTmenos = new javax.swing.JButton();
        BTmultipli = new javax.swing.JButton();
        BT6 = new javax.swing.JButton();
        BT5 = new javax.swing.JButton();
        BT4 = new javax.swing.JButton();
        BTlimpa = new javax.swing.JButton();
        BTdivis = new javax.swing.JButton();
        BTon = new javax.swing.JButton();
        BT9 = new javax.swing.JButton();
        BT8 = new javax.swing.JButton();
        BT7 = new javax.swing.JButton();

        jButton13.setText("jButton13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jTFTela.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        jTFTela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTFTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelaActionPerformed(evt);
            }
        });

        BT0.setBackground(new java.awt.Color(204, 204, 255));
        BT0.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BT0.setText("0");
        BT0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT0ActionPerformed(evt);
            }
        });

        BTvirgu.setBackground(new java.awt.Color(204, 204, 255));
        BTvirgu.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BTvirgu.setText(".");
        BTvirgu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTvirguActionPerformed(evt);
            }
        });

        BTsoma.setBackground(new java.awt.Color(204, 204, 255));
        BTsoma.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BTsoma.setText("+");
        BTsoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTsomaActionPerformed(evt);
            }
        });

        BTigual.setBackground(new java.awt.Color(204, 204, 255));
        BTigual.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BTigual.setText("=");
        BTigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTigualActionPerformed(evt);
            }
        });

        BT3.setBackground(new java.awt.Color(204, 204, 255));
        BT3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BT3.setText("3");
        BT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT3ActionPerformed(evt);
            }
        });

        BT2.setBackground(new java.awt.Color(204, 204, 255));
        BT2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BT2.setText("2");
        BT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT2ActionPerformed(evt);
            }
        });

        BT1.setBackground(new java.awt.Color(204, 204, 255));
        BT1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BT1.setText("1");
        BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT1ActionPerformed(evt);
            }
        });

        BTmenos.setBackground(new java.awt.Color(204, 204, 255));
        BTmenos.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BTmenos.setText("-");
        BTmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTmenosActionPerformed(evt);
            }
        });

        BTmultipli.setBackground(new java.awt.Color(204, 204, 255));
        BTmultipli.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BTmultipli.setText("*");
        BTmultipli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTmultipliActionPerformed(evt);
            }
        });

        BT6.setBackground(new java.awt.Color(204, 204, 255));
        BT6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BT6.setText("6");
        BT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT6ActionPerformed(evt);
            }
        });

        BT5.setBackground(new java.awt.Color(204, 204, 255));
        BT5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BT5.setText("5");
        BT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT5ActionPerformed(evt);
            }
        });

        BT4.setBackground(new java.awt.Color(204, 204, 255));
        BT4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BT4.setText("4");
        BT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT4ActionPerformed(evt);
            }
        });

        BTlimpa.setBackground(new java.awt.Color(204, 204, 255));
        BTlimpa.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BTlimpa.setText("C");
        BTlimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTlimpaActionPerformed(evt);
            }
        });

        BTdivis.setBackground(new java.awt.Color(204, 204, 255));
        BTdivis.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        BTdivis.setText("/");
        BTdivis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTdivisActionPerformed(evt);
            }
        });

        BTon.setBackground(new java.awt.Color(204, 204, 255));
        BTon.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        BTon.setText("IMC");
        BTon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTonActionPerformed(evt);
            }
        });

        BT9.setBackground(new java.awt.Color(204, 204, 255));
        BT9.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        BT9.setText("9");
        BT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT9ActionPerformed(evt);
            }
        });

        BT8.setBackground(new java.awt.Color(204, 204, 255));
        BT8.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        BT8.setText("8");
        BT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT8ActionPerformed(evt);
            }
        });

        BT7.setBackground(new java.awt.Color(204, 204, 255));
        BT7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        BT7.setText("7");
        BT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(BT0, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTvirgu, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTsoma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFTela))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BT7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BT8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BT9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTdivis, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTon, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BT4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BT5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BT1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BT2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BT6, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(BT3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTmultipli, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                    .addComponent(BTmenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(BTigual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(BTlimpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jTFTela, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTdivis, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTmultipli, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTlimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTvirgu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTsoma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTigual, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTsomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTsomaActionPerformed
        valor1 = Double.parseDouble(jTFTela.getText());
        jTFTela.setText("");
        operacao = "soma";
    }//GEN-LAST:event_BTsomaActionPerformed

    private void BTonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTonActionPerformed
        CalculadoraIMC IMC = new CalculadoraIMC();
        IMC.setVisible(true);
        dispose(); 
        IMC.setResizable(false);
        IMC.setLocationRelativeTo(null);
        IMC.setDefaultCloseOperation(IMC.DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_BTonActionPerformed

    private void jTFTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelaActionPerformed

    private void BT0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT0ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "0");
    }//GEN-LAST:event_BT0ActionPerformed

    private void BT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT1ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "1");
    }//GEN-LAST:event_BT1ActionPerformed

    private void BT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT2ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "2");
    }//GEN-LAST:event_BT2ActionPerformed

    private void BT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT3ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "3");
    }//GEN-LAST:event_BT3ActionPerformed

    private void BT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT4ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "4");
    }//GEN-LAST:event_BT4ActionPerformed

    private void BT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT5ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "5");
    }//GEN-LAST:event_BT5ActionPerformed

    private void BT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT6ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "6");
    }//GEN-LAST:event_BT6ActionPerformed

    private void BT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT7ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "7");
    }//GEN-LAST:event_BT7ActionPerformed

    private void BT8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT8ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "8");
    }//GEN-LAST:event_BT8ActionPerformed

    private void BT9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT9ActionPerformed
        jTFTela.setText(jTFTela.getText()+ "9");
    }//GEN-LAST:event_BT9ActionPerformed

    private void BTvirguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTvirguActionPerformed
        jTFTela.setText(jTFTela.getText()+ ".");
    }//GEN-LAST:event_BTvirguActionPerformed

    private void BTlimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTlimpaActionPerformed
        jTFTela.setText("");
    }//GEN-LAST:event_BTlimpaActionPerformed

    private void BTmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTmenosActionPerformed
         valor1 = Double.parseDouble(jTFTela.getText());
        jTFTela.setText(" ");
        operacao = "subtração";
    }//GEN-LAST:event_BTmenosActionPerformed

    private void BTmultipliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTmultipliActionPerformed
         valor1 = Double.parseDouble(jTFTela.getText());
        jTFTela.setText(" ");
        operacao = "multiplicação";
    }//GEN-LAST:event_BTmultipliActionPerformed

    private void BTdivisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTdivisActionPerformed
         valor1 = Double.parseDouble(jTFTela.getText());
        jTFTela.setText(" ");
        operacao = "divisão";
    }//GEN-LAST:event_BTdivisActionPerformed

    private void BTigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTigualActionPerformed
        if (jTFTela.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um número!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return; 
    }
        valor2 = Double.parseDouble(jTFTela.getText());
         
         if(operacao == "soma"){
             jTFTela.setText(String.valueOf(valor1 + valor2));
         }
         else if (operacao == "subtração"){
             jTFTela.setText(String.valueOf(valor1 - valor2));
         }
         else if (operacao == "multiplicação"){
             jTFTela.setText(String.valueOf(valor1 * valor2));
         }
          else if (operacao == "divisão"){
              if(valor2 != 0){
                jTFTela.setText(String.valueOf(valor1 / valor2));
         }
              else{
                   jTFTela.setText("Não pode dividir por 0");
              }
          }
         operacao = "";
    }//GEN-LAST:event_BTigualActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Calculadora calcula = new Calculadora();
                calcula.setVisible(true);
                calcula.setResizable(false);
                calcula.setLocationRelativeTo(null);
                calcula.setDefaultCloseOperation(calcula.DO_NOTHING_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT0;
    private javax.swing.JButton BT1;
    private javax.swing.JButton BT2;
    private javax.swing.JButton BT3;
    private javax.swing.JButton BT4;
    private javax.swing.JButton BT5;
    private javax.swing.JButton BT6;
    private javax.swing.JButton BT7;
    private javax.swing.JButton BT8;
    private javax.swing.JButton BT9;
    private javax.swing.JButton BTdivis;
    private javax.swing.JButton BTigual;
    private javax.swing.JButton BTlimpa;
    private javax.swing.JButton BTmenos;
    private javax.swing.JButton BTmultipli;
    private javax.swing.JButton BTon;
    private javax.swing.JButton BTsoma;
    private javax.swing.JButton BTvirgu;
    private javax.swing.JButton jButton13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFTela;
    // End of variables declaration//GEN-END:variables
}
