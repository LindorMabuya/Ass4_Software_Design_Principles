package za.ac.cput.Single_Responsibility;

/**
 * Created by LILO on 2016/03/24.
 */
public class Text {
    String text;
    String author;
    int length;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    void printText() {
        System.out.print("Text: not all Text can be printed");
    }

}
