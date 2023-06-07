import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.*;
import java.util.ArrayList;

public class Main implements ActionListener, Serializable {
    ArrayList<User> user_list = new ArrayList<>();
    ArrayList<Game> game_list = new ArrayList<>();
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JButton createButton = new JButton("Create a Account");
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();
    JButton exit = new JButton("Exit");
    
    int i;
    
    public static void main(String[] args) {
        String fileName = "main.data";
        Main main = new Main();
        main.loadUsers();
        main.loadGames();



    }
    
    public Main(){
        
        usernameLabel.setBounds(50,100,75,25);
        passwordLabel.setBounds(50,150,75,25);
        
        frame.add(usernameLabel);
        frame.add(passwordLabel);
        frame.add(messageLabel);
        frame.add(username);
        frame.add(password);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(createButton);
        frame.add(exit);
        username.setBounds(125,100,200,25);
        password.setBounds(125,150,200,25);
        
        loginButton.setBounds(125,200,100,25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);
        
        exit.setBounds(150,300,100,25);
        exit.addActionListener(this);
        exit.setFocusable(false);
        
        createButton.setBounds(125,250,200,25);
        createButton.addActionListener(this);
        
        resetButton.setBounds(225,200,100,25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);
        
        messageLabel.setBounds(125,300,250,35);
        
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
    }
   
    public void loadUsers(){
        String fileName = "users.data";

        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            this.user_list = (ArrayList<User>) in.readObject();
            in.close();
            file.close();
         } // end try

         catch(IOException ex){
         }
         catch(ClassNotFoundException ex){
         }
    }
    public void writeUsers(){
    try{
        String fileName = "users.data";
                    FileOutputStream file = new FileOutputStream(fileName);
                    ObjectOutputStream out = new ObjectOutputStream(file);
                    out.writeObject(this.user_list);
                    out.close();
                    file.close();
                }
   
                catch(IOException ex){
  
                }
    }
    public void loadGames(){
        String fileName = "games.data";

        try{
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            this.game_list = (ArrayList<Game>) in.readObject();
            in.close();
            file.close();
         } // end try

         catch(IOException ex){
         }
         catch(ClassNotFoundException ex){
         }
    }
    public void writeGames(){
    try{
        String fileName = "games.data";
                    FileOutputStream file = new FileOutputStream(fileName);
                    ObjectOutputStream out = new ObjectOutputStream(file);
                    out.writeObject(this.game_list);
                    out.close();
                    file.close();
                }
   
                catch(IOException ex){
  
                }
    }
    public void setuserList(ArrayList<User> users){
        this.user_list = users;
    }
    public int getIndex(){
        int k = this.i;
        return k;
    }
    @Override
    public void actionPerformed(ActionEvent action){
        if(action.getSource() == resetButton){
            username.setText("");
            password.setText("");
        }
        
        if(action.getSource() == loginButton){
            String user = username.getText();
            String pass = String.valueOf(password.getPassword());
            if(user.equals("mod") && pass.equals("12345")){
                new ModDashboard(this,user_list,game_list).setVisible(true);
                frame.dispose();
            }
            for(int i = 0; i < user_list.size(); i++){
                if(user_list.get(i).getUsername().equals(user) && user_list.get(i).getPassword().equals(pass)){
                    this.i = i;
                    new Dashboard(this,user_list.get(i),user_list,game_list).setVisible(true);
                    frame.dispose();
                }
                
            }
        }
        
        if(action.getSource() == createButton){
            frame.setVisible(true);
            createAccount create = new createAccount(user_list);
            create.addUser(user_list);
            
            }
        if(action.getSource() == exit){
            
            this.writeUsers();
            System.exit(0);
        }
    
  }
}
