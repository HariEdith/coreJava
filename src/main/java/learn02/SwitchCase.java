package learn02;

public class SwitchCase {
    public static void main(String args[]) {
        String day = "monday";
        switch(day){
            case "friday":
                System.out.println("monday");
                break;
            default:
                System.out.println("not mentioned");
        }
    }
}
