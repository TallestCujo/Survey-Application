/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Survey_Application;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author BLACK PAPER
 */
public class survey_Application extends javax.swing.JFrame {

    public survey_Application() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        movie_Rating = new javax.swing.ButtonGroup();
        radio_Rating = new javax.swing.ButtonGroup();
        eat_Rate = new javax.swing.ButtonGroup();
        tv_Rate = new javax.swing.ButtonGroup();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fulNames = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        emailText = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        numContact = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        checkPizza = new javax.swing.JCheckBox();
        checkPasta = new javax.swing.JCheckBox();
        checkPap = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        DOB = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Personal Details :");

        jLabel2.setText("Full Names");

        jScrollPane1.setViewportView(fulNames);

        jLabel3.setText("Email");

        jScrollPane2.setViewportView(emailText);

        jLabel4.setText("Date of Birth");

        jLabel5.setText("Contact Number");

        numContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numContactKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(numContact);

        jLabel6.setText("What is your favorite food?");

        checkPizza.setText("Pizza");

        checkPasta.setText("Pasta");

        checkPap.setText("Pap and Wors");

        jCheckBox4.setText("Other");

        jLabel7.setText("Please rate your level of agreement on a scale from 1 to 5, with 1 being \"strongly agree\" and 5 being \"strongly disagree.\"");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Strongly Agree", "Agree", "Neutral", "Disagree", "Strongly Disagree"
            }
        ));
        jScrollPane6.setViewportView(jTable3);

        movie_Rating.add(jRadioButton1);

        movie_Rating.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        movie_Rating.add(jRadioButton3);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        movie_Rating.add(jRadioButton4);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        movie_Rating.add(jRadioButton5);

        jLabel8.setText("I like to watch movies");

        jLabel9.setText("I like to listen to radio");

        jLabel10.setText("I like to eat out");

        jLabel11.setText("I like to watch TV");

        radio_Rating.add(jRadioButton6);

        radio_Rating.add(jRadioButton11);

        radio_Rating.add(jRadioButton20);

        radio_Rating.add(jRadioButton13);

        radio_Rating.add(jRadioButton14);

        eat_Rate.add(jRadioButton7);

        eat_Rate.add(jRadioButton8);

        eat_Rate.add(jRadioButton9);

        eat_Rate.add(jRadioButton10);

        eat_Rate.add(jRadioButton12);

        tv_Rate.add(jRadioButton15);

        tv_Rate.add(jRadioButton16);
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });

        tv_Rate.add(jRadioButton17);

        tv_Rate.add(jRadioButton18);

        tv_Rate.add(jRadioButton19);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton6)
                                    .addComponent(jRadioButton7)
                                    .addComponent(jRadioButton15))
                                .addGap(111, 111, 111)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton11)
                                    .addComponent(jRadioButton8)
                                    .addComponent(jRadioButton16))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton20)
                                    .addComponent(jRadioButton9)
                                    .addComponent(jRadioButton17))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton13)
                                    .addComponent(jRadioButton10)
                                    .addComponent(jRadioButton18)))
                            .addComponent(jLabel11))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton12)
                            .addComponent(jRadioButton14)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton19))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton5)
                                            .addComponent(jRadioButton4))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jLabel8)))
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButton6)
                                        .addComponent(jLabel9)
                                        .addComponent(jRadioButton20, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jRadioButton13)
                                    .addComponent(jRadioButton14)))
                            .addComponent(jRadioButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jRadioButton8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButton10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButton9))
                            .addComponent(jRadioButton12)))
                    .addComponent(jRadioButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jRadioButton15))
                        .addComponent(jRadioButton16))
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton19))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        DOB.setDateFormatString("dd//MM/yyyy\n");

        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("VIEW SURVEY RESULTS");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(345, 345, 345))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1))
                                .addGap(119, 119, 119)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkPizza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkPasta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkPap)
                                        .addGap(28, 28, 28)
                                        .addComponent(jCheckBox4))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(DOB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                            .addComponent(jLabel7))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkPizza)
                    .addComponent(checkPasta)
                    .addComponent(checkPap)
                    .addComponent(jCheckBox4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Object movieRating() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object radioRating() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object eatRating() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object tvRating() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int totalMovies() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int totRadio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int totEat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private int totTv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
public class DBConnect {
    public static void main(String args[]) throws ClassNotFoundException
    {
        Connection conn=null;
        Statement stmt=null;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connecting to database");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/surveydb","root","");
            System.out.println("connected to database successfully");       
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(survey_Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        catch (SQLException ex) {
            Logger.getLogger(survey_Application.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        

        private static Connection connect() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
            
}
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
        //Checking if all information is provided
        if (fulNames.getText().length()<=0 || emailText.getText().length()<=0 || numContact.getText().length()<=0)
        {
            JOptionPane.showMessageDialog(null, "Please provide all information!!");
        }               
        // Check if movie rating is selected
        if(!jRadioButton1.isSelected() && !jRadioButton2.isSelected() && !jRadioButton3.isSelected() && !jRadioButton4.isSelected() && !jRadioButton5.isSelected())             
        {
            JOptionPane.showMessageDialog(null, "Please select your movie rating!!");
        }        
        // Check if radio rating is selected
        if(!jRadioButton6.isSelected() && !jRadioButton11.isSelected() && !jRadioButton20.isSelected() && !jRadioButton13.isSelected() && !jRadioButton14.isSelected())            
        {
            JOptionPane.showMessageDialog(null, "Please select your radio rating!!");
        }
        // Check if eat out rating is selected
        if(!jRadioButton7.isSelected() && !jRadioButton8.isSelected() && !jRadioButton9.isSelected() && !jRadioButton10.isSelected() && !jRadioButton12.isSelected())            
        {
            JOptionPane.showMessageDialog(null, "Please select your eat out rating!!");
        }
        // Check if watch TV rating is selected
         if(!jRadioButton15.isSelected() && !jRadioButton16.isSelected() && !jRadioButton17.isSelected() && !jRadioButton18.isSelected() && !jRadioButton19.isSelected())            
        {
            JOptionPane.showMessageDialog(null, "Please select your TV rating!!");
        }
        try
        {
          
            String favMeal="";
            String favContent="";
             
             Class.forName("com.mysql.jdbc.Driver");
             Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/surveyresults","root","");
             PreparedStatement ps =con.prepareStatement("INSERT INTO `surveyresults`.`results`(`Date of Birth`,`favourite Food`,\n" +"`favourite Hobbie`)VALUES(?,?,?)");
            
             
             
             if(checkPizza.isSelected())
             {
                 favMeal="Pizza";
                 ps.setString(2, favMeal);
             }
             else if (checkPasta.isSelected())
             {
                 favMeal="Pasta";
                 ps.setString(2, favMeal);
             }
             else if(checkPap.isSelected())
             {
                 favMeal="Pap and Wors";
                 ps.setString(2, favMeal);
             }
                         
             ps.setString(3, (String) movieRating());
             ps.setString(4, (String) radioRating());
             ps.setString(5, (String) eatRating());
             ps.setString(6, (String) tvRating());
            
                         
             ps.executeUpdate();
             JOptionPane.showMessageDialog(this, "Data Inserted");
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(survey_Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(survey_Application.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton16ActionPerformed
    
    //This initialize rate for movies
    public int movieRating(int movieRate)
    {
       if(jRadioButton1.isSelected())
       {
           //strongly Agree
           movieRate=1;
       }
       else if(jRadioButton2.isSelected())
       {
           //Agree
           movieRate=2;
       }
       else if(jRadioButton3.isSelected())
       {
           //Neutral
           movieRate=3;
       }
       else if(jRadioButton4.isSelected())
       {
           //Disagree
           movieRate=2;
       }
       else if(jRadioButton5.isSelected())
       {
           //Strongly Disagree
           movieRate=5;
       }
        return movieRate;
    }
      
    //This initialise rate for radio
       public int radioRating(int radioRate)
    {
       if(jRadioButton6.isSelected())
       {
           //strongly Agree
           radioRate=1;
       }
       else if(jRadioButton11.isSelected())
       {
            //Agree
             radioRate=2;
       }
       else if(jRadioButton20.isSelected())
       {
            //Neutral
             radioRate=3;
       }
       else if(jRadioButton13.isSelected())
       {
            //Disagree
             radioRate=4;
       }
       else if(jRadioButton14.isSelected())
       {
            //Strongly Disagree
             radioRate=5;
       }
        return radioRate;
    }
    
       //This initialise eat out rate
           public int eatRating(int eatRate)
    {
       if(jRadioButton7.isSelected())
       {
           //strongly Agree
           eatRate=1;
       }
       else if(jRadioButton8.isSelected())
       {
             //Agree
             eatRate=2;
       }
       else if(jRadioButton9.isSelected())
       {
            //Neutral
             eatRate=3;
       }
       else if(jRadioButton10.isSelected())
       {
            //Disagree
             eatRate=4;
       }
       else if(jRadioButton12.isSelected())
       {
            //Strongly Disagree
             eatRate=5;
       }
        return eatRate;
    }  
           //This initialise Tv rate
           public int tvRating(int tvRate)
    {
       if(jRadioButton15.isSelected())
       {
           //strongly Agree
           tvRate=1;
       }
       else if(jRadioButton16.isSelected())
       {
             //Agree
             tvRate=2;
       }
       else if(jRadioButton17.isSelected())
       {
            //Neutral
             tvRate=3;
       }
       else if(jRadioButton18.isSelected())
       {
            //Disagree
             tvRate=4;
       }
       else if(jRadioButton19.isSelected())
       {
            //Strongly Disagree
             tvRate=5;
       }
        return tvRate;
    }
    
    //Create a function that execute counts
    
    public int execCount(String query)
    {
        
       int totSurvey=0;
       PreparedStatement pst;
       Connection con = getConnection();
       
       try
       {
         
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(query);
         while(rs.next())
         {
             totSurvey=rs.getInt(1);
             
         }
         
       }
       catch (SQLException ex) {
            Logger.getLogger(survey_Application.class.getName()).log(Level.SEVERE, null, ex);
        }
       return totSurvey;
    }
    
    
    //Count people who filled survery
    public int totalPeople()
    {
        String query="SELECT COUNT(*) FROM 'surveyresults'";
        return execCount(query);
    }
     //Count people who likes pizza
    public int totPizza()
    {
        String query="SELECT COUNT(*) FROM 'surveyresults' WHERE favourite Food = 'Pizza'";
        return execCount(query);
    }
     //Count people who likes Pasta
    public int totalPasta()
    {
        String query="SELECT COUNT(*) FROM 'surveyresults' WHERE favourite Food = 'Pasta'";
        return execCount(query);
    }
     //Count people who likes Pap and Wors
    public int totPapandWors()
    {
        String query="SELECT COUNT(*) FROM 'surveyresults' WHERE favourite Food = 'Pap and Wors'";
        return execCount(query);
    }
    
    //Calculate Sum of Movies
    public int sumOfMovie()
    {
        int rowCount = totalPeople();
        int sumMovies=0;
        for(int i=0;i<rowCount;i++)
        {
            sumMovies=sumMovies+Integer.parseInt(movieRating().toString());
        }
        return sumMovies;
    }
      //Calculate Sum of Radio
    public int sumOfRadio()
    {
        int rowCount = totalPeople();
        int sumRadio=0;
        for(int i=0;i<rowCount;i++)
        {
            sumRadio=sumRadio+Integer.parseInt(radioRating().toString());
        }
        return sumRadio;
    }
      //Calculate Sum of Eat out
    public int sumOfEat()
    {
        int rowCount = totalPeople();
        int sumEat=0;
        for(int i=0;i<rowCount;i++)
        {
            sumEat=sumEat+Integer.parseInt(eatRating().toString());
        }
        return sumEat;
    }
      //Calculate Sum of Tv
    public int sumOfTv()
    {
        int rowCount = totalPeople();
        int sumTv=0;
        for(int i=0;i<rowCount;i++)
        {
            sumTv=sumTv+Integer.parseInt(tvRating().toString());
        }
        return sumTv;
    }
    
    //get Movie Average
    
    public float aveMovie(float movieAverage)
    {
      float sum=sumOfMovie();
      int rowCount=totalPeople();
      
      movieAverage=sum/rowCount;
      
      return movieAverage;
    }
    
     //get radio Average
    
    public float aveRadio(float radioAverage)
    {
      float sum=sumOfRadio();
      int rowCount=totalPeople();
      
      radioAverage=sum/rowCount;
      
      return radioAverage;
    }
    
     //get Eat Average
    
    public float aveEat(float eatAverage)
    {
      float sum=sumOfEat();
      int rowCount=totalPeople();
      
      eatAverage=sum/rowCount;
      
      return eatAverage;
    }
     //get Tv Average
    
    public float aveTv(float tvAverage)
    {
      float sum=sumOfTv();
      int rowCount=totalPeople();
      
      tvAverage=sum/rowCount;
      
      return tvAverage;
    }
    
    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       
        int numPizza=totPizza();
        int numPasta=totalPasta();
        int numPapWors=totPapandWors();
        int numMovies=totalMovies();
        int numRadio=totRadio();
        int numEat=totEat();
        int numTv=totTv();
        
        // calculate the percentage of favourite food choices
        double pizzaPerc= (numPizza/totalPeople())*100;
        double pastaPerc= (numPasta/totalPeople())*100;
        double papPerc= (numPapWors/totalPeople())*100;
        
               
        //This code shows survey results
        //survey_Results rslt= new survey_Results();
       /* 
        rslt.lblNumSurveys.setText(totalPeople().toText());
        rslt.lblPizzaPercent.setText(pizzaPerc.getText());
        rslt.lblPastaPercent.setText(pastaPerc.getText());
        rslt.lblPapWors.setText(papPerc.getText());
        rslt.lblNumMovies.setText(movieRating().getText());
        rslt.lblNumRadio.setText(radioRating().getText());
        rslt.lblNumEat.setText(eatRating().getText());
        rslt.lblNumTv.setText(tvRating().getText());
        
        rslt.setVisible(true);*/
        
        
    
     
       
        
        
    }//GEN-LAST:event_jLabel12MouseClicked
    // The following function allow user to enter only numbers on contact numbers   
    private void numContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numContactKeyTyped
        
        char c=evt.getKeyChar();
        
        if(!Character.isDigit(c)){
            evt.consume();
        }
        
    }//GEN-LAST:event_numContactKeyTyped

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(survey_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(survey_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(survey_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(survey_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new survey_Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JCheckBox checkPap;
    private javax.swing.JCheckBox checkPasta;
    private javax.swing.JCheckBox checkPizza;
    private javax.swing.ButtonGroup eat_Rate;
    private javax.swing.JTextPane emailText;
    private javax.swing.JTextPane fulNames;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.ButtonGroup movie_Rating;
    private javax.swing.JTextPane numContact;
    private javax.swing.ButtonGroup radio_Rating;
    private javax.swing.ButtonGroup tv_Rate;
    // End of variables declaration//GEN-END:variables
}
