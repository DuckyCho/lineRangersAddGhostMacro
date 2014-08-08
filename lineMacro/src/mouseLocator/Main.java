package mouseLocator;

import guiImplementation.First;
import java.awt.PointerInfo;
import java.util.ArrayList;



public class Main {

	public static int searchBarX,searchBarY;
	public static int xButtonX, xButtonY;
	public static int addButtonX, addButtonY;
	public static ArrayList<Integer> userInputInfo;
	
	public static void main(String[] args) {
				
		
		First gui =  new First();
		Thread t1 = new Thread(gui);
		
		t1.start();
       
	}
	
	public static void StartMacro(int searchX, int searchY, int xX, int xY, int okX, int okY ){
		ArrayList<String> idList;
		MouseMover mm1 = MouseMover.getInstance();
		CopyAndPaster cnp = CopyAndPaster.getInstance();
		PointerInfo pi;
		FileReader fr1 = FileReader.getInstance();
		idList = fr1.getLine(-1);
		
	
		/*
		System.out.println("ID List has been created!");
		
		
		System.out.println("START");
		System.out.println(String.format("%d, %d, %d, %d",searchX,searchY,xX,xY));
		System.out.println(String.format("%d, %d, %d, %d",searchX,searchY,xX,xY));
		System.out.println(String.format("%d, %d, %d, %d",searchX,searchY,xX,xY));
		System.out.println(String.format("%d, %d, %d, %d",searchX,searchY,xX,xY));
		System.out.println(String.format("%d, %d, %d, %d",searchX,searchY,xX,xY));
		System.out.println(String.format("%d, %d, %d, %d",searchX,searchY,xX,xY));
		*/
		mm1.moveMouseTo(searchX,searchY);
		mm1.leftClick();
		
		mm1.moveMouseTo(searchX,searchY);
		mm1.leftClick();
	
		
		for(int i = 0 ; i < 192 ; i++){
			
			cnp.copy(idList.get(i));
			mm1.moveMouseTo(searchX,searchY);
			mm1.leftClick();
			mm1.leftClick();
			cnp.paste();
			cnp.pressEnter();
			
			
			
			mm1.moveMouseTo(okX, okY);
			mm1.leftClick();
			
			mm1.moveMouseTo(okX, okY-28);
			mm1.leftClick();
			
			mm1.moveMouseTo(okX, okY-36);
			mm1.leftClick();
			
			mm1.moveMouseTo(xX, xY);
			mm1.leftClick();
			
			/*System.out.println("ID : "+idList.get(i)+"		...added");*/
			
			
			pi =MousePosCapture.getMousePos();
			if(pi.getLocation().getX() == 0 && pi.getLocation().getY() == 0)
				break;
			
			}
		
		
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		
		
		for(int i = 193 ; i < 380 ; i++){

			cnp.copy(idList.get(i));
			mm1.moveMouseTo(searchX,searchY);
			mm1.leftClick();
			mm1.leftClick();
			cnp.paste();
			cnp.pressEnter();
			
			
			
			mm1.moveMouseTo(okX, okY);
			mm1.leftClick();
			
			mm1.moveMouseTo(okX, okY-28);
			mm1.leftClick();
			
			mm1.moveMouseTo(okX, okY-36);
			mm1.leftClick();
			
			mm1.moveMouseTo(xX, xY);
			mm1.leftClick();
			
			/*System.out.println("ID : "+idList.get(i)+"		...added");*/
			
			
			pi =MousePosCapture.getMousePos();
			if(pi.getLocation().getX() == 0 && pi.getLocation().getY() == 0)
				break;
			
			}
		
		
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();	}
	
		for(int i = 381 ; i < idList.size() ; i++){

			cnp.copy(idList.get(i));
			mm1.moveMouseTo(searchX,searchY);
			mm1.leftClick();
			mm1.leftClick();
			cnp.paste();
			cnp.pressEnter();
			
			
			
			mm1.moveMouseTo(okX, okY);
			mm1.leftClick();
			
			mm1.moveMouseTo(okX, okY-28);
			mm1.leftClick();
			
			mm1.moveMouseTo(okX, okY-36);
			mm1.leftClick();
			
			mm1.moveMouseTo(xX, xY);
			mm1.leftClick();
			
			/*System.out.println("ID : "+idList.get(i)+"		...added");*/
			
			
			pi =MousePosCapture.getMousePos();
			if(pi.getLocation().getX() == 0 && pi.getLocation().getY() == 0)
				break;
			
			}
		
		
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();	}
		
	
	}
	
}





