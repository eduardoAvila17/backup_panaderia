
package formularios;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import programas.ver_conex;

/**
 *
 * @author mi
 */
public class ciudad extends javax.swing.JFrame {
 javax.swing.table.DefaultTableModel cursor;
   ver_conex conn = new ver_conex();
 //javax.swing.table.DefaultTableModel cursor;
  private int posreg;
    private int band = 0;
       javax.swing.table.DefaultTableModel m;
    /** Creates new form marcas */
    public ciudad() {
        
        initComponents();
         cursor = (javax.swing.table.DefaultTableModel)grilla.getModel();
        des_text();
         this.setLocationRelativeTo(null);
         hab_botones();
         cargar_grilla();
         beditar.setEnabled(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lcodigo = new javax.swing.JLabel();
        ldescripcion = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        bcancelar = new javax.swing.JButton();
        bgrabar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        beditar = new javax.swing.JButton();
        bagregar = new javax.swing.JButton();
        bborrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grilla);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lcodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lcodigo.setText("Codigo :");

        ldescripcion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ldescripcion.setText("Descripcion :");

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });

        txtdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcionActionPerformed(evt);
            }
        });
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ldescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lcodigo)
                        .addGap(57, 57, 57)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lcodigo)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ldescripcion))
                .addGap(36, 36, 36))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Ciudad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bcancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bcancelar.setText("Cancelar");
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        bgrabar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bgrabar.setText("Grabar");
        bgrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgrabarActionPerformed(evt);
            }
        });
        bgrabar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bgrabarKeyPressed(evt);
            }
        });

        bsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bsalir.setText("Salir");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        beditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        beditar.setText("Editar");
        beditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditarActionPerformed(evt);
            }
        });

        bagregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bagregar.setText("Agregar");
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });

        bborrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bborrar.setText("Borrar");
        bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bborrarActionPerformed(evt);
            }
        });
        bborrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bborrarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bcancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bagregar)
                .addGap(18, 18, 18)
                .addComponent(beditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgrabar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bborrar)
                .addGap(8, 8, 8)
                .addComponent(bcancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsalir)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
        buscar();
}//GEN-LAST:event_txtcodActionPerformed

    private void txtdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcionActionPerformed
   
       //  validar();
