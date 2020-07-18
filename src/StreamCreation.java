import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        //Creating Stream object using Stream.Of()

        Stream<String> stream = Stream.of("venkata","ravindra","reddy");
        System.out.println(stream);
    }
}
