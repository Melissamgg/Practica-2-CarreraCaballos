/**
 * Created by melissamariangranadosgomez on 10/09/18.
 */

import javax.swing.JLabel;

public class Hilos extends Thread {
    public JLabel label;
    public int velocidad;
    public String imageName;
    public int x;
    public JLabel getLabel(){
        return label;
    }
    public void setLabel(JLabel label){
        this.label = label;
    }
    public String getImageName(){
        return  imageName;
    }

    public void setImageName(String imageName){
        this.imageName=imageName;
    }

    public int getVelocidad(){
        return velocidad;
    }

    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x=x;
    }
}
