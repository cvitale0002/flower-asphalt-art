import org.code.neighborhood.*;


public class FlowerPainter extends backroundPainter {
  public void drawFlower(){
    getToCenter();
    drawCenter();
    drawTopPetal();
    drawRightPetal();
    drawLeftPetal();
    drawBottomPetal();
  }
//gets painter to the center 
 public void getToCenter(){
    move ();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    }
  // draws center of flower in green 
  public void drawCenter(){
    paint ("green");
    move();
    turnLeft();
    paint("green");
    
    setPaint (2);
    paintToEmpty("green");

    turnRight();
    turnRight();
    turnLeft();


    move();
    turnRight();
    paint("green");
    move();
    paint("green");

    setPaint (2);
    paintToEmpty("green");
  }
  // draws top petal
  public void drawTopPetal(){
    turnRight();
    paint ("pink");
    move();
    paint ("pink");
    move();
    paint ("pink");

    setPaint (3);
    paintToEmpty ("pink");

    turnRight();
    paint ("pink");
    move();
    paint("pink");
    
    setPaint (2);
    paintToEmpty ("pink");

    turnRight();
    move();
    paint ("pink");
    

    setPaint (3);
    paintToEmpty("pink");

    turnRight();
    move();
    move();
    turnRight();
    move();
    paint("pink");

    setPaint (3);
    paintToEmpty("pink");

    turnRight();
    move();
    turnRight();
    move();
    paint("pink");

    setPaint(3);
    paintToEmpty("pink");
      }
  // draws the right petal entirely 
  public void drawRightPetal(){
    turnRight();
    turnRight();
    move();
    turnRight();
    move();
    move();
    paint("pink");

    setPaint (2);
    paintToEmpty("pink");

    turnRight();
    move();
    paint("pink");

    setPaint (2);
    paintToEmpty("pink");

    turnRight();
    move();
    paint("pink");

    setPaint (3);
    paintToEmpty ("pink");

    turnRight();
    move();
    turnRight();
    move();
    paint ("pink");

    setPaint (3);
    paintToEmpty ("pink");

    turnLeft();
    move();
    turnLeft();
    move();
    paint("pink");

    setPaint(3);
    paintToEmpty("pink");
}
  public void drawLeftPetal(){
    move();
    move();
    turnRight();
    move();
    turnLeft();
    paint("pink");

    setPaint (3);
    paintToEmpty("pink");

    turnLeft();
    move();
    paint ("pink");

    setPaint (2);
    paintToEmpty ("pink");

    turnLeft();
    move();
    paint("pink");

    setPaint (3);
    paintToEmpty ("pink");

    turnLeft();
    move();
    turnLeft();    
    move();
    paint ("pink");

    setPaint(3);
    paintToEmpty("pink");

    turnRight();
    move();
    turnRight();
    paint("pink");

    setPaint(4);
    paintToEmpty("pink");
  }
  //draws bottom of petal 
  public void drawBottomPetal(){
    turnRight();
    move();
    move();
    turnRight();
    move();
    turnLeft();
    move();
    paint("pink");

    setPaint (2);
    paintToEmpty("pink");

    turnLeft();
    move();
    paint("pink");

    setPaint(2);
    paintToEmpty("pink");

    turnLeft();
    move();

    setPaint (2);
    paintToEmpty("pink");

    turnRight();
    turnRight();
    turnRight();
    move();
    paint ("pink");

    setPaint (2);
    paintToEmpty("pink");

    turnLeft();
    move();
    turnLeft();
    paint("pink");

    setPaint (3);
    paintToEmpty("pink");

    turnRight();
    move();
    turnRight();
    paint("pink");

    setPaint (3);
    paintToEmpty("pink");
    turnRight();
    
    
  }
}