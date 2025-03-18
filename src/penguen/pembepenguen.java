package penguen;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class pembepenguen extends penguen_ortak {

    BufferedImage arka1, arka2, on1, on2, sol1, sol2, sag1, sag2;
    BufferedImage sagarka1, sagarka2, solarka1, solarka2;
    BufferedImage sagon1, sagon2, solon1, solon2;


    public void getPenguenImage() {

        try {
            arka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguenarka1.png"));
            arka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguenarka2.png"));
            on1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguenon1.png"));
            on2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguenon2.png"));
            sol1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensol1.png"));
            sol2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensol2.png"));
            sag1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensag1.png"));
            sag2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensag2.png"));
            sagarka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensagarka1.png"));
            sagarka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensagarka2.png"));
            solarka1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensolarka1.png"));
            solarka2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensolarka2.png"));
            sagon1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensagon1.png"));
            sagon2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensagon2.png"));
            solon1 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensolon1.png"));
            solon2 = ImageIO.read(getClass().getResourceAsStream("/penguen_png/pembepenguensolon2.png"));
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }


}
