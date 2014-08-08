package guiImplementation;


import javax.swing.*;

import java.awt.Font;
import java.util.ArrayList;


public class First implements Runnable {
	private static JTextField textFieldX_search;
	private static JTextField textFieldY_search;
	private static JTextField textFieldX_xButton;
	private static JTextField textFieldY_xButton;
	private static JTextField textFieldX_addButton;
	private static JTextField textFieldY_addButton;
	private static JTextField currentMousePosX;
	private static JTextField currentMousePosY;
	
	public static int okayButtonX, okayButtonY;
	public static int xButtonX, xButtonY;
	public static int searchButtonX,searchButtonY;
	
	@Override
	public void run() {
		createAndShowGUI();		
	}
	
		
    
	public static void createAndShowGUI()  {
    	ThreadMousePos mousePosSynchro = new ThreadMousePos();
    	Thread t1 = new Thread(mousePosSynchro);
    	
    	//Create and set up the window.
        JFrame frame = new JFrame("LINE Adding ghosts macro - by YD ");
        frame.setResizable(false);
        frame.getContentPane().setLayout(null);
        frame.setSize(338, 500);
        
        /*start button*/
        JButton btnStart = new JButton("START");
        btnStart.setBounds(121, 421, 100, 40);
        frame.getContentPane().add(btnStart);
        
        
        /*검색바 위치*/
        textFieldX_search = new JTextField();
        textFieldX_search.setBounds(6, 0, 134, 28);
        frame.getContentPane().add(textFieldX_search);
        textFieldX_search.setColumns(10);
        
        JLabel textFieldX_search_label = new JLabel("검색바의 X좌표");
        textFieldX_search_label.setBounds(140, 6, 136, 16);
        frame.getContentPane().add(textFieldX_search_label);
        
        textFieldY_search = new JTextField();
        textFieldY_search.setBounds(6, 32, 134, 28);
        frame.getContentPane().add(textFieldY_search);
        textFieldY_search.setColumns(10);
        
        JLabel textFieldY_search_label = new JLabel("검색바의 Y좌표");
        textFieldY_search_label.setBounds(140, 38, 136, 16);
        frame.getContentPane().add(textFieldY_search_label);
        
        
        /*X버튼 위치*/
        textFieldX_xButton = new JTextField();
        textFieldX_xButton.setColumns(10);
        textFieldX_xButton.setBounds(6, 84, 134, 28);
        frame.getContentPane().add(textFieldX_xButton);
        
        
        JLabel textFieldX_xButton_label = new JLabel("검색바 옆의 X버튼 X좌표");
        textFieldX_xButton_label.setBounds(140, 90, 136, 16);
        frame.getContentPane().add(textFieldX_xButton_label);
        
        textFieldY_xButton = new JTextField();
        textFieldY_xButton.setColumns(10);
        textFieldY_xButton.setBounds(6, 116, 134, 28);
        frame.getContentPane().add(textFieldY_xButton);
        
        JLabel textFieldY_xButton_label = new JLabel("검색바 옆의 X버튼 Y좌표");
        textFieldY_xButton_label.setBounds(140, 121, 136, 16);
        frame.getContentPane().add(textFieldY_xButton_label);
        
        
        
        /*추가버튼 위치*/
        textFieldX_addButton = new JTextField();
        textFieldX_addButton.setColumns(10);
        textFieldX_addButton.setBounds(6, 167, 134, 28);
        frame.getContentPane().add(textFieldX_addButton);
        
        JLabel textFieldX_addButton_label = new JLabel("추가버튼 X좌표");
        textFieldX_addButton_label.setBounds(140, 173, 136, 16);
        frame.getContentPane().add(textFieldX_addButton_label);
        
        textFieldY_addButton = new JTextField();
        textFieldY_addButton.setColumns(10);
        textFieldY_addButton.setBounds(6, 199, 134, 28);
        frame.getContentPane().add(textFieldY_addButton);
        
        JLabel textFieldY_addButton_label = new JLabel("추가버튼 Y좌표");
        textFieldY_addButton_label.setBounds(140, 205, 136, 16);
        frame.getContentPane().add(textFieldY_addButton_label);
        
        JLabel description = new JLabel("검색바, 검색바 옆의 x버튼, 추가 버튼의 좌표를 확인하여");
        description.setBounds(28, 230, 300, 40);
        frame.getContentPane().add(description);
        
        JLabel description2 = new JLabel("각각의 란에 입력해주세요.");
        description2.setBounds(100, 246, 300, 40);
        frame.getContentPane().add(description2);
        
        JLabel description3 = new JLabel("종료하시려면 왼쪽 맨위 화면으로");
        description3.setBounds(80, 262, 300, 40);
        frame.getContentPane().add(description3);
        
        JLabel description4 = new JLabel("미친듯이 가져다 놓으셔야 합니다.");
        description4.setBounds(80, 278, 300, 40);
        frame.getContentPane().add(description4);
        
        
        JLabel currentMousePos = new JLabel("현재 마우스 위치 좌표");
        currentMousePos.setHorizontalAlignment(SwingConstants.CENTER);
        currentMousePos.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        currentMousePos.setBounds(91, 313, 162, 28);
        frame.getContentPane().add(currentMousePos);
        
       
        currentMousePosX = new JTextField("X좌표",16);
        currentMousePosX.setHorizontalAlignment(SwingConstants.CENTER);
        currentMousePosX.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        currentMousePosX.setBounds(51,340, 100, 28);
        frame.getContentPane().add(currentMousePosX);
       
        
        currentMousePosY = new JTextField("Y좌표",16);
        currentMousePosY.setHorizontalAlignment(SwingConstants.CENTER);
        currentMousePosY.setFont(new Font("Lucida Grande", Font.BOLD, 13));
        currentMousePosY.setBounds(180,340, 100, 28);
        frame.getContentPane().add(currentMousePosY);
      
        
        JLabel lblX = new JLabel("X좌표");
        lblX.setHorizontalAlignment(SwingConstants.CENTER);
        lblX.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        lblX.setBounds(67, 367, 67, 28);
        frame.getContentPane().add(lblX);
        
        JLabel lblY = new JLabel("Y좌표");
        lblY.setHorizontalAlignment(SwingConstants.CENTER);
        lblY.setFont(new Font("Lucida Grande", Font.BOLD, 16));
        lblY.setBounds(199, 367, 67, 28);
        frame.getContentPane().add(lblY);
        
        btnStart.addActionListener(new StartButtonPushed());
        frame.addWindowListener(new WindowEventHandler());
        frame.setVisible(true);
        
        t1.setDaemon(true);
        t1.start();
        
        

        
	}

