

// Juan Pedro Alvarez y Francisco Latorre


package interfaz;

import dominio.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;


public class EstadoObra extends javax.swing.JFrame implements Observer {

    private Sistema sis;
    static Color colorSalmon = Color.decode("#ffcc64");
    static Color colorRosado = Color.decode("#ff9c9c");
    static Color colorVerdeClaro = Color.decode("#d0fccc");

    public class CustomRubroPresupuestadoCellRenderer extends JPanel implements ListCellRenderer<CostoRubro> {

        private JLabel label;

        public CustomRubroPresupuestadoCellRenderer() {
            setLayout(new BorderLayout());
            label = new JLabel();
            label.setFont(new Font("Serif", Font.PLAIN, 14));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            add(label, BorderLayout.CENTER);
            setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends CostoRubro> list,
                CostoRubro value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {
            label.setText("• " + value.getRubro() + " $ " + value.getPresupuesto());

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                label.setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                label.setForeground(list.getForeground());
            }

            return this;
        }
    }

    public class CustomListaRubroGastoCellRenderer extends JPanel implements ListCellRenderer<Rubro> {

        private JLabel label;

        public CustomListaRubroGastoCellRenderer() {
            setLayout(new BorderLayout());
            label = new JLabel();
            label.setFont(new Font("Arial", Font.BOLD, 12));
            add(label, BorderLayout.CENTER);
            setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        }

        @Override
        public Component getListCellRendererComponent(JList<? extends Rubro> list,
                Rubro value,
                int index,
                boolean isSelected,
                boolean cellHasFocus) {
            label.setText(value.getNombreRubro());

            if (isSelected) {
                setBackground(list.getSelectionBackground());
                label.setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                label.setForeground(list.getForeground());
            }

            return this;
        }
    }

    public EstadoObra(Sistema unSistema) {
        sis = unSistema;
        initComponents();
        modeloAPantalla();
    }

    @Override
    public void update(Observable o, Object ob) {
        modeloAPantalla();
    }

