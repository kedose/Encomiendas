/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package encomiendas.views.usuarios;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author USER-PC
 */
public class RegistroAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public RegistroAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondoRegistroAdministrador = new javax.swing.JPanel();
        jLLlenadoObligatorio = new javax.swing.JLabel();
        jLCreaciónEncomiendas = new javax.swing.JLabel();
        jTFNombresAdministrador = new javax.swing.JTextField();
        jTFApellidosAdministrador = new javax.swing.JTextField();
        jTFCorreoAdministrador = new javax.swing.JTextField();
        jTFCédulaAdministrador = new javax.swing.JTextField();
        jTFContraseñaAdministrador = new javax.swing.JTextField();
        jTFTeléfonoPAdministrador = new javax.swing.JTextField();
        jTFTeléfonoSAdministrador = new javax.swing.JTextField();
        jTFDireccion = new javax.swing.JTextField();
        jBRegistroAdministrador = new javax.swing.JButton();
        logoRegistro = new javax.swing.JLabel();
        jCBCiudad = new javax.swing.JComboBox<>();
        jLIngresoDatosAdministrador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);

        jPFondoRegistroAdministrador.setBackground(new java.awt.Color(37, 37, 58));
        jPFondoRegistroAdministrador.setForeground(new java.awt.Color(153, 153, 153));
        jPFondoRegistroAdministrador.setMinimumSize(new java.awt.Dimension(320, 420));
        jPFondoRegistroAdministrador.setPreferredSize(new java.awt.Dimension(320, 420));
        jPFondoRegistroAdministrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLLlenadoObligatorio.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLLlenadoObligatorio.setForeground(new java.awt.Color(204, 204, 204));
        jLLlenadoObligatorio.setText("Llena los datos obligatorios :");
        jPFondoRegistroAdministrador.add(jLLlenadoObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        jLCreaciónEncomiendas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLCreaciónEncomiendas.setForeground(new java.awt.Color(255, 255, 255));
        jLCreaciónEncomiendas.setText("Creación encomiendas");
        jPFondoRegistroAdministrador.add(jLCreaciónEncomiendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jTFNombresAdministrador.setForeground(new java.awt.Color(153, 153, 153));
        jTFNombresAdministrador.setText("Nombres");
        jTFNombresAdministrador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFNombresAdministradorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNombresAdministradorFocusLost(evt);
            }
        });
        jPFondoRegistroAdministrador.add(jTFNombresAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, -1));

        jTFApellidosAdministrador.setForeground(new java.awt.Color(153, 153, 153));
        jTFApellidosAdministrador.setText("Apellidos");
        jTFApellidosAdministrador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFApellidosAdministradorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFApellidosAdministradorFocusLost(evt);
            }
        });
        jPFondoRegistroAdministrador.add(jTFApellidosAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 270, -1));

        jTFCorreoAdministrador.setForeground(new java.awt.Color(153, 153, 153));
        jTFCorreoAdministrador.setText("Correo");
        jTFCorreoAdministrador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFCorreoAdministradorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCorreoAdministradorFocusLost(evt);
            }
        });
        jPFondoRegistroAdministrador.add(jTFCorreoAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 270, -1));

        jTFCédulaAdministrador.setForeground(new java.awt.Color(153, 153, 153));
        jTFCédulaAdministrador.setText("Cédula");
        jTFCédulaAdministrador.setToolTipText("");
        jTFCédulaAdministrador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFCédulaAdministradorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFCédulaAdministradorFocusLost(evt);
            }
        });
        jPFondoRegistroAdministrador.add(jTFCédulaAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, -1));

        jTFContraseñaAdministrador.setForeground(new java.awt.Color(153, 153, 153));
        jTFContraseñaAdministrador.setText("Contraseña");
        jTFContraseñaAdministrador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFContraseñaAdministradorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFContraseñaAdministradorFocusLost(evt);
            }
        });
        jPFondoRegistroAdministrador.add(jTFContraseñaAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, -1));

        jTFTeléfonoPAdministrador.setForeground(new java.awt.Color(153, 153, 153));
        jTFTeléfonoPAdministrador.setText("Teléfono");
        jTFTeléfonoPAdministrador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFTeléfonoPAdministradorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFTeléfonoPAdministradorFocusLost(evt);
            }
        });
        jPFondoRegistroAdministrador.add(jTFTeléfonoPAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 170, -1));

        jTFTeléfonoSAdministrador.setForeground(new java.awt.Color(153, 153, 153));
        jTFTeléfonoSAdministrador.setText("Teléfono Secundario");
        jTFTeléfonoSAdministrador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFTeléfonoSAdministradorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFTeléfonoSAdministradorFocusLost(evt);
            }
        });
        jPFondoRegistroAdministrador.add(jTFTeléfonoSAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 180, -1));

        jTFDireccion.setForeground(new java.awt.Color(153, 153, 153));
        jTFDireccion.setText("Dirección");
        jTFDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFDireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFDireccionFocusLost(evt);
            }
        });
        jTFDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDireccionActionPerformed(evt);
            }
        });
        jPFondoRegistroAdministrador.add(jTFDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 170, -1));

        jBRegistroAdministrador.setBackground(new java.awt.Color(223, 216, 241));
        jBRegistroAdministrador.setText("Registro Administrador");
        jBRegistroAdministrador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 51), new java.awt.Color(0, 0, 51), null, null));
        jBRegistroAdministrador.setFocusable(false);
        jBRegistroAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistroAdministradorActionPerformed(evt);
            }
        });
        jPFondoRegistroAdministrador.add(jBRegistroAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 150, 20));

        logoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoPequenio.jpg"))); // NOI18N
        jPFondoRegistroAdministrador.add(logoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jCBCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quito", "Guayaquil", "Cuenca" }));
        jCBCiudad.setToolTipText("");
        jCBCiudad.setFocusable(false);
        jPFondoRegistroAdministrador.add(jCBCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 90, -1));

        jLIngresoDatosAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLIngresoDatosAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLIngresoDatosAdministrador.setText("Ingreso de datos Administrador");
        jPFondoRegistroAdministrador.add(jLIngresoDatosAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPFondoRegistroAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondoRegistroAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNombresAdministradorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombresAdministradorFocusGained
        // TODO add your handling code here:
        if (jTFNombresAdministrador.getText().equals("Nombres")) {
        jTFNombresAdministrador.setText("");
        jTFNombresAdministrador.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTFNombresAdministradorFocusGained
//funciones para poner un texto provicional en un txt
    private void jTFNombresAdministradorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNombresAdministradorFocusLost
        // TODO add your handling code here:
        if (jTFNombresAdministrador.getText().isEmpty()) {
        jTFNombresAdministrador.setForeground(Color.GRAY);
        jTFNombresAdministrador.setText("Nombres");
        }
    }//GEN-LAST:event_jTFNombresAdministradorFocusLost

    private void jTFApellidosAdministradorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFApellidosAdministradorFocusGained
        // TODO add your handling code here:
        if (jTFApellidosAdministrador.getText().equals("Apellidos")) {
        jTFApellidosAdministrador.setText("");
        jTFApellidosAdministrador.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTFApellidosAdministradorFocusGained

    private void jTFApellidosAdministradorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFApellidosAdministradorFocusLost
        // TODO add your handling code here:
        if (jTFApellidosAdministrador.getText().isEmpty()) {
        jTFApellidosAdministrador.setForeground(Color.GRAY);
        jTFApellidosAdministrador.setText("Apellidos");
        }
    }//GEN-LAST:event_jTFApellidosAdministradorFocusLost

    private void jTFCorreoAdministradorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCorreoAdministradorFocusGained
        // TODO add your handling code here:
        if (jTFCorreoAdministrador.getText().equals("Correo")) {
        jTFCorreoAdministrador.setText("");
        jTFCorreoAdministrador.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTFCorreoAdministradorFocusGained

    private void jTFCorreoAdministradorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCorreoAdministradorFocusLost
        // TODO add your handling code here:
        if (jTFCorreoAdministrador.getText().isEmpty()) {
        jTFCorreoAdministrador.setForeground(Color.GRAY);
        jTFCorreoAdministrador.setText("Correo");
        }
    }//GEN-LAST:event_jTFCorreoAdministradorFocusLost

    private void jTFCédulaAdministradorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCédulaAdministradorFocusGained
        // TODO add your handling code here:
        if (jTFCédulaAdministrador.getText().equals("Cédula")) {
        jTFCédulaAdministrador.setText("");
        jTFCédulaAdministrador.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTFCédulaAdministradorFocusGained

    private void jTFCédulaAdministradorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFCédulaAdministradorFocusLost
        // TODO add your handling code here:
        if (jTFCédulaAdministrador.getText().isEmpty()) {
        jTFCédulaAdministrador.setForeground(Color.GRAY);
        jTFCédulaAdministrador.setText("Cédula");
        }
    }//GEN-LAST:event_jTFCédulaAdministradorFocusLost

    private void jTFContraseñaAdministradorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFContraseñaAdministradorFocusGained
        // TODO add your handling code here:
        if (jTFContraseñaAdministrador.getText().equals("Contraseña")) {
        jTFContraseñaAdministrador.setText("");
        jTFContraseñaAdministrador.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTFContraseñaAdministradorFocusGained

    private void jTFContraseñaAdministradorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFContraseñaAdministradorFocusLost
        // TODO add your handling code here:
        if (jTFContraseñaAdministrador.getText().isEmpty()) {
        jTFContraseñaAdministrador.setForeground(Color.GRAY);
        jTFContraseñaAdministrador.setText("Contraseña");
        }
    }//GEN-LAST:event_jTFContraseñaAdministradorFocusLost

    private void jTFTeléfonoPAdministradorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFTeléfonoPAdministradorFocusGained
        // TODO add your handling code here:
        if (jTFTeléfonoPAdministrador.getText().equals("Teléfono")) {
        jTFTeléfonoPAdministrador.setText("");
        jTFTeléfonoPAdministrador.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTFTeléfonoPAdministradorFocusGained

    private void jTFTeléfonoPAdministradorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFTeléfonoPAdministradorFocusLost
        // TODO add your handling code here:
        if (jTFTeléfonoPAdministrador.getText().isEmpty()) {
        jTFTeléfonoPAdministrador.setForeground(Color.GRAY);
        jTFTeléfonoPAdministrador.setText("Teléfono");
        }
    }//GEN-LAST:event_jTFTeléfonoPAdministradorFocusLost

    private void jTFTeléfonoSAdministradorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFTeléfonoSAdministradorFocusGained
        // TODO add your handling code here:
        if (jTFTeléfonoSAdministrador.getText().equals("Teléfono Adicional")) {
        jTFTeléfonoSAdministrador.setText("");
        jTFTeléfonoSAdministrador.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTFTeléfonoSAdministradorFocusGained

    private void jTFTeléfonoSAdministradorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFTeléfonoSAdministradorFocusLost
        // TODO add your handling code here:
        if (jTFTeléfonoSAdministrador.getText().isEmpty()) {
        jTFTeléfonoSAdministrador.setForeground(Color.GRAY);
        jTFTeléfonoSAdministrador.setText("Teléfono Adicional");
        }
    }//GEN-LAST:event_jTFTeléfonoSAdministradorFocusLost

    private void jTFDireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDireccionFocusGained
        // TODO add your handling code here:
        if (jTFDireccion.getText().isEmpty()) {
        jTFDireccion.setForeground(Color.GRAY);
        jTFDireccion.setText("Dirección");
        }
    }//GEN-LAST:event_jTFDireccionFocusGained

    private void jTFDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFDireccionFocusLost
        // TODO add your handling code here:
        if (jTFDireccion.getText().isEmpty()) {
        jTFDireccion.setForeground(Color.GRAY);
        jTFDireccion.setText("Dirección");
        }
    }//GEN-LAST:event_jTFDireccionFocusLost

    private void jTFDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFDireccionActionPerformed

    private void jBRegistroAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistroAdministradorActionPerformed
            //Aqui va toda la logica de creación de nuevo usuario 
            
            JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente");
            Login login= new Login();
            login.setVisible(true);
            this.dispose();
            
    }//GEN-LAST:event_jBRegistroAdministradorActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRegistroAdministrador;
    private javax.swing.JComboBox<String> jCBCiudad;
    private javax.swing.JLabel jLCreaciónEncomiendas;
    private javax.swing.JLabel jLIngresoDatosAdministrador;
    private javax.swing.JLabel jLLlenadoObligatorio;
    private javax.swing.JPanel jPFondoRegistroAdministrador;
    private javax.swing.JTextField jTFApellidosAdministrador;
    private javax.swing.JTextField jTFContraseñaAdministrador;
    private javax.swing.JTextField jTFCorreoAdministrador;
    private javax.swing.JTextField jTFCédulaAdministrador;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFNombresAdministrador;
    private javax.swing.JTextField jTFTeléfonoPAdministrador;
    private javax.swing.JTextField jTFTeléfonoSAdministrador;
    private javax.swing.JLabel logoRegistro;
    // End of variables declaration//GEN-END:variables
}