package BrickBreaker;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame ramka = new JFrame();

        Gameplay gamePlay = new Gameplay();

        ramka.setBounds(10, 10, 700, 600);
        ramka.setTitle("Ultimate Super Brick Braker");
        ramka.setResizable(false);
        ramka.setVisible(true);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ramka.add(gamePlay);
    }

}