    public void modeloAPantalla() {
        jListaObras.setListData(sis.getListaObras().toArray());
        jLabel21.setBackground(Color.GREEN);
        jLabel21.setOpaque(true);
        jLabel22.setBackground(colorVerdeClaro);
        jLabel22.setOpaque(true);
        jLabel23.setBackground(colorSalmon);
        jLabel23.setOpaque(true);
        jLabel24.setBackground(colorRosado);
        jLabel24.setOpaque(true);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListaObras = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        lblPropietario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListaPresupuesto = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCapataz = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblPresupuesto = new javax.swing.JLabel();
        lblTotGastadoIntegrado = new javax.swing.JLabel();
        lblTotGastNoIntegrado = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListaRubrosConGastos = new javax.swing.JList();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaGastosDelRubros = new javax.swing.JList();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblTotalGastado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jListaObras.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListaObrasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListaObras);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 150, 100);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Propietario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 70, 50);
        getContentPane().add(lblPropietario);
        lblPropietario.setBounds(290, 20, 70, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Capataz: ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 50, 60, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Total presupuestado:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 70, 130, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Total Gastado:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 80, 90, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Total Gastado Ya Integrado:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 110, 150, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Total gastado no integrado:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 120, 150, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Saldo:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(660, 120, 50, 20);

        jScrollPane2.setViewportView(jListaPresupuesto);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 190, 180, 140);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Presupuesto (Rubros y montos):");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 160, 190, 14);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Lista obras");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 14, 70, 20);
        getContentPane().add(lblCapataz);
        lblCapataz.setBounds(510, 50, 70, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Comienzo obra:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(220, 50, 90, 20);
        getContentPane().add(lblMes);
        lblMes.setBounds(320, 50, 20, 30);
        getContentPane().add(lblPresupuesto);
        lblPresupuesto.setBounds(340, 70, 80, 30);
        getContentPane().add(lblTotGastadoIntegrado);
        lblTotGastadoIntegrado.setBounds(370, 120, 60, 20);
        getContentPane().add(lblTotGastNoIntegrado);
        lblTotGastNoIntegrado.setBounds(600, 100, 50, 20);
        getContentPane().add(lblSaldo);
        lblSaldo.setBounds(700, 120, 50, 20);

        jListaRubrosConGastos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListaRubrosConGastosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jListaRubrosConGastos);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(260, 190, 180, 140);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("Rubros con gastos en la obra:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(260, 160, 180, 14);

        jScrollPane4.setViewportView(ListaGastosDelRubros);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(490, 190, 260, 140);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel19.setText("Gastos del rubro seleccionado:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(490, 150, 270, 30);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel20.setText("Codigo de colores:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(110, 350, 120, 14);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel21.setText("Presupuesto y Reintegrado");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(250, 350, 160, 14);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel22.setText("Presupuestado y no Reintegrado");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(250, 370, 200, 14);

        jLabel23.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel23.setText("No Presupuestado y Reintegrado");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(450, 350, 190, 14);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel24.setText("No Presupuestado y No Reintegrado");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(450, 370, 210, 14);
        getContentPane().add(lblAno);
        lblAno.setBounds(350, 50, 50, 30);
        getContentPane().add(lblTotalGastado);
        lblTotalGastado.setBounds(530, 80, 80, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("/");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 50, 30, 30);

        setBounds(0, 0, 806, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void jListaObrasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListaObrasValueChanged
        Obra obraSeleccionada = (Obra) jListaObras.getSelectedValue();

        if (obraSeleccionada != null) {
            // Actualizar panel informativo de la obra
            jListaPresupuesto.setListData(obraSeleccionada.getListaRubrosObra().toArray());
            jListaPresupuesto.setCellRenderer(new CustomRubroPresupuestadoCellRenderer());
            lblPropietario.setText(obraSeleccionada.getPropietario().getNombre());
            lblCapataz.setText(obraSeleccionada.getCapataz().getNombre());
            lblMes.setText(String.valueOf(obraSeleccionada.getMesComienzo()));
            lblAno.setText(String.valueOf(obraSeleccionada.getAnoComienzo()));
            lblPresupuesto.setText(String.valueOf(obraSeleccionada.getPresupuesto()));
            lblTotalGastado.setText(String.valueOf(obraSeleccionada.getTotalGastado()));
            lblTotGastNoIntegrado.setText(String.valueOf(obraSeleccionada.getTotalGastadoNoReintegrado()));
            lblTotGastadoIntegrado.setText(String.valueOf(obraSeleccionada.getTotalGastadoReintegrado()));
            lblSaldo.setText(String.valueOf(obraSeleccionada.getTotalGastado() - obraSeleccionada.getTotalGastadoReintegrado()));

            // Actualizar lista de rubros con gastos
            ArrayList<Rubro> rubrosConGastos = new ArrayList<>();
            for (Gasto gasto : obraSeleccionada.getListaGastosNoIntegrados()) {
                if (!rubrosConGastos.contains(gasto.getRubroGasto())) {
                    rubrosConGastos.add(gasto.getRubroGasto());
                }
            }

            for (Gasto gasto : obraSeleccionada.getListaGastosReintegrados()) {
                if (!rubrosConGastos.contains(gasto.getRubroGasto())) {
                    rubrosConGastos.add(gasto.getRubroGasto());
                }
            }

            jListaRubrosConGastos.setListData(rubrosConGastos.toArray());
            jListaRubrosConGastos.setCellRenderer(new CustomListaRubroGastoCellRenderer());
        }
    }//GEN-LAST:event_jListaObrasValueChanged
    

    private void jListaRubrosConGastosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListaRubrosConGastosValueChanged
        Obra obraSeleccionada = (Obra) jListaObras.getSelectedValue();
    Rubro rubroSeleccionado = (Rubro) jListaRubrosConGastos.getSelectedValue();
    
    if (obraSeleccionada != null && rubroSeleccionado != null) {
        ArrayList<Gasto> gastosDelRubro = new ArrayList<>();
        
        for (Gasto gasto : obraSeleccionada.getListaGastosNoIntegrados()) {
            if (gasto.getRubroGasto().equals(rubroSeleccionado)) {
                gastosDelRubro.add(gasto);
            }
        }
        
        for (Gasto gasto : obraSeleccionada.getListaGastosReintegrados()) {
            if (gasto.getRubroGasto().equals(rubroSeleccionado)) {
                gastosDelRubro.add(gasto);
            }
        }

        ListaGastosDelRubros.setListData(gastosDelRubro.toArray());
        
        // Asignar colores a los gastos
        DefaultListCellRenderer renderer = new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                
                Gasto gasto = (Gasto) value;
                
                if (obraSeleccionada.getListaRubrosObra().stream().anyMatch(costoRubro -> costoRubro.getRubro().equals(rubroSeleccionado))) {
                    // El rubro está presupuestado
                    if (obraSeleccionada.getListaGastosNoIntegrados().contains(gasto)) {
                        // El gasto está en la lista de impagos
                        setBackground(colorVerdeClaro);
                    } else if (obraSeleccionada.getListaGastosReintegrados().contains(gasto)) {
                        // El gasto está en la lista de gastos reintegrados
                        setBackground(Color.green);
                    } else {
                        // El gasto no está presupuestado ni reintegrado
                        setBackground(colorRosado);
                    }
                } else {
                    // El rubro no está presupuestado
                    if (obraSeleccionada.getListaGastosNoIntegrados().contains(gasto)) {
                        // El gasto está en la lista de impagos
                        setBackground(colorRosado);
                    } else {
                        // El gasto no está presupuestado ni en la lista de impagos
                        setBackground(colorSalmon);
                    }
                }
                
                return c;
            }
        };
        ListaGastosDelRubros.setCellRenderer(renderer);
    }
    }//GEN-LAST:event_jListaRubrosConGastosValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaGastosDelRubros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListaObras;
    private javax.swing.JList jListaPresupuesto;
    private javax.swing.JList jListaRubrosConGastos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCapataz;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblPresupuesto;
    private javax.swing.JLabel lblPropietario;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTotGastNoIntegrado;
    private javax.swing.JLabel lblTotGastadoIntegrado;
    private javax.swing.JLabel lblTotalGastado;
    // End of variables declaration//GEN-END:variables
}
