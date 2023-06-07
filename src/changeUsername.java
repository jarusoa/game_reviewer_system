
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class changeUsername implements ActionListener, Serializable{
    private User user;
    ArrayList<User> user_list;
    ArrayList<Game> game_list;
    boolean Go;
    JFrame frame = new JFrame();
    JButton changeButton = new JButton("Change Username");
    JTextField username = new JTextField();
    JLabel usernameLabel = new JLabel("Username: ");
    JLabel banner = new JLabel("Change Username");
    
    public changeUsername(User user, ArrayList<User> user_list, ArrayList<Game> game_list){
        this.user = user;
        this.user_list = user_list;
        this.game_list = game_list;
        usernameLabel.setBounds(50,100,75,25);
        banner.setBounds(130,20,200,50);
        banner.setFont(new Font("",Font.BOLD, 20));
        frame.add(usernameLabel);
        frame.add(username);
        frame.add(changeButton);
        frame.add(banner);
         
        username.setBounds(125,100,200,25);
       
        changeButton.setBounds(125,250,200,25);
        changeButton.addActionListener(this);
        
      
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent action){
        if(action.getSource() == changeButton){
            for(int i = 0; i < user_list.size(); i++){
                if(username.getText().equals(user_list.get(i).getUsername())){
                    Go = false;
                    break;
                }
                else{
                    Go = true;
                }
            }      
                if(Go == false)
                    JOptionPane.showMessageDialog(null,"Username is already taken", "",JOptionPane.WARNING_MESSAGE);    
                }
                if(Go == true){
                    String userName = username.getText();
                    for(int i = 0; i < user.user_reviews.size(); i ++){
                        for(int k = 0; k < game_list.size(); k++){
                            if(game_list.get(k).getName().equals(user.user_reviews.get(i).getGame())){
                                for(int y = 0; y < game_list.get(k).review_list.size(); y++){
                                    if(game_list.get(k).review_list.get(y).getName().equals(user.user_reviews.get(i).getName())){
                                        game_list.get(k).review_list.get(y).changeName(userName);
                                    }
                                }
                            }
                        }
                    user.changeUsername(userName);
                    
                    user.user_reviews.get(i).changeName(userName);
                            
                        
                    }
                    
                    frame.dispose();
                }
            
    } 
}
