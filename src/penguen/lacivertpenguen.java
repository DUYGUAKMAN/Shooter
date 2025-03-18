package penguen;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class lacivertpenguen extends penguen_ortak {


    BufferedImage arka1, arka2, on1, on2, sol1, sol2, sag1, sag2;
    BufferedImage sagarka1, sagarka2, solarka1, solarka2;
    BufferedImage sagon1, sagon2, solon1, solon2;


    public void getPenguenImage() {

        try {
            arka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguenarka1.png"));
            arka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguenarka2.png"));
            on1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguenon1.png"));
            on2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguenon2.png"));
            sol1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensol1.png"));
            sol2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensol2.png"));
            sag1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensag1.png"));
            sag2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensag2.png"));
            sagarka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensagarka1.png"));
            sagarka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensagarka2.png"));
            solarka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensolarka1.png"));
            solarka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensolarka2.png"));
            sagon1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensagon1.png"));
            sagon2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensagon2.png"));
            solon1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensolon1.png"));
            solon2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/lacivertpenguensolon2.png"));
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }


}
