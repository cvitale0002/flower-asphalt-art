import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

 backroundPainter bp = new backroundPainter ();
 FlowerPainter fp = new FlowerPainter ();
// draws the flower entirely 
        bp.backroundPainter ("ivory", 16);
        fp.drawFlower();
  }
}