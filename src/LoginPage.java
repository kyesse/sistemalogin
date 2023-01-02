import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginbutton = new JButton("Login");
    JButton resetbutton = new JButton("Reset");
    JButton registerbutton = new JButton("Register");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordBox = new JPasswordField();
    JLabel userIdLabel = new JLabel("ID Usuario");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel("");

    HashMap<String, String> loginInfo = new HashMap<String, String>();
    IdeaPasswords idpasswords = new IdeaPasswords();

    public LoginPage(HashMap<String, String> loginOriginalInfo) {

        loginInfo = loginOriginalInfo;

        userIdLabel.setBounds(50, 100, 175, 25);
        userPasswordLabel.setBounds(50, 150, 175, 25);
        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIDField.setBounds(125, 100, 200, 25);
        userPasswordBox.setBounds(125, 150, 200, 25);

        loginbutton.setBounds(125, 200, 100, 25);
        loginbutton.setFocusable(false);
        loginbutton.addActionListener(this);

        resetbutton.setBounds(225, 200, 100, 25);
        resetbutton.setFocusable(false);
        resetbutton.addActionListener(this);

        registerbutton.setBounds(225, 250, 100, 25);
        registerbutton.setFocusable(false);
        registerbutton.addActionListener(this);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userPasswordBox);
        frame.add(userIDField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(loginbutton);
        frame.add(resetbutton);
        frame.add(registerbutton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == registerbutton) {

            String userID = userIDField.getText();
            String password = String.valueOf((userPasswordBox.getPassword()));
            IdeaPasswords idpasswords2 = new IdeaPasswords(userID, password);

            idpasswords.setNewLoginInfo(userID, password);
            messageLabel.setForeground(Color.green);
            messageLabel.setText("REGISTRO COM SUCESSO");
            userIDField.setText("");
            userPasswordBox.setText("");
            loginInfo = idpasswords2.getLoginInfo();

        }

        if (e.getSource() == resetbutton) {
            userIDField.setText("");
            userPasswordBox.setText("");
        }
        if (e.getSource() == loginbutton) {

            String userID = userIDField.getText();
            String password = String.valueOf((userPasswordBox.getPassword()));

            if (loginInfo.containsKey(userID)) {


                if (loginInfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("LOGIN COM SUCESSO");
                    frame.dispose();
                    WelcomePage welcomepage = new WelcomePage();

                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("PASSWORD ERRADO");
                }

            } else {
                messageLabel.setForeground(Color.ORANGE);
                messageLabel.setText("usuario nao existe");

            }

        }

    }
}
