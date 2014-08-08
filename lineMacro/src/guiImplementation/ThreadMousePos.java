package guiImplementation;

import mouseLocator.MousePosCapture;

public class ThreadMousePos implements Runnable {

	@Override
	public void run() {
		while(true){
			First.setCurrentMousePosX(Double.toString(MousePosCapture.getMousePos().getLocation().getX()));
			First.setCurrentMousePosY(Double.toString(MousePosCapture.getMousePos().getLocation().getY()));
		}
	}
	
}
