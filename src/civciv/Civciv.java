package civciv;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Civciv {

    GamePanel gp;
    KeyHandler keyH;

    public int x, y;
    public int civcivhiz;

    public String direction = "asagi";

    BufferedImage civcivarka1, civcivarka2, civcivon1, civcivon2, civcivsol1, civcivsol2, civcivsag1, civcivsag2;
    BufferedImage civcivsagarka1, civcivsagarka2, civcivsolarka1, civcivsolarka2;
    BufferedImage civcivsagon1, civcivsagon2, civcivsolon1, civcivsolon2;
    int spriteCounter = 0;
    int spriteNum = 1;
    public int tummapx, tummapy;
    public int civcivx;
    public int civcivy;

    public Civciv(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;

        civcivx = gp.ekrangenislik / 2 - (gp.tileSize / 2);
        civcivy = gp.ekranyukseklik / 2 - (gp.tileSize / 2);

        tummapx = gp.tileSize * 23;
        tummapy = gp.tileSize * 12;

        civcivhiz = 4;

        getCivcivImage();

    }

    public void getCivcivImage() {
        try {
            civcivarka1 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivarka1.png"));
            civcivarka2 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivarka2.png"));
            civcivon1 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivon1.png"));
            civcivon2 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivon2.png"));
            civcivsol1 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsol1.png"));
            civcivsol2 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsol2.png"));
            civcivsag1 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsag1.png"));
            civcivsag2 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsag2.png"));
            civcivsagarka1 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsagarka1.png"));
            civcivsagarka2 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsagarka2.png"));
            civcivsolarka1 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsolarka1.png"));
            civcivsolarka2 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsolarka2.png"));
            civcivsagon1 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsagon1.png"));
            civcivsagon2 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsagon2.png"));
            civcivsolon1 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsolon1.png"));
            civcivsolon2 = ImageIO.read(getClass().getResourceAsStream("/civciv_png/civcivsolon2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        boolean yukari = keyH.yukariklavyegiris;
        boolean asagi = keyH.asagiklavyegiris;
        boolean sol = keyH.solaklavyegiris;
        boolean sag = keyH.sagaklavyegiris;

        if (yukari || asagi || sol || sag) {
            if (yukari && sag) {
                direction = "sagyukari";
                if (!gp.checkTileCollision(tummapx + civcivhiz, tummapy - civcivhiz)) {
                    tummapx += civcivhiz;
                    tummapy -= civcivhiz;
                }
            } else if (yukari && sol) {
                direction = "solyukari";
                if (!gp.checkTileCollision(tummapx - civcivhiz, tummapy - civcivhiz)) {
                    tummapx -= civcivhiz;
                    tummapy -= civcivhiz;
                }
            } else if (asagi && sag) {
                direction = "sagasagi";
                if (!gp.checkTileCollision(tummapx + civcivhiz, tummapy + civcivhiz)) {
                    tummapx += civcivhiz;
                    tummapy += civcivhiz;
                }
            } else if (asagi && sol) {
                direction = "solasagi";
                if (!gp.checkTileCollision(tummapx - civcivhiz, tummapy + civcivhiz)) {
                    tummapx -= civcivhiz;
                    tummapy += civcivhiz;
                }
            } else if (yukari) {
                direction = "yukari";
                if (!gp.checkTileCollision(tummapx, tummapy - civcivhiz)) {
                    tummapy -= civcivhiz;
                }
            } else if (asagi) {
                direction = "asagi";
                if (!gp.checkTileCollision(tummapx, tummapy + civcivhiz)) {
                    tummapy += civcivhiz;
                }
            } else if (sol) {
                direction = "sol";
                if (!gp.checkTileCollision(tummapx - civcivhiz, tummapy)) {
                    tummapx -= civcivhiz;
                }
            } else if (sag) {
                direction = "sag";
                if (!gp.checkTileCollision(tummapx + civcivhiz, tummapy)) {
                    tummapx += civcivhiz;
                }
            }

            spriteCounter++;
            if (spriteCounter > 10) {
                if (spriteNum == 1) {
                    spriteNum = 2;
                }
                else {
                    spriteNum = 1;
                }
                spriteCounter = 0;
            }
        }
    }


    public void draw(Graphics2D g2) {
        BufferedImage image = null;

        if (direction=="yukari") {
            if (spriteNum == 1) {
                image = civcivarka1;
            }
            else {
                image = civcivarka2;
            }
        }
        else {
            if (direction=="asagi") {
                if (spriteNum == 1) {
                    image = civcivon1;
                }
                else {
                    image = civcivon2;
                }
            }
            else {
                if (direction=="sol") {
                    if (spriteNum == 1) {
                        image = civcivsol1;
                    }
                    else {
                        image = civcivsol2;
                    }
                }
                else {
                    if (direction=="sag") {
                        if (spriteNum == 1) {
                            image = civcivsag1;
                        }
                        else {
                            image = civcivsag2;
                        }
                    }
                    else {
                        if (direction=="sagyukari") {
                            if (spriteNum == 1) {
                                image = civcivsagarka1;
                            } else {
                                image = civcivsagarka2;
                            }
                        }
                        else {
                            if (direction=="solyukari") {
                                if (spriteNum == 1) {
                                    image = civcivsolarka1;
                                }
                                else {
                                    image = civcivsolarka2;
                                }
                            }
                            else {
                                if (direction=="sagasagi") {
                                    if (spriteNum == 1) {
                                        image = civcivsagon1;
                                    }
                                    else {
                                        image = civcivsagon2;
                                    }
                                }
                                else {
                                    if (direction=="solasagi") {
                                        if (spriteNum == 1) {
                                            image = civcivsolon1;
                                        }
                                        else {
                                            image = civcivsolon2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        g2.drawImage(image, civcivx, civcivy, gp.tileSize, gp.tileSize, null);
    }


}
