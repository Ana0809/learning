package ArrayListImplementation;

    interface List {
       int get(int index) throws Exception;
        void put(int index, int value);
        int length();
        boolean contains(int value);
        void addAll(List other);
    }

