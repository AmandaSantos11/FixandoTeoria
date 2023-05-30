package LinkdList;
import java.util.LinkedList;

public class linkdList {
    public static void main(String[] args) {

        LinkedList<Integer> listaDeNumeros = new LinkedList<>();

        listaDeNumeros.add(6);
        listaDeNumeros.add(5);
        listaDeNumeros.add(2);

        LinkedList<Integer> lista2 = new LinkedList<>();
        lista2.add(3);
        lista2.add(5);

        listaDeNumeros.addAll(lista2);

        System.out.println(listaDeNumeros);
    }
}