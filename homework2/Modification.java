import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Modification extends JFrame {
    private JPanel Mod;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passLabel;
    private JPasswordField passText;
    private JButton loginButton;
    public Modification(){
        setTitle("Login Form");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Mod = new JPanel();
        Mod.setLayout(null);
        userLabel = new JLabel("Username:");
        userLabel.setBounds(10,20,80,25);
        Mod.add(userLabel);
        passLabel = new JLabel("Password:");
        passLabel.setBounds(10,50,80,25);
        Mod.add(passLabel);
        userText = new JTextField(10);
        userText.setBounds(100,20,170,25);
        Mod.add(userText);
        passText = new JPasswordField(10);
        passText.setBounds(100,50,170,25);
        Mod.add(passText);
        loginButton = new JButton("login");
        loginButton.setBounds(10,80,80,25);
        Mod.add(loginButton);
        add(Mod);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Userinfo userinfo = new Userinfo("admin","admin");
                userinfo.setUsername(userText.getText());
                userinfo.setUserpassword(String.valueOf(passText.getPassword()));
                try {
                    String filename = "./src/" + userinfo.getUsername() + ".txt";
                    File file = new File(filename);
                    if (!file.exists()) {
                        throw new Exception();
                    }
                    BufferedReader read = new BufferedReader(new FileReader(file));
                    if (userinfo.getUsername().equals(read.readLine().replaceAll(" +",""))) {
                        if (userinfo.getpassword().equals(read.readLine().replaceAll(" +", ""))) {
                            Register register = new Register();
                            register.setVisible(true);
                        }
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
    public static void main(String[] args){
        Modification modification = new Modification();
        modification.setVisible(true);
    }
}
