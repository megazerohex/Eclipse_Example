import java.io.File;

import javax.swing.JFileChooser;

public class example_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFileChooser finder = new JFileChooser();
		int returnValue = finder.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
          File selectedFile = finder.getSelectedFile();
          System.out.println(selectedFile.getPath());
        }
	}

}
