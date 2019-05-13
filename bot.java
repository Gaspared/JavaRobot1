package bot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class bot {

	//clipboard
	public static void clip(String text) {
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
	}
	
	
	public static void main(String[] args) throws IOException, AWTException {
		Robot robot = new Robot();
		Runtime runtime = Runtime.getRuntime();
		System.out.println("test");
		/*
		//copy&paste
		String [] text = new String [10];
		text[0] = "i:";
		text[1] = "clear";
		text[2] = "mkdir important";
		text[3] = "wget \"http://clipart-library.com/images/kiMKobxKT.jpg\" -outfile \"i:/important/wc.jpg\"";
		text[4] = "exit";
		text[5] = "i:\\important";
		
		text[6]= "https://www.youtube.com/watch?v=boAJUSN8fOU";
		
		
		//Desktop
		//wait 
		robot.delay(2000);
		
		//powershell
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_X);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		
		//loop for copy&paste
		for (int i = 0; i<=4;i++) {
			robot.delay(600);
			clip(text[i]);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		
		//open directory
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		
		robot.delay(800);
		clip(text[5]);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//select pic
		robot.delay(800);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		
		robot.delay(800);
		robot.keyPress(KeyEvent.VK_CONTEXT_MENU);
		robot.keyRelease(KeyEvent.VK_CONTEXT_MENU);	
		
		robot.delay(800);
		for (int i = 0; i<5;i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//close
		robot.delay(800);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_F4);
	
		
		
		//Paint
		runtime.exec("mspaint.exe");
		robot.delay(1000);
		
		int xstart = 400;
		int ystart = 400;
		
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		for (int k = 0; k<200;k++) {
			int l = (int)(Math.random()*700) +150;
			int m = (int)(Math.random()*700) +150;
			
			robot.mouseMove(l, m);
			robot.delay(10);

			
		}
		
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		robot.mouseMove(xstart, ystart);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		for (int k = 0; k<100;k++) {
			robot.delay(10);
			robot.mouseMove(xstart+500, ystart-30);
			
			for (int j = 0; j<4;j++) {
				robot.mouseMove(xstart++, ystart++);
			}
			
		}
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		
		//Browser
		
		runtime.exec("C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
		robot.delay(1000);
		
		//fullscreen
		robot.keyPress(KeyEvent.VK_WINDOWS);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_WINDOWS);
		robot.keyRelease(KeyEvent.VK_UP);
		
		//addressbar
		robot.delay(800);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_E);
		
		//paste address
		robot.delay(800);
		clip(text[6]);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		//enter
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		*/
		
		
		
	}

}
