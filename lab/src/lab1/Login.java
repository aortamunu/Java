package lab1;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login implements ActionListener{
    JTextField tfUser;
    JTextField tfPassword;
    JFrame f;
    public Login() {
        f = new JFrame("login");
        JLabel user = new JLabel("Username");
        user.setBounds(20, 20, 150, 20);
        f.add(user);
        tfUser = new JTextField();
        tfUser.setBounds(180, 20, 150, 20);
        f.add(tfUser);

        JLabel password = new JLabel("Password");
        password.setBounds(20, 60, 150, 20);
        f.add(password);
        tfPassword = new JTextField();
        tfPassword.setBounds(180, 60, 150, 20);
        f.add(tfPassword);
        JButton b = new JButton("Login");
        b.setBounds(180, 100, 150, 20);
        b.addActionListener(this);
        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new Login();
    }

    public void actionPerformed(ActionEvent e){
        String user = tfUser.getText();
        String pwd = tfPassword.getText();
try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava_2023","root", "root");
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery("select * from User where username = '"+user+"' and password = '"+pwd+"'");
while(rs.next()) {
    if (user.equals(rs.getString("username")) && pwd.equals(rs.getString("password"))) {
        JDialog d = new JDialog(f, "login success", true);
        d.setLocationRelativeTo(d);
        d.setSize(100, 100);
        d.setVisible(true);
    }
}

    con.close();
}
catch(Exception ex){
    System.out.println(ex.getMessage());
}
}
}



