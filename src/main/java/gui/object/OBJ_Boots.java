package gui.object;

import gui.entity.Entity;
import gui.main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Boots extends Entity {

    public OBJ_Boots(GamePanel gp) {
        super(gp);
        name = "Boots";
        down1 = getImage("/objects/boots.png",gp.tileSize,gp.tileSize);
    }
}