    public static void setCurrentMousePosX(String posX){
    	currentMousePosX.setText(posX);
    }
    
    public static void setCurrentMousePosY(String posY){
    	currentMousePosY.setText(posY);
    }
    
   
    public static ArrayList<Integer> getOkayButton(){
    	 ArrayList<Integer> result = new  ArrayList<Integer>();
    	 
    	 okayButtonX=Integer.valueOf(textFieldX_addButton.getText());
    	 okayButtonY=Integer.valueOf(textFieldY_addButton.getText());
    	 result.add(okayButtonX);
    	 result.add(okayButtonY);
    	 return result;
	}

  
	public static ArrayList<Integer> getXButton(){
   	 ArrayList<Integer> result = new  ArrayList<Integer>();
   	xButtonX=Integer.valueOf(textFieldX_xButton.getText());
   	xButtonY=Integer.valueOf(textFieldY_xButton.getText());
   	 result.add(xButtonX);
   	 result.add(xButtonY);
   	 return result;
	}

	
	
	public static ArrayList<Integer> getSearchButton(){
	   	 ArrayList<Integer> result = new  ArrayList<Integer>();
	   	searchButtonX=Integer.valueOf(textFieldX_search.getText());
	   	searchButtonY=Integer.valueOf(textFieldY_search.getText());
	   	 result.add(searchButtonX);
	   	 result.add(searchButtonY);
	   	 return result;
		}

 

	
    
	
   
 }
