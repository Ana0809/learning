package shortestPath;

public class Edge extends Node implements Comparable<Edge> {
    Node source;
    Node destination;
    double minutes;

    public Edge(Node node1, Node node2, double minutes) {
        this.source = node1;
        this.destination = node2;
        this.minutes = minutes;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return source + " : " + destination + " : " + minutes;
    }

    public int compareTo(Edge otherEdge) {
        if (this.getMinutes() > otherEdge.getMinutes()) {
            return 1;
        } else return -1;
    }

    public Node getDestination() {
        return destination;
    }

    public Node getSource() {
        return source;
    }

}
