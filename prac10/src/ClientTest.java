public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client();
        client.sit();
        client.setChair(new MagicChair());
    }
}
