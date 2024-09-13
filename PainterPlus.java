import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the Painter object to the right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  // Takes all paint from a paint bucket
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
    }
  }

  // Moves while the Painter object can move then turns left
  public void moveTurnLeft() {
    while (canMove()) {
      move();
    }

    turnLeft();
  }
 public void turnSouth() {
    if (canMove("south")) {
      turnRight();
    }
  }

  public void makeTurn() {
    if (!canMove()) {
      turnLeft();
    }
  }

  public void returnToStart() {
    if (isFacingWest()) {
      if (canMove("north")) {
        turnRight();
      }
    }
  }
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
    }
  }
  
}