import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Register extends JFrame {
    private JPanel panelregister;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passLabel;
    private JTextField passText;
    private JButton complete;
    private JButton delete;
    public Register(){
        Userinfo userinfo = new Userinfo("1","1");
        setTitle("Register Form");
        setSize(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelregister = new JPanel();
        panelregister.setLayout(null);
        userLabel = new JLabel("you username:");
        userLabel.setBounds(10,20,120,25);
        panelregister.add(userLabel);
        userText = new JTextField(20);
        userText.setBounds(150,20,170,25);
        panelregister.add(userText);
        passLabel = new JLabel("you password:");
        passLabel.setBounds(10,50,120,25);
        panelregister.add(passLabel);

        passText = new JPasswordField(20);
        passText.setBounds(150,50,170,25);
        panelregister.add(passText);

        complete = new JButton("complete");
        complete.setBounds(150,110,120,25);
        delete = new JButton("delete");
        delete.setBounds(20,110,120,25);
        panelregister.add(delete);
        panelregister.add(complete);
        add(panelregister);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userinfo.setUsername(userText.getText());
                userinfo.setUserpassword(String.valueOf(passText.getText()));
                String  filename =  userinfo.getUsername() + ".txt";
                File file = new File(filename);
                if(file.exists()&&file.isFile()) {
                    file.delete();
                }
            }
        });
        complete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userinfo.setUsername(userText.getText());
                userinfo.setUserpassword(String.valueOf(passText.getText()));
                try{
                    if(userinfo.getUsername() == null || userinfo.getUsername().length() == 0){
                        throw new Exception();
                    }
                    String  filename =  userinfo.getUsername() + ".txt";
                    String content = userinfo.getUsername() + "\n" + userinfo.getpassword();
                    File file = new File(filename);
                    if (file.exists()) {
                        throw new Exception();
                    }
                    file.createNewFile();
                    BufferedWriter out = new BufferedWriter(new FileWriter(file,true));
                    out.write(content);
                    out.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
    public boolean saveUser(Userinfo userinfo){
        boolean result = false;
        return result;
    }
}
