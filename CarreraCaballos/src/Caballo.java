import javax.swing.*;

/**
 * Created by melissamariangranadosgomez on 10/09/18.
 */
public class Caballo extends Hilos{

    public Caballo(String imageName){
        setImageName(imageName);
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon(imageName));
        setLabel(label);
    }

    @Override
    public void run(){
        for (int i = 0; 1 < 1000; i++){
            try {
                setX(getX() + getVelocidad());
                getLabel().setLocation(getX(), (int) getLabel().getLocation().getY());
                Thread.sleep(1000/getVelocidad());

            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
