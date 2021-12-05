public class Person {
    private String first_name = " ";
    private String middle_name = " ";
    private final String last_name;

    Person(String first_name, String  last_name, String middle_name){
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
    }
    Person(String last_name) {
        this.last_name = last_name;
    }
    public void callout(){
        System.out.println(last_name + " " + first_name.charAt(0) + "." + middle_name.charAt(0));
    }
}
