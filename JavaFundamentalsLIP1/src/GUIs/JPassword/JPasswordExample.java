/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIs.JPassword;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author maumneto
 */
public class JPasswordExample extends JFrame {

    JLabel lLogin, lPass;
    JButton enter;
    JTextField tLogin;
    JPasswordField tPass;

    public JPasswordExample() {
        super("My Login Example");

        Container cont = getContentPane();
        setLayout(null);

        lLogin = new JLabel("Login");
        lPass = new JLabel("Password");
        enter = new JButton("enter");
        tLogin = new JTextField();
        tPass = new JPasswordField();

        cont.add(lLogin);
        cont.add(lPass);
        cont.add(enter);
        cont.add(tLogin);
        cont.add(tPass);

        lLogin.setBounds(20, 20, 50, 30);
        tLogin.setBounds(70, 20, 200, 30);
        lPass.setBounds(20, 60, 100, 30);
        tPass.setBounds(120, 60, 150, 30);
        enter.setBounds(120, 100, 60, 30);

        VerifyLogin verify = new VerifyLogin();
        enter.addActionListener(verify);

        setSize(300, 300);
        setVisible(true);
    }

    public class VerifyLogin implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JLabel result = new JLabel("", JLabel.CENTER);
            setLayout(null);
            JFrame frame = new JFrame();            
            frame.add(result);
            result.setBounds(20, 50, 300, 40);
            String login = tLogin.getText();
            String password = new String(tPass.getPassword());
            if (login.equals("admin") && password.equals("admin123")) {
                result.setForeground(Color.BLUE);
                result.setText("Login and Password are right");
            } else {
                result.setForeground(Color.RED);
                result.setText("Login and Password are wrong");
            }
            tLogin.setText("");
            tPass.setText("");
            frame.setSize(300, 200);
            frame.setVisible(true);
            }
    }

    public static void main(String[] args) {
        JPasswordExample jpassword = new JPasswordExample();
        jpassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
