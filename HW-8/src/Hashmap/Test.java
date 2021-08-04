package Hashmap;

public  class Test<T, V> {
    T key;
    V text;
    public Test(T key, V text) {
        this.key = key;
        this.text = text;
    }

    public T getKey() {
        return key;
    }

    public V getText() {
        return text;
    }
}