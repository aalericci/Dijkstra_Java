import java.util.HashSet;

public class Grafo {
    private HashSet <Nodo> nodi = new HashSet<>(); // Array in cui mettiamo l'oggetto un sola volta

    public HashSet<Nodo> getNodi() {
        return nodi;
    }

    public void setNodi(HashSet<Nodo> nodi) {
        this.nodi = nodi;
    }

    @Override
    public String toString() {
        return "Grafo [nodi=" + nodi + "]";
    }

    public void addNodo(Nodo n){
        nodi.add(n);
    }
}
