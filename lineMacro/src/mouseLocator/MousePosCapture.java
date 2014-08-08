package mouseLocator;

import java.awt.MouseInfo;
import java.awt.PointerInfo;


public class MousePosCapture {
	
	static PointerInfo mousePos;
	
	public static PointerInfo getMousePos(){
		return MouseInfo.getPointerInfo();
		
	}
	
}
