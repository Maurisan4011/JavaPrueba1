package calculadora;

/**
 *
 * @author Mauri
 */
public class Claculadora extends javax.swing.JFrame {

    String memo1, signo, memo2;

    /**
     * Creates new form Claculadora
     */
    public Claculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPantalla = new java.awt.TextField();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSuma = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        txtPantalla2 = new java.awt.TextField();
        txtPantalla3 = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 700));
        setMinimumSize(new java.awt.Dimension(400, 700));
        setPreferredSize(new java.awt.Dimension(400, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        txtPantalla.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPantalla);
        txtPantalla.setBounds(10, 160, 335, 51);

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 255, 0));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(20, 320, 63, 68);

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btn0.setForeground(new java.awt.Color(0, 255, 0));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(20, 560, 63, 68);

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 255, 0));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(20, 400, 63, 68);

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btn7.setForeground(new java.awt.Color(0, 255, 0));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(20, 480, 63, 68);

        btnPunto.setBackground(new java.awt.Color(0, 0, 0));
        btnPunto.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(0, 255, 0));
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPunto);
        btnPunto.setBounds(100, 560, 63, 68);

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btn5.setForeground(new java.awt.Color(0, 255, 0));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(100, 400, 63, 68);

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btn8.setForeground(new java.awt.Color(0, 255, 0));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(100, 480, 63, 68);

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 255, 0));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(100, 320, 63, 68);

        btnResultado.setBackground(new java.awt.Color(0, 0, 0));
        btnResultado.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btnResultado.setForeground(new java.awt.Color(0, 255, 0));
        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnResultado);
        btnResultado.setBounds(180, 560, 63, 68);

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btn6.setForeground(new java.awt.Color(0, 255, 0));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(180, 400, 63, 68);

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btn9.setForeground(new java.awt.Color(0, 255, 0));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(180, 480, 63, 68);

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btn3.setForeground(new java.awt.Color(0, 255, 0));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(180, 320, 63, 68);

        btnSuma.setBackground(new java.awt.Color(0, 0, 0));
        btnSuma.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(0, 255, 0));
        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSuma);
        btnSuma.setBounds(270, 560, 63, 68);

        btnMultiplicar.setBackground(new java.awt.Color(0, 0, 0));
        btnMultiplicar.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(0, 255, 0));
        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicar);
        btnMultiplicar.setBounds(270, 400, 63, 68);

        btnMenos.setBackground(new java.awt.Color(0, 0, 0));
        btnMenos.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btnMenos.setForeground(new java.awt.Color(0, 255, 0));
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenos);
        btnMenos.setBounds(270, 480, 63, 68);

        btnDividir.setBackground(new java.awt.Color(0, 0, 0));
        btnDividir.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(0, 255, 0));
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        getContentPane().add(btnDividir);
        btnDividir.setBounds(270, 320, 63, 68);

        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 255, 0));
        jButton18.setText("CE");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(270, 230, 63, 68);

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 255, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(20, 230, 149, 68);

        jButton21.setBackground(new java.awt.Color(0, 0, 0));
        jButton21.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 255, 0));
        jButton21.setText("c");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(180, 230, 63, 72);

        txtPantalla2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtPantalla2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantalla2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPantalla2);
        txtPantalla2.setBounds(10, 80, 335, 51);

        txtPantalla3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        txtPantalla3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantalla3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPantalla3);
        txtPantalla3.setBounds(10, 10, 335, 51);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/java calcu.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 260, 240, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        txtPantalla.setText(txtPantalla.getText() + "0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        String cadena;
        cadena = txtPantalla.getText();

        if (cadena.length() <= 0) {
            txtPantalla.setText("0.");
        } else {
            if (!haypunto(txtPantalla.getText())) {

                txtPantalla.setText(txtPantalla.getText() + ".");

            }
        }


    }//GEN-LAST:event_btnPuntoActionPerformed

    public static boolean haypunto(String cadena) {
        boolean resultado;
        resultado = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i + 1).equals(".")) {
                resultado = true;
                break;

            }

        }
        return resultado;

    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        String cadena;

        cadena = txtPantalla.getText();

        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            txtPantalla.setText(cadena);
            txtPantalla2.setText("");
            txtPantalla3.setText("");
        }

    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        txtPantalla.setText("");
        txtPantalla2.setText("");
        txtPantalla3.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed

        if (!txtPantalla.getText().equals(" ")) {
            memo1 = txtPantalla.getText();
            signo = "-";
            txtPantalla.setText("");
            txtPantalla2.setText(signo);
            txtPantalla3.setText(memo1);

        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        if (!txtPantalla.getText().equals("")) {

            memo1 = txtPantalla.getText();
            signo = "+";
            txtPantalla.setText("");
            txtPantalla2.setText(signo);
            txtPantalla3.setText(memo1);
        }
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        if (!txtPantalla.getText().equals("")) {
            memo1 = txtPantalla.getText();
            signo = "*";
            txtPantalla.setText("");
            txtPantalla2.setText(signo);
            txtPantalla3.setText(memo1);

        }
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
        if (!txtPantalla.getText().equals("")) {
            memo1 = txtPantalla.getText();
            signo = "/";

            txtPantalla.setText("");
            txtPantalla2.setText(signo);
            txtPantalla3.setText(memo1);
        }


    }//GEN-LAST:event_btnDividirActionPerformed

    private void txtPantalla2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantalla2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantalla2ActionPerformed

    private void txtPantalla3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantalla3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantalla3ActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        // TODO add your handling code here: 
        String resultado;
        memo2 = txtPantalla.getText();
        if (!txtPantalla.getText().equals("")) {

            resultado = operaciones(memo1, memo2, signo);
            txtPantalla.setText(resultado);

        }


    }//GEN-LAST:event_btnResultadoActionPerformed

    public static String operaciones(String memo1, String memo2, String signo) {
        Double resultado = 0.0;
        String respuesta;

        if (signo.equals("-")) {
            resultado = Double.parseDouble(memo1) - Double.parseDouble(memo2);

        }

        if (signo.equals("+")) {
            resultado = Double.parseDouble(memo1) + Double.parseDouble(memo2);

        }

        if (signo.equals("*")) {
            resultado = Double.parseDouble(memo1) * Double.parseDouble(memo2);

        }

        if (signo.equals("/")) {
            resultado = Double.parseDouble(memo1) / Double.parseDouble(memo2);

        }

        respuesta = resultado.toString();
        return respuesta;
    }

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
            java.util.logging.Logger.getLogger(Claculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Claculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Claculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Claculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Claculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel1;
    private java.awt.TextField txtPantalla;
    private java.awt.TextField txtPantalla2;
    private java.awt.TextField txtPantalla3;
    // End of variables declaration//GEN-END:variables

}