if(txtdescripcion.getText().trim().length()==0){
          JOptionPane.showMessageDialog(null,"EL CAMPO NO PUEDE ESTAR VACIO","AVISO",JOptionPane.ERROR_MESSAGE);
          bgrabar.setEnabled(false);
          txtdescripcion.requestFocus();
        }
        else{
        String ValidarDuplicados;
        String TextoValidar = txtdescripcion.getText().trim();
        TextoValidar.toUpperCase();
        ValidarDuplicados = "SELECT ciu_desc FROM ciudad "
                        + "WHERE trim(ciu_desc) ='"+TextoValidar+"' ";
        try
        {
        conn.sentencia = conn.conexion.createStatement();
        conn.resultado =conn.sentencia.executeQuery(ValidarDuplicados);
        if (conn.resultado.next() && band != 2) /*Esta validacion se aplica cuand*/
        {
                int Msn = JOptionPane.showOptionDialog(
                    rootPane,
                    "EXISTE UN REGISTRO CON ESTA "
                    + "DESCRIPCIÓN. ¿DESEA CANCELAR LA OPERACIÓN?",
                    "INFORMACIÓN",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[] {"Si","No"},
                    "Si");
                       this.bgrabar.setEnabled(false);
                switch (Msn + 1)
                {
                    case 1:{
                        bcancelar.doClick();} break;
                    case 2: {
                        txtdescripcion.requestFocus();} break;
                }
        }
            else
            {
        //this.tdescri.setEnabled(false);
        this.bgrabar.setEnabled(false);
        this.bgrabar.requestFocus();
            }
        }
            catch(SQLException SqlError)
            {
                JOptionPane.showMessageDialog(null,"No se ejecuto la consulta verifique parametros. "+SqlError);
            }
        }
}//GEN-LAST:event_txtdescripcionActionPerformed

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
        // TODO add your handling code here:
            int letra = (int) evt.getKeyChar();
        if (letra > 47 && letra < 58) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            getToolkit().beep();///el sonido del error
            evt.consume();////mantiene el pulsor al presionar espacio
            JOptionPane.showMessageDialog(null,"No puede Ingresar Numeros");
            txtdescripcion.requestFocus();
   
}
        if (letra == 10) // enter
        {
            //transfiere el foco si presionas enter
            bgrabar.setEnabled(true);
            bgrabar.requestFocus();

        }
}//GEN-LAST:event_txtdescripcionKeyTyped

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        
        hab_botones();
        des_text();
        borrar_text();
        txtcod.setEnabled(false);
        txtcod.setText("");
        txtdescripcion.setText("");
}//GEN-LAST:event_bcancelarActionPerformed

    private void bgrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgrabarActionPerformed
        // TODO add your handling code here:
        
            if (txtdescripcion.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo no puede "
                    + "estar vacio", "Atención", JOptionPane.WARNING_MESSAGE);
            txtdescripcion.requestFocus();
            txtdescripcion.setText("");
             bgrabar.setEnabled(false);
        } else {
            grabar();
        borrar_text();
        //des_text();
        txtdescripcion.setText("");
        txtcod.setText("");
        }
}//GEN-LAST:event_bgrabarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        // TODO add your handling code here:
        salir();
}//GEN-LAST:event_bsalirActionPerformed

    private void beditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditarActionPerformed
        // TODO add your handling code here:
        bandera="editar";
        des_botones();
         txtcod.setEnabled(true);
        txtcod.requestFocus();
        txtdescripcion.setEnabled(true);
}//GEN-LAST:event_beditarActionPerformed

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
        // TODO add your handling code here:
        bandera="agregar";
        hab_text();
        des_botones();
        txtcod.requestFocus();
        txtcod.setEnabled(false);
        gencod();
        txtdescripcion.setEnabled(true);
         txtdescripcion.requestFocus();
        txtcod.setEnabled(false);
}//GEN-LAST:event_bagregarActionPerformed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
        // TODO add your handling code here:
         eligio();
        this.bcancelar.setEnabled(true);
           this.beditar.setEnabled(true);
              this.bagregar.setEnabled(false);
    }//GEN-LAST:event_grillaMouseClicked

    private void txtdescripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyPressed
        // TODO add your handling code here:
            // TODO add your handling code here:
//            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//        if (!txtdescripcion.getText().trim().equals("")) {
//            bgrabar.setEnabled(true);
//            bgrabar.requestFocus();
//             txtdescripcion.setEnabled(false);
//        } else {
//            JOptionPane.showMessageDialog(null, "El campo no puede "
//                    + "estar vacio", "Atención", JOptionPane.WARNING_MESSAGE);
//            txtdescripcion.requestFocus();
//            txtdescripcion.setText("");
//        }
//    }
         
    }//GEN-LAST:event_txtdescripcionKeyPressed

    private void bgrabarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bgrabarKeyPressed
        // TODO add your handling code here:
