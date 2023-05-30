package Stack;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();

        pilha.push("Elemento 1");
        pilha.push("Elemento 2");
        pilha.push("Elemento 3");


        System.out.println("Elemento removido: "+pilha.pop());
        System.out.println("O elemento que está no topo é: "+pilha.peek());
        System.out.println("Tamanho da pilha: "+pilha.size());
    }
}