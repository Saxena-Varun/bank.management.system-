package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno, minorYes, minorNo;
    JComboBox religion, education, occupation, income;
    String formno;
    
 SignupTwo(String formno) {
        this.formno = formno;

        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
       
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel ireligion = new JLabel("Religion:");
        ireligion.setFont(new Font("Raleway", Font.BOLD, 20));
        ireligion.setBounds(100, 140, 100, 30);
        add(ireligion);

        String Religion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Buddhist", "Jain", "Other"};
        religion = new JComboBox(Religion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel minorLabel = new JLabel("Minor Account:");
        minorLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        minorLabel.setBounds(100, 190, 200, 30);
        add(minorLabel);
        
        minorYes = new JRadioButton("Yes");
        minorYes.setBounds(300, 190, 60, 30);
        minorYes.setBackground(Color.WHITE);
        add(minorYes);

        minorNo = new JRadioButton("No");
        minorNo.setBounds(450, 190, 120, 30);
        minorNo.setBackground(Color.WHITE);
        add(minorNo);

        ButtonGroup minorGroup = new ButtonGroup();
        minorGroup.add(minorYes);
        minorGroup.add(minorNo);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        String IncomeCategory[] = {"Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "Upto 10,00,000"};
        income = new JComboBox(IncomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel qeducation = new JLabel("Educational");
        qeducation.setFont(new Font("Raleway", Font.BOLD, 20));
        qeducation.setBounds(100, 290, 200, 30);
        add(qeducation);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);

        String EducationValues[] = {"Non-Graduation", "Graduation", "Post-Graduation", "Doctrate", "Others"};
        education = new JComboBox(EducationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel employed = new JLabel("Occupation:");
        employed.setFont(new Font("Raleway", Font.BOLD, 20));
        employed.setBounds(100, 390, 200, 30);
        add(employed);

        String Occupation[] = {"Employed", "Self-Employed", "UnEmployed", "Retired", "Student", "Business", "Others"};
        occupation = new JComboBox(Occupation);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel pan = new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        JLabel citizen = new JLabel("Senior Citizen:");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100, 540, 200, 30);
        add(citizen);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 60, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 120, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);

        JLabel account = new JLabel("Existing Account:");
        account.setFont(new Font("Raleway", Font.BOLD, 20));
        account.setBounds(100, 590, 200, 30);
        add(account);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 60, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 120, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup accountgroup = new ButtonGroup();
        accountgroup.add(eyes);
        accountgroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        minorYes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panTextField.setEnabled(false);
                panTextField.setText("");
            }
        });

        minorNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panTextField.setEnabled(true);
            }
        });

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
  public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String sincome = (String) income.getSelectedItem();

        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }

        String minorAccount = null;
        if (minorYes.isSelected()) {
            minorAccount = "Yes";
        } else if (minorNo.isSelected()) {
            minorAccount = "No";
        }
 String span = panTextField.getText();
        String saadhar = aadharTextField.getText();

        try {
            if (sreligion.equals("") || seducation.equals("") || soccupation.equals("") || sincome.equals("") || seniorcitizen == null || existingaccount == null || minorAccount == null || saadhar.equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            } else {
                Conn c = new Conn();
                String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" + minorAccount + "','" + seducation + "','" + soccupation + "','" + sincome + "','" + seniorcitizen + "','" + existingaccount + "','" + span + "','" + saadhar + "')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignupTwo("");
    }
}

