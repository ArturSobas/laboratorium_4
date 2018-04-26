import java.awt.Graphics;
import java.util.Timer;


import javax.swing.JApplet;

public class SpringApplet extends JApplet {
	
	private SimEngine simengine;
	private SimTask simtask;
	private Timer timer;
	
	@Override
	public void init() {
		setSize(1366,662);
		simengine = new SimEngine(5, 14, 0.707, 200, new Vector2D(-10,300),
				new Vector2D(200,-300), new Vector2D(-5,30));
		simtask = new SimTask(0.1,this,simengine);
		timer = new Timer();
		timer.scheduleAtFixedRate(simtask, 0, 30);
	}

	@Override
	public void paint(Graphics g) {
		//czyszczenie okna
		g.clearRect(0, 0, getWidth(), getHeight());
		g.translate(1366/2, 662/2);
	

		int xo = (int)simengine.getPunktZawieszenia().x;
		int yo = -(int)simengine.getPunktZawieszenia().y;
		
		g.translate(xo, yo);
		
		//rysowanie linii symbolizujacej sprezyne
		g.drawLine(0, 0, (int)simengine.getPolozenie().x, -(int)simengine.getPolozenie().y);
		//rysowanie kola symbolizujacego mase
		g.fillOval((int)simengine.getPolozenie().x - 10, -(int)simengine.getPolozenie().y, 20, 20);

	}
}