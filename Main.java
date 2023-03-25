public class Main {
    public static void main(String[] args) {
        Nodo NodoA = new Nodo("A");
        Nodo NodoB = new Nodo("B");
        Nodo NodoC = new Nodo("C");
        Nodo NodoD = new Nodo("D"); 
        Nodo NodoE = new Nodo("E");
        Nodo NodoF = new Nodo("F");

        NodoA.addDestination(NodoB, 10);
        NodoA.addDestination(NodoC, 15);

        NodoB.addDestination(NodoD, 12);
        NodoB.addDestination(NodoF, 15); 

        NodoC.addDestination(NodoE, 10);

        NodoD.addDestination(NodoE, 2);
        NodoD.addDestination(NodoF, 1);

        NodoF.addDestination(NodoE, 5);

        Grafo grafo = new Grafo();

        grafo.addNodo(NodoA);
        grafo.addNodo(NodoB);
        grafo.addNodo(NodoC);
        grafo.addNodo(NodoD);
        grafo.addNodo(NodoE);
        grafo.addNodo(NodoF);

        grafo = Dijkstra.calcolaCammino(grafo, NodoA);
        System.out.println(grafo);
        System.out.println("\n");
        System.out.println(NodoF.getPathMinimo());
        
    }
}
