package OBJS;

import edu.sdccd.cisc191.GamePanel;
import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Blueheart  extends SuperObject{
    GamePanel gp;

    public OBJ_Blueheart(GamePanel gp){
        this.gp = gp;

        name = "Blueheart";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/blueheart.png"));
            uTool.scaleImage(image, gp.tileSize, gp.tileSize);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
