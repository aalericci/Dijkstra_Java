import java.util.HashMap;
import java.util.LinkedList;

public class Nodo {
    private String nome;
    private int distanza = Integer.MAX_VALUE;
    private LinkedList <Nodo> pathMinimo = new LinkedList<>(); // Cammino minimo dall'origine ad un nodo
    HashMap <Nodo, Integer> nodiAdiacenti = new HashMap(); // Nodi collegati

    public Nodo(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDistanza() {
        return distanza;
    }

    public void setDistanza(int distanza) {
        this.distanza = distanza;
    }

    public LinkedList<Nodo> getPathMinimo() {
        return pathMinimo;
    }

    public void setPathMinimo(LinkedList<Nodo> pathMinimo) {
        this.pathMinimo = pathMinimo;
    }

    public HashMap <Nodo, Integer> getNodiAdiacenti() {
        return nodiAdiacenti;
    }

    public void setNodiAdiacenti(HashMap<Nodo, Integer> nodiAdiacenti) {
        this.nodiAdiacenti = nodiAdiacenti;
    }

    @Override
    public String toString() {
        return "Nodo [nome=" + nome + ", distanza=" + distanza + "]";
    }

    public void addDestination(Nodo n, int dist){ // Collegamento da un nodo all'altro con un certo peso
        nodiAdiacenti.put(n,dist);
    }
}
