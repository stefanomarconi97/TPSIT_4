package corsa;

import java.awt.Color;
import static java.awt.Color.blue;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 * Pista è la finestra che contiene il percorso di gara
 *
 * @author Andrea Vallorani
 */
public class Pista extends javax.swing.JFrame {

    /**
     * Creates new form pista
     */
    public Pista() {
        this.setTitle("Mario Kart 64");
        this.getContentPane().setBackground(Color.orange);
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

        corsia1 = new javax.swing.JPanel();
        partenza = new javax.swing.JPanel();
        icoAtleta1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        corsia2 = new javax.swing.JPanel();
        icoAtleta2 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        partenza1 = new javax.swing.JPanel();
        bottoneAvvio = new javax.swing.JButton();
        statoGara = new javax.swing.JLabel();
        corsia3 = new javax.swing.JPanel();
        icoAtleta3 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        partenza2 = new javax.swing.JPanel();
        corsia4 = new javax.swing.JPanel();
        icoAtleta4 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        partenza3 = new javax.swing.JPanel();
        ButtonReset = new javax.swing.JButton();
        box = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        s1 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        primo = new javax.swing.JLabel();
        secondo = new javax.swing.JLabel();
        terzo = new javax.swing.JLabel();
        quarto = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        rename = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        corsia1.setBackground(new java.awt.Color(255, 102, 0));
        corsia1.setLayout(null);

        javax.swing.GroupLayout partenzaLayout = new javax.swing.GroupLayout(partenza);
        partenza.setLayout(partenzaLayout);
        partenzaLayout.setHorizontalGroup(
            partenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        partenzaLayout.setVerticalGroup(
            partenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        corsia1.add(partenza);
        partenza.setBounds(60, 0, 10, 330);
        partenza.getAccessibleContext().setAccessibleName("");
        partenza.getAccessibleContext().setAccessibleParent(null);

        icoAtleta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Wario.png"))); // NOI18N
        corsia1.add(icoAtleta1);
        icoAtleta1.setBounds(10, 14, 50, 50);

        name1.setText("Mario");
        corsia1.add(name1);
        name1.setBounds(18, 0, 40, 14);

        corsia2.setBackground(new java.awt.Color(255, 102, 0));
        corsia2.setLayout(null);

        icoAtleta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Green.png"))); // NOI18N
        corsia2.add(icoAtleta2);
        icoAtleta2.setBounds(10, 14, 50, 50);

        name2.setText("Luigi");
        corsia2.add(name2);
        name2.setBounds(20, 0, 30, 14);

        javax.swing.GroupLayout partenza1Layout = new javax.swing.GroupLayout(partenza1);
        partenza1.setLayout(partenza1Layout);
        partenza1Layout.setHorizontalGroup(
            partenza1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        partenza1Layout.setVerticalGroup(
            partenza1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        corsia2.add(partenza1);
        partenza1.setBounds(60, 0, 10, 240);

        bottoneAvvio.setText("START!");
        bottoneAvvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneAvvioActionPerformed(evt);
            }
        });

        statoGara.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        statoGara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statoGara.setText("Gara non ancora iniziata");

        corsia3.setBackground(new java.awt.Color(255, 102, 0));
        corsia3.setLayout(null);

        icoAtleta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Blue.png"))); // NOI18N
        corsia3.add(icoAtleta3);
        icoAtleta3.setBounds(10, 14, 50, 50);

        name3.setText("Wario");
        corsia3.add(name3);
        name3.setBounds(18, 0, 50, 14);

        javax.swing.GroupLayout partenza2Layout = new javax.swing.GroupLayout(partenza2);
        partenza2.setLayout(partenza2Layout);
        partenza2Layout.setHorizontalGroup(
            partenza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        partenza2Layout.setVerticalGroup(
            partenza2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        corsia3.add(partenza2);
        partenza2.setBounds(60, 0, 10, 160);

        corsia4.setBackground(new java.awt.Color(255, 102, 0));
        corsia4.setLayout(null);

        icoAtleta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/Black.png"))); // NOI18N
        corsia4.add(icoAtleta4);
        icoAtleta4.setBounds(10, 14, 50, 50);

        name4.setText("Waluigi");
        corsia4.add(name4);
        name4.setBounds(15, 0, 50, 14);

        javax.swing.GroupLayout partenza3Layout = new javax.swing.GroupLayout(partenza3);
        partenza3.setLayout(partenza3Layout);
        partenza3Layout.setHorizontalGroup(
            partenza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        partenza3Layout.setVerticalGroup(
            partenza3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        corsia4.add(partenza3);
        partenza3.setBounds(60, 0, 10, 80);

        ButtonReset.setText("RESET");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        box.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deserto", "Glaciale", "Prato", "Pista" }));
        box.setToolTipText("");
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleziona la mappa:");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/rosso.png"))); // NOI18N

        s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/corsa/green-light.png"))); // NOI18N
        s2.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(s1)
                .addGap(29, 29, 29)
                .addComponent(s2)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(s2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
            .addComponent(s1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Classifica");

        primo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        primo.setForeground(new java.awt.Color(235, 195, 0));
        primo.setText("1. ...");

        secondo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        secondo.setForeground(new java.awt.Color(152, 152, 152));
        secondo.setText(" 2. ...");

        terzo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        terzo.setForeground(new java.awt.Color(140, 120, 83));
        terzo.setText("  3. ...");

        quarto.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        quarto.setText("   4. ...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(secondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(primo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(quarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(primo)
                .addGap(1, 1, 1)
                .addComponent(secondo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(terzo, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quarto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rename.setText("RENAME");
        rename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameActionPerformed(evt);
            }
        });

        jLabel3.setText("Giocatore 3");

        jLabel4.setText("Giocatore 1");

        jLabel5.setText("Giocatore 2");

        jLabel6.setText("Giocatore 4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(statoGara, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(corsia1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                            .addComponent(corsia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(corsia3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(corsia4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(rename)
                                .addGap(135, 135, 135)
                                .addComponent(bottoneAvvio)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonReset))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(corsia1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corsia2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corsia3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corsia4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statoGara)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottoneAvvio)
                    .addComponent(ButtonReset)
                    .addComponent(rename))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottoneAvvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneAvvioActionPerformed
        Giudice giudice = new Giudice(this);
        s1.setEnabled(false);
        s2.setEnabled(true);
        renameActionPerformed(evt);
        giudice.start();
        this.bottoneAvvio.setEnabled(false);
        this.ButtonReset.setEnabled(false);
        this.box.setEnabled(false);
        this.rename.setEnabled(false);
        this.jTextField1.setEnabled(false);
        this.jTextField2.setEnabled(false);
        this.jTextField3.setEnabled(false);
        this.jTextField4.setEnabled(false);
    }//GEN-LAST:event_bottoneAvvioActionPerformed

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        icoAtleta1.setBounds(10, 14, 50, 50);
        icoAtleta2.setBounds(10, 14, 50, 50);
        icoAtleta3.setBounds(10, 14, 50, 50);
        icoAtleta4.setBounds(10, 14, 50, 50);
        name1.setBounds(18, 0, 40, 14);
        name2.setBounds(20, 0, 30, 14);
        name3.setBounds(18, 0, 50, 14);
        name4.setBounds(15, 0, 50, 14);
        primo.setText("1. ...");
        secondo.setText(" 2. ...");
        terzo.setText("  3. ...");
        quarto.setText("   4. ...");
        bottoneAvvio.setEnabled(true);
        s1.setEnabled(true);
        s2.setEnabled(false);
        this.box.setEnabled(true);
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        renameActionPerformed(evt);
    }//GEN-LAST:event_ButtonResetActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        int selectedChoise = (int) this.box.getSelectedIndex();
        switch (selectedChoise) {
            case 0:

                corsia1.setBackground(new java.awt.Color(255, 102, 0));
                corsia1.setLayout(null);

                corsia2.setBackground(new java.awt.Color(255, 102, 0));
                corsia2.setLayout(null);

                corsia3.setBackground(new java.awt.Color(255, 102, 0));
                corsia3.setLayout(null);

                corsia4.setBackground(new java.awt.Color(255, 102, 0));
                corsia4.setLayout(null);
                
                this.getContentPane().setBackground(Color.orange);
                break;
            case 1:

                corsia1.setBackground(new java.awt.Color(100, 150, 250));
                corsia1.setLayout(null);

                corsia2.setBackground(new java.awt.Color(100, 150, 250));
                corsia2.setLayout(null);

                corsia3.setBackground(new java.awt.Color(100, 150, 250));
                corsia3.setLayout(null);

                corsia4.setBackground(new java.awt.Color(100, 150, 250));
                corsia4.setLayout(null);
                
                this.getContentPane().setBackground(Color.cyan);
                break;
            case 2:

                corsia1.setBackground(new java.awt.Color(0,150,0));
                corsia1.setLayout(null);

                corsia2.setBackground(new java.awt.Color(0,150,0));
                corsia2.setLayout(null);

                corsia3.setBackground(new java.awt.Color(0,150,0));
                corsia3.setLayout(null);

                corsia4.setBackground(new java.awt.Color(0,150,0));
                corsia4.setLayout(null);
                
                this.getContentPane().setBackground(new java.awt.Color(46, 184, 46));
                break;
            case 3:

                corsia1.setBackground(new java.awt.Color(152,152,152));
                corsia1.setLayout(null);

                corsia2.setBackground(new java.awt.Color(152,152,152));
                corsia2.setLayout(null);

                corsia3.setBackground(new java.awt.Color(152,152,152));
                corsia3.setLayout(null);

                corsia4.setBackground(new java.awt.Color(152,152,152));
                corsia4.setLayout(null);
                
                this.getContentPane().setBackground(new java.awt.Color(36, 174, 36));
                break;

        }
    }//GEN-LAST:event_boxActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void renameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameActionPerformed
        if(!this.jTextField1.getText().isEmpty()){
            this.name1.setText(this.jTextField1.getText());
        }else
            this.name1.setText("Mario");
        if(!this.jTextField2.getText().isEmpty()){
            this.name2.setText(this.jTextField2.getText());
        }else
            this.name2.setText("Luigi");
        if(!this.jTextField3.getText().isEmpty()){
            this.name3.setText(this.jTextField3.getText());
        }else
            this.name3.setText("Wario");
        if(!this.jTextField4.getText().isEmpty()){
            this.name4.setText(this.jTextField4.getText());
        }else
            this.name4.setText("Waluigi");
    }//GEN-LAST:event_renameActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ButtonReset;
    public javax.swing.JButton bottoneAvvio;
    public javax.swing.JComboBox box;
    private javax.swing.JPanel corsia1;
    private javax.swing.JPanel corsia2;
    private javax.swing.JPanel corsia3;
    private javax.swing.JPanel corsia4;
    public javax.swing.JLabel icoAtleta1;
    public javax.swing.JLabel icoAtleta2;
    public javax.swing.JLabel icoAtleta3;
    public javax.swing.JLabel icoAtleta4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JLabel name1;
    public javax.swing.JLabel name2;
    public javax.swing.JLabel name3;
    public javax.swing.JLabel name4;
    private javax.swing.JPanel partenza;
    private javax.swing.JPanel partenza1;
    private javax.swing.JPanel partenza2;
    private javax.swing.JPanel partenza3;
    public javax.swing.JLabel primo;
    public javax.swing.JLabel quarto;
    public javax.swing.JButton rename;
    public javax.swing.JLabel s1;
    public javax.swing.JLabel s2;
    public javax.swing.JLabel secondo;
    public javax.swing.JLabel statoGara;
    public javax.swing.JLabel terzo;
    // End of variables declaration//GEN-END:variables
}