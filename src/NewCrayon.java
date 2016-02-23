import java.awt.*;
import java.applet.*;

/**
 * Applet that displays a set of crayon.
 * 
 * @author Saad Ahmad
 */

@SuppressWarnings("serial")
public class NewCrayon extends Applet {
	
 private final int APPLET_WIDTH = 250;
 private final int APPLET_HEIGHT = 150;

   private Crayon1 Crayon1, Crayon2, Crayon3, Crayon4, Crayon5, Crayon6, Crayon7;

   //-----------------------------------------------------------------
   //  Creates several crayons
   //-----------------------------------------------------------------
   public void init ()
   {
      Crayon1 = new Crayon1 (40, 50, Color.red, 20);
      Crayon2 = new Crayon1 (60, 50, Color.cyan, 20);
      Crayon3 = new Crayon1 (80, 50, Color.green, 20);
      Crayon4 = new Crayon1 (100, 50, Color.yellow, 20);
      Crayon5 = new Crayon1 (120, 50, Color.pink, 20);
      Crayon6 = new Crayon1 (140, 50, Color.black, 20);
      Crayon7 = new Crayon1 (160, 50, Color.blue, 20);
      
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }
   //-----------------------------------------------------------------
   //  Paints the Crayons on the applet.
   //----------------------------------------------------------------
   public void paint (Graphics page)
  {
   Crayon1.draw (page);
   Crayon2.draw (page);
   Crayon3.draw (page);
   Crayon4.draw (page);
   Crayon5.draw (page);
   Crayon6.draw (page);
   Crayon7.draw (page);
  }
}
