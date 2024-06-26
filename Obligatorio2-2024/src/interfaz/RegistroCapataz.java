

// Juan Pedro Alvarez y Francisco Latorre


package interfaz;

import dominio.Sistema;
import dominio.Capataz;
import javax.swing.JOptionPane;

public class RegistroCapataz extends javax.swing.JFrame {

    private Sistema sis;

    public RegistroCapataz(Sistema unSistema) {
        sis = unSistema;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFldNombre = new javax.swing.JTextField();
        txtFldCedula = new javax.swing.JTextField();
        txtFldDireccion = new javax.swing.JTextField();
        txtFldAnoIngreso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(txtFldNombre);
        txtFldNombre.setBounds(130, 60, 210, 22);
        getContentPane().add(txtFldCedula);
        txtFldCedula.setBounds(130, 90, 210, 22);

        txtFldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtFldDireccion);
        txtFldDireccion.setBounds(130, 120, 210, 22);
        getContentPane().add(txtFldAnoIngreso);
        txtFldAnoIngreso.setBounds(130, 150, 210, 20);

        jButton1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 180, 80, 21);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Registro Capataz");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 20, 120, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Año de ingreso:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 150, 110, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Nombre:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 60, 50, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Cedula:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 90, 50, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Direccion:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 120, 80, 20);

        setBounds(0, 0, 376, 251);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String nombre = txtFldNombre.getText();
        String cedula = txtFldCedula.getText();
        String direc = txtFldDireccion.getText();
        String anoIngresoStr = txtFldAnoIngreso.getText();

        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre debe ser un string no vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación de cédula: debe ser única
        if (cedula == null || cedula.trim().isEmpty() || sis.existeCedulaCapataz(cedula)) {
            JOptionPane.showMessageDialog(this, "La cédula debe ser un string no vacío y única.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación de dirección: debe ser un string no vacío
        if (direc == null || direc.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La dirección debe ser un string no vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (anoIngresoStr == null || anoIngresoStr.trim().isEmpty() || !anoIngresoStr.matches("\\d{4}") || Integer.parseInt(anoIngresoStr) < 1970 || Integer.parseInt(anoIngresoStr) > 2030) {
            JOptionPane.showMessageDialog(this, "El año de ingreso debe ser un número válido de 4 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int anoIngreso = Integer.valueOf(anoIngresoStr);
        Capataz c1 = new Capataz(nombre, cedula, direc, anoIngreso);
        sis.addCapataz(c1);
        txtFldNombre.setText("");
        txtFldAnoIngreso.setText("");
        txtFldCedula.setText("");
        txtFldDireccion.setText("");
        JOptionPane.showMessageDialog(this, "Capataz registrado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldDireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtFldAnoIngreso;
    private javax.swing.JTextField txtFldCedula;
    private javax.swing.JTextField txtFldDireccion;
    private javax.swing.JTextField txtFldNombre;
    // End of variables declaration//GEN-END:variables
}
