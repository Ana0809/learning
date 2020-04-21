package shortestPath;

public interface Classifiable {
    public int rank();
    default boolean isClassifable(){
         return true;
     }
}
