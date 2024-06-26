// Juan Pedro Alvarez y Francisco Latorre
package interfaz;

import dominio.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import dominio.ArchivoGrabacion;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    private Sistema sis;

    //Serializacion cuando se cierra la ventana
    public MenuPrincipal(Sistema unSistema) {
        sis = unSistema;
        initComponents();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    serializacion();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void serializacion() throws FileNotFoundException, IOException {
        FileOutputStream f = new FileOutputStream("archivo.ser");
        BufferedOutputStream b = new BufferedOutputStream(f);
        ObjectOutputStream s = new ObjectOutputStream(b);
        s.writeObject(sis);
        s.close();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        btnRegistrarRubro = new javax.swing.JMenuItem();
        btnRegistrarCapataz = new javax.swing.JMenuItem();
        btnRegistrarPropietario = new javax.swing.JMenuItem();
        btnRegistroObra = new javax.swing.JMenuItem();
        btnRegistroGastoObra = new javax.swing.JMenu();
        btnRegistroGasto = new javax.swing.JMenuItem();
        btnPagoGasto = new javax.swing.JMenuItem();
        btnEstadoObra = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        btnImportacionDatos = new javax.swing.JMenuItem();
        btnExportacionDatos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Registros");

        btnRegistrarRubro.setMnemonic('o');
        btnRegistrarRubro.setText("Registrar / Modificar rubro");
        btnRegistrarRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarRubroActionPerformed(evt);
            }
        });
        fileMenu.add(btnRegistrarRubro);

        btnRegistrarCapataz.setMnemonic('s');
        btnRegistrarCapataz.setText("Registrar capataz");
        btnRegistrarCapataz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCapatazActionPerformed(evt);
            }
        });
        fileMenu.add(btnRegistrarCapataz);

        btnRegistrarPropietario.setMnemonic('a');
        btnRegistrarPropietario.setText("Registro de propietario");
        btnRegistrarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPropietarioActionPerformed(evt);
            }
        });
        fileMenu.add(btnRegistrarPropietario);

        btnRegistroObra.setMnemonic('x');
        btnRegistroObra.setText("Registro de obra");
        btnRegistroObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroObraActionPerformed(evt);
            }
        });
        fileMenu.add(btnRegistroObra);

        menuBar.add(fileMenu);

        btnRegistroGastoObra.setMnemonic('e');
        btnRegistroGastoObra.setText("Gastos");

        btnRegistroGasto.setMnemonic('t');
        btnRegistroGasto.setText("Registro de gasto para obra");
        btnRegistroGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroGastoActionPerformed(evt);
            }
        });
        btnRegistroGastoObra.add(btnRegistroGasto);

        btnPagoGasto.setMnemonic('y');
        btnPagoGasto.setText("Pago de gasto");
        btnPagoGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoGastoActionPerformed(evt);
            }
        });
        btnRegistroGastoObra.add(btnPagoGasto);

        btnEstadoObra.setMnemonic('p');
        btnEstadoObra.setText("Estado de obra");
        btnEstadoObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoObraActionPerformed(evt);
            }
        });
        btnRegistroGastoObra.add(btnEstadoObra);

        menuBar.add(btnRegistroGastoObra);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Importacion y Exportacion");

        btnImportacionDatos.setMnemonic('c');
        btnImportacionDatos.setText("Importacion de datos para obra nueva");
        btnImportacionDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportacionDatosActionPerformed(evt);
            }
        });
        helpMenu.add(btnImportacionDatos);

        btnExportacionDatos.setMnemonic('a');
        btnExportacionDatos.setText("Exportacion de datos de Propietarios y Capataces");
        btnExportacionDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportacionDatosActionPerformed(evt);
            }
        });
        helpMenu.add(btnExportacionDatos);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        setBounds(0, 0, 671, 423);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroObraActionPerformed
        new RegistroObra(sis).setVisible(true);
    }//GEN-LAST:event_btnRegistroObraActionPerformed

    private void btnExportacionDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportacionDatosActionPerformed
        Exportacion pantExportacion = new Exportacion(sis);
        pantExportacion.setVisible(true);
    }//GEN-LAST:event_btnExportacionDatosActionPerformed

    private void btnRegistrarCapatazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCapatazActionPerformed
        new RegistroCapataz(sis).setVisible(true);
    }//GEN-LAST:event_btnRegistrarCapatazActionPerformed

    private void btnRegistrarRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarRubroActionPerformed
        new RegistroRubro(sis).setVisible(true);
    }//GEN-LAST:event_btnRegistrarRubroActionPerformed

    private void btnRegistrarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPropietarioActionPerformed
        new RegistroPropietario(sis).setVisible(true);
    }//GEN-LAST:event_btnRegistrarPropietarioActionPerformed

    private void btnRegistroGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroGastoActionPerformed
        new RegistroGastoObra(sis).setVisible(true);
    }//GEN-LAST:event_btnRegistroGastoActionPerformed

    private void btnPagoGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoGastoActionPerformed
        new PagoGastos(sis).setVisible(true);
    }//GEN-LAST:event_btnPagoGastoActionPerformed

    private void btnEstadoObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoObraActionPerformed
        new EstadoObra(sis).setVisible(true);
    }//GEN-LAST:event_btnEstadoObraActionPerformed

    private void btnImportacionDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportacionDatosActionPerformed
        JFileChooser fc = new JFileChooser();
        //Abre explorador de archivos
        int seleccion = fc.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();

            ArchivoLectura arch = new ArchivoLectura(fichero.getAbsolutePath());
            if (arch.hayMasLineas()) {

                String[] lin = arch.linea().split("#");

                String cedulaCap = lin[0];
                if (!sis.existeCedulaCapataz(cedulaCap)) {
                    JOptionPane.showMessageDialog(this, "Cedula de capataz no registrada en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
                    arch.cerrar();
                    return;
                }
                String cedulaProp = lin[1];
                if (!sis.existeCedulaPropietario(cedulaProp)) {
                    JOptionPane.showMessageDialog(this, "Cedula de propietario no registrada en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
                    arch.cerrar();
                    return;
                }
                String direccion = lin[2];
                int mes = Integer.parseInt(lin[3]);
                int ano = Integer.parseInt(lin[4]);
                int numPermiso = Integer.parseInt(lin[5]);
                int unPresupuesto = 0;
                Capataz capataz = sis.getCapatazPorCedula(cedulaCap);
                Propietario propietario = sis.getPropietarioPorCedula(cedulaProp);

                Obra nuevaObra = new Obra(propietario, capataz, numPermiso, direccion, mes, ano, unPresupuesto);

                if (arch.hayMasLineas()) {
                    int cantidadRubros = Integer.parseInt(arch.linea());

                    for (int i = 0; i < cantidadRubros; i++) {
                        if (arch.hayMasLineas()) {
                            String[] rubroData = arch.linea().split("#");
                            String nombreRubro = rubroData[0];
                            Rubro rubro = null;
                            if(!sis.existeRubro(nombreRubro)){
                                rubro = new Rubro(nombreRubro, "Descripcion a Definir");
                            }else{
                                rubro = sis.getRubroPorNombre(nombreRubro);
                            }
                            int monto = Integer.parseInt(rubroData[1]);
                            unPresupuesto += monto;
                            
                            CostoRubro costoRubro = new CostoRubro(rubro, monto);

                            nuevaObra.addRubroAObra(costoRubro);
                        }
                    }
                }
                nuevaObra.setPresupuesto(unPresupuesto);
                //Agrega obra, muy parecido a codigo de registrar obra
                sis.addObra(nuevaObra);
                JOptionPane.showMessageDialog(this, "Obra registrada exitosamente.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            }

            arch.cerrar();
        }
    }//GEN-LAST:event_btnImportacionDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnEstadoObra;
    private javax.swing.JMenuItem btnExportacionDatos;
    private javax.swing.JMenuItem btnImportacionDatos;
    private javax.swing.JMenuItem btnPagoGasto;
    private javax.swing.JMenuItem btnRegistrarCapataz;
    private javax.swing.JMenuItem btnRegistrarPropietario;
    private javax.swing.JMenuItem btnRegistrarRubro;
    private javax.swing.JMenuItem btnRegistroGasto;
    private javax.swing.JMenu btnRegistroGastoObra;
    private javax.swing.JMenuItem btnRegistroObra;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
