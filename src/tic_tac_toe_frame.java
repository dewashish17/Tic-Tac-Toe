
import java.awt.Color;
import static java.awt.Color.*;
//import static java.awt.Color.red;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dewashish painkra
 */
public class tic_tac_toe_frame extends javax.swing.JFrame {

    /**
     * Creates new form tic_tac_toe_frame
     */
    private  String turn ="O";
    private  int xCount=0;
    private int oCount=0;
    public tic_tac_toe_frame() {
        initComponents();
    }
    public  void choosePlayer()
    {
    if(turn.equalsIgnoreCase("X"))
    {
        turn="O";
    }
    else
    {
        turn="X";
    }
        
        }
    private void setScore()
    {
        xScore.setText(String.valueOf(xCount));
        oScore.setText(String.valueOf(oCount));
    }
    public void chooseWinner()
    {
        String b1=Button1.getText();
        String b2=Button2.getText();
        String b3=Button3.getText();
        String b4=Button4.getText();
        String b5=Button5.getText();
        String b6=Button6.getText();
        String b7=Button7.getText();
        String b8=Button8.getText();
        String b9=Button9.getText();
        if(b1=="X" && b2=="X" && b3=="X")
        {
            JOptionPane.showMessageDialog(this,"Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            Button1.setBackground(orange);
            Button2.setBackground(orange);
            Button3.setBackground(orange);
             
           
        }
        if(b4=="X" && b5=="X" && b6=="X")
        {
            JOptionPane.showMessageDialog(this,"Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            Button4.setBackground(orange);
            Button5.setBackground(orange);
            Button6.setBackground(orange);
        }
        if(b7=="X" && b8=="X" && b9=="X")
        {
            JOptionPane.showMessageDialog(this,"Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            Button7.setBackground(orange);
            Button8.setBackground(orange);
            Button9.setBackground(orange);
        }
        if(b1=="X" && b4=="X" && b7=="X")
        {
            JOptionPane.showMessageDialog(this,"Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            Button1.setBackground(orange);
            Button4.setBackground(orange);
            Button7.setBackground(orange);
        }
        if(b2=="X" && b5=="X" && b8=="X")
        {
            JOptionPane.showMessageDialog(this,"Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            Button2.setBackground(orange);
            Button5.setBackground(orange);
            Button8.setBackground(orange);
        }
        if(b3=="X" && b6=="X" && b9=="X")
        {
            JOptionPane.showMessageDialog(this,"Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            Button3.setBackground(orange);
            Button6.setBackground(orange);
            Button9.setBackground(orange);
        }
        if(b1=="X" && b5=="X" && b9=="X")
        {
            JOptionPane.showMessageDialog(this,"Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            Button1.setBackground(orange);
            Button5.setBackground(orange);
            Button9.setBackground(orange);
        }
        if(b3=="X" && b5=="X" && b7=="X")
        {
            JOptionPane.showMessageDialog(this,"Player X wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            Button3.setBackground(orange);
            Button5.setBackground(orange);
            Button7.setBackground(orange);
        }
        
        // for 00000000
        if(b1=="O" && b2=="O" && b3=="O")
        {
            JOptionPane.showMessageDialog(this,"Player o wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            Button1.setBackground(orange);
            Button2.setBackground(orange);
            Button3.setBackground(orange);
        }
        if(b4=="O" && b5=="O" && b6=="O")
        {
            JOptionPane.showMessageDialog(this,"Player o wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            Button4.setBackground(orange);
            Button5.setBackground(orange);
            Button6.setBackground(orange);
        }
        if(b7=="O" && b8=="O" && b9=="O")
        {
            JOptionPane.showMessageDialog(this,"Player o wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            Button7.setBackground(orange);
            Button8.setBackground(orange);
            Button9.setBackground(orange);
        }
        if(b1=="O" && b4=="O" && b7=="O")
        {
            JOptionPane.showMessageDialog(this,"Player o wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            Button1.setBackground(orange);
            Button4.setBackground(orange);
            Button7.setBackground(orange);
        }
        if(b2=="O" && b5=="O" && b8=="O")
        {
            JOptionPane.showMessageDialog(this,"Player o wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            Button2.setBackground(orange);
            Button5.setBackground(orange);
            Button8.setBackground(orange);
        }
        if(b3=="O" && b6=="O" && b9=="O")
        {
            JOptionPane.showMessageDialog(this,"Player o wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            Button3.setBackground(orange);
            Button6.setBackground(orange);
            Button9.setBackground(orange);
        }
        if(b1=="O" && b5=="O" && b9=="O")
        {
            JOptionPane.showMessageDialog(this,"Player o wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            Button1.setBackground(orange);
            Button5.setBackground(orange);
            Button9.setBackground(orange);
        }
        if(b3=="O" && b5=="O" && b7=="O")
        {
            JOptionPane.showMessageDialog(this,"Player o wins","TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            Button3.setBackground(orange);
            Button5.setBackground(orange);
            Button7.setBackground(orange);
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button2 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        xScore = new javax.swing.JLabel();
        oScore = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 0, 51));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setText("    TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        Button2.setBackground(new java.awt.Color(51, 255, 255));
        Button2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 0, 0));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(51, 255, 255));
        Button1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 0, 0));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(51, 255, 255));
        Button3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 0, 0));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(51, 255, 255));
        Button4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 0, 0));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(51, 255, 255));
        Button5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 0, 0));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(51, 255, 255));
        Button6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 0, 0));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(51, 255, 255));
        Button8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Button8.setForeground(new java.awt.Color(255, 0, 0));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button7.setBackground(new java.awt.Color(51, 255, 255));
        Button7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 0, 0));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(51, 255, 255));
        Button9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        Button9.setForeground(new java.awt.Color(255, 0, 0));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 204, 51));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 0, 0));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("PlayerX: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Player0: ");

        xScore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xScore.setText("------");

        oScore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        oScore.setText("------");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xScore, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oScore, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(xScore))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oScore))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        Button3.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
        Button3.setForeground(red);
                }
        else {
            Button3.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
        Button6.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
        Button6.setForeground(red);
                }
        else {
            Button6.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        // TODO add your handling code here:
        Button9.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
        Button9.setForeground(red);
                }
        else {
            Button9.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        Button1.setText(null);
        Button2.setText(null);
        Button3.setText(null);
        
        Button4.setText(null);
        Button5.setText(null);
        Button6.setText(null);
        
        Button7.setText(null);
        Button8.setText(null);
        Button9.setText(null);
        
        Button1.setBackground(new Color(51,255,255));
        Button2.setBackground(new Color(51,255,255));
        Button3.setBackground(new Color(51,255,255));
        
        Button4.setBackground(new Color(51,255,255));
        Button5.setBackground(new Color(51,255,255));
        Button6.setBackground(new Color(51,255,255));
        
        Button7.setBackground(new Color(51,255,255));
        Button8.setBackground(new Color(51,255,255));
        Button9.setBackground(new Color(51,255,255));
        
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"confirm if you want to exit","TIC TAC TOE", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        Button1.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
        Button1.setForeground(red);
                }
        else {
            Button1.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
         Button2.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
        Button2.setForeground(red);
                }
        else {
            Button2.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        Button4.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
        Button4.setForeground(red);
                }
        else {
            Button4.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        Button5.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
        Button5.setForeground(red);
                }
        else {
            Button5.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        Button7.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
        Button7.setForeground(red);
                }
        else {
            Button7.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        // TODO add your handling code here:
        Button8.setText(turn);
        if(turn.equalsIgnoreCase("X"))
        {
        Button8.setForeground(red);
                }
        else {
            Button8.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button8ActionPerformed

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
            java.util.logging.Logger.getLogger(tic_tac_toe_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic_tac_toe_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel oScore;
    private javax.swing.JButton reset;
    private javax.swing.JLabel xScore;
    // End of variables declaration//GEN-END:variables
}
