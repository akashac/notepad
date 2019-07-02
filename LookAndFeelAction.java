import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;
import java.awt.image.BufferedImage;
public class LookAndFeelAction
{
    JFrame jf;
    public LookAndFeelAction(JFrame j)
    {
        jf=j;
    }

    public static void setBasicLookAndFeel()
    {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            Notepad tb = new Notepad();
            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
            BufferedImage image = null;
            try {
                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            tb.setIconImage(image);
            tb.setSize(800, 600);
            tb.setLocation(100, 50);
            tb.setVisible(true);
        } catch (Exception e) {
        }
    }

    public static void setMotifLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            Notepad tb = new Notepad();
            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
            BufferedImage image = null;
            try {
                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            tb.setIconImage(image);
            tb.setSize(800, 600);
            tb.setLocation(100, 50);
            tb.setVisible(true);
        }
        catch (Exception e) {
        }
    }

    public static void setNimbusLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            Notepad tb=new Notepad();
            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
            BufferedImage image = null;
            try {
                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            tb.setIconImage(image);
            tb.setSize(800, 600);
            tb.setLocation(100, 50);
            tb.setVisible(true);
        }
        catch(Exception e){ }
    }

    public static void setWindowsLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            Notepad tb = new Notepad();
            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
            BufferedImage image = null;
            try {
                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            tb.setIconImage(image);
            tb.setSize(800, 600);
            tb.setLocation(100, 50);
            tb.setVisible(true);
        }
        catch (Exception e) {
        }
    }

    public static void setWindowsClassicLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            Notepad tb = new Notepad();
            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
            BufferedImage image = null;
            try {
                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            tb.setIconImage(image);
            tb.setSize(800, 600);
            tb.setLocation(100, 50);
            tb.setVisible(true);
        }
        catch (Exception e) {
        }
    }
//setBasic()
	public static void setgtkLookAndFeel()
    {
        try
        {
	     System.out.println("Called Successfully");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            Notepad tb = new Notepad();
            tb.setExtendedState(JFrame.MAXIMIZED_BOTH);
            BufferedImage image = null;
            try {
                image = ImageIO.read(tb.getClass().getResource("resources/myicon.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            tb.setIconImage(image);
            tb.setSize(800, 600);
            tb.setLocation(100, 50);
            tb.setVisible(true);
        }
        catch (Exception e) {
        }
    }

} 
