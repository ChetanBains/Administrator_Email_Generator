package EmailApp;

import javax.swing.*;
import java.awt.*;

public class EmailApp {
        public static void main(String aerd[]){

            JFrame f1 = new JFrame();
            f1.setBounds(300,200,800,500);
            f1.setVisible(true);

            JPanel j1 = new JPanel();
            j1.setBounds(10,10,780,460);
            j1.setBackground(Color.lightGray);
            f1.add(j1);
            j1.setVisible(true);

            JLabel l1 = new JLabel("Automatic Administrator Email Generation Panel");
            j1.add(l1);
            l1.setBounds(300,20,400,40);
            l1.setVisible(true);



            Email em1 = new Email("Chetanjeev","Bains");
            System.out.println(em1.showInfo());
            em1.changePassword();
            em1.setAlternateemail();
            em1.setMailboxcapacity();
        }
}
