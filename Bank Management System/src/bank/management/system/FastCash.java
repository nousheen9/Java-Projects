package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener{
    
    JButton A1,A2,A3,A4,A5,A6,back;
    String pinnumber;
    
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(220,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System" , Font.BOLD, 16));
        image.add(text);
        
        
        A1 = new JButton("Rs 100");
        A1.setBounds(170,415,150,30);
        A1.addActionListener(this);
        image.add(A1);
        
        A2 = new JButton("Rs 500");
        A2.setBounds(355,415,150,30);
        A2.addActionListener(this);
        image.add(A2);
        
        A3 = new JButton("Rs 1000");
        A3.setBounds(170,450 ,150,30);
        A3.addActionListener(this);
        image.add(A3);
        
        A4 = new JButton("Rs 2000");
        A4.setBounds(355,450,150,30);
        A4.addActionListener(this);
        image.add(A4);
        
        A5 = new JButton("Rs 5000");
        A5.setBounds(170,485 ,150,30);
        A5.addActionListener(this);
        image.add(A5);
        
        A6 = new JButton("Rs 10000");
        A6.setBounds(355,485 ,150,30);
        A6.addActionListener(this);
        image.add(A6);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);  
       
    }
    
  
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c = new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance =0;
                while(rs.next()){
                    if(rs.getString("type_name").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if(ae.getSource()!=back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " + amount + "Debited Sucessfully");
                
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
                
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public static void main(String args[]){
        new FastCash("");
    }
    
}

