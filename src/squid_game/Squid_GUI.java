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
 * @author ElizabethReed PC & Cooper Whittemore
 */
public class Squid_GUI extends javax.swing.JFrame {
    
int lifeCount = 5;
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
     DataBase squidMiss = new DataBase();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Lives: 5\nYou are Squidward Tenticals stuck \nin the future. You've arrived \nin an empty room with\nvirtual transportation squares.");
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

        jLabel1.setText("Answer:");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//the next button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //Custom button text
        int option;
        
        if(lifeCount <= 0){
      Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"Quit",
                    "Retry"};
        option = JOptionPane.showOptionDialog(this,
            "You died!\nGame over. Press Retry to start over.",
            "Game Over",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]);
        
        switch(option)
        {
            case 0:{
                System.exit(0);
                break;
            }
            
            case 1:{
                lifeCount = 5;
                seen = 0;
                break;
            }
        }
        
        }
        
        
        if(seen==0)
        {
        jTextArea1.setText("Lives: " + lifeCount + "\nYou are Squidward Tenticals stuck \n" +
        "in the future. You've arrived \n" +
        "in an empty room with \n" +
        "virtual transportation squares.");

        Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"Red",
                    "Green",
                    "Blue",
                    "Purple"};
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
                --lifeCount;
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("Lives: " + lifeCount 
                        + "\nYou've descended into a bottomless void. "
                        + "Lose 1 life."
                        + "\nPress Next to try again");
                break;
            }
            
            case 1:  //green path
            {
                getContentPane().setBackground( new Color(128,255,128)); 
                jTextArea1.setText("Oh no!\n"
                    + "You've gone even further into the future!\n");
                
                 seen = 1;
                break;
            }
            
            case 2: //blue path
            {
                getContentPane().setBackground( new Color(128,128,255)); 
                jTextArea1.setText("You've been ejected into space.\n" +
                        "You're moving at dangerous speeds.\n" +
                        "Slow down!\n");
                seen = 7;
                break;
            }
             case 3: //purple path
            {
                getContentPane().setBackground( new Color(128,128,255)); 
                 jTextArea1.setText("You're trapped in a capsule at the\n"
                    + "bottom of the ocean.\n"
                    + "\n");
                seen = 11;
                break;
            }
           
        }
        
        jButton2.setText("" + seen);
        return;
        }//close if 0
        
        //*******************Green********************
        if(seen ==1){
            jTextArea1.setText("You're not the first one to get lost in this year.\n"
                        + "You have been entered into the missing person's catalog.");
            seen = 2;
        }
        
        // ****** LOOK AT THIS THIS IS IMPORTANT LOOK!!! 
        //the "else if" v causes the box to wait!!! ******
        
       else
       if(seen == 2){
           Object paneBG = UIManager.get("OptionPane.background"); // get original BG
            UIManager.put("OptionPane.background", new Color(200, 200, 255));
            Object[] options = {"View"};
            option = JOptionPane.showOptionDialog(this,
                    "Would you like to view the missing persons data base?",
                    "Data",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            UIManager.put("OptionPane.background", paneBG); // reset BG
            //************ End Custom dialog ***********

            switch (option) {
                case 0: //if clicks
                {
                    getContentPane().setBackground(new Color(255, 128, 128));
                    jTextArea1.setText("Data by Year: \n" + squidMiss.toString());
                    seen = 3;
                }

            }
       } //end seen 2
       
        else
       if(seen == 3){
           Object paneBG = UIManager.get("OptionPane.background"); // get original BG
            UIManager.put("OptionPane.background", new Color(200, 200, 255));
            Object[] options = {"Compare"};
            option = JOptionPane.showOptionDialog(this,
                    "Compare data between two years",
                    "Compare",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);

            UIManager.put("OptionPane.background", paneBG); // reset BG
            //************ End Custom dialog ***********

            switch (option) {
                case 0: //if clicks
                {
                    getContentPane().setBackground(new Color(255, 128, 128));
                    jTextArea1.setText("Enter two years below\n" + "They must fall between 2500 and 2600");
                    seen = 4;
                    break;
                }

            }
       } //end seen 3
       
        else
        if (seen == 5) {

            Object paneBG = UIManager.get("OptionPane.background"); // get original BG
            UIManager.put("OptionPane.background", new Color(200, 200, 255));
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

            switch (option) {
                case 0: //if clicks
                {
                    getContentPane().setBackground(new Color(255, 128, 128));
                    jTextArea1.setText("Your distress signal was picked up by a freindly pirate!\n");
                    seen = 6;
                    break;
                }

                case 1: {
                    getContentPane().setBackground(new Color(128, 255, 128));
                    --lifeCount;
                    jTextArea1.setText("Lives: " + lifeCount + "\nYou're stuck in limbo!\nPress next to try again!");
                    
                    break;
                }

            }
        } //end seen 4
        
        else
        if (seen == 6) {
            jTextArea1.append("Congrats! You made it safely back to Bikini Bottom. "
                    + "\nPress next to try again.");
            seen = 0;
        } //end of green branch, player wins
        

        //********************Blue*****************************
        if (seen == 7) {

            Object paneBG = UIManager.get("OptionPane.background"); // get original BG
            UIManager.put("OptionPane.background", new Color(200, 200, 255));
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

            switch (option) {
                case 0: //if clicks
                {
                    getContentPane().setBackground(new Color(255, 128, 128));
                    jTextArea1.setText("You're swimming through the giant Ocean...");
                    seen = 8;
                    break;
                }

                case 1: {
                    --lifeCount;
                    getContentPane().setBackground(new Color(128, 255, 128));
                    jTextArea1.setText("Lives: " + lifeCount + "\nYou're suffocating! "
                            + "Press next to try again!");
                    break;
                }
            }
        }//close 
        
        else
        if (seen == 8) {
            Object paneBG = UIManager.get("OptionPane.background"); // get original BG
            UIManager.put("OptionPane.background", new Color(200, 200, 255));
            Object[] options = {"Shallower",
                "Deeper"};
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

            switch (option) {
                case 0: //if clicks
                {
                    getContentPane().setBackground(new Color(255, 128, 128));
                    jTextArea1.setText("A submarine is approaching.");
                    seen = 9;
                    break;
                }

                case 1: {
                    --lifeCount;
                    getContentPane().setBackground(new Color(128, 255, 128));
                    jTextArea1.setText("Lives: " + lifeCount + "\nYour brains just "
                            + "exploded from pressure! \nPress next to try again!");
                    break;
                }
            }
        } //end seen 7
        
        else
        if (seen == 9) {
            Object paneBG = UIManager.get("OptionPane.background"); // get original BG
            UIManager.put("OptionPane.background", new Color(200, 200, 255));
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

            switch (option) {
                case 0: //if clicks
                {
                    getContentPane().setBackground(new Color(255, 128,128));
                jTextArea1.setText("The submarine will take you back to Bikini Bottom.");
                seen =10;
                break;
            }
            
            case 1:  
            {
                --lifeCount;
                getContentPane().setBackground(new Color(128, 255, 128));
                jTextArea1.setText("Lives: " + lifeCount + "\nYou're stuck at the bottom of the sea!"
                        + "\nPress next to try again!");
                break;
            }           
        }
            
             
            if(seen == 10)
            {
                jTextArea1.setText("\nCongrats! You made it safely back to Bikini Bottom. "
                    + "\nPress next to try again.");
            seen = 0;
            }
        }//close 8
        
        //********************purple *******************************
        
        if(seen == 11) {
            Object paneBG = UIManager.get("OptionPane.background"); // get original BG
            UIManager.put("OptionPane.background", new Color(200, 200, 255));
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

            switch (option) {
                case 0: //if clicks
                {
                    getContentPane().setBackground(new Color(255, 128, 128));
                    seen = 12;
                }

            }

        }
        if(seen == 12){
            jTextArea1.setText("Passcode Pending!");
        }
        
        if(seen == 13) {
            Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"North", "South","East","West"};
        option = JOptionPane.showOptionDialog(this,
          "Choose a direction",
            "Passcode",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[3]);
        
        UIManager.put("OptionPane.background", paneBG); // reset BG
        //************ End Custom dialog ***********
            
            
        switch(option)
        {
            case 0: //if north
            {
                --lifeCount;
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("Lives: " +lifeCount+ "\nYou've been attacked "
                        + "by zombie pinapples!\nPress Next to try again!");
                break;
            }   
            case 1:  //south
            {
                getContentPane().setBackground( new Color(128,255,128)); 
                jTextArea1.setText("You've been caught by a fishnet!");
                seen = 15; 
                break;
            }
            
            case 2: //east
            {
                --lifeCount;
                getContentPane().setBackground( new Color(255,128,128));
                jTextArea1.setText("Lives: " +lifeCount+ "\nYou've been attacked "
                        + "by shark puppies!\nPress Next to try again!");
                break;
            }
             case 3: //west
            {
                //getContentPane().setBackground( new Color(128,128,255)); 
                 jTextArea1.setText("You find a diner!");
                seen = 18; 
                break;
            }    
        }
        
        }
        
        else
        if(seen == 15){//south
            Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"No",
                    "Yes"};
        option = JOptionPane.showOptionDialog(this,
            "Do you want to try to escape?",
            "Caught!",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]);
        
        switch(option){
            case 0:{//no
                --lifeCount;
                jTextArea1.setText("Lives: " + lifeCount + "\nYou're turned into"
                        + " sushi! \nPress Next to try again!");
                seen = 13;
                break;
            }
            case 1:{//yes
                --lifeCount;
                jTextArea1.setText("Lives: " + lifeCount + "\nYou're stangled!"
                        + "\nPress Next to try again!");
                seen = 13;
                break;
            }
        }
        
        }
        
        else
            if(seen==18){
                    Object paneBG = UIManager.get("OptionPane.background"); // get original BG
        UIManager.put("OptionPane.background", new Color(200,200,255));
        Object[] options = {"Braised Plankton",
                    "Radio-Active Algae"};
        option = JOptionPane.showOptionDialog(this,
            "What will you eat?",
            "Feast!",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[1]);
        
        switch(option){
            case 0:{//braised
                --lifeCount;
                jTextArea1.setText("Lives: " + lifeCount + "\nYou're poisoned!"
                        + "\nPress Next to try again!");
                seen = 18;
                break;
            }
            case 1:{//radio-active
                ++lifeCount;
                jTextArea1.setText("Lives: " + lifeCount + "\nYou're strengthened!");
                seen = 19;
                break;
            }
        }
        
        }
        
        else
        if(seen==19){
                 jTextArea1.setText("A submarine approaches!");
                 Object paneBG = UIManager.get("OptionPane.background"); // get original BG
            UIManager.put("OptionPane.background", new Color(200, 200, 255));
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

            switch (option) {
                case 0: //if clicks
                {
                    getContentPane().setBackground(new Color(255, 128,128));
                jTextArea1.setText("The submarine will take you back to Bikini Bottom.");
                seen = 10;
                break;
            }
            
            case 1:  
            {
                --lifeCount;
                getContentPane().setBackground(new Color(128, 255, 128));
                jTextArea1.setText("Lives: " + lifeCount + "\nYou're stuck at the bottom of the sea!"
                        + "\nPress next to try again!");
                break;
            }
            }
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
//submit button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (seen == 4) {
            int yearInput;
            int yearInput2;
            yearInput = Integer.parseInt(jTextField1.getText());
            yearInput2 = Integer.parseInt(jTextField2.getText());
            
//            if (Math.abs(squidMiss.compareY()) < 0) {
//                jTextArea1.setText(yearInput + " had " + Math.abs(squidMiss.compareY()) + " less missing persons reports than " + yearInput2);
//                seen = 4;
//            } else if (squidMiss.compareY() > 0) {
//                jTextArea1.setText(yearInput + " had " + Math.abs(squidMiss.compareY()) + " more missing persons reports than " + yearInput2);
//                seen = 4;
//            } else {
//                jTextArea1.setText(yearInput + " and " + yearInput2 + "had the same amount of missing persons reports\n");
//                seen = 4;
//            }
            jTextArea1.setText("years " + yearInput +"\n"+ yearInput2);
            System.out.println("index " + squidMiss.getMissCount());
           seen = 5;
        }

        
        if (seen == 12) {
            int passcode;
            passcode = Integer.parseInt(jTextField1.getText());

            if (SquidData.isPrime(passcode) == false || passcode > 31 || passcode < 23) {
               
                Object paneBG = UIManager.get("OptionPane.background"); // get original BG
                UIManager.put("OptionPane.background", new Color(200, 200, 255));
                Object[] options = {"OK"};
                int option = JOptionPane.showOptionDialog(this,
                        "Your passcode must be prime number between 23-31 \n",
                        "Passcode",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);

                UIManager.put("OptionPane.background", paneBG); // reset BG
                //************ End Custom dialog ***********

                switch (option) {
                    case 0: //if clicks
                    {
                        getContentPane().setBackground(new Color(255, 128, 128));
                        seen = 12;
                    }

                }
            } else {
                jTextArea1.setText("Passcode Accepted! Click next!");
                seen = 13;
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
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private boolean isNumeric(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
