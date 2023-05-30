package ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {

        List<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("carol");
        listaDeNomes.add("milena");
        listaDeNomes.add("laura");
        listaDeNomes.add("vitoria");
        listaDeNomes.add("carol");
        listaDeNomes.add("amanda");

        Iterator iterator = listaDeNomes.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------------");
        listaDeNomes.remove(3);
        System.out.println(listaDeNomes);
    }
    }