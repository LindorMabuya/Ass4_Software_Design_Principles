package za.ac.cput.SRP;

/**
 * Created by LILO on 2016/03/25.
 */
public class Printer {
    Text text;

    public Printer(Text text) {
        this.text = text;
    }
    public void printText(){
        System.out.print("Text sent to printer to be printed");

    }
}
