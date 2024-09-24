import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShortLister {
    public static void main(String[] args) {



        File workingDirectory = new File(System.getProperty("user.dir"));
        File jfcFile = new File(workingDirectory.getPath() + "\\Interfaces");
        JFileChooser jfc = new JFileChooser(jfcFile, FileSystemView.getFileSystemView());
        jfc.showOpenDialog(null);

        try {
            String fileContents = new String(Files.readAllBytes(Paths.get(jfc.getSelectedFile().getAbsolutePath())));
            fileContents = fileContents.replace(",", "");
            String[] splitContents = fileContents.split(" ");

            Filter fil = new ShortWordFilter();

            for (int i = 0; i < splitContents.length; i++){
                if (fil.accept(splitContents[i])){
                    System.out.println(splitContents[i]);
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }}