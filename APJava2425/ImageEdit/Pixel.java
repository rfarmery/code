package APJava2425.ImageEdit;
/**
 * Write a description of class Pixel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pixel
{
    int r,g,b;
    //create new pixel with all values as 0
    public Pixel(){
        r=g=b=0;
    }

    //create new pixel using specified value
    public Pixel(int v){
        r = (v>>16)&0xFF;
        g = (v>>8)&0xFF;
        b = v&0xFF;
    }

    //get the red component of the pixel
    public int getRed(){
        return r;
    }

    //get the green component of the pixel
    public int getGreen(){
        return g;
    }
    //get the blue component of the pixel
    public int getBlue(){
        return b;
    }
    //set the red component of the pixel to the specified value
    public void setRed(int red){
        r = red;
    }
    //set the green component of the pixel to the specified value
    public void setGreen(int green){
        g = green;
    }
    //set the blue component of the pixel to the specified value
    public void setBlue(int blue){
        b = blue;
    }

}