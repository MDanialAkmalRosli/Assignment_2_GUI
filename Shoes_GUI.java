 // Assignment 2 GUI 
 //  Create a graphic user-interface for program Shoes 
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   
class Shoes_GUI extends JFrame implements ActionListener {
   
   // My interface components
   private Container n;
   private JLabel title; // title of the interface     
   private JLabel name; // name                        
   private JTextField a_name;                        
   private JLabel age; // age                          
   private JComboBox a_age;                          
   private JLabel gender; // gender                   
   private JRadioButton male;                        
   private JRadioButton female;                      
   private ButtonGroup mof;
   private JLabel footsize; // foot size              
   private JComboBox a_foot;                         
   private JLabel email; // email                      
   private JTextField a_email;                       
   private JLabel pword; // password                   
   private JPasswordField a_pword;                   
   private JButton confirm; // confirms user
   private JCheckBox t_and_c; // terms & conditions
   private JButton reset; // resets the data
   private JLabel select; // sttment select shoes
   private JButton shoe1;
   private JButton shoe2;
   private JButton shoe3;
   private JTextArea display; // display the data entered
   private JLabel belowtxt; 
   
   private String ages[] = {"13", "14", "15", "16", "17", "18",
                            "19", "20", "21", "22", "23", "24"};
                            
   private String sizes[] = {"7", "8", "9", "10", "11", "12"};
   
   // name & basic features of the Shoes
   String nmsh1 = "Nike FlexiSport";
   String nmsh2 = "Mountain Boots";
   String nmsh3 = "Converse Shoes";
   
   String basechara = "@ This shoe has laces. \n" +
                      "@ Durable. \n@ Unisex, suitable for men & women. \n\n";
  
