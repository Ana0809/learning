package ArrayListImplementation;

public class MyArrayList <T> implements List<T> {

    private Object[] object;
    private Object[] obj;
    int size =6;
    int size2 = size;
    int size3=8;


    public MyArrayList() {
        object = new Object[8];
    }

    @Override
    public void put(int index, T value) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException("Esti in afara size-ului");
        }
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("Esti in afara size-ului");
        }
        if (index < size) {
            object[index] = value;
        }
    }

    @Override
    public boolean contains(int value) {
        boolean a = false;
        for (int i = 0; i <object.length-1; i++) {
            if (object[i] != null && object[i].equals(value)) {
                a = true;
            }
        }
        if (a == true) {
            return true;
        } else return false;
    }

    @Override
    public void add(Object value) {
        if(object.length == size){
            obj = object;
            object = new Object[object.length*2];
            for(int i = 0; i< obj.length; i++){
                object[i] = obj[i];
            }
        }
            object[size2] = value;
            size2++;

    }

    @Override
    public int get(int index) {
        if (object[index] != null) {
            return (int) object[index];
        } else return 0;
    }

    public int length() {
        return object.length;
    }

    @Override
    public void addAll(List<T>other) {
        System.out.println("Listele alaturate");
        if(object.length == size3){
            obj = object;
            object = new Object[object.length*2];
            for(int i = 0; i< obj.length; i++){
                object[i] = obj[i];
                if(object[i]!=null){
                    System.out.print(object[i]+ " ");
                }

            }
        }
        for(int i=0;i<other.length();i++) {
            if (other.get(i)!= 0) {
                object[size3] = other.get(i);
                size3++;
            }
            if(other.get(i)!=0) {
                System.out.print(other.get(i) + " ");
            }
        }
    }


}

