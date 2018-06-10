import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringProcess processor = new StringProcess();
        String str = processor.readInputText();
        processor.showResult(processor.processText(str));

    }
}