package screens;

import LoginUseCase.LoginResponse;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoggedInScreen extends JPanel implements ActionListener, Screen{

    private Controller controller;
    public LoggedInScreen(String email) {
        JLabel title = new JLabel("Got It");
        JLabel loggedIn = new JLabel("Logged In");
        JLabel emailLabel = new JLabel("Welcome" + email);
        this.add(title);
        this.add(loggedIn);
        this.add(emailLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }
}
