import java.util.Arrays;

public class Stack<T> {
    private T[] array;

    public T[] push(T element) {
        if (array == null) {
            T[] arrayTemp = (T[]) new Object[1];
            arrayTemp[0] = element;
            this.array = arrayTemp;
        } else {
            T[] arrayTemp = (T[]) new Object[array.length + 1];
            System.arraycopy(array, 0, arrayTemp, 0, array.length);
            arrayTemp[arrayTemp.length - 1] = element;
            this.array = arrayTemp;
        }
        return array;
    }

    public T[] remove(Integer index) {
        T[] arrayTemp = (T[]) new Object[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[index]) {
                arrayTemp[k] = array[i];
                k++;
            }
        }
        this.array = arrayTemp;
        return array;
    }

    public T[] clear() {
        T[] arrayTemp = (T[]) new Object[0];
        this.array = arrayTemp;
        return array;
    }

    public Integer size() {
        return array.length;
    }

    public T peak() {
        return array[array.length - 1];
    }

    public T pop() {
        T temp;
        T[] arrayTemp = (T[]) new Object[array.length - 1];
        temp = array[array.length - 1];
        System.arraycopy(array, 0, arrayTemp, 0, array.length - 1);
        this.array = arrayTemp;
        return temp;
    }

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println(Arrays.toString(stack.push("qqq")));
        System.out.println(Arrays.toString(stack.push("www")));
        System.out.println(Arrays.toString(stack.push("eee")));
        System.out.println(Arrays.toString(stack.push("rrr")));

        System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.array));


    }
}
