package algorithms;

public class Nodes {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Node nod1, nod2, nod3, nod4, nod5, nod6, nod7, nod8;

        nod8 = new Node(20, null, null);
        nod7 = new Node(17, null, nod8);
        nod6 = new Node(3, null, null);
        nod5 = new Node(9, nod6,nod7);
        nod4 = new Node(53, null, null);
        nod3 = new Node(59, null, null);
        nod2 = new Node(55, nod4, nod3);
        nod1 = new Node(45,nod5, nod2);
        System.out.println(search(nod1,3).getData()+"s-a gasit");


    }

    public static Node search(Node node,int cheie) {
        if(node==null||(int)node.getData()==cheie)
            return node;
        if(cheie<(int)node.getData())
            return search(node.getLeft(),cheie);
        return search(node.getRight(),cheie);

    }
}
