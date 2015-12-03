package squid_game;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Dialogue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ElizabethReed PC
 */
public class Squid_GUI extends javax.swing.JFrame {
int seen = 0;
    private Component frame;
    /**
     * Creates new form Squid_GUI
     */
    public Squid_GUI() {
        initComponents();
        jButton2.setText("" + seen);
         getContentPane().setBackground( new Color(147,200,200)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("You are Squidward Tenticals stuck \nin the future. You've arrived \nin an empty room with \nvirtual transportation squares.");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("button");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Answer;");

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField1)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//the next button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Custom button text
        int option;
        if(seen==0)
        {
        Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"Red",
                    "Green",
                    "Blue",
                    "purple"};
        option = JOptionPane.showOptionDialog(this,
            "Choose a square",
            "Color Picker",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[3]);
        
        UIManager.put("OptionPane.background", paneBG); // reset BG
        //************ End Custom dialog ***********
        
        switch(option)
        {
            case 0: //red path
            {
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("You die");
                break;
            }
            
            case 1:  //green path
            {
                getContentPane().setBackground( new Color(128,255,128)); 
                jTextArea1.setText("Oh no!\n"
                    + "You've gone even further into the future!\n" 
                    + "Choose a year to return to.\n"
                    + "Unfortunately your home year, 2015 is not available\n\n");
                
                 seen = 1;
                break;
            }
            
            case 2: //blue path
            {
                getContentPane().setBackground( new Color(128,128,255)); 
                jTextArea1.setText("You've been ejected into space.\n" +
                        "You're moving at dangerous speeds.\n" +
                        "Slow down!\n");
                seen = 6;
                break;
            }
             case 3: //purple path
            {
                //getContentPane().setBackground( new Color(128,128,255)); 
                 jTextArea1.setText("You're trapped in a capsule at the\n"
                    + "bottom of the ocean.\n"
                    + "\n");
                seen = 10;
                break;
            }
           
        }
        
        jButton2.setText("" + seen);
        return;
        }//close if 0
        
        //*******************Green********************
        if(seen ==1){
            jTextArea1.append("You're not the first one to get lost in this year.\n"
                        + "You have been entered into the missing person's catalog.");
            seen = 2;
        }
       
       if(seen == 2){
           Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"View"};
        option = JOptionPane.showOptionDialog(this,
           "View Data Base",
            "View Data Base",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0]);
        
        UIManager.put("OptionPane.background", paneBG); // reset BG
        //************ End Custom dialog ***********
            
            
        switch(option)
        {
            case 0: //if clicks
            {
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("[Show data]");
                seen = 3;
            }
            
                     
        }
       } //end seen 2
       
       if(seen == 3){
           Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"Compare"};
        option = JOptionPane.showOptionDialog(this,
           "Compare data between 2 years",
            "Comparison",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0]);
        
        UIManager.put("OptionPane.background", paneBG); // reset BG
        //************ End Custom dialog ***********
            
            
        switch(option)
        {
            case 0: //if clicks
            {
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("[Show data]");
                seen = 4;
                break;
            }       
        }
       } //end seen 3
       
        if(seen == 4){
            
              Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"Yes",
                    "No"};
        option = JOptionPane.showOptionDialog(this,
            "Would you like to send out a distress signal?",
            "Distress",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]);
        
        UIManager.put("OptionPane.background", paneBG); // reset BG
        //************ End Custom dialog ***********
            
            
        switch(option)
        {
            case 0: //if clicks
            {
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("Your distress signal was picked up by a freindly pirate!\n");
                seen = 5;
                break;
            }
            
            case 1:   
            {
                getContentPane().setBackground(new Color(128, 255, 128));
                jTextArea1.setText("You're stuck in limbo");
                break;
            }
            
           }
        } //end seen 4
        
         if(seen ==5){
            jTextArea1.append("Congrats! You made it safely back to Bikini Bottom");
        } //end of green branch, player wins
       
        
        //********************Blue*****************************
        if(seen==6) 
        {
        
              Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"Yes",
                    "No"};
        option = JOptionPane.showOptionDialog(this,
            "You're marooned on planet Zorg!\n"
                    + "Would you like an oxygen tank?",
            "Oxygen Tank?",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]);
        
        UIManager.put("OptionPane.background", paneBG); // reset BG
        //************ End Custom dialog ***********
            
            
        switch(option)
        {
            case 0: //if clicks
            {
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("[next]");
                seen = 7;
                break;
            }
            
            case 1:  
            {
                getContentPane().setBackground(new Color(128, 255, 128));
                jTextArea1.setText("You're suffocating! Lose 1 life");
                break;
            }           
        }
        }//close 
        if(seen ==7){
            Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"Shallow",
                    "Deep"};
        option = JOptionPane.showOptionDialog(this,
                "Dive deeper\n"
                + " or shallower?",
            "Dive",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]);
        
        UIManager.put("OptionPane.background", paneBG); // reset BG
        //************ End Custom dialog ***********
            
            
        switch(option)
        {
            case 0: //if clicks
            {
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("A submarine is approaching.");
                seen = 8;
                break;
            }
            
            case 1:  
            {
                getContentPane().setBackground(new Color(128, 255, 128));
                jTextArea1.setText("Your brains just exploded");
                break;
            }           
        }
        } //end seen 7
        
        if(seen == 8){
             Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"Yes",
                    "No"};
        option = JOptionPane.showOptionDialog(this,
                "Would you like to stowaway?",
            "Hitch Hike",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]);
        
        UIManager.put("OptionPane.background", paneBG); // reset BG
        //************ End Custom dialog ***********
            
            
        switch(option)
        {
            case 0: //if clicks
            {
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("The submarine will take you back to Bikini Bottom.");
                seen = 9;
                break;
            }
            
            case 1:  
            {
                getContentPane().setBackground(new Color(128, 255, 128));
                jTextArea1.setText("You're going to rot at the bottom of the sea");
                break;
            }           
        }
        }//close 8
        //********************end of blue *******************************
        if(seen == 10) {
            Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"OK"};
        option = JOptionPane.showOptionDialog(this,
          "To open capsule, guess 2 digit passcode. \n" + "Please enter passcode below",
            "Passcode",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0]);
        
        UIManager.put("OptionPane.background", paneBG); // reset BG
        //************ End Custom dialog ***********
            
            
        switch(option)
        {
            case 0: //if clicks
            {
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("[Show data]");
                seen = 11;
            }   
                     
        }

        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
//submit button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(seen==11){
            int passcode;
            passcode = Integer.parseInt(jTextField1.getText());

             if(SquidData.isPrime(passcode) == false || passcode > 31 || passcode < 23)
             {
                 System.out.println("Your passcode must be prime number between 23-31 \n");
             }
             else{
                 System.out.println("great!");
             }
        }       
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Squid_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Squid_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Squid_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Squid_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Squid_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    private boolean isNumeric(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
