public class ArrayCollection<T> implements CollectionInterface<T> {
     T[] elements ;
     int numElements = 0;
     int DEFAULT_CAP = 100;

    public ArrayCollection() {elements = (T[]) new Object[DEFAULT_CAP];}
    public ArrayCollection(int capacity) {
        elements = (T[]) new Object[capacity];
    }




    @Override
    public boolean add(T element) {
        if(!isFull()){
            elements[numElements] = element;
            numElements++;
            return true;
        } else return false;
    }

    @Override
    public T get(T element){
        int position = find(element);
        if (position >= 0) return elements[position];
        else return null;
    }
    public int find(T target) {
        for (int i = 0; i < numElements; i++) {
            if (elements[i].equals(target)) {
                return i; // Found it! Return index
            }
        }
        return -1; // Not found
    }

    @Override
    public boolean contains(T element) {
        return (find(element) >= 0);
    }

    @Override
    public boolean remove(T element) {
        int position = find(element);
        if (position < 0) return false;
        numElements--;
        elements[position] =elements[numElements];
        elements[numElements] = null;

        return true;
    }

    @Override
    public boolean isEmpty() {
        return numElements == 0;
    }

    @Override
    public boolean isFull() {
        return numElements == elements.length;
    }

    @Override
    public int size() {
        return numElements;
    }
}
