import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter at least three words divided by commas");
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String [] array = str.split(",");
        String choise = "";

        while(!"0".equals(choise)) {
            System.out.println("Select filter:");
            System.out.println("1 - maximum length \n"+
                    "2 - start with\n"+
                    "3 - end with\n"+
                    "4 - contains\n"+
                    "0 - exit");

            choise = in.next();
            String result = "";

            switch(choise) {
                case "1":
                    System.out.println("Enter maximum length");
                    double length = in.nextDouble();
                    for(String s : array) {
                        if (s.length() <= length)
                            result += s + "\n";
                    }
                    break;
                case "2":
                    System.out.println("Enter first letters");
                    String firstLetters = in.next();
                    for(String s : array) {
                        if (s.startsWith(firstLetters))
                            result += s + "\n";
                    }
                    break;
                case "3":
                    System.out.println("Enter last letters");
                    String lastLetters = in.next();
                    for(String s : array) {
                        if (s.endsWith(lastLetters))
                            result += s + "\n";
                    }
                    break;
                case "4":
                    System.out.println("Enter part of the world");
                    String part = in.next();
                    for(String s : array) {
                        if (s.contains(part))
                            result += s + "\n";
                    }
                    break;
                default:
                    break;
            }
            System.out.println(result);
        }
    }
}