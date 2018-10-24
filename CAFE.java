
package CAFE;
import java.util.*;
//import java.util.Random;
import java.text.SimpleDateFormat;
import java.sql.*;
import javax.swing.*;

public class CAFE extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    Connection conn=null;

    double[] drink=new double[5];
    double[] cake=new double[10];
    double[] cost=new double[10];
    double i[]=new double[10];
    
    public CAFE() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KINGNATO CAFETERIA MANAGEMENT SYSTEM");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 586, -1));

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 380, 250, 178));

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 240, 178));

        TOTAL.setText("TOTAL");
        TOTAL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TOTALMouseClicked(evt);
            }
        });
        getContentPane().add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 73, -1));

        jButton1.setText("RESET");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 90, -1));

        jButton2.setText("RECEIPT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 87, -1));

        jButton3.setText("EXIT");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 480, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 74, 323, 384));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 230));

        jCheckBox1.setText("Lattle");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jCheckBox2.setText("Iced Lattle");
        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jCheckBox3.setText("Cappuccino");
        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jCheckBox4.setText("Iced Cappuccino");
        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 240, 230));

        jCheckBox5.setText("CoffeeCake");
        jCheckBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox5MouseClicked(evt);
            }
        });
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jCheckBox6.setText("Red Velvet Cake");
        jCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jCheckBox7.setText("Bostons Cream Pie");
        jCheckBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox7MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jCheckBox8.setText("Chocoloate Cake");
        jCheckBox8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox8MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        jCheckBox9.setText("LagosChocolate Cake");
        jCheckBox9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox9MouseClicked(evt);
            }
        });
        getContentPane().add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 130, -1));

        jCheckBox10.setText("Black Forest Cake");
        jCheckBox10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox10MouseClicked(evt);
            }
        });
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        jTextField1.setText("0");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 60, -1));

        jTextField2.setText("0");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 60, -1));

        jTextField3.setText("0");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 60, -1));

        jTextField4.setText("0");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 60, -1));

        jTextField5.setText("0");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 50, -1));

        jTextField6.setText("0");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 50, -1));

        jTextField7.setText("0");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 50, -1));

        jTextField8.setText("0");
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 50, -1));

        jTextField9.setText("0");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 50, -1));

        jTextField10.setText("0");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 50, -1));

        jLabel6.setText("Cost of Drinks");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel7.setText("Cost of Cakes");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 70, -1));

        jLabel8.setText("Service Charge");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 80, -1));

        jLabel9.setText("0");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 80, 20));

        jLabel10.setText("0");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 80, 20));

        jLabel11.setText("0");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 80, 20));

        jLabel12.setText("Tax");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 60, -1));

        jLabel13.setText("SubTotal");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 50, -1));

        jLabel14.setText("Total");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 50, -1));

        jLabel15.setText("0");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 50, 20));

        jLabel16.setText("0");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 50, 20));

        jLabel17.setText("0");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 50, 20));

        jButton4.setText("ORDER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, -1, -1));

        jLabel18.setText("Enter Your Name");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 20));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, -1));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 70, 20));

        pack();
    }// </editor-fold>                        

    
    
    //conn=MysqlConnect.ConnectDB();
    
     

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        System.exit(0);
    }                                     

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        jTextField1.setText("0");
        jTextField2.setText("0");
        jTextField3.setText("0");
        jTextField4.setText("0");
        jTextField5.setText("0");
        jTextField6.setText("0");
        jTextField7.setText("0");
        jTextField8.setText("0");
        jTextField9.setText("0");
        jTextField10.setText("0");
        jTextArea1.setText(null);
        jLabel9.setText("0");
        jLabel10.setText("0");
        jLabel11.setText("0");
        jLabel15.setText("0");
        jLabel16.setText("0");
        jLabel17.setText("0");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        
        
        
        
        
    }                                     

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        drink[0]=Double.parseDouble(jTextField1.getText());
        drink[1]=Double.parseDouble(jTextField2.getText());
        drink[2]=Double.parseDouble(jTextField3.getText());
        drink[3]=Double.parseDouble(jTextField4.getText());
        cake[0]=Double.parseDouble(jTextField5.getText());
        cake[1]=Double.parseDouble(jTextField6.getText());
        cake[2]=Double.parseDouble(jTextField7.getText());
        cake[3]=Double.parseDouble(jTextField8.getText());
        cake[4]=Double.parseDouble(jTextField9.getText());
        cake[5]=Double.parseDouble(jTextField10.getText());
        cost[0]=Double.parseDouble(jLabel15.getText());
        cost[1]=Double.parseDouble(jLabel16.getText());
        cost[2]=Double.parseDouble(jLabel17.getText());
        
        int ref=1325+(int)(Math.random()*4238);
        int refs=ref;
        Calendar timer=Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat time=new SimpleDateFormat("HH:mm:ss");
        time.format(timer.getTime());
        SimpleDateFormat date=new SimpleDateFormat("dd:mm:yyyy");
        date.format(timer.getTime());
        
        String t=jTextField11.getText();
        
        
        
        
        jTextArea1.append("\t\n KINGNATO CAFETERIA MANAGEMENT SYSTEM:\n\n"+"Customer Name: "+t+"     Refernce: "+refs+"\n================================="+"\n\nLattle \t\t\t"+drink[0]+"\nIced Lattle\t\t\t"+drink[1]
        +"\nCappuccino\t\t\t"+drink[2]+"\nIced Cappuccino\t\t"+drink[3]+"\n===================================\t\t"+
                "\nCoffee Cake\t\t\t"+cake[0]+"\nRed Velvet Cake\t\t"+cake[1]+"\nBoston Cream Pie\t\t"+cake[2]+"\nChocolate Cake\t\t"+cake[3]+
                "\nLagos Chocolate Cake\t\t"+cake[4]+"\nBlack Forest Cake\t\t"+cake[5]+"\nTax : "+cost[0]+"\nSub Total : "+cost[1]+
                  "\nTotal : "+cost[2]+ "\n\n\n Date : "+date.format(timer.getTime())+
                "\n Time : "+time.format(timer.getTime())+"\n\nThank You!");
        
        
    }                                        

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        double lat=Double.parseDouble(jLabel9.getText());
        double latt=Double.parseDouble(jTextField1.getText());
        double ilat=40.0;
        if(jCheckBox1.isSelected())
        {
            i[0]=(latt*ilat)+lat;
            String x=String.format("%.2f",i[0]);
            jLabel9.setText(x);
            jTextField1.setText(x);
            
        }
    }                                       

    private void jCheckBox2MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        double lat=Double.parseDouble(jLabel9.getText());
        double latt=Double.parseDouble(jTextField2.getText());
        double ilat=40.0;
        if(jCheckBox2.isSelected())
        {
            i[1]=(latt*ilat)+lat;
            String x=String.format("%.2f",i[1]);
            jLabel9.setText(x);
            jTextField2.setText(x);
            
        }
    }                                       

    private void jCheckBox3MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        double lat=Double.parseDouble(jLabel9.getText());
        double latt=Double.parseDouble(jTextField3.getText());
        double ilat=40.0;
        if(jCheckBox3.isSelected())
        {
            i[2]=(latt*ilat)+lat;
            String x=String.format("%.2f",i[2]);
            jLabel9.setText(x);
            jTextField3.setText(x);
            
        }
    }                                       

    private void jCheckBox4MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        double lat=Double.parseDouble(jLabel9.getText());
        double latt=Double.parseDouble(jTextField4.getText());
        double ilat=30.0;
        if(jCheckBox4.isSelected())
        {
            i[3]=(latt*ilat)+lat;
            String x=String.format("%.2f",i[3]);
            jLabel9.setText(x);
            jTextField4.setText(x);
            
        }
    }                                       

    private void jCheckBox5MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        double lat=Double.parseDouble(jLabel10.getText());
        double latt=Double.parseDouble(jTextField5.getText());
        double ilat=50.0;
        if(jCheckBox5.isSelected())
        {
            i[4]=(latt*ilat)+lat;
            String x=String.format("%.2f",i[4]);
            jLabel10.setText(x);
            jTextField5.setText(x);
            
        }
    }                                       

    private void jCheckBox6MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        double lat=Double.parseDouble(jLabel10.getText());
        double latt=Double.parseDouble(jTextField6.getText());
        double ilat=40.0;
        if(jCheckBox6.isSelected())
        {
            i[5]=(latt*ilat)+lat;
            String x=String.format("%.2f",i[5]);
            jLabel10.setText(x);
            jTextField6.setText(x);
            
        }
    }                                       

    private void jCheckBox7MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        double lat=Double.parseDouble(jLabel10.getText());
        double latt=Double.parseDouble(jTextField7.getText());
        double ilat=50.0;
        if(jCheckBox7.isSelected())
        {
            i[6]=(latt*ilat)+lat;
            String x=String.format("%.2f",i[6]);
            jLabel10.setText(x);
            jTextField7.setText(x);
            
        }
    }                                       

    private void jCheckBox8MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        double lat=Double.parseDouble(jLabel10.getText());
        double latt=Double.parseDouble(jTextField8.getText());
        double ilat=50.0;
        if(jCheckBox8.isSelected())
        {
            i[7]=(latt*ilat)+lat;
            String x=String.format("%.2f",i[7]);
            jLabel10.setText(x);
            jTextField8.setText(x);
            
        }
    }                                       

    private void jCheckBox9MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        double lat=Double.parseDouble(jLabel10.getText());
        double latt=Double.parseDouble(jTextField9.getText());
        double ilat=40.0;
        if(jCheckBox9.isSelected())
        {
            i[8]=(latt*ilat)+lat;
            String x=String.format("%.2f",i[8]);
            jLabel10.setText(x);
            jTextField9.setText(x);
            
        }
    }                                       

    private void jCheckBox10MouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        double lat=Double.parseDouble(jLabel10.getText());
        double latt=Double.parseDouble(jTextField10.getText());
        double ilat=50.0;
        if(jCheckBox10.isSelected())
        {
            i[9]=(latt*ilat)+lat;
            String x=String.format("%.2f",i[9]);
            jLabel10.setText(x);
            jTextField10.setText(x);
            
        }
    }                                        

    private void TOTALMouseClicked(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        double tax=12.0;
        String Tax=String.format("%.2f",tax);
        jLabel15.setText(Tax);
        double q=Double.parseDouble(Tax);
        double x=Double.parseDouble(jLabel9.getText());
        double y=Double.parseDouble(jLabel10.getText());
        double z=x+y+q;
        String Total=String.format("%.2f",z);
        jLabel16.setText(Total);
        jLabel17.setText(Total);
        
    }                                  

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        con=MysqlConnect1.ConnectDB();
        String Name=jTextField11.getText();
       
        String price=jLabel17.getText();
        
        double Price=Double.parseDouble(price);
        if (jTextField11.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(null,"Please Enter Name and Press Total Button","Access denied",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        double q=Double.parseDouble(jLabel17.getText());
        if(q==0.0){
            JOptionPane.showMessageDialog(null,"Please Enter Name and Press Total Button","Access denied",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        String query="Insert into record(name,price) values(?,?)";
        try{
        pst=con.prepareStatement(query);
        pst.setString(1, Name);
        pst.setDouble(2, Price);
        //rs=pst.executeQuery();
        
        if(pst.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Order Successful");
                jTextField1.setText("0");
        jTextField2.setText("0");
        jTextField3.setText("0");
        jTextField4.setText("0");
        jTextField5.setText("0");
        jTextField6.setText("0");
        jTextField7.setText("0");
        jTextField8.setText("0");
        jTextField9.setText("0");
        jTextField10.setText("0");
        jTextArea1.setText(null);
        jLabel9.setText("0");
        jLabel10.setText("0");
        jLabel11.setText("0");
        jLabel15.setText("0");
        jLabel16.setText("0");
        jLabel17.setText("0");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);
        jCheckBox9.setSelected(false);
        jCheckBox10.setSelected(false);
        jTextField11.setText(null);
                
            }
        else
              JOptionPane.showMessageDialog(null, "Not Successful");
            
        }catch(Exception e){
         JOptionPane.showMessageDialog(null,e);   
        }
        
        
        
        
    }                                        

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
            java.util.logging.Logger.getLogger(CAFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAFE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton TOTAL;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration                   
}
