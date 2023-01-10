import java.util.function.DoubleToIntFunction;

public class App {
    public static void main(String[] args) throws Exception {
        int size = 5;

        for(int i = 1; i <= size; i++){
            String line = String.valueOf(i);

            for(int j = 1; j < i; j++){
                line = line + String.valueOf(i);
            }

            System.out.println(line);
        }
    }
}
