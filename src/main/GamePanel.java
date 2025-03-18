package main;

import civciv.Civciv;
import penguen.pembepenguen;
import tile.TileManager;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel implements Runnable {


    final int originalTileSize = 16;
    final int scale = 3;

    public final int tileSize = originalTileSize * scale;
    public final int maxScreenCol = 26;
    public final int maxScreenRow = 16;
    public final int ekrangenislik = tileSize * maxScreenCol;
    public final int ekranyukseklik = tileSize * maxScreenRow;
    public final int maxWorldCol = 44;
    public final int maxWorldRow = 24;

    public final int worldWidth = tileSize * maxWorldCol;
    public final int worldHeight = tileSize * maxWorldRow;

    int FPS=60;

    TileManager tileM=new TileManager(this);

    KeyHandler keyH=new KeyHandler();
    Thread gameThread;

    public Civciv civciv=new Civciv(this,keyH);


    public GamePanel() {
        this.setPreferredSize(new Dimension(ekrangenislik, ekranyukseklik));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
        civciv = new Civciv(this, keyH);



    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

 //RYİSNOWDAN KONSEPT BAKILMIŞTIR
    @Override
    /*public void run() {
        double drawInterval = 1000000000 / FPS; // ~ 0.01666 seconds
        double nextDrawTime = System.nanoTime() + drawInterval;

        while(gameThread != null) {

            update();
            repaint();

            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime / 1000000;
                if(remainingTime < 0 )
                    remainingTime=0;

                Thread.sleep((long) remainingTime);

                nextDrawTime+=drawInterval;
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }*/

    public void run() {

        double drawInterval = 1000000000 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        int drawCount = 0;

        while(gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            if(delta >= 1) {
                update();
                repaint();
                delta--;
                drawCount++;
            }

            if(timer >= 1000000000) {

                drawCount = 0;
                timer = 0;
            }
        }
    }

    public boolean checkTileCollision(int nextX, int nextY) {
        int tileLeftCol = nextX / tileSize;
        int tileRightCol = (nextX + tileSize - 1) / tileSize;
        int tileTopRow = nextY / tileSize;
        int tileBottomRow = (nextY + tileSize - 1) / tileSize;

        int topLeftTile = tileM.tileMapNum[tileLeftCol][tileTopRow];
        int topRightTile = tileM.tileMapNum[tileRightCol][tileTopRow];
        int bottomLeftTile = tileM.tileMapNum[tileLeftCol][tileBottomRow];
        int bottomRightTile = tileM.tileMapNum[tileRightCol][tileBottomRow];


        return tileM.tile[topLeftTile].collision ||
                tileM.tile[topRightTile].collision ||
                tileM.tile[bottomLeftTile].collision ||
                tileM.tile[bottomRightTile].collision;
    }



    public void update() {

        civciv.update();



    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        tileM.draw(g2);


        civciv.draw(g2);

        g2.dispose();
    }


}
