package shortestPath;

import java.time.LocalTime;

public class MainPath {
    public static void main(String[] args) {
        Hotel v1 = new Hotel("California");
        Airport v2 = new Airport("Sky");
        Church v3 = new Church("Forgiveness");
        Parks v4 = new Parks("Good Roads");
        Restaurant v5 = new Restaurant("Bon apetit");
        Museum v6 = new Museum("WorldWide");

        InformatiiNod1(v1);
        InformatiiNod2(v2);
        InformatiiNod3(v3);
        InformatiiNod4(v4);
        InformatiiNod5(v5);
        InformatiiNod6(v6);

        TravelMap map = new TravelMap(true);
        AdaugareInMapa(v1, v2, v3, v4, v5, v6, map);
        System.out.println("The map is: \n" + map.toString());
        map.visitableButNotPayable();
        map.averagePriceTiket();
        map.shortestPathGivenNodes(v1,v6);
    }

    private static void AdaugareInMapa(Hotel v1, Airport v2, Church v3, Parks v4, Restaurant v5, Museum v6, TravelMap map) {
        map.addNode(v1);
        map.addNode(v2);
        map.addNode(v3);
        map.addNode(v4);
        map.addNode(v5);
        map.addNode(v6);

        map.addEdge(v1, v2, 10);        //  v1   v2   v3   v4   v5   v6
        map.addEdge(v1, v4, 15);     //  v1  0    10   -   15   12    -
        map.addEdge(v1, v5, 12);     //  v2  -    0    -    5    20   -
        map.addEdge(v2, v4 , 5);     //  v3  -    -    0    -     -   30
        map.addEdge(v3, v6 , 30);     // v4  -    -    -    0    22   17
        map.addEdge(v4, v5 , 22);      //v5  -    -    32   -    0    50
        map.addEdge(v4, v6,  17);     // v6  -     -     -  17   50    0
        map.addEdge(v5, v3,  32);
        map.addEdge(v5, v6,  50);
        map.addEdge(v2, v5 , 20);
        map.getNodes();
    }

    private static void InformatiiNod6(Museum v6) {
        v6.setPrice(300);
        v6.setRank(10);
        LocalTime openv6 = LocalTime.of(9, 00); //ora personalizata
        v6.setOpeningHour(openv6);
        System.out.println("Muzeu "+  v6.getName()+", deschis luni-vineri "+ v6.getOpeningHour()+
                ", in weekend " + v6.openeningHour()+ ", inchide "+ v6.closingHours()+ ", rating "+ v6.getRank() +", pret "+v6.getPrice());
    }

    private static void InformatiiNod5(Restaurant v5) {
        v5.setRank(6);
        LocalTime openv5 = LocalTime.of(10, 45);
        v5.setOpeningHour(openv5);
        System.out.println("Restaurant "+ v5.getName()+", deschis luni-vineri "+ v5.getOpeningHour()+
                ", in weekend " + v5.openeningHour()+ ", inchide "+ v5.closingHours()+ ", rating "+ v5.getRank() );
    }

    private static void InformatiiNod4(Parks v4) {
        v4.setPrice(10);
        System.out.println("Prcare "+ v4.getName()+ ", pret bilet/ora "+v4.getPrice());
    }

    private static void InformatiiNod3(Church v3) {
        LocalTime openv3 = LocalTime.of(8, 30);
        v3.setOpeningHour(openv3);
      //  System.out.println(Node.openTime());
        v3.setRank(8);
        System.out.println("Biserica "+v3.getName()+", ora la care deschide "+ v3.getOpeningHour()+
                ", tine deschis pana la "+ v3.closingHours()+ ", rating "+ v3.getRank());
    }

    private static void InformatiiNod2(Airport v2) {
        v2.setPrice(100);
        v2.setRank(9);
        System.out.println("Aeroport "+ v2.getName()+ ", pret bilet pornind de la "+v2.getPrice()+", are un rating pt servicii de "+ v2.getRank());
    }

    private static void InformatiiNod1(Hotel v1) {
        v1.setRank(5);
        v1.setPrice(200);
        System.out.println("Hotel " + v1.getName()+ ", rating "+v1.getRank()+", pret/noapte "+ v1.getPrice()  );

    }

}
