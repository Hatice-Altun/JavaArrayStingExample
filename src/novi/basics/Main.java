package novi.basics;

public class Main {

    public static void main(String[] args) {
	// Just an Array String example

        String[] text = new String[4];
        text[0] = "This ";
        text[1] = "is ";
        text[2] = "an ";
        text[3] = "Array!";

        System.out.println(text[0] + text[1] + text[2] + text[3]);
        System.out.println(text.length);
    }
}
