/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.calculadora.poo;

import java.awt.Color;

/**
 *
 * @author jenni
 */
public class Tela1 extends javax.swing.JFrame {

    /**
     * Creates new form Tela1
     */
    public Tela1() {
        initComponents();
        pnResultado.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbImput1 = new javax.swing.JLabel();
        tfGastoManut = new javax.swing.JTextField();
        lbImput2 = new javax.swing.JLabel();
        tfLucroPub = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        pnResultado = new javax.swing.JPanel();
        lbResultado = new javax.swing.JLabel();
        lbResultado1 = new javax.swing.JLabel();
        manutMes = new javax.swing.JLabel();
        manutAno = new javax.swing.JLabel();
        lbResultado2 = new javax.swing.JLabel();
        lbResultado3 = new javax.swing.JLabel();
        lbResultado4 = new javax.swing.JLabel();
        lucroMes = new javax.swing.JLabel();
        lucroAno = new javax.swing.JLabel();
        lbResultado5 = new javax.swing.JLabel();
        prgLucro = new javax.swing.JProgressBar();
        prgManutencao = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        lbImput1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbImput1.setForeground(new java.awt.Color(255, 255, 255));
        lbImput1.setText("Gasto atual com manutenção (mês)");

        lbImput2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbImput2.setForeground(new java.awt.Color(255, 255, 255));
        lbImput2.setText("Lucro atual com publicidade (mês)");

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Calculadora de Viabilidade Financeira");

        lbSubtitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbSubtitulo.setText("Serviços PNEU");

        pnResultado.setBackground(new java.awt.Color(51, 0, 51));

        lbResultado.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbResultado.setForeground(new java.awt.Color(250, 250, 250));
        lbResultado.setText("Economia de gastos com manutenção");

        lbResultado1.setForeground(new java.awt.Color(250, 250, 250));
        lbResultado1.setText("MÊS");

        manutMes.setForeground(new java.awt.Color(255, 255, 255));
        manutMes.setText("0");

        manutAno.setForeground(new java.awt.Color(255, 255, 255));
        manutAno.setText("0");

        lbResultado2.setForeground(new java.awt.Color(250, 250, 250));
        lbResultado2.setText("ANO");

        lbResultado3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbResultado3.setForeground(new java.awt.Color(250, 250, 250));
        lbResultado3.setText("Aumento do lucro com publicidade");

        lbResultado4.setForeground(new java.awt.Color(250, 250, 250));
        lbResultado4.setText("MÊS");

        lucroMes.setForeground(new java.awt.Color(255, 255, 255));
        lucroMes.setText("0");

        lucroAno.setForeground(new java.awt.Color(255, 255, 255));
        lucroAno.setText("0");

        lbResultado5.setForeground(new java.awt.Color(250, 250, 250));
        lbResultado5.setText("ANO");

        javax.swing.GroupLayout pnResultadoLayout = new javax.swing.GroupLayout(pnResultado);
        pnResultado.setLayout(pnResultadoLayout);
        pnResultadoLayout.setHorizontalGroup(
            pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnResultadoLayout.createSequentialGroup()
                .addGroup(pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbResultado)
                    .addGroup(pnResultadoLayout.createSequentialGroup()
                        .addComponent(lbResultado2)
                        .addGap(18, 18, 18)
                        .addComponent(manutAno, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnResultadoLayout.createSequentialGroup()
                        .addComponent(lbResultado1)
                        .addGap(18, 18, 18)
                        .addComponent(manutMes, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(prgManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142)
                .addGroup(pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prgLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnResultadoLayout.createSequentialGroup()
                        .addComponent(lbResultado5)
                        .addGap(18, 18, 18)
                        .addComponent(lucroAno, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnResultadoLayout.createSequentialGroup()
                        .addComponent(lbResultado4)
                        .addGap(18, 18, 18)
                        .addComponent(lucroMes, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbResultado3))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        pnResultadoLayout.setVerticalGroup(
            pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnResultadoLayout.createSequentialGroup()
                .addGroup(pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResultado)
                    .addComponent(lbResultado3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnResultadoLayout.createSequentialGroup()
                        .addGroup(pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbResultado1)
                            .addComponent(manutMes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbResultado2)
                            .addComponent(manutAno)))
                    .addGroup(pnResultadoLayout.createSequentialGroup()
                        .addGroup(pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbResultado4)
                            .addComponent(lucroMes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbResultado5)
                            .addComponent(lucroAno))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prgManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prgLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbImput1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                        .addComponent(lbSubtitulo)
                        .addComponent(lbTitulo)
                        .addComponent(lbImput2)
                        .addComponent(tfGastoManut)
                        .addComponent(tfLucroPub)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSubtitulo)
                .addGap(18, 18, 18)
                .addComponent(lbImput1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfGastoManut, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbImput2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfLucroPub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addGap(50, 50, 50)
                .addComponent(pnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        // Cálculo da economia em manutenção
        Double manutencao = Double.valueOf(tfGastoManut.getText());
        Double economiaManut;
        Double porcManut;
        
        if (manutencao <= 250) {
            porcManut = 10.0;
            economiaManut = manutencao * 0.1;
        } else if (manutencao > 250 && manutencao <= 500) {
            porcManut = 12.0;
            economiaManut = manutencao * 0.12;
        } else if (manutencao > 500 && manutencao <= 750) {
            porcManut = 15.0;
            economiaManut = manutencao * 0.15;
        } else {
            porcManut = 18.0;
            economiaManut = manutencao * 0.18;
        }
        
        // Cálculo do auemnto dos lucros com publicidade
        Double publicidade = Double.valueOf(tfLucroPub.getText());
        Double aumentoLucroPub;
        Double porcLucroPub;
        
        if (publicidade <= 250) {
            porcLucroPub = 20.0;
            aumentoLucroPub = publicidade * 0.2;
        } else if (publicidade > 250 && publicidade <= 500) {
            porcLucroPub = 25.0;
            aumentoLucroPub = publicidade * 0.25;
        } else if (publicidade > 500 && publicidade <= 750) {
            porcLucroPub = 30.0;
            aumentoLucroPub = publicidade * 0.3;
        } else {
            porcLucroPub = 50.0;
            aumentoLucroPub = publicidade * 0.5;
        }
        
        
        // Estilizando barras de progresso
            // Manutenção
        prgManutencao.setValue(porcManut.intValue());
        prgManutencao.setStringPainted(true);
        prgManutencao.setForeground(Color.BLACK);
            // Publicidade
        prgLucro.setValue(porcLucroPub.intValue());
        prgLucro.setStringPainted(true);
        prgLucro.setForeground(Color.BLACK);
        
        // Printando valores na tela
        manutMes.setText(String.format("R$ %.2f", economiaManut));
        manutAno.setText(String.format("R$ %.2f", economiaManut * 12));
        lucroMes.setText(String.format("R$ %.2f", aumentoLucroPub));
        lucroAno.setText(String.format("R$ %.2f", aumentoLucroPub * 12));

        pnResultado.setVisible(true);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImput1;
    private javax.swing.JLabel lbImput2;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JLabel lbResultado1;
    private javax.swing.JLabel lbResultado2;
    private javax.swing.JLabel lbResultado3;
    private javax.swing.JLabel lbResultado4;
    private javax.swing.JLabel lbResultado5;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lucroAno;
    private javax.swing.JLabel lucroMes;
    private javax.swing.JLabel manutAno;
    private javax.swing.JLabel manutMes;
    private javax.swing.JPanel pnResultado;
    private javax.swing.JProgressBar prgLucro;
    private javax.swing.JProgressBar prgManutencao;
    private javax.swing.JTextField tfGastoManut;
    private javax.swing.JTextField tfLucroPub;
    // End of variables declaration//GEN-END:variables
}
