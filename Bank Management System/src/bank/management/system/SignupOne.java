package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameText, fnameText, emailText, addressText, cityText,stateText, pincodeText;
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser dateChooser;

    SignupOne() {

        setLayout(null);

        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personDetail = new JLabel("Page 1: Personal Details ");
        personDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetail.setBounds(290, 80, 400, 30);
        add(personDetail);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameText = new JTextField();
        nameText.setFont(new Font("Raleway", Font.BOLD, 14));
        nameText.setBounds(300, 140, 400, 30);
        add(nameText);

        JLabel fathername = new JLabel("Father's Name: ");
        fathername.setFont(new Font("Raleway", Font.BOLD, 20));
        fathername.setBounds(100, 190, 200, 30);
        add(fathername);

        fnameText = new JTextField();
        fnameText.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameText.setBounds(300, 190, 400, 30);
        add(fnameText);

        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setBounds(300, 290, 60, 30);
        add(male);

        female = new JRadioButton("Female");
        female.setBackground(Color.WHITE);
        female.setBounds(450, 290, 120, 30);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailText = new JTextField();
        emailText.setFont(new Font("Raleway", Font.BOLD, 14));
        emailText.setBounds(300, 340, 400, 30);
        add(emailText);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBackground(Color.WHITE);
        married.setBounds(300, 390, 100, 30);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(Color.WHITE);
        unmarried.setBounds(450, 390, 100, 30);
        add(unmarried);

        other = new JRadioButton("Others");
        other.setBackground(Color.WHITE);
        other.setBounds(600, 390, 100, 30);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressText = new JTextField();
        addressText.setFont(new Font("Raleway", Font.BOLD, 14));
        addressText.setBounds(300, 440, 400, 30);
        add(addressText);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        cityText = new JTextField();
        cityText.setFont(new Font("Raleway", Font.BOLD, 14));
        cityText.setBounds(300, 490, 400, 30);
        add(cityText);
        
        
        
        JLabel pincode = new JLabel("Pincode: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 540, 200, 30);
        add(pincode);

        pincodeText = new JTextField();
        pincodeText.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeText.setBounds(300, 540, 400, 30);
        add(pincodeText);
        
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 590, 200, 30);
        add(state);
        
        stateText = new JTextField();
        stateText.setFont(new Font("Raleway", Font.BOLD, 14));
        stateText.setBounds(300, 590, 400, 30);
        add(stateText);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameText.getText();
        String fname = fnameText.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        }
        if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailText.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        }
        if (unmarried.isSelected()) {
            marital = "Unmarried";
        }
        if (other.isSelected()) {
            marital = "Other";
        }

        String address = addressText.getText();
        String city = cityText.getText();
        String state = stateText.getText();
        String pincode = pincodeText.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }
            else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }    
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String args[]) {
        new SignupOne();
    }
}
