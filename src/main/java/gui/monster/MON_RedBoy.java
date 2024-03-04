package gui.monster;

import gui.entity.Entity;
import gui.main.GamePanel;

public class MON_RedBoy extends Entity {
    GamePanel gp;
    public MON_RedBoy(GamePanel gp) {
        super(gp);
        this.gp = gp;
        type = 2;
        name = "Red Boy";
        speed = 1;
        maxLife = 30;
        life = maxLife;
        solidArea.x = 3;
        solidArea.y = 18;
        solidArea.width = 42;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        getImage();


    }

    public void getImage(){

        up1 = getImage("/monster/boy_red_left_1.png", gp.tileSize, gp.tileSize);
    }
}
