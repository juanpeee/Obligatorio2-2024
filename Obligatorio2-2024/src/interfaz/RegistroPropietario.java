

// Juan Pedro Alvarez y Francisco Latorre


package interfaz;

import dominio.Sistema;
import dominio.Propietario;
import javax.swing.JOptionPane;

public class RegistroPropietario extends javax.swing.JFrame {

    private Sistema sis;

    public RegistroPropietario(Sistema unSistema) {
        sis = unSistema;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFldNombre = new javax.swing.JTextField();
        txtFldCedul = new javax.swing.JTextField();
        txtFldDireccion = new javax.swing.JTextField();
        txtFldNroCont = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(txtFldNombre);
        txtFldNombre.setBounds(130, 60, 190, 20);
        getContentPane().add(txtFldCedul);
        txtFldCedul.setBounds(130, 90, 190, 22);
        getContentPane().add(txtFldDireccion);
        txtFldDireccion.setBounds(130, 120, 190, 22);

        txtFldNroCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldNroContActionPerformed(evt);
            }
        });
        getContentPane().add(txtFldNroCont);
        txtFldNroCont.setBounds(130, 150, 190, 22);

        botonRegistrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar);
        botonRegistrar.setBounds(290, 180, 90, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Registro de propietario");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 20, 186, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("número de celular:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 150, 110, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 60, 50, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Cedula:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 90, 50, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Dirección:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 120, 80, 20);

        setBounds(0, 0, 409, 243);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFldNroContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldNroContActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldNroContActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        String nombre = txtFldNombre.getText();
        String cedulaStr = txtFldCedul.getText();
        String direc = txtFldDireccion.getText();
        String nroContStr = txtFldNroCont.getText();

        // Validaciones basicas para que el usuario no ingrese cualquier cosa
        if (nombre == null || nombre.trim().isEmpty() || !nombre.matches("[a-zA-Z\\s]+")) {
            JOptionPane.showMessageDialog(this, "El nombre debe ser un string no vacío y solo contener letras.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

      
        if (cedulaStr == null || cedulaStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La cédula debe ser un String no vacio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(sis.existeCedulaPropietario(cedulaStr)){
            JOptionPane.showMessageDialog(this, "La cedula ya ha sido ingresada" , "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        if (direc == null || direc.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "La dirección debe ser un string no vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        if (nroContStr == null || nroContStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El número de contacto debe ser un número de 9 dígitos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int nroCont = Integer.valueOf(nroContStr);
        Propietario p1 = new Propietario(nombre, cedulaStr, direc, nroCont);
        sis.addPropietario(p1);
        txtFldNombre.setText("");
        txtFldCedul.setText("");
        txtFldDireccion.setText("");
        txtFldNroCont.setText("");
        JOptionPane.showMessageDialog(this, "Propietario registrado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_botonRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtFldCedul;
    private javax.swing.JTextField txtFldDireccion;
    private javax.swing.JTextField txtFldNombre;
    private javax.swing.JTextField txtFldNroCont;
    // End of variables declaration//GEN-END:variables
}
