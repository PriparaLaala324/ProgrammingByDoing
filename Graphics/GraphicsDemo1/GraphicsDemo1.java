import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
    public void paint(Graphics g)
    {
      g.setColor(Color.green);
      g.drawRect(60,30,110,210);
      g.fillOval(170,30,110,210);
      g.setColor(Color.blue);
      g.fillRect(210,410,210,30);
      g.drawOval(210,440,210,110);

        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 510, 110);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main(String[] args)
    {
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(810,610);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}
