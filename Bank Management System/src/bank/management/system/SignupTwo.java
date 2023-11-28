
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField panNumberText,aadharText;
    JButton next;
    JRadioButton snrYes,snrNo,eAYes,eANo;
    JComboBox religionBox,CategoryBox,OccupationBox,incomeBox,EducationBox;
    String formno;
    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);
           
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetail = new JLabel("Page 1: Additional Details ");
        additionalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetail.setBounds(290, 80, 400, 30);
        add(additionalDetail);

        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);
        
        String[] valReligion = {"Hindu","Muslim","Sikh","Christian","Other"};
        religionBox = new JComboBox(valReligion);
        religionBox.setBounds(300, 140, 400, 30);
        religionBox.setBackground(Color.WHITE);
        add(religionBox);
         
        JLabel category = new JLabel("Category: ");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String[] valCategory = {"General","OBC","SC","ST","Others"};
        CategoryBox = new JComboBox(valCategory);
        CategoryBox.setBounds(300, 190, 400, 30);
        CategoryBox.setBackground(Color.WHITE);
        add(CategoryBox);

        JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String[] valIncome = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        incomeBox = new JComboBox(valIncome);
        incomeBox.setBounds(300, 240, 400, 30);
        incomeBox.setBackground(Color.WHITE);
        add(incomeBox);

        JLabel educational = new JLabel("Educational ");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);

   
        JLabel qualification = new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 320, 200, 30);
        add(qualification);
        
        String[] valEducation = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Others"};
        EducationBox = new JComboBox(valEducation);
        EducationBox.setBounds(300, 320, 400, 30);
        EducationBox.setBackground(Color.WHITE);
        add(EducationBox);

        JLabel occupation = new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String[] valOccupation = {"Salaried","Self-Employeed","Business","Student","Retired","Others"};
        OccupationBox = new JComboBox(valOccupation);
        OccupationBox.setBounds(300, 390, 400, 30);
        OccupationBox.setBackground(Color.WHITE);
        add(OccupationBox);

        JLabel panNumber = new JLabel("PAN Number: ");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        panNumber.setBounds(100, 440, 200, 30);
        add(panNumber);

        panNumberText = new JTextField();
        panNumberText.setFont(new Font("Raleway", Font.BOLD, 14));
        panNumberText.setBounds(300, 440, 400, 30);
        add(panNumberText);

        JLabel aadharNo = new JLabel("Aadhar Number: ");
        aadharNo.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharNo.setBounds(100, 490, 200, 30);
        add(aadharNo);

        aadharText = new JTextField();
        aadharText.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharText.setBounds(300, 490, 400, 30);
        add(aadharText);
        
        
        
        JLabel snrCitizen = new JLabel("Senior Citizen: ");
        snrCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        snrCitizen.setBounds(100, 540, 200, 30);
        add(snrCitizen);
        
        snrYes = new JRadioButton("Yes");
        snrYes.setBounds(300,540,100,30); 
        snrYes.setBackground(Color.WHITE);
        add(snrYes);
        
        snrNo = new JRadioButton("No");
        snrNo.setBounds(450,540,100,30);
        snrNo.setBackground(Color.WHITE);
        add(snrNo);
        
        ButtonGroup snrGroup = new ButtonGroup();
        snrGroup.add(snrYes);
        snrGroup.add(snrNo);

        
        JLabel existingAcc = new JLabel("Existing Account: ");
        existingAcc.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAcc.setBounds(100, 590, 200, 30);
        add(existingAcc);
        
        eAYes = new JRadioButton("Yes");
        eAYes.setBounds(300,590,100,30);
        eAYes.setBackground(Color.WHITE);
        add(eAYes);
        
        eANo = new JRadioButton("No");
        eANo.setBounds(450,590,100,30);
        eANo.setBackground(Color.WHITE);
        add(eANo);
        
        ButtonGroup eAGroup = new ButtonGroup();
        eAGroup.add(eAYes);
        eAGroup.add(eANo);
        

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
    
        String religion = (String) religionBox.getSelectedItem();
        String category = (String) CategoryBox.getSelectedItem();
        String income = (String) incomeBox.getSelectedItem();
        String education = (String) EducationBox.getSelectedItem();
        String occupation = (String) OccupationBox.getSelectedItem();
        String seniorcitizen = null;
        if (snrYes.isSelected()) {
            seniorcitizen= "Yes";
        }
        if (snrNo.isSelected()) {
            seniorcitizen = "No";
        }

        
        String existingacc = null;
        if (eAYes.isSelected()) {
            existingacc = "Yes";
        }
        if (eANo.isSelected()) {
            existingacc = "No";
        }
    

        String pan = panNumberText.getText();
        String aadhar = aadharText.getText();
        
        
        try{   
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+seniorcitizen+"','"+existingacc+"')";
            c.s.executeUpdate(query);
            
            //signupthree object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
           
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public static void main(String args[]) {
        new SignupTwo("");
    }
}

