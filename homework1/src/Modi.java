import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Modi extends JFrame {
    private JPanel mod;
    private JLabel passL;
    private JPasswordField passT;
    private JButton succeed;
    public Modi(Userinfo userinfo){
            setTitle("Modification");
            setSize(350,200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            mod = new JPanel();
            mod.setLayout(null);
            passL = new JLabel("New password");
            passL.setBounds(10,20,80,25);
            passT = new JPasswordField(10);
            passT.setBounds(100,20,170,25);
            succeed = new JButton("完成");
            succeed.setBounds(10,80,80,25);
            mod.add(passL);
            mod.add(passT);
            mod.add(succeed);
            add(mod);
            succeed.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String filename = "./src/" + userinfo.getUsername() + ".txt";
                        File file = new File(filename);
                        file.createNewFile();
                        userinfo.setUserpassword(String.valueOf(passT.getPassword()));
                        BufferedWriter out = new BufferedWriter(new PrintWriter(filename));
                        String content = userinfo.getUsername() + "\n" + userinfo.getpassword();
                        out.write(content);
                        out.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
    }
}
