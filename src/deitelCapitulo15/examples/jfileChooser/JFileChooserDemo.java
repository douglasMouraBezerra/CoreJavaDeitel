package deitelCapitulo15.examples.jfileChooser;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooserDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private final JTextArea outputArea;

	public JFileChooserDemo() throws IOException {
		super("JFileChooser Demo");
		outputArea = new JTextArea();
		add(new JScrollPane(outputArea));
		analyzePath();
	}

	public void analyzePath() throws IOException {
		Path path = getFileOrDirectory();

		// se existir, exibe as informa��es
		if (path != null && Files.exists(path)) {
			StringBuilder builder = new StringBuilder();
			builder.append(String.format("%s:%n", path.getFileName()));
			builder.append(String.format("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not"));
			builder.append(String.format("%s an absolute path%n", path.isAbsolute() ? "Is" : "Is not"));
			builder.append(String.format("Last modified: %s%n", Files.getLastModifiedTime(path)));
			builder.append(String.format("Size: %s%n", Files.size(path)));
			builder.append(String.format("Path: %s%n", path));
			builder.append(String.format("Absolute path: %s%n", path.toAbsolutePath()));

			// agora listanto diretorios
			if (Files.isDirectory(path)) {
				builder.append(String.format("%nDirectory contents:%n"));

				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

				for (Path p : directoryStream) {
					builder.append(String.format("%s%n", p));
				}
			}
			outputArea.setText(builder.toString());

		} else // Path nao existe
		{
			JOptionPane.showMessageDialog(this, path.getFileName() + "does not exist.", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} // fim do m�todo analyzePath

	}

	public Path getFileOrDirectory() throws IOException {
		// configura o di�logo permitindo a sele��o de um arquivo ou diret�rio
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int resultado = fileChooser.showOpenDialog(this);

		if (resultado == JFileChooser.CANCEL_OPTION)
			System.exit(1);

		return fileChooser.getSelectedFile().toPath();

	}

}
