public class MyList<T> {
    private T[] array;
    private int size = 0;
    private int capacity;

    public MyList() {
        capacity = 10;
        array = (T[]) new Object[capacity];
    }

    public MyList(int size) {
        capacity = size + (10 - (size % 10));
        array = (T[]) new Object[capacity];
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size == capacity) {
            capacity += 10;
            T[] tempArray = (T[]) new Object[this.capacity - 10];
            tempArray = array.clone();
            array = (T[]) new Object[this.capacity];
            int temp = 0;
            for (T item : tempArray) {
                array[temp] = item;
                temp += 1;
            }
            array[size] = data;
        } else array[size] = data;
        size++;
    }

    public T get(int index) {
        if (size > index) return array[index];
        return null;
    }

    public T remove(int index) {
        if (index < size) {
            T t = array[index];
            for (; index < size; index++)
                array[index] = array[index + 1];
            size--;
            return t;
        }
        return null;
    }

    public void set(int index, T data) {
        if (size > index)
            array[index] = data;
    }

    @Override
    public String toString() {
        String res = "[";
        for (int idx = 0; idx < size; idx++) {
            if (idx == size - 1) res += (array[idx].toString());
            else res += (array[idx].toString() + ",");
        }
        res += "]";
        return res;
    }

    public int indexOf(T data) {
        int idx = 0;
        for (T item : array) {
            if (item == data) return idx;
            idx++;
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int idx = size - 1; idx >= 0; idx--) if (array[idx] == data) return idx;
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        return array.clone();
    }

    public void clear() {
        size = 0;
        capacity = 10;
        array = (T[]) new Object[this.capacity];
    }

    public MyList<T> subList(int start, int finish) {
        MyList arr = new MyList(finish - start + 1);

        for (int idx = 0; start <= finish; start++, idx++) {
            arr.add(array[start]);
        }
        return arr;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}