
import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by melissamariangranadosgomez on 10/09/18.
 */
public class Pista extends JFrame{
    private ArrayList<Hilos> caballos;
    public Pista(){
        super("Carrera");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        caballos = new ArrayList<Hilos>();
    }

    public void add(Hilos caballo){
        caballos.add(caballo);
    }

    public void start(){
        setLayout(new GridLayout(caballos.size(),1));
        Panel lane = null;
        for (Hilos caballo : caballos){
            lane = new Panel();
            lane.add(caballo.getLabel());
            add(lane);
        }

        setVisible(true);
        for (Hilos caballo : caballos){
            caballo.getLabel().setLocation(caballo.getX(),(int) caballo.getLabel().getLocation().getY());
            caballo.start();
        }


    }

}

