package tile;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TileManager {

    GamePanel gp;
    public Tile[] tile;
    public int[][] tileMapNum;

    public TileManager(GamePanel gp) {
        this.gp = gp;

        tile = new Tile[10];
        tileMapNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage();
        loadMap();
    }

    public void getTileImage() {
        try {
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/map_png/arkaplan.png"));

            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/map_png/duvar.png"));
            tile[1].collision = true;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void loadMap() {
        try {
            InputStream is = getClass().getResourceAsStream("/main/map.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;

            while (col < gp.maxWorldCol && row < gp.maxWorldRow) {
                String line = br.readLine();

                while (col < gp.maxWorldCol) {
                    String[] numbers = line.split(" ");
                    int num = Integer.parseInt(numbers[col]);
                    tileMapNum[col][row] = num;
                    col++;
                }

                if (col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void draw(Graphics2D g2) {
        int worldCol = 0;
        int worldRow = 0;

        while (worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {

            int tileNum = tileMapNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.civciv.tummapx + gp.civciv.civcivx;
            int screenY = worldY - gp.civciv.tummapy + gp.civciv.civcivy;

            if (worldX + gp.tileSize > gp.civciv.tummapx - gp.civciv.civcivx &&
                    worldX - gp.tileSize < gp.civciv.tummapx + gp.civciv.civcivx &&
                    worldY + gp.tileSize > gp.civciv.tummapy - gp.civciv.civcivy &&
                    worldY - gp.tileSize < gp.civciv.tummapy + gp.civciv.civcivy) {

                g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            }

            worldCol++;

            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;
            }
        }
    }



}
