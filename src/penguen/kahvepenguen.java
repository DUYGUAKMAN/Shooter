package penguen;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class kahvepenguen extends penguen_ortak {

    BufferedImage arka1, arka2, on1, on2, sol1, sol2, sag1, sag2;
    BufferedImage sagarka1, sagarka2, solarka1, solarka2;
    BufferedImage sagon1, sagon2, solon1, solon2;

   public void getPenguenImage() {

        try {
            arka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguenarka1.png"));
            arka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguenarka2.png"));
            on1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguenon1.png"));
            on2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguenon2.png"));
            sol1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensol1.png"));
            sol2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensol2.png"));
            sag1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensag1.png"));
            sag2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensag2.png"));
            sagarka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensagarka1.png"));
            sagarka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensagarka2.png"));
            solarka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensolarka1.png"));
            solarka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensolarka2.png"));
            sagon1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensagon1.png"));
            sagon2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensagon2.png"));
            solon1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensolon1.png"));
            solon2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/kahvepenguensolon2.png"));
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }


}
