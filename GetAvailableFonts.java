import java.applet.Applet;
 import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
/*
<applet code="GetAvailableFonts" width=200 height=200>
</applet> */
public class GetAvailableFonts extends Applet{
 

public void paint(Graphics g){ GraphicsEnvironment graphicsEnvironment =
GraphicsEnvironment.getLocalGraphicsEnvironment();
String fontNames[] = graphicsEnvironment.getAvailableFontFamilyNames();


int y = 20;
for(int i=0; i < fontNames.length; i++){ g.drawString(fontNames[i], 10, y);
y += 20;
}
}
}

