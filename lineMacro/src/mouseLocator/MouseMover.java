package mouseLocator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;


public class MouseMover{
	
	private static Robot mouseOperator;	
	private static MouseMover m1 = new MouseMover();
	
	private MouseMover() {
		try {
			mouseOperator = this.setMouseOperator();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	private Robot setMouseOperator() throws AWTException {
		Robot r1 = new Robot();
		return r1;
	}
	
	public static MouseMover getInstance(){
		return m1;
	}
	
	public boolean moveMouseTo(int x, int y){
		if( x > 0 && y > 0){
			try{
				mouseOperator.mouseMove(x, y);
				Thread.sleep(100L);
			} catch(InterruptedException ex){
				ex.printStackTrace();
			}
			
			return true;
		}
		else
			return false;
	}
	
	public boolean leftClick(){
		
		mouseOperator.mousePress(InputEvent.BUTTON1_MASK);
		mouseOperator.mouseRelease(InputEvent.BUTTON1_MASK);
		mouseOperator.delay(500);
		
		return true;
	}

}
