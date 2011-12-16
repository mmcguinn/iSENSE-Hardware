/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProgressBar.java
 *
 * Created on Aug 29, 2011, 12:53:13 PM
 */
package goldeneye_v1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author jdalphon
 */
public class ProgressBar extends javax.swing.JFrame {

    private int Ticks, Timeout;
    private String Task;

    /** Creates new form ProgressBar */
    public ProgressBar(int NumTicks, int TimePerTick, String TheTask) {
        initComponents();

        Ticks = NumTicks;
        Timeout = TimePerTick;
        Task = TheTask;
        
     

        progressBar.setMaximum(Ticks);

        this.setResizable(true);
        
        titleLabel.setText(Task + "...");

    }

    public void Start(){
        System.out.println(Ticks  + " -- " + Timeout );
        for(int i = 0; i < Ticks; i++){
            try {
                Thread.sleep(Timeout);
                progressBar.setValue(i);
                //progressBar.updateUI();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        this.dispose();

    }




    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressBar = new javax.swing.JProgressBar();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(goldeneye_v1.GoldenEye_v1App.class).getContext().getResourceMap(ProgressBar.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N

        progressBar.setName("progressBar"); // NOI18N

        titleLabel.setText(resourceMap.getString("titleLabel.text")); // NOI18N
        titleLabel.setName("titleLabel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
