public class PhoneNumber {
    private final int code;
    private final int operator;
    private final int three;
    private final int four;
    boolean russian = false;

    PhoneNumber(String text){
        four = Integer.parseInt(text.substring(text.length()-4));
        three = Integer.parseInt(text.substring(text.length()-7, text.length()-4));
        operator = Integer.parseInt(text.substring(text.length()-10, text.length()-7));
        if (text.contains("+")) {
            code = Integer.parseInt(text.substring(1, text.length()-10));
        } else {
            russian = true;
            code = 8;
        }
    }
    public void printNumber(){
        System.out.println("+" + code + "(" + operator + ")-" + three + "-" + four);
    }
}
