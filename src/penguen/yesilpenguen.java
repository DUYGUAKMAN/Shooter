package penguen;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class yesilpenguen extends penguen_ortak {

    BufferedImage arka1, arka2, on1, on2, sol1, sol2, sag1, sag2;
    BufferedImage sagarka1, sagarka2, solarka1, solarka2;
    BufferedImage sagon1, sagon2, solon1, solon2;


    public void getPenguenImage() {

        try {
            arka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguenarka1.png"));
            arka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguenarka2.png"));
            on1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguenon1.png"));
            on2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguenon2.png"));
            sol1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensol1.png"));
            sol2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensol2.png"));
            sag1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensag1.png"));
            sag2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensag2.png"));
            sagarka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensagarka1.png"));
            sagarka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensagarka2.png"));
            solarka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensolarka1.png"));
            solarka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensolarka2.png"));
            sagon1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensagon1.png"));
            sagon2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensagon2.png"));
            solon1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensolon1.png"));
            solon2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/yesilpenguensolon2.png"));
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
