import java.util.StringTokenizer;

public class Shirt {
    private final String article;
    private final String name;
    private final String color;
    private final String size;

    Shirt(String text){
        StringTokenizer stringTokenizer = new StringTokenizer(text, ",");
        article = stringTokenizer.nextToken();
        name = stringTokenizer.nextToken();
        color = stringTokenizer.nextToken();
        size = stringTokenizer.nextToken();
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "article='" + article + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