   // Constructor
   public Shoes_GUI() {
      setTitle("My First GUI!"); 
      setBounds(300, 90, 950, 630);  
      setDefaultCloseOperation(EXIT_ON_CLOSE); 
      setResizable(false);
      
      n = getContentPane(); 
      n.setLayout(null);
      
      // title inside the GUI
      title = new JLabel("Welcome to the Shoes Info!"); 
         title.setFont(new Font("Times New Roman", Font.BOLD, 20)); 
         title.setSize(350, 40); 
         title.setLocation(350, 20); 
         n.add(title); 

      // attribute regarding name
      name = new JLabel("Enter your name:"); 
         name.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         name.setSize(150, 20); 
         name.setLocation(50, 80); 
         n.add(name);
      
      a_name = new JTextField();
         a_name.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         a_name.setSize(190, 25); 
         a_name.setLocation(200, 80); 
         n.add(a_name);
      
      // attribute regarding age
      age = new JLabel("Age: ");
         age.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         age.setSize(100, 20); 
         age.setLocation(50, 130); 
         n.add(age);
         
      a_age = new JComboBox(ages);
         a_age.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         a_age.setSize(75, 25); 
         a_age.setLocation(150, 130); 
         n.add(a_age);
      
      // attribute regarding gender
      gender = new JLabel("Gender: ");
         gender.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         gender.setSize(100, 20); 
         gender.setLocation(50, 180); 
         n.add(gender);
         
      male = new JRadioButton("Male");    // male
         male.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         male.setSelected(true); 
         male.setSize(75, 20); 
         male.setLocation(150, 180); 
         n.add(male); 

      female = new JRadioButton("Female");      // female
         female.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         female.setSelected(false); 
         female.setSize(100, 20); 
         female.setLocation(250, 180); 
         n.add(female); 
         
      mof = new ButtonGroup(); 
         mof.add(male); 
         mof.add(female);
         
      // attribute regarding foot size
      footsize = new JLabel("Foot Size: ");
         footsize.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         footsize.setSize(100, 20); 
         footsize.setLocation(50, 230); 
         n.add(footsize);
      
      a_foot = new JComboBox(sizes);
         a_foot.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         a_foot.setSize(75, 25); 
         a_foot.setLocation(150, 230); 
         n.add(a_foot);
         
      // attribute regarding e-mail
      email = new JLabel("E-mail: ");
         email.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         email.setSize(100, 20); 
         email.setLocation(50, 280); 
         n.add(email);
      
      a_email = new JTextField();
         a_email.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         a_email.setSize(190, 25); 
         a_email.setLocation(150, 280); 
         n.add(a_email);
      
      // attribute regarding password
      pword = new JLabel("Password: ");
         pword.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         pword.setSize(100, 20); 
         pword.setLocation(50, 330); 
         n.add(pword);
        
      a_pword = new JPasswordField();   
         a_pword.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         a_pword.setSize(190, 25); 
         a_pword.setLocation(150, 330); 
         n.add(a_pword);
         
      // terms & conditions
      t_and_c = new JCheckBox("Accept T&C");
      t_and_c.setFont(new Font("Bodoni MT", Font.PLAIN, 15)); 
      t_and_c.setSize(250, 20); 
      t_and_c.setLocation(150, 370); 
      n.add(t_and_c);
         
      // confirm?   
      confirm = new JButton("Are you confirm?");
         confirm.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         confirm.setSize(200, 30); 
         confirm.setLocation(50, 400); 
         confirm.addActionListener(this);
         n.add(confirm);
      
      // reset   
      reset = new JButton("Reset");
         reset.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         reset.setSize(100, 30); 
         reset.setLocation(250, 400); 
         reset.addActionListener(this);
         n.add(reset);
         
      // statement to select shoes
      select = new JLabel("Select one of the shoes.");
         select.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         select.setSize(400, 20); 
         select.setLocation(100, 450); 
         n.add(select);
      
      // button 1                                                       
      shoe1 = new JButton("Nike Flexisport");
         shoe1.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         shoe1.setSize(150, 30); 
         shoe1.setLocation(50, 475); 
         shoe1.addActionListener(this);
         n.add(shoe1);
      
      // button 2
      shoe2 = new JButton("Mountain Boots");
         shoe2.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         shoe2.setSize(175, 30); 
         shoe2.setLocation(210, 475); 
         shoe2.addActionListener(this);
         n.add(shoe2);
         
      // button 3
      shoe3 = new JButton("Converse Sneakers");
         shoe3.setFont(new Font("Bodoni MT", Font.PLAIN, 17)); 
         shoe3.setSize(200, 30); 
         shoe3.setLocation(115, 515);
         shoe3.addActionListener(this); 
         n.add(shoe3); 
     
      // text above the display
      belowtxt = new JLabel(" ");
         belowtxt.setFont(new Font("Courier New", Font.PLAIN, 15));
         belowtxt.setSize(500, 30); 
         belowtxt.setLocation(500, 65); 
         n.add(belowtxt);
         
      // display   
      display = new JTextArea(); 
         display.setFont(new Font("Courier New", Font.PLAIN, 17)); 
         display.setSize(450, 450); 
         display.setLocation(440, 100); 
         display.setLineWrap(true); 
         display.setEditable(false); 
         n.add(display);
         
      setVisible(true);
   } // end of GUI
      
