package gui.object;

import gui.entity.Entity;
import gui.main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Chest  extends Entity {

    public OBJ_Chest(GamePanel gp){
        super(gp);
        name = "Chest";
        down1 = getImage("/objects/chest (OLD).png",gp.tileSize,gp.tileSize);
        collision = true;
    }
}
