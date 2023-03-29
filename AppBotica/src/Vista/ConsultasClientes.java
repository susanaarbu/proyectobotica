
package Vista;

import Conexion.ConexionBD;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class ConsultasClientes extends javax.swing.JInternalFrame {
 
    public ConsultasClientes() {
        initComponents();
        txtDni.setEnabled(false);
        txtRuc.setEnabled(false);
        Cargarlistaclientes();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextFieldRound1 = new jtextfieldround.JTextFieldRound();
        jPanel1 = new javax.swing.JPanel();
        rdgenero = new javax.swing.JRadioButton();
        rddni = new javax.swing.JRadioButton();
        rdtodo = new javax.swing.JRadioButton();
        cbogenero = new javax.swing.JComboBox();
        btnbuscar = new javax.swing.JButton();
        txtDni = new jtextfieldround.JTextFieldRound();
        txtRuc = new jtextfieldround.JTextFieldRound();
        rdRuc = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        txtCantidad = new jtextfieldround.JTextFieldRound();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbclientes = new rojerusan.RSTableMetro();

        jTextFieldRound1.setText("jTextFieldRound1");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Clientes");

        jPanel1.setBackground(new java.awt.Color(251, 248, 248));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar Cliente:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11), new java.awt.Color(0, 153, 153))); // NOI18N

        buttonGroup1.add(rdgenero);
        rdgenero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdgenero.setForeground(new java.awt.Color(0, 51, 51));
        rdgenero.setSelected(true);
        rdgenero.setText("Mostrar Clientes por Genero:");
        rdgenero.setContentAreaFilled(false);
        rdgenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rdgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdgeneroActionPerformed(evt);
            }
        });

        buttonGroup1.add(rddni);
        rddni.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rddni.setForeground(new java.awt.Color(0, 51, 51));
        rddni.setText("Buscar Clientes por DNI:");
        rddni.setContentAreaFilled(false);
        rddni.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rddni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rddniActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdtodo);
        rdtodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdtodo.setForeground(new java.awt.Color(0, 51, 51));
        rdtodo.setText("Mostrar todos los clientes");
        rdtodo.setContentAreaFilled(false);
        rdtodo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rdtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdtodoActionPerformed(evt);
            }
        });

        cbogenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "⠀⠀", "M", "F" }));
        cbogenero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbogenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbogeneroKeyPressed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/btn32.png"))); // NOI18N
        btnbuscar.setContentAreaFilled(false);
        btnbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnbuscar.setFocusPainted(false);
        btnbuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/btn33.png"))); // NOI18N
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });

        buttonGroup1.add(rdRuc);
        rdRuc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rdRuc.setForeground(new java.awt.Color(0, 51, 51));
        rdRuc.setText("Buscar Clientes por Ruc:");
        rdRuc.setContentAreaFilled(false);
        rdRuc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rdRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdRucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdgenero)
                    .addComponent(rddni)
                    .addComponent(rdRuc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbogenero, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btnbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdtodo)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdgenero)
                            .addComponent(cbogenero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(rddni))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdRuc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnbuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(rdtodo)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Cantidad de Registros:");

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/btn35.png"))); // NOI18N
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/btn34.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtCantidad.setEditable(false);

        tbclientes.setForeground(new java.awt.Color(0, 102, 255));
        tbclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbclientes.setAltoHead(22);
        tbclientes.setColorBackgoundHead(new java.awt.Color(0, 102, 255));
        tbclientes.setColorFilasBackgound2(new java.awt.Color(240, 240, 240));
        tbclientes.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tbclientes.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tbclientes.setFuenteFilas(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        tbclientes.setFuenteFilasSelect(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbclientes.setFuenteHead(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tbclientes.setGrosorBordeFilas(0);
        jScrollPane2.setViewportView(tbclientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void rdgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdgeneroActionPerformed
// TODO add your handling code here:
    if(rdgenero.isSelected()==true)
    {
        Cargarlistaclientes();
        btnbuscar.setEnabled(true);
        cbogenero.setSelectedItem(0);
        cbogenero.setEnabled(true);
        txtDni.setEnabled(false);
        txtDni.setText("");
        txtRuc.setText("");
        txtRuc.setEnabled(false);
    }
}//GEN-LAST:event_rdgeneroActionPerformed

private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
// TODO add your handling code here:
   String sexo= cbogenero.getSelectedItem().toString();
   String dni=txtDni.getText();
   String ruc=txtRuc.getText();
   
   if(rdgenero.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"Código","Nombres","Apellidos","Sexo","DNI","Teléfono","Ruc","Email","Dirección"};
       modelo.setColumnIdentifiers(Titulos);
       this.tbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM cliente WHERE Sexo='"+sexo+"'";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("IdCliente");
                registros[1]=rs.getString("Nombres");
                registros[2]=rs.getString("Apellidos");  
                registros[3]=rs.getString("Sexo");
                registros[4]=rs.getString("DNI");
                registros[5]=rs.getString("Telefono");
                registros[6]=rs.getString("Ruc");
                registros[7]=rs.getString("Email");
                registros[8]=rs.getString("Direccion");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtCantidad.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   if(rddni.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"Código","Nombres","Apellidos","Sexo","DNI","Teléfono","Ruc","Email","Dirección"};
       modelo.setColumnIdentifiers(Titulos);
       this.tbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM cliente WHERE DNI='"+dni+"'";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("IdCliente");
                registros[1]=rs.getString("Nombres");
                registros[2]=rs.getString("Apellidos");  
                registros[3]=rs.getString("Sexo");
                registros[4]=rs.getString("DNI");
                registros[5]=rs.getString("Telefono");
                registros[6]=rs.getString("Ruc");
                registros[7]=rs.getString("Email");
                registros[8]=rs.getString("Direccion");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtCantidad.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
   }
    if(rdRuc.isSelected()==true)
   {
       DefaultTableModel modelo= new DefaultTableModel();
       String []Titulos = {"Código","Nombres","Apellidos","Sexo","DNI","Teléfono","Ruc","Email","Dirección"};
       modelo.setColumnIdentifiers(Titulos);
       this.tbclientes.setModel(modelo);
       try {
            
            String ConsultaSQL="SELECT * FROM cliente WHERE Ruc='"+ruc+"'";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("IdCliente");
                registros[1]=rs.getString("Nombres");
                registros[2]=rs.getString("Apellidos");  
                registros[3]=rs.getString("Sexo");
                registros[4]=rs.getString("DNI");
                registros[5]=rs.getString("Telefono");
                registros[6]=rs.getString("Ruc");
                registros[7]=rs.getString("Email");
                registros[8]=rs.getString("Direccion");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtCantidad.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
   }
   if(rdtodo.isSelected()==true)
   {
      Cargarlistaclientes();
   }
   
}//GEN-LAST:event_btnbuscarActionPerformed

private void rddniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rddniActionPerformed
// TODO add your handling code here:
    if(rddni.isSelected()==true)
    {
        Cargarlistaclientes();
        cbogenero.setSelectedIndex(0);
        cbogenero.setEnabled(false);
        txtDni.setEnabled(true);
        txtDni.requestFocus();
        txtRuc.setText("");
        txtRuc.setEnabled(false);
        btnbuscar.setEnabled(true);
    }
}//GEN-LAST:event_rddniActionPerformed

private void rdtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtodoActionPerformed
// TODO add your handling code here:
   Cargarlistaclientes();
    txtDni.setText("");
    txtDni.setEnabled(false);
    txtRuc.setText("");
    txtRuc.setEnabled(false);
    btnbuscar.setEnabled(false);
    
        cbogenero.setSelectedIndex(0);
        cbogenero.setEnabled(false);
    
}//GEN-LAST:event_rdtodoActionPerformed

    private void cbogeneroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbogeneroKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnbuscar.requestFocus();

        }
    }//GEN-LAST:event_cbogeneroKeyPressed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
      this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void rdRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdRucActionPerformed
         if(rdRuc.isSelected()==true)
    {
        Cargarlistaclientes();
        cbogenero.setSelectedIndex(0);
        cbogenero.setEnabled(false);
        txtRuc.setEnabled(true);
        txtRuc.requestFocus();
        txtDni.setText("");
        txtDni.setEnabled(false);
        btnbuscar.setEnabled(true);
    }
    }//GEN-LAST:event_rdRucActionPerformed

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
       char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
        int i = txtRuc.getText().length();
        if (txtRuc.getText().trim().length() < 11) {

        } else {
            i = 10;
            String com = txtRuc.getText().substring(0, 10);
            txtRuc.setText("");
            txtRuc.setText(com);
        }
    }//GEN-LAST:event_txtRucKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
        int i = txtDni.getText().length();
        if (txtDni.getText().trim().length() < 8) {

        } else {
            i = 10;
            String com = txtDni.getText().substring(0, 7);
            txtDni.setText("");
            txtDni.setText(com);
        }
    }//GEN-LAST:event_txtDniKeyTyped

    void Cargarlistaclientes()          
    {
        DefaultTableModel modelo= new DefaultTableModel();
        String []Titulos = {"Código","Nombres","Apellidos","Sexo","DNI","Teléfono","Ruc","Email","Dirección"};
        modelo.setColumnIdentifiers(Titulos);
         this.tbclientes.setModel(modelo);
        try {
            
            String ConsultaSQL="SELECT * FROM cliente";
        
            String []registros= new String[9];
           
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(ConsultaSQL);
            while(rs.next())
            {
                registros[0]=rs.getString("IdCliente");
                registros[1]=rs.getString("Nombres");
                registros[2]=rs.getString("Apellidos");  
                registros[3]=rs.getString("Sexo");
                registros[4]=rs.getString("DNI");
                registros[5]=rs.getString("Telefono");
                registros[6]=rs.getString("Ruc");
                registros[7]=rs.getString("Email");
                registros[8]=rs.getString("Direccion");
                modelo.addRow(registros);
                                
            }
            tbclientes.setModel(modelo);
            txtCantidad.setText(""+tbclientes.getRowCount());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbogenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private jtextfieldround.JTextFieldRound jTextFieldRound1;
    private javax.swing.JRadioButton rdRuc;
    private javax.swing.JRadioButton rddni;
    private javax.swing.JRadioButton rdgenero;
    private javax.swing.JRadioButton rdtodo;
    private rojerusan.RSTableMetro tbclientes;
    private jtextfieldround.JTextFieldRound txtCantidad;
    private jtextfieldround.JTextFieldRound txtDni;
    private jtextfieldround.JTextFieldRound txtRuc;
    // End of variables declaration//GEN-END:variables
ConexionBD cc= new ConexionBD();
Connection cn = cc.conectar();


}
