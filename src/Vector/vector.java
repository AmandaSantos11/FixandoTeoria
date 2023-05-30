package Vector;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {

        Vector<Integer> numeros = new Vector<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        for(int num : numeros) {
            System.out.println(num);
        }
    }
}