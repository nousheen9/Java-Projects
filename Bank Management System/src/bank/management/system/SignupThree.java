
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public  class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton saveAcc,fdAcc,currAcc,recAcc;
    JCheckBox atmService,internetService,mobService,emailAlerts,chequeBook,eService,declare;
    JButton submit,cancel;
    String formno;
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        saveAcc = new JRadioButton("Saving Account");
        saveAcc.setFont(new Font("Raleway", Font.BOLD,16));
        saveAcc.setBackground(Color.WHITE);
        saveAcc.setBounds(100,180,150,20);
        add(saveAcc);
        
        fdAcc = new JRadioButton("Fixed Deposit Account");
        fdAcc.setFont(new Font("Raleway", Font.BOLD,16));
        fdAcc.setBackground(Color.WHITE);
        fdAcc.setBounds(350,180,250,20);
        add(fdAcc);
        
        currAcc = new JRadioButton("Current Account");
        currAcc.setFont(new Font("Raleway", Font.BOLD,16));
        currAcc.setBackground(Color.WHITE);
        currAcc.setBounds(100,220,250,20);
        add(currAcc);
        
        recAcc = new JRadioButton("Recurring Deposit Account");
        recAcc.setFont(new Font("Raleway", Font.BOLD,16));
        recAcc.setBackground(Color.WHITE);
        recAcc.setBounds(350,220,250,20);
        add(recAcc);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(saveAcc);
        groupaccount.add(fdAcc);
        groupaccount.add(currAcc);
        groupaccount.add(recAcc);
        
        JLabel card = new JLabel("Card Number: ");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,330,300,20);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pinNumber = new JLabel("XXXX");
        pinNumber.setFont(new Font("Raleway",Font.BOLD,22));
        pinNumber.setBounds(330,370,300,30);
        add(pinNumber);
        
        JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,300,20);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required: ");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,400,20);
        add(services);
        
        atmService = new JCheckBox("ATM CARD");
        atmService.setBackground(Color.WHITE);
        atmService.setFont(new Font("Raleway", Font.BOLD,16));
        atmService.setBounds(100,500,200,30);
        add(atmService);
        
        internetService = new JCheckBox("Internet Banking");
        internetService.setBackground(Color.WHITE);
        internetService.setFont(new Font("Raleway", Font.BOLD,16));
        internetService.setBounds(350,500,200,30);
        add(internetService);
        
        mobService = new JCheckBox("Mobile Banking");
        mobService.setBackground(Color.WHITE);
        mobService.setFont(new Font("Raleway", Font.BOLD,16));
        mobService.setBounds(100,550,200,30);
        add(mobService);
        
        emailAlerts = new JCheckBox("Email & SMS ALERTS");
        emailAlerts.setBackground(Color.WHITE);
        emailAlerts.setFont(new Font("Raleway", Font.BOLD,16));
        emailAlerts.setBounds(350,550,200,30);
        add(emailAlerts);
        
        chequeBook = new JCheckBox("Cheque Book");
        chequeBook.setBackground(Color.WHITE);
        chequeBook.setFont(new Font("Raleway", Font.BOLD,16));
        chequeBook.setBounds(100,600,200,30);
        add(chequeBook);
        
        eService = new JCheckBox("E-Statement");
        eService.setBackground(Color.WHITE);
        eService.setFont(new Font("Raleway", Font.BOLD,16));
        eService.setBounds(350,600,200,30);
        add(eService);
        
        declare = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.");
        declare.setBackground(Color.WHITE);
        declare.setFont(new Font("Raleway", Font.BOLD,12));
        declare.setBounds(100,680,600,30);
        add(declare);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==submit){
           String accountType = null;
           if(saveAcc.isSelected()){
               accountType = "Saving Account";
           }
           else if(fdAcc.isSelected()){
               accountType = "Fixed Deposit Account";
           }
           else if(currAcc.isSelected()){
               accountType = "Current Account";
           }
           else if(recAcc.isSelected()){
               accountType = "Reccuring Deposit Account";
           }
           
           Random random = new Random(); 
           String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L); 
           
           String pinnumber = "" + Math.abs((random.nextLong()% 9000L) + 1000L);
           
           String facility = "";
           if(atmService.isSelected()){
               facility = facility + "ATM Card";
           }
           else if(internetService.isSelected()){
               facility = facility + "Internet Banking";
           }
           else if(mobService.isSelected()){
               facility = facility + "Mobile Banking";
           }
           else if(emailAlerts.isSelected()){
               facility = facility + "Email & SMS Alerts";
           }
           else if(chequeBook.isSelected()){
               facility = facility + "Cheque Book";
           }
           else if(eService.isSelected()){
               facility = facility + "E-Statement";
           }
           
           
           try{
              if(accountType.equals("")){
                  JOptionPane.showMessageDialog(null,"AccountType is Required");
              }
              else{
                  Conn c = new Conn();
                  String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                  String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                  
                  c.s.executeUpdate(query1);
                  c.s.executeUpdate(query2);
                   
                  JOptionPane.showMessageDialog(null,"Card Number: " + cardnumber + "\n Pin: " + pinnumber );
                  
                  setVisible(false);
                  new Deposit(pinnumber).setVisible(false);
              }
           }
           catch(Exception e){
               System.out.println(e);
           }
           
       } 
       else if(ae.getSource() == cancel){
           setVisible(false);
           new Login().setVisible(true);
       }
    }
    
    public static void main(String args[]){
        new SignupThree("");
    }
}
