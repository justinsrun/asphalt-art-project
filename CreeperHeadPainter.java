import org.code.neighborhood.*;

public class CreeperHeadPainter extends MuralPainter {

//constructor
  public CreeperHeadPainter () {
    
  } // end of constructor

public void paintFace(String color) {
startPosition();
  paintEye(color);
paintMouth(color);
  
}//end of paintFace


  public void startPosition () {
    turnRight();
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
  }//end of start position
  
public void paintEye(String color) {
  paintLine(color,3);
  move();
  move();
  move();
  paintLine(color,3);
  turnRight();
  move();
  turnRight();
  move();
  paintLine(color,3);
    move();
  move();
  move();
  paintLine(color,3);
  turnLeft();
  move();
  turnLeft();
  move();
  paintLine(color,3);
  move();
  move();
  move();
  paintLine(color,3);
} //end of paintEye

  public void paintMouth(String color) {
    turnRight();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    paintLine(color,3);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(color,3);
    move();
    move();
    turnRight();
    move();
    turnRight();
    paintLine(color,9);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(color,9);
    turnRight();
    move();
    turnRight();
    move();
    paintLine(color,9);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(color,3);
    move();
    move();
    move();
    paintLine(color,3);
    turnRight();
    move();
    turnRight();
    move();
    paintLine(color,3);
    move();
    move();
    move();
    paintLine(color,3);
  }//end of paintMouth

  
} // end of class