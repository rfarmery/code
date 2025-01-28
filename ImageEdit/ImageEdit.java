package ImageEdit;
//import all the libraries
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageEdit extends Component {
  // DO NOT EDIT MY CODE!

  BufferedImage img;
  Pixel[][] pixelsArray;

  // create a new object by opening a file in the current directory called
  // school.jpg
  // school.jpg is a small version of this image:
  // https://en.wikipedia.org/wiki/Prospect_Hill_Academy#/media/File:Prospect_Hill_Academy,_Cambridge_MA.jpg
  public ImageEdit(String filename) {
    try {
      img = ImageIO.read(new File(filename));
    } catch (IOException e) {
      System.out.println("error loading image");
    }
  }

  // convert BufferedImage object to a 2D pixel array
  public void imagetoArray() {
    pixelsArray = new Pixel[img.getHeight()][img.getWidth()];

    for (int i = 0; i < img.getHeight(); i++) {
      for (int j = 0; j < img.getWidth(); j++) {
        pixelsArray[i][j] = new Pixel(img.getRGB(j, i));
      }
    }
    System.out.println("array of pixels created");
  }

  public void saveImage() {
    try {
      File saveFile = new File("newImg.jpg");
      ImageIO.write(img, "jpg", saveFile);
      System.out.println("New Image saved");
    } catch (IOException e) {
      System.out.println("save failed :(");
    }
  }

  // convert a 2D pixel array into a BufferedImage
  public void arraytoImage() {
    for (int i = 0; i < img.getHeight(); i++) {
      for (int j = 0; j < img.getWidth(); j++) {
        Pixel p = pixelsArray[i][j];
        img.setRGB(j, i, (p.getRed() << 16) | (p.getGreen() << 8) | p.getBlue());
      }
    }
    System.out.println("array of pixels converted to image");
  }

  // example method to create a negative image
  public void negative() {
    System.out.println("running filter");
    for (int x = 0; x < pixelsArray.length; x++) {
      for (int y = 0; y < pixelsArray[0].length; y++) {
        int red = 255 - pixelsArray[x][y].getRed();
        int green = 255 - pixelsArray[x][y].getGreen();
        int blue = 255 - pixelsArray[x][y].getBlue();
        pixelsArray[x][y].setRed(red);
        pixelsArray[x][y].setGreen(green);
        pixelsArray[x][y].setBlue(blue);
      }
    }
  }
  ////////////////////////////////////////////////
  /* write your image modification method(s) here */
  ////////////////////////////////////////////////
}
 