package Drawing;

import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class MyHouse {
  public static void main(String[] args) throws IOException {
    int width = 100;
    int height = 100;

    BufferedImage picture = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    Graphics g = picture.createGraphics();

    g.setColor(Color.WHITE); //määrame värvi
    g.fillRect(0, 0, width, height); // teeme ristkülikut

    g.setColor(Color.BLACK); // teksti värv
    g.drawString("My house", 20, 20); //tekst

    g.drawLine(10, 50, 50, 25); // kust kuhu tõmmata joon
    g.drawLine(50, 25, 90, 50); // kattus

    g.drawRect(10, 50, 80, 40);

    g.setColor(Color.GREEN);

    g.fillRect(15, 55, 20, 20); //aknad
    g.fillRect(40, 55, 20, 20);

    g.setColor(Color.CYAN);

    g.fillRect(65, 55, 20, 30);

    ImageIO.write(picture, "png", new File("house.png")); 
  }
}
