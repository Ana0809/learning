package homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainBuilding {
    public static void main(String[] args) {
        ArrayList<Building> listOfBuildings = new ArrayList<>();

        createBuildings(listOfBuildings); //and showing them
        averageBuildingCategory(listOfBuildings);
        averageNeigborhood(listOfBuildings);
        numberOfCategory();
        uniqueNbhd(listOfBuildings);
    }

    private static void createBuildings(ArrayList<Building> listOfBuildings) {
        Building building1 = new Building();
        Building building2 = new Building();
        Building building3 = new Building();
        Building building4 = new Building();
        Building building5 = new Building();
        Building building6 = new Building();

        building1.setName("Cladire1");
        building1.setNeighborhood("Cartier1");
        building1.setPrice(100);
        building1.setCategory(Building.Category.HOSPITAL);

        building2.setName("Cladire2");
        building2.setNeighborhood("Cartier2");
        building2.setPrice(200);
        building2.setCategory(Building.Category.RESIDENTIAL);

        building3.setName("Cladire3");
        building3.setNeighborhood("Cartier3");
        building3.setPrice(300);
        building3.setCategory(Building.Category.RELIGIOUS);

        building4.setName("Cladire4");
        building4.setNeighborhood("Cartier4");
        building4.setPrice(400);
        building4.setCategory(Building.Category.OFFICE);

        building5.setCategory(Building.Category.HOSPITAL);
        building6.setCategory(Building.Category.OFFICE);
        building5.setPrice(500);
        building6.setPrice(600);
        building5.setNeighborhood("Cartier6");
        building6.setNeighborhood("Cartier3");

        listOfBuildings.add(building1);
        listOfBuildings.add(building2);
        listOfBuildings.add(building3);
        listOfBuildings.add(building4);
        listOfBuildings.add(building5);
        listOfBuildings.add(building6);

        for (int i = 0; i < listOfBuildings.size(); i++) {
            System.out.println(listOfBuildings.get(i).getName() + " " + listOfBuildings.get(i).getNeighborhood() + " " + listOfBuildings.get(i).getPrice() + " " + listOfBuildings.get(i).getCategory());
        }
    }

    private static void averageBuildingCategory(ArrayList<Building> listOfBuildings) {
        int mediaReligious = 0;
        int mediaRessidential = 0;
        int mediaOffice = 0;
        int mediaHospital = 0;

        int contorHospital = 0;
        int contorReligious = 0;
        int contorResidential = 0;
        int contorOffice = 0;

        for (int i = 0; i < listOfBuildings.size(); i++) {
            if (listOfBuildings.get(i).getCategory().equals(Building.Category.HOSPITAL)) {
                contorHospital++;
                mediaHospital = (mediaHospital + listOfBuildings.get(i).getPrice()) / contorHospital;
            } else if (listOfBuildings.get(i).getCategory().equals(Building.Category.RELIGIOUS)) {
                contorReligious++;
                mediaReligious = (mediaReligious + listOfBuildings.get(i).getPrice()) / contorReligious;
            } else if (listOfBuildings.get(i).getCategory().equals(Building.Category.RESIDENTIAL)) {
                contorResidential++;
                mediaRessidential = (mediaRessidential + listOfBuildings.get(i).getPrice()) / contorResidential;
            } else if (listOfBuildings.get(i).getCategory().equals(Building.Category.OFFICE)) {
                contorOffice++;
                mediaOffice = (mediaOffice + listOfBuildings.get(i).getPrice()) / contorOffice;
            }

        }
        System.out.println("Print the average price for each building category:");
        System.out.println(Building.Category.valueOf("HOSPITAL") + " " + mediaHospital);
        System.out.println(Building.Category.valueOf("RESIDENTIAL") + " " + mediaRessidential);
        System.out.println(Building.Category.valueOf("RELIGIOUS") + " " + mediaReligious);
        System.out.println(Building.Category.valueOf("OFFICE") + " " + mediaOffice);
    }

    private static void averageNeigborhood(ArrayList<Building> listOfBuildings) {
        int mediaCartier1 = 0;
        int mediaCartier2 = 0;
        int mediaCartier3 = 0;
        int mediaCartier4 = 0;

        int contorCartier1 = 0;
        int contorCartier2 = 0;
        int contorCartier3 = 0;
        int contorCartier4 = 0;

        for (int i = 0; i < listOfBuildings.size(); i++) {
            if (listOfBuildings.get(i).getNeighborhood().equals("Cartier1")) {
                contorCartier1++;
                mediaCartier1 = (mediaCartier1 + listOfBuildings.get(i).getPrice()) / contorCartier1;

            } else if (listOfBuildings.get(i).getNeighborhood().equals("Cartier2")) {
                contorCartier2++;
                mediaCartier2 = (mediaCartier2 + listOfBuildings.get(i).getPrice()) / contorCartier2;

            } else if (listOfBuildings.get(i).getNeighborhood().equals("Cartier3")) {
                contorCartier3++;
                mediaCartier3 = (mediaCartier3 + listOfBuildings.get(i).getPrice()) / contorCartier3;

            } else if (listOfBuildings.get(i).getNeighborhood().equals("Cartier4")) {
                contorCartier4++;
                mediaCartier4 = (mediaCartier4 + listOfBuildings.get(i).getPrice()) / contorCartier4;

            }
        }
        System.out.println("Print the average price for each neighborhood:");
        System.out.println("Cartier1" + " " + mediaCartier1);
        System.out.println("Cartier2" + " " + mediaCartier2);
        System.out.println("Cartier3" + " " + mediaCartier3);
        System.out.println("Cartier4" + " " + mediaCartier4);
    }

    private static void numberOfCategory() {
        System.out.println(Building.Category.values().length);
    }

    private static void uniqueNbhd(ArrayList<Building> listOfBuildings) {
        Set<String> nbhd = new HashSet<>();
        for (int i = 0; i < listOfBuildings.size(); i++) {
            nbhd.add(listOfBuildings.get(i).getNeighborhood());
        }
        System.out.println(nbhd);
    }
}