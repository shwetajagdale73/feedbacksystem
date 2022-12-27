package net.javaguides.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.border.EmptyBorder;

/**
 * User Registration using Swing
 * @author javaguides.net
 *
 */
public class UserRegistration extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField restotitle;
    private JTextField restorating;
    private JTextField cleanliness;
    private JTextField foodprice;
    private JTextField foodquality;
    
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JRadioButton star;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UserRegistration frame = new UserRegistration();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public UserRegistration() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

     
        
        JLabel lblFeedbackForm = new JLabel("Feedback Form For Restaurant");
        lblFeedbackForm.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblFeedbackForm.setBounds(322, 12, 525, 50);
        contentPane.add(lblFeedbackForm);
        
        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblName.setBounds(38, 70, 79, 20);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel.setBounds(38, 110, 160, 20);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Reviewer Email");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblEmailAddress.setBounds(38, 150, 124, 20);
        contentPane.add(lblEmailAddress);
        
        JLabel lblTitle = new JLabel("Restaurant Name");
        lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblTitle.setBounds(38, 190, 124, 20);
        contentPane.add(lblTitle);
        
        JLabel lblrate = new JLabel("Rating:  (poor/very poor/good/better/best)");
        lblrate.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblrate.setBounds(390, 230, 624, 20);
        contentPane.add(lblrate);
        
        JLabel lblrating = new JLabel("How would you rate this Restaurant overall?");
        lblrating.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblrating.setBounds(38, 270, 624, 20);
        contentPane.add(lblrating);
        
        JLabel lblclean = new JLabel("How was the cleanliness?");
        lblclean.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblclean.setBounds(700, 270, 624, 20);
        contentPane.add(lblclean);

        JLabel lblprice = new JLabel("How was price?");
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblprice.setBounds(38, 350, 624, 20);
        contentPane.add(lblprice);
        
        JLabel lblquality = new JLabel("How was the quality of food?");
        lblquality.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblquality.setBounds(700, 350, 624, 20);
        contentPane.add(lblquality);
        
        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        firstname.setBounds(150, 70, 160, 25);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lastname.setBounds(150, 110, 160, 25);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();
        email.setFont(new Font("Tahoma", Font.PLAIN, 14));
        email.setBounds(150, 150, 160, 25);
        contentPane.add(email);
        email.setColumns(10);
        
        restotitle = new JTextField();
        restotitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
        restotitle.setBounds(150, 190, 160, 25);
        contentPane.add(restotitle);
        restotitle.setColumns(10);
        
        restorating = new JTextField();
        restorating.setFont(new Font("Tahoma", Font.PLAIN, 14));
        restorating.setBounds(38, 300, 250, 25);
        contentPane.add(restorating);
        restorating.setColumns(10);
        
        cleanliness = new JTextField();
        cleanliness.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cleanliness.setBounds(700, 300, 250, 25);
        contentPane.add(cleanliness);
        cleanliness.setColumns(10);
        
        foodprice = new JTextField();
        foodprice.setFont(new Font("Tahoma", Font.PLAIN, 14));
        foodprice.setBounds(38, 380, 250, 25);
        contentPane.add(foodprice);
        foodprice.setColumns(10);
        
        foodquality = new JTextField();
        foodquality.setFont(new Font("Tahoma", Font.PLAIN, 14));
        foodquality.setBounds(700, 380, 250, 25);
        contentPane.add(foodquality);
        foodquality.setColumns(10);


        

        
        
        btnNewButton = new JButton("Submit");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String Title = restotitle.getText();
                String rating = restorating.getText();
               // String mobileNumber = mob.getText();
                String clean = cleanliness.getText();
                String price = foodprice.getText();
                String quality = foodquality.getText();
                //int len = mobileNumber.length();
				//String password = passwordField.getText();
				
				
                String msg = "" + firstName;           				
                msg += " \n";
                /*
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }
                */

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo", "root", "vaishu");

                    String query = "INSERT INTO restofeed values('" + firstName + "','" + lastName + "','" + emailId + "','" + Title + "','" + rating
                    		+ "', '" +
                    		clean + "','" + price + "', '" + quality + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Thankyou!, " + msg + "Your feedback is sucessfully recorded");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(399, 447, 259, 74);
        contentPane.add(btnNewButton);
    }
}
