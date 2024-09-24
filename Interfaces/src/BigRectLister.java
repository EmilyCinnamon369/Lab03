import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class BigRectLister {
    public static void main(String[] args) {

        Random r = new Random();

        Rectangle[] rectArray = new Rectangle[10];


        Filter fil = new BigRectangleFilter();

        for (int i = 0; i<10; i++){
            rectArray[i] = new Rectangle(i*2, i*2); // This creates an array of rectangles (squares, technically) going from 2 by 2 to 18 by 18.
        }

        for (int i = 0; i<10; i++){
            if (fil.accept(rectArray[i])){
                System.out.println(rectArray[i]);
            }
        }


    }}