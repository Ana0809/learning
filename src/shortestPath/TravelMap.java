package shortestPath;

import java.util.*;

public class TravelMap {
    private Set<Node> nodes;
    private boolean directed;

    TravelMap(boolean directed) {
        this.directed = directed;
        nodes = new HashSet<>();
    }
    void addNode(Node node) {
        nodes.add(node);
    }
    void getNodes() {
        System.out.println("All the locations sorted by their names");
        Set<String> tree_Set = new TreeSet<>();
        Iterator<Node> it = nodes.iterator();
        while (it.hasNext()) {
            tree_Set.add(it.next().getName());
        }
        System.out.println(tree_Set);
    }

    @Override
    public String toString() {
        return nodes + " ";
    }

    void visitableButNotPayable() {  //Using streams, display the locations that are visitable and are not payable, sorted by their opening hour.
        nodes.stream().filter(z -> z.isVisitable() && !z.isPayable()).map(Node::getName).forEach(System.out::println);
    }

    void averagePriceTiket() {   //Using streams, display the average price ticket of the locations that are payable.
        Set<Node> avg = nodes;
        OptionalDouble result = avg.stream().filter((i) -> i.isPayable())
                .mapToInt((x) -> x.priceOfTheTicket()).average();
        System.out.println(result);
    }

    public void addEdge(Node source, Node destination, double weight) {
        nodes.add(source);
        nodes.add(destination);
        addEdgeHelper(source, destination, weight);   //pentru a nu avea edges dublicate
        if (!directed && source != destination) {
            addEdgeHelper(destination, source, weight);
        }
    }

    private void addEdgeHelper(Node a, Node b, double cost) {
        for (Edge edge : a.edges) {  // Verifica daca edge a fost sau nu adaugata
            if (edge.getSource() == a && edge.getDestination() == b) {
                edge.minutes = cost;               // Update valoare daca este edge diferita
                return;
            }
        }
        a.edges.add(new Edge(a, b, cost));       // Daca nu a fost deja adaugata, se adauga
    }

    public void shortestPathGivenNodes(Node start, Node end) {
        HashMap<Node, Node> changedAt = new HashMap<>(); //tinem minte nodul de pornire pentru a ne ajuta sa gasim cea mai scurta ruta
        changedAt.put(start, null);  //destinatia nu este specificata, nu stim inca unde sa mergem
        HashMap<Node, Double> shortestPathMap = new HashMap<>(); //urmarim cea mai scurta ruta dintre noduri(in minute)
        for (Node node : nodes) {
            if (node == start)
                shortestPathMap.put(start, 0.0); // pentru nodul de start path-ul este zero
            else shortestPathMap.put(node, Double.POSITIVE_INFINITY); //pentru restul path-ul default este infinit
        }
        for (Edge edge : start.edges) { //parcurgem toate nodurile de la start
            shortestPathMap.put(edge.getDestination(), edge.getMinutes());  //adaugam minutele
            changedAt.put(edge.getDestination(), start);  //adaugam numele nodurilor de parcurs
        }

        start.visit(); //marcam nodul de start vizitat
        while (true) {   // cat timp sunt noduri care nu au fost vizitate
            Node currentNode = closestReachableUnvisited(shortestPathMap);   //nodul curent devine nodul nevizitat spre care distanta este cea mai mica
            if (currentNode == null) { // daca nu am ajuns la destinatie si nu este alt nod prin care se poate ajunge, nodurile nu sunt conectate
                System.out.println("Nu exista o ruta intre " + start.getName() + " si " + end.getName());
                return;
            }
            if (currentNode == end) {
                System.out.println("Path-ul cu cele mai putine minute intre " + start.getName() + " si " + end.getName() + " este:");

                Node child = end;
                String path = end.getName();
                while (true) {
                    Node parent = changedAt.get(child);  // keepTheShortPath memoreaza relatia child -> parent, nod start-> nod destinatie
                    if (parent == null) {
                        break;
                    }
                    path = parent.getName() + " " + path;        //se afiseaza toate nodurile dintre sursa si destinatie
                    child = parent;
                }
                System.out.println(path);
                System.out.println("The path costs: " + shortestPathMap.get(end));
                return;
            }
            currentNode.visit();
            for (Edge edge : currentNode.edges) {
                if (edge.getDestination().isVisitated())
                    continue;

                if (shortestPathMap.get(currentNode) + edge.getMinutes() < shortestPathMap.get(edge.getDestination())) {
                    shortestPathMap.put(edge.getDestination(), shortestPathMap.get(currentNode) + edge.getMinutes());
                    changedAt.put(edge.getDestination(), currentNode);
                }
            }
        }
    }


    private Node closestReachableUnvisited(HashMap<Node, Double> shortestPathMap) { //se calculeaza cea mai mica distanta spre uramtoarul nod nevizitat

        double shortestDistance = Double.POSITIVE_INFINITY;
        Node closestReachableNode = null;
        for (Node node : nodes) {
            if (node.isVisitated())
                continue;

            double currentDistance = shortestPathMap.get(node);
            if (currentDistance == Double.POSITIVE_INFINITY)
                continue;

            if (currentDistance < shortestDistance) {
                shortestDistance = currentDistance;
                closestReachableNode = node;
            }
        }
        return closestReachableNode;
    }
}
