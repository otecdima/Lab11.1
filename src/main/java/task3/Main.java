package task3;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyImage image1 = new ProxyImage("3180-Pug_green_grass-732x549-thumbnail-732x549.jpeg");
        MyImage image2 = new ProxyImage("Zugpsitze_mountain.jpeg");
        image1.display();
        image2.display();
        image1.display();
        image2.display();
    }
}
