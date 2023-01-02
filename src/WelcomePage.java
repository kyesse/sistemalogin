import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomelabel = new JLabel("Bem vindo ao sistema");


    WelcomePage() {

        welcomelabel.setBounds(0, 0, 200, 35);
        welcomelabel.setFont(new Font(null, Font.BOLD, 25));

        frame.add(welcomelabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