//       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//        if (!txtdescripcion.getText().trim().equals("")) {
//            
//        } else {
//            JOptionPane.showMessageDialog(null, "El campo no puede "
//                    + "estar vacio", "Atención", JOptionPane.WARNING_MESSAGE);
//            txtdescripcion.requestFocus();
//            txtdescripcion.setText("");
//             bgrabar.setEnabled(false);
//        }
//    }

    }//GEN-LAST:event_bgrabarKeyPressed

    private void bborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bborrarActionPerformed
        // TODO add your handling code here:
         bandera="borrar";
         borrar();
       // txtcod.setEnabled(true);
        txtcod.requestFocus();
        txtcod.setEnabled(true);
        txtdescripcion.setEnabled(true);
    }//GEN-LAST:event_bborrarActionPerformed

    private void bborrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bborrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bborrarKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ciudad().setVisible(true);
            }
        });
    }
   
    public String bandera="" ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagregar;
    private javax.swing.JButton bborrar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton beditar;
    private javax.swing.JButton bgrabar;
    private javax.swing.JButton bsalir;
    private javax.swing.JTable grilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lcodigo;
    private javax.swing.JLabel ldescripcion;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables

 private void hab_text(){
    txtcod.setEnabled (true);
    txtdescripcion.setEnabled(true);
}
private void des_text(){
     txtcod.setEnabled (false);
    txtdescripcion.setEnabled(false);
}
private void borrar_text(){
     txtcod.setText (" ");
    txtdescripcion.setText(" ");


}
  private void des_botones() //metodo para deshabilitar botones
     {
         bagregar.setEnabled(false);
	 bborrar.setEnabled(false);
         beditar.setEnabled(false);
         bgrabar.setEnabled(false);
         bsalir.setEnabled(false);
	 bcancelar.setEnabled(true);
     }
   private void borrar() //metodo para deshabilitar botones
     {
         bagregar.setEnabled(false);
	 bborrar.setEnabled(false);
         beditar.setEnabled(false);
         bgrabar.setEnabled(true);
         bsalir.setEnabled(false);
	 bcancelar.setEnabled(true);
     }

     private void hab_botones()	// metodo para hab botones
     {
         bagregar.setEnabled(true);
	 bborrar.setEnabled(true);
         beditar.setEnabled(true);
         bgrabar.setEnabled(false);
         bsalir.setEnabled(true);
	 bcancelar.setEnabled(false);
     }
     private void gencod()
    {
        try {
            //       Main.inicio = "no";
                   ver_conex conn = new ver_conex();
                   conn.sentencia = conn.conexion.createStatement();
                   conn.resultado = conn.sentencia.executeQuery("SELECT IFNULL(MAX(ciu_cod),0)+ 1 AS xxx FROM ciudad");
                   conn.resultado.next();
                  this.txtcod.setText(conn.resultado.getString("xxx"));
        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
     //   } catch (SQLException ex)
        {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        }



        }
        
    }
  private void validar()
  {
     try {
         ver_conex conn =new ver_conex();
         conn.sentencia = conn.conexion.createStatement();
         conn.resultado = conn.sentencia.executeQuery("select * from ciudad");
         boolean encontro = conn.resultado.next();
         
         if (encontro == true) {
             JOptionPane.showMessageDialog(null, "Ya existe un registro grabado con ese Nombre","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
             
             txtdescripcion.setText("");
             txtdescripcion.requestFocus();
         }else {if(txtdescripcion.getText().trim().length()==0){
             JOptionPane.showMessageDialog(null, "El Campo no puede estar Vacio Favor verificar","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
             txtdescripcion.setText("");
             txtdescripcion.requestFocus();
         }else{
             bgrabar.setEnabled(true);
             bgrabar.requestFocus();
         }
         }
     } catch (SQLException ex) {
         Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
     }
  }
       private void grabar()
    {
        try {
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();

            if(bandera.equals("agregar"))
             {
               gencod();  // sirve para que no se dupliquen los codigos y no de error cuando se trabaja en redes
              conn.sentencia.executeUpdate("INSERT INTO ciudad(ciu_cod,ciu_desc,ciu_est) values("+txtcod.getText()+",'"+txtdescripcion.getText()+"','ACTIVO')");
             cargar_grilla();
             this.bcancelar.doClick();
             }

            if(bandera.equals("editar"))
             {
               conn.sentencia.executeUpdate("UPDATE ciudad SET ciu_desc ='"+txtdescripcion.getText()+"' WHERE ciu_cod ="+txtcod.getText());
            cargar_grilla();
             }

            JOptionPane.showMessageDialog(null, "REGISTRO GRABADO","CONFIRMACION",JOptionPane.INFORMATION_MESSAGE);
this.bcancelar.doClick();
        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
        private void buscar()
    {
        try {
           // Main.inicio = "no";
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery
       ("SELECT * FROM ciudad WHERE ciu_cod = "+txtcod.getText());
            boolean encontro = conn.resultado.next();

            if(encontro == true)
            {
                txtdescripcion.setText(conn.resultado.getString("ciu_desc"));
               

   if(bandera.equals("borrar"))
                {
                    int mensaje = JOptionPane.showConfirmDialog(this,"Deseas Borrar-->"+txtdescripcion.getText(),"Confirmar",JOptionPane.YES_NO_OPTION);
                     if(mensaje == JOptionPane.YES_OPTION)//si quiere borrar
                     {
                          conn.sentencia = conn.conexion.createStatement();
                          conn.sentencia.executeUpdate("UPDATE ciudad SET ciu_est ='Borrado' Where ciu_cod= "+txtcod.getText()+"");
                          JOptionPane.showMessageDialog(null, "El registro ha sido borrado satisfactoriamente.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    cargar_grilla();
                    }
                     else
                     {
                        JOptionPane.showMessageDialog(null, "Operacion Cancelada", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                     }
                     this.bcancelar.doClick();
                }//fin de borrar
                 if(bandera.equals("editar"))
                 {
                     txtdescripcion.setEnabled(true);
                     txtdescripcion.requestFocus();
                 }//fin de editar

       // catch (SQLException ex) {
         //   Logger.getLogger(grupos.class.getName()).log(Level.SEVERE, null, ex);
        //}            else
            } else // no encontro
            {
              JOptionPane.showMessageDialog(null, "No existe un registro con este codigo!", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

private void salir (){
     int respuesta = JOptionPane.showConfirmDialog
         (this,"DESEA SALIR","CONFIRMAR",JOptionPane.YES_NO_OPTION);
       if(respuesta == JOptionPane.YES_OPTION)
       {
	   dispose();

       }
}
// public void genreporte() //throws JRException, Exception
//    {
//        try //throws JRException, Exception
//        {
//            ver_conex conn = new ver_conex();    
//            conn.sentencia = conn.conexion.createStatement();
//            conn.resultado = conn.sentencia.executeQuery("SELECT * FROM marcas"); //OJO LE PASO LA SENTENCIA
//            JRResultSetDataSource jrRS = new JRResultSetDataSource(conn.resultado);
//
//            HashMap parameters = new HashMap();
//            URL urlMaestro = getClass().getClassLoader().getResource("reportes/marcas.jasper");
//
//            // Cargamos el reporte
//            JasperReport masterReport = null;
//            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
//            JasperPrint masterPrint = null;
//            masterPrint = JasperFillManager.fillReport(masterReport, parameters, jrRS);
//            JasperViewer ventana = new JasperViewer(masterPrint, false);
//            ventana.setTitle("Vista Previa");
//            ventana.setVisible(true);
//
//        } catch (JRException ex) {
//            Logger.getLogger(marcas.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(marcas.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }   
        
  private void cargar_grilla()
  {
      try
      {
           for (int i = grilla.getRowCount()-1; i>=0; i--)
            {
                cursor.removeRow(i);
            }
 
          
          
            ver_conex conn = new ver_conex();
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery("SELECT * from ciudad");
           
            while(conn.resultado.next())
            {
                Object[] datos = {conn.resultado.getString("ciu_cod"),conn.resultado.getString("ciu_desc"),conn.resultado.getString("ciu_est")
              //  conn.resultado.getString("cli_ape"),
                };
                cursor.addRow(datos);   
            }

        } catch (SQLException ex) {
            Logger.getLogger(ciudad.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
   public void eligio()
     {
          if (band == 0)
          {
               posreg = grilla.getSelectedRow();
               txtcod.setText(String.valueOf(this.grilla.getValueAt(posreg,0)));
               txtdescripcion.setText(String.valueOf(this.grilla.getValueAt(posreg,1)));

          }
     }
    private void comparar()
     {
            String texto;
            String ValidarDuplicados;
            texto = txtdescripcion.getText().trim();
            texto.toUpperCase();
            ValidarDuplicados="SELECT ciu_desc as descripcion FROM ciudad WHERE ciu_desc='"+texto+"'";
            try
            {
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery(ValidarDuplicados);
                int Bandera = 0;
                
            if (conn.resultado.next() && Bandera != 2)
                /*Esta validacion se aplica cuand*/
            {
              JOptionPane.showMessageDialog(null, "El registro que intenta ingresar ya existe", "Atencion", JOptionPane.ERROR_MESSAGE);  
            txtdescripcion.setEnabled(true);
            bgrabar.setEnabled(false);
            txtdescripcion.requestFocus();
            }
            else {
                    bgrabar.setEnabled(true);
                    bgrabar.requestFocus();
            }
        }
        catch(SQLException SqlError)
        {
        JOptionPane.showMessageDialog(null,"No se ejecuto la consulta verifique parametros. "+SqlError);
        }
    
    }
    
}



