package com.mycompany.hospital.igu;

import com.mycompany.hospital.logica.ControladoraLogica;
import com.mycompany.hospital.logica.Paciente;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Consultas2 extends javax.swing.JFrame {

     ControladoraLogica logica = null;
     
     
    public Consultas2() {
        logica = new ControladoraLogica();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRecetas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verificacion-de-antecedentes.png"))); // NOI18N
        jLabel2.setText("Consulta por Id");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnBuscar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/verificar.png"))); // NOI18N
        btnSalir.setText("Regresar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaPacientes);

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 0, 48)); // NOI18N
        jLabel1.setText("Dra.Cuevas");

        btnRecetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/receta.png"))); // NOI18N
        btnRecetas.setText("Recetas");
        btnRecetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(525, 525, 525)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRecetas, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecetas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //Crear variables auxiliares
        int id_buscar = Integer.parseInt(txtBuscar.getText());

        Busqueda buscar = new Busqueda(id_buscar);
        buscar.setVisible(true);
        buscar.setLocationRelativeTo(null);

        this.dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //Variable de confirmacion de eliminacion
        int codigo = 0;
        //Verificar si la tabla no esta vacia
        if(tablaPacientes.getRowCount() > 0){
            //Verificamos que se selecciono un fila (registro a eliminar)
            if(tablaPacientes.getSelectedRow()!=-1){

                //Mensaje de confirmacion de la eliminacion
                codigo=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "Info", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (codigo==JOptionPane.YES_OPTION){

                    //obtener el id del auto a eliminar
                    //Realizamos un parseo del dato
                    int idEliminar = Integer.parseInt(
                        //realizamos un cambio a un valo String
                        String.valueOf(
                            //Obtenemos el valor de la fila especifica seleccionada
                            tablaPacientes.getValueAt(tablaPacientes.getSelectedRow(), 0)));

                    logica.borrarPaciente(idEliminar);
                    //Cargamos el mensaje
                    mostrarMensaje("Registro Borrado Exitosamente", "info", "Eliminacion");
                    //Cargamos nuevamente la tabla
                    cargarTabla();

                }
                else if(codigo==JOptionPane.NO_OPTION){
                    System.out.println("Has pulsado en NO");
                }
            }
            else{
                mostrarMensaje("No selecciono ningun registro", "Error ", "Error ");
            }
        }else{
            mostrarMensaje("La tabla esta vacia ", "Error ", "Error ");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Verificamos que la tabla no este vacia
        if(tablaPacientes.getRowCount() > 0){
            //Verificamos que este seleccionado un registro
            if(tablaPacientes.getSelectedRow()!=-1){

                //Obtener el id a modificar
                int id_paciente = Integer.parseInt(
                    String.valueOf(
                        tablaPacientes.getValueAt(
                            tablaPacientes.getSelectedRow(),0)));

//                Mandamos llamar el nuevo Formulario
                                Modificar modif = new Modificar(id_paciente);
                                modif.setVisible(true);
                                modif.setLocationRelativeTo(null);

                //Cerramos la venta
                this.dispose();

            }
            else{
                mostrarMensaje("No selecciono ningun registro", "Error", "Error");
            }
        }
        else{
            mostrarMensaje("Error: Tabla vacia", "error", "Error");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnRecetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetasActionPerformed
        // Verificamos que la tabla no este vacia
        if(tablaPacientes.getRowCount() > 0){
            //Verificamos que este seleccionado un registro
            if(tablaPacientes.getSelectedRow()!=-1){

                //Obtener el id a modificar
                int id_paciente = Integer.parseInt(
                    String.valueOf(
                        tablaPacientes.getValueAt(
                            tablaPacientes.getSelectedRow(),0)));


////                Abrimos formulario de recetas 
                Receta receta = new Receta(id_paciente);
                receta.setVisible(true);
                receta.setLocationRelativeTo(null);

//                 
//                 p2 p = new p2();
//                 p.setVisible(true);
//                 p.setLocationRelativeTo(null);

         

            }
            else{
                mostrarMensaje("No selecciono ningun registro", "Error", "Error");
            }
        }
        else{
            mostrarMensaje("Error: Tabla vacia", "error", "Error");
        }
        
        
    }//GEN-LAST:event_btnRecetasActionPerformed
 
    
    
    private void cargarTabla() {
         //hacer que las filas y columnas no sean editables
        DefaultTableModel tabla = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row,int column) {
                return false;
            }
            
        };
        
        //Titutulos de las columnas
        String titulos[] = {
              "id",
              "nombre",
              " apellidoPaterno",
              " apllidoMaterno",
              "signos",
              "alergias",
              "enferCronica",
              "cirugias",
              "fecha_Registro"
            };
        
        tabla.setColumnIdentifiers(titulos);
        
        List<Paciente> listaPacientes = logica.traerPacientes();
        
        //Seteamos los datos de la lista de automoviles
        //Verificamos si la lista esta vacia
        if(listaPacientes != null){
            for (Paciente pac : listaPacientes) {
            //Creamos un array de tipo Obect y obtenemos los valores de la BD
            Object[] object = {
                pac.getId_paciente(),
                   pac.getNombre(),
                   pac.getApellidoPaterno(),
                   pac.getApllidoMaterno(),
                   pac.getEdad(),
                   
                   pac.getSignos(),
                   pac.getAlergias(),
                   pac.getEnferCronica(),
                   pac.getFecha()
                  
                };
               //Agregamos a la tabla el objecto con los dato del Auto
               tabla.addRow(object);
            }
        }
        
        //Le asignamos a la tabla del form, los datos de las columnas
        tablaPacientes.setModel(tabla);

    } 
        //Mensajes Ventanas Emergentes
    //Creamos el metodo del mensaje
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
       //creamos una instancia del JoptionPane
        JOptionPane optionpane = new JOptionPane(mensaje);
        //El if controla el tipo de icono para la ventana
        if(tipo.equalsIgnoreCase("info")){
            optionpane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if (tipo.equalsIgnoreCase("Error")) {
            optionpane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        //Una instancia de dialog
        JDialog dialog = optionpane.createDialog(titulo);
        dialog.setVisible(true);
        dialog.setAlwaysOnTop(true);
            
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRecetas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPacientes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
