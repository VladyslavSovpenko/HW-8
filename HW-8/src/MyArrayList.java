import java.util.Arrays;

class MyArrayListTest<T> {

    private T[] array;

    public T[] add(T value) {

        if (array == null) {
            T[] arrayAdd = (T[]) new Object[1];
            arrayAdd[0] = value;
            return this.array = arrayAdd;
        } else {
            T[] arrayAdd = (T[]) new Object[array.length + 1];
            System.arraycopy(array, 0, arrayAdd, 0, array.length);
            arrayAdd[arrayAdd.length - 1] = value;
            this.array = arrayAdd;
        }
        return array;
    }

    public T[] remove(Integer value) {
        T[] arrayTemp = (T[]) new Object[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[value]) {
                arrayTemp[k] = array[i];
                k++;
            }
        }
        array = arrayTemp;
        return array;
    }

    public T[] clear() {
        T[] arrayTemp = (T[]) new Object[0];
        return arrayTemp;
    }

    public Integer size() {
        return array.length;
    }

    public T get(Integer index) {
        return array[index];
    }

    public static void main(String[] args) {

        MyArrayListTest<Integer> myArrayListTest = new MyArrayListTest<>();

        System.out.println(Arrays.toString(myArrayListTest.array));
        System.out.println(Arrays.toString(myArrayListTest.add(1)));
        System.out.println(Arrays.toString(myArrayListTest.add(2)));
        System.out.println(Arrays.toString(myArrayListTest.add(3)));
        System.out.println(Arrays.toString(myArrayListTest.add(4)));

        System.out.println("remove" + Arrays.toString(myArrayListTest.remove(0)));
        System.out.println("remove" + Arrays.toString(myArrayListTest.remove(0)));

        System.out.println(Arrays.toString(myArrayListTest.clear()));

        System.out.println(myArrayListTest.size());

        System.out.println(myArrayListTest.get(0));
    }

}

