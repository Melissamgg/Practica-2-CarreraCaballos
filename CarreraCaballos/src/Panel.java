import javax.swing.*;
import java.awt.*;

/**
 * Created by melissamariangranadosgomez on 10/09/18.
 */
public class Panel extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        ImageIcon image = new ImageIcon("/Users/melissamariangranadosgomez/Desktop/CarreraCaballos");
        super.setOpaque(false);
        g.drawImage(image.getImage(),0,0,null);
        super.paintComponent(g);

    }
}
