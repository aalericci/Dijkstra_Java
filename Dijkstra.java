import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public class Dijkstra{

    private static Nodo distanzaMinore(HashSet<Nodo> nonVisitati) {
        Nodo min = new Nodo(null);

        for(Nodo v: nonVisitati){
            if(v.getDistanza()<min.getDistanza()){
                min=v;
            }
        }
        return min;
    }
    private static void calcoloDistanzaMinima(Nodo nodoCorrente, Nodo nodoAdiacente, Integer value){
        int distanzaNodoCorrente = nodoCorrente.getDistanza();
        if(distanzaNodoCorrente + value < nodoAdiacente.getDistanza()){
            nodoAdiacente.setDistanza(value+distanzaNodoCorrente);
            LinkedList <Nodo> camminoMinimo = new LinkedList<>(nodoCorrente.getPathMinimo());
            camminoMinimo.add(nodoCorrente);
            nodoAdiacente.setPathMinimo(camminoMinimo);
        }
    }

    public static Grafo calcolaCammino(Grafo g, Nodo sorgente){
        sorgente.setDistanza(0); // Setto a 0 la distanza della sorgente

        HashSet <Nodo> visitati = new HashSet<>();
        HashSet <Nodo> nonVisitati = new HashSet<>();

        nonVisitati.add(sorgente); // Aggiungo la sorgente ai nodi non visitati

        while(nonVisitati.size() != 0){ // Finchè ci sono nodi da visitare
            Nodo nodoCorrente = distanzaMinore(nonVisitati);
            nonVisitati.remove(nodoCorrente);

            for(Entry <Nodo, Integer> nodo : nodoCorrente.getNodiAdiacenti().entrySet()){ // Per ogni nodo collegato al nodo corrente
                if(!visitati.contains(nodo)){
                    calcoloDistanzaMinima(nodoCorrente, nodo.getKey(), nodo.getValue());
                    nonVisitati.add(nodo.getKey());
                }
            }
            visitati.add(nodoCorrente);
        }

        return g;
    }

    
}