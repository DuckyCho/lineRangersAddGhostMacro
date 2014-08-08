package guiImplementation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import mouseLocator.Main;

public class StartButtonPushed implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<Integer> searchBar = First.getSearchButton();
		ArrayList<Integer> xButton = First.getXButton();
		ArrayList<Integer> addButton = First.getOkayButton();
		
		Main.StartMacro(searchBar.get(0),searchBar.get(1),xButton.get(0),xButton.get(1),addButton.get(0),addButton.get(1));
		
	}

	

}
