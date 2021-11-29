/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import datos.DatosDesordenados;
import datos.DatosOrdenados;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class Ordenamientos extends javax.swing.JFrame {

    /**
     * Creates new form Ordenamientos
     */
    public Ordenamientos() {
        initComponents();
        setBackground(Color.black);
        setForeground(Color.white);
        setResizable(false);
        setLocationRelativeTo(null);
        ((JPanel) getContentPane()).setOpaque (false);
        setTitle("Ordenamientos");
    }
    private static void orden(){
        DatosDesordenados m;
        String nn, ss, d;
        int n, s;
        nn = tf1.getText();
        ss = tf2.getText();
        n = Integer.parseInt(nn);
        s = Integer.parseInt(ss);
        long t, t1, t2;
        m = new DatosDesordenados(s, n);
        m.generarValores();
        d = m.toString();
        
        if(nn.isEmpty() || ss.isEmpty()){
            JOptionPane.showMessageDialog(null, "¡Llena los dos campos!");
        }else{
            if(bu.isSelected() && as.isSelected()){
                t1 = System.nanoTime();
                ta.append("Burbuja Ascendente:\n");
                ta.append(d+"\n");
                DatosOrdenados moba = m.bubbleSort();
                t2 = System.nanoTime();   // stop
                t = t2 - t1;
                ta.append("n = "+ n + " t = " + t +"ns.\n"+ moba+"\n\n");
            }
            if(bu.isSelected() && des.isSelected()){
                t1 = System.nanoTime();
                ta.append("Burbuja Descendente:\n");
                ta.append(d+"\n");
                DatosOrdenados mobd = m.bubbleSortD();
                t2 = System.nanoTime();   // stop
                t = t2 - t1;
                ta.append("n = "+ n + " t = " + t +"ns.\n"+ mobd+"\n\n");
            }
            if(in.isSelected() && as.isSelected()){
                t1 = System.nanoTime();
                ta.append("Insert Ascendente:\n");
                ta.append(d+"\n");
                DatosOrdenados moia = m.insertSort();
                t2 = System.nanoTime();   // stop
                t = t2 - t1;
                ta.append("n = "+ n + " t = " + t + " ns.\n" + moia+"\n\n");
            }
            if(in.isSelected() && des.isSelected()){
                t1 = System.nanoTime();
                ta.append("Insert Descendente:\n");
                ta.append(d+"\n");
                DatosOrdenados moid = m.insertSortD();
                t2 = System.nanoTime();   // stop
                t = t2 - t1;
                ta.append("n = "+ n + " t = " + t + " ns.\n" + moid+"\n\n");
            }
            if(qu.isSelected() && as.isSelected()){
                t1 = System.nanoTime();
                ta.append("QuickSort Ascendente:\n");
                ta.append(d+"\n");
                DatosOrdenados moqa = m.QuicksortA();
                t2 = System.nanoTime();   // stop
                t = t2 - t1;
                ta.append("n = "+ n + " t = " + t + " ns.\n" + moqa+"\n\n");
            }
            if(qu.isSelected() && des.isSelected()){
                t1 = System.nanoTime();
                ta.append("QuickSort Descendente:\n");
                ta.append(d+"\n");
                DatosOrdenados moqd = m.QuicksortD();
                t2 = System.nanoTime();   // stop
                t = t2 - t1;
                ta.append("n = "+ n + " t = " + t + " ns.\n" + moqd+"\n\n");
            }
            if(sh.isSelected() && as.isSelected()){
                t1 = System.nanoTime();
                ta.append("ShellSort Ascendente:\n");
                ta.append(d+"\n");
                DatosOrdenados mosa = m.Shellsort();
                t2 = System.nanoTime();   // stop
                t = t2 - t1;
                ta.append("n = "+ n + " t = " + t + " ns.\n" + mosa+"\n\n");
            }
            if(sh.isSelected() && des.isSelected()){
                t1 = System.nanoTime();
                ta.append("ShellSort Descendente:\n");
                ta.append(d+"\n");
                DatosOrdenados mosd = m.ShellsortD();
                t2 = System.nanoTime();   // stop
                t = t2 - t1;
                ta.append("n = "+ n + " t = " + t + " ns.\n" + mosd+"\n\n");
            }
            if(ra.isSelected() && as.isSelected()){
                t1 = System.nanoTime();
                ta.append("Radix Ascendente:\n");
                ta.append(d+"\n");
                DatosOrdenados mora = m.Radixsort();
                t2 = System.nanoTime();   // stop
                t = t2 - t1;
                ta.append("n = "+ n + " t = " + t + " ns.\n" + mora+"\n\n");
            }
            if(ra.isSelected() && des.isSelected()){
                t1 = System.nanoTime();
                ta.append("Radix Descendente:\n");
                ta.append(d+"\n");
                DatosOrdenados mord = m.RadixsortD();
                t2 = System.nanoTime();   // stop
                t = t2 - t1;
                ta.append("n = "+ n + " t = " + t + " ns.\n" + mord+"\n\n");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        bu = new javax.swing.JCheckBox();
        in = new javax.swing.JCheckBox();
        qu = new javax.swing.JCheckBox();
        sh = new javax.swing.JCheckBox();
        ra = new javax.swing.JCheckBox();
        acept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        clean = new javax.swing.JButton();
        as = new javax.swing.JCheckBox();
        des = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Algoritmos de ordenamiento");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("¿Cuántos datos son?");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("¿Cuál es el valor máximo?");

        tf1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tf1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        tf2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });

        bu.setText("Burbuja");

        in.setText("Inserción");

        qu.setText("Quicksort");

        sh.setText("Shellsort");

        ra.setText("Radix");

        acept.setText("Aceptar");
        acept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptActionPerformed(evt);
            }
        });

        ta.setBackground(new java.awt.Color(0, 0, 0));
        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        ta.setForeground(new java.awt.Color(255, 255, 255));
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        clean.setText("Limpiar");
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        as.setText("Ascendente");

        des.setText("Descendente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bu)
                        .addGap(40, 40, 40)
                        .addComponent(in)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(qu)
                                .addGap(35, 35, 35)
                                .addComponent(sh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(ra)
                                .addGap(52, 52, 52))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(acept)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(des)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(as)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(clean)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(as))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(des))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bu)
                    .addComponent(in)
                    .addComponent(qu)
                    .addComponent(sh)
                    .addComponent(ra))
                .addGap(18, 18, 18)
                .addComponent(acept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clean)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptActionPerformed
        orden();
    }//GEN-LAST:event_aceptActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        tf1.setText("");
        tf2.setText("");
        ta.setText("");
    }//GEN-LAST:event_cleanActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
        orden();
    }//GEN-LAST:event_tf2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ordenamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordenamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordenamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordenamientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordenamientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton acept;
    public static javax.swing.JCheckBox as;
    public static javax.swing.JCheckBox bu;
    public static javax.swing.JButton clean;
    public static javax.swing.JCheckBox des;
    public static javax.swing.JCheckBox in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JCheckBox qu;
    public static javax.swing.JCheckBox ra;
    public static javax.swing.JCheckBox sh;
    public static javax.swing.JTextArea ta;
    public static javax.swing.JTextField tf1;
    public static javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
