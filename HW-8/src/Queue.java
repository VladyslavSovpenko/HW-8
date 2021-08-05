import java.util.Arrays;

public class Queue<T> {

  private T[] array;

  public T[] add(T element) {
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
    return array[0];
  }

  public T pool() {
    T[] arrayTemp = (T[]) new Object[array.length - 1];
    System.arraycopy(array, 1, arrayTemp, 0, array.length - 1);
    this.array = arrayTemp;
    return array[0];
  }

  public static void main(String[] args) {

    Queue<Integer> queue = new Queue<>();

    System.out.println(Arrays.toString(queue.array));
    System.out.println(Arrays.toString(queue.add(1)));
    System.out.println(Arrays.toString(queue.add(2)));
    System.out.println(Arrays.toString(queue.add(3)));
    System.out.println(Arrays.toString(queue.add(4)));

//        System.out.println(Arrays.toString(queue.remove(0)));
//        System.out.println(Arrays.toString(queue.remove(2)));

    System.out.println(queue.pool());
    System.out.println(Arrays.toString(queue.array));
  }
}
