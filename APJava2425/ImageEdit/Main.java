package APJava2425.ImageEdit;

public class Main
{
   public static void main(String[] args) {
        //create a new ImageEdit object using input file (image of school)
        ImageEdit newFilter = new ImageEdit("ImageEdit/school.jpg");
        //convert the jpg to a pixel array to be able to modify each pixel
        newFilter.imagetoArray();

        //////////////////////////////////////////////////////
        /*call the image modification method that you create//
        / remove the call to the negative method            */
        //////////////////////////////////////////////////////
        newFilter.negative();

        
        //convert the pixel array back to an image file
        newFilter.arraytoImage();
        //save new image
        newFilter.saveImage();
        //redraw the display
        //frame.repaint();

    }
}
