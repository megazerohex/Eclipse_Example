import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class example_class {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//express and look
		try {UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch (ClassNotFoundException e) {}
        catch (InstantiationException e) {}
        catch (IllegalAccessException e) {}
        catch (UnsupportedLookAndFeelException e) {}
		
		//File finder
		JFileChooser finder = new JFileChooser();
		int returnValue = finder.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
          File selectedFile = finder.getSelectedFile();
          System.out.println(selectedFile.getPath());
        }
	}	

}