   // method actionPerformed as a mechanism of the GUI   
   public void actionPerformed(ActionEvent e) { 
              
      // if "Confirm" button is clicked             
      if (e.getSource() == confirm) {  
      
        // if terms & conditions is clicked   
        if (t_and_c.isSelected() ) {       
            // displays name, age, gender, foot size, e-mail, password
            String a0 = "--------------------------------------------" + "\n" +
                        "\t     BASIC INFORMATIONS \n\n";
            String att1 = "Name: "+ a_name.getText() +"\n";
            String att2 =  "Age: "+ (String)a_age.getSelectedItem() +"\n";
            
            String att3;
            if (male.isSelected())
               att3 = "Gender: Male"+ "\n";
            else
               att3 = "Gender: Female"+ "\n";
               
            String att4 = "Foot Size: "+ (String)a_foot.getSelectedItem() +"\n";
            String att5 = "E-mail: "+ a_email.getText() +"\n";
            String a1 = "--------------------------------------------";
            String welc = "Nice to meet you, "+ a_name.getText() + "!" +
                          "\nWe have certain types of shoes here! \nEnjoy yourself!";
            
            display.setText(a0 + att1 + att2 + att3 + att4 + att5 + a1 + welc);               
            display.setEditable(false);
            belowtxt.setText("Login successful!");             
         }  // end of t&c button         
            
         else { 
            display.setText(""); 
            belowtxt.setText("Please accept the "
                     + "terms & conditions..."); }                   
      } // end of "Confirm" button
      
      // Nike FlexiSport button
      if (e.getSource() == shoe1) {
         if (t_and_c.isSelected() ) {
                  String a = "--------------------------------------------" +
                             "\n\t" + nmsh1.toUpperCase() + "\n" + 
                             "--------------------------------------------" + "\n\n"; 
                  String b = basechara;
                  String c = "1. " + nmsh1 + " is made of PVC. \n" +
                             "2. The shoe is light. \n" +
                             "3. " + nmsh1 + " has spikes. \n" +
                             "4. This shoe can be used in various sports \n" + 
                                 "   such as jogging and playing football. \n" +
                             "5. " + nmsh1 + " has LED light, so that it   glows afar.  \n" +
                             "6. It is free-sized so that the shoe is        flexible to all " +
                                 "regardless of his/her \n   foot size.   \n" +
                             "7. The colour of " + nmsh1 + " is black \n   and red.";
                  display.setText(a + b + c);   }
      }
         
      // Mountain Boots button      
      if (e.getSource() == shoe2) {
         if (t_and_c.isSelected() ) {
               String a = "--------------------------------------------" +
                          "\n\t" + nmsh2.toUpperCase() + "\n" + 
                          "--------------------------------------------" + "\n\n";
               String b = basechara;
               String c = "1. " + nmsh2 + " is made of crocodile \n   leather. \n" +
                          "2. Suitable for extreme activities such as \n   hiking. \n" +
                          "3. Stiff soles to prevent slipping easily. \n" +
                          "4. The inner part of boots has chip as a \n" +
                          "   security feature to track the wearer in \n   case of emergency. \n" +
                          "5. The colour of " + nmsh2 + " is dark \n   brown.";
               display.setText(a + b + c);   }
      }
         
      // Converse Sneakers button
      if (e.getSource() == shoe3) {
         if (t_and_c.isSelected() ) {
               String a = "--------------------------------------------" +
                          "\n\t" + nmsh3.toUpperCase() + "\n" + 
                          "--------------------------------------------" + "\n\n";
               String b = basechara.substring(22);
               String c = "1. " + nmsh3 + " is made of canvas. \n" +
                          "2. This shoe can be laced or non-laced. \n" +
                          "3. Suitable for casual/leisure activities. \n" +
                          "4. " + nmsh3 + " is light. \n" +
                          "5. Reflexological insoles to increase blood    circulation and reduces feet pain. \n" +
                          "6. The colour of " + nmsh3 + " is yellow.";
               display.setText(a + b + c);   }
      }
                  
      // if "Reset" button is clicked
      else if (e.getSource() == reset) { 
         String ay = ""; 
         a_name.setText(ay); 
         a_age.setSelectedIndex(0); 
         a_foot.setSelectedIndex(0); 
         a_pword.setText(ay);
         display.setText(ay);
         a_email.setText(ay); 
         t_and_c.setSelected(false); 
         shoe1.setSelected(false);
         shoe2.setSelected(false);
         shoe3.setSelected(false);
      } // end of "Reset" button
          

   } // end of actionPerformed
  
} // end of actionlistener

// Driver Code 
class Start { 
   public static void main(String[] args) throws Exception 
   { 
      Shoes_GUI z = new Shoes_GUI(); 
   } 
} 

    
  
