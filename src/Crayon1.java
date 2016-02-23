import java.awt.*;

/**
 * Applet that displays a set of crayon.
 * 
 * @author Saad Ahmad
 */

public class Crayon1
{
   private int baseX;     // center of crayon
   private int baseY;     // floor of crayon
   private Color color;   // color of crayon
   private int scale;     // height of crayon

   //-----------------------------------------------------------------
   //  Sets up the crayon's primary attributes.
   //-----------------------------------------------------------------
   public Crayon1 (int X, int Y, Color shade, int size)
   {
   	  baseX = X;
   	  baseY = Y;
      color = shade;
      scale = size;
   }

   //-----------------------------------------------------------------
   //  Draws this figure relative to baseX, baseY, and height.
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
      page.setColor (color);
      page.fillRect (baseX, baseY, scale, scale*6);   //base
      // drawing multiple lines for coloring the cones 
      page.drawLine (baseX, baseY, baseX+10, baseY-30);   //tips
      page.drawLine (baseX+1, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+2, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+3, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+4, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+5, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+6, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+7, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+8, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+9, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+10, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+11, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+12, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+13, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+14, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+15, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+16, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+17, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+18, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+19, baseY, baseX+10, baseY-30);
      page.drawLine (baseX+20, baseY, baseX+10, baseY-30);
      

      // Writing "CRAYOLA" on each crayon
      page.setColor(Color.white);
      page.drawString("C", baseX+6, baseY+10);
      page.drawString("R", baseX+6, baseY+25);
      page.drawString("A", baseX+6, baseY+40);
      page.drawString("Y", baseX+6, baseY+55);
      page.drawString("O", baseX+6, baseY+70);
      page.drawString("L", baseX+6, baseY+85);
      page.drawString("A", baseX+6, baseY+100);
   }
}
