package trabPackage;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class EscolherArquivo {
	public static String getPath() {
		String path = caminho();
		JOptionPane.showMessageDialog(null, path);
		return path;
	}

	public static String caminho() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int result = fileChooser.showOpenDialog(null);
		if (result == JFileChooser.CANCEL_OPTION) {
			return null;
		}
		File arquivo = fileChooser.getSelectedFile();
		if (arquivo == null || arquivo.getName().equals("")) {
			JOptionPane.showMessageDialog(null, "Nome do arquivo Inv�lido");
		} else {
			return arquivo.getPath();
		}
		return null;
	}
	
}
