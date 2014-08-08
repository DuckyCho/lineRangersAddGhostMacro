package mouseLocator;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyAndPaster {

	private static Robot paster;
	private static CopyAndPaster cnp = new CopyAndPaster();
	
	private CopyAndPaster(){
		try {
			paster = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static CopyAndPaster getInstance(){
		return cnp;
	}
	
	public void copy(String id){
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		
		if(id != null){
			StringSelection contents = new StringSelection(id);
			clipboard.setContents(contents, null);
		}
	}
	
	public void paste(){
		paster.keyPress(KeyEvent.VK_META);
		paster.keyPress(KeyEvent.VK_V);
		paster.keyRelease(KeyEvent.VK_META);
		paster.keyRelease(KeyEvent.VK_V);
		try {
			Thread.sleep(500L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void pressEnter(){
		paster.keyPress(KeyEvent.VK_ENTER);
		paster.keyRelease(KeyEvent.VK_ENTER);
		try {
			Thread.sleep(500L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
