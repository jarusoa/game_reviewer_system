import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.*;
import java.util.ArrayList;

public class createAccount implements ActionListener, Serializable {
    
    User new_user = new User();
    private ArrayList<User> user_list;
    boolean Go;
    JFrame frame = new JFrame();
    JButton createButton = new JButton("Create a Account");
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel genreLabel = new JLabel("Favorite Genre");
    JLabel banner = new JLabel("Create a Account");
    String[] genres = {"RPG","FPS","MMO","SB"};
    JComboBox genreBox = new JComboBox(genres);
    
    public createAccount(ArrayList<User> user_list){
        this.user_list = user_list;
        usernameLabel.setBounds(50,100,75,25);
        passwordLabel.setBounds(50,150,75,25);
        banner.setBounds(130,20,200,50);
        banner.setFont(new Font("",Font.BOLD, 20));
        frame.add(genreBox);
        frame.add(usernameLabel);
        frame.add(passwordLabel);
        frame.add(username);
        frame.add(password);
        frame.add(createButton);
        frame.add(banner);
        frame.add(genreLabel);
        
        genreLabel.setBounds(25,200,200,25);
        genreBox.setBounds(125, 200, 200, 25);
        username.setBounds(125,100,200,25);
        password.setBounds(125,150,200,25);
        
        
        
        createButton.setBounds(125,250,200,25);
        createButton.addActionListener(this);
        
      
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
    }
    
    public void addUser(ArrayList<User> users){
        if(new_user != null){
            users.add(new_user);
        }
    }
    
  
    
    @Override
    public void actionPerformed(ActionEvent action){
   
            for(int i = 0; i < user_list.size(); i++){
                if(username.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"No username", "",JOptionPane.WARNING_MESSAGE);
                    break;
                }
                if(String.valueOf(password.getPassword()).equals("")){
                    JOptionPane.showMessageDialog(null,"No password", "",JOptionPane.WARNING_MESSAGE);
                    break;
                }
                if(username.getText().equals(user_list.get(i).getUsername())){
                    //Go = false;
                }
                else{
                    Go = true;
                }
                  
                if(Go == false){
                    JOptionPane.showMessageDialog(null,"Username is already taken", "",JOptionPane.WARNING_MESSAGE);
                    break;
                }
                if(Go == true){
                    String userName = username.getText();
                    String pass = String.valueOf(password.getPassword());
                    String genre = String.valueOf(genreBox.getSelectedItem());
                    new_user.setUser(userName,pass,genre);
                    
                    frame.dispose();
                    break;
                }
            }

           
            }
    }

