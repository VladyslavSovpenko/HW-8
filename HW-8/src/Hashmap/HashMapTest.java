package Hashmap;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.hash;

//Написать свой класс MyHashMap как аналог классу HashMap.
//        Нужно делать с помощью односвязной Hashmap.Node.
//        Не может хранить две ноды с одинаковых ключами одновременно.
//        put(Object key, Object value) добавляет пару ключ + значение
//        remove(Object key) удаляет пару по ключу
//        clear() очищает коллекцию
//        size() возвращает размер коллекции
//        get(Object key) возвращает значение(Object value) по ключу

public class HashMapTest<T, V> implements HashMapMethods {

  Node[] keyTexts = new Node[16];
  int size = 0;

  public static void main(String[] args) {

    Node node1 = new Node(11, 11, "qqq", null);

    HashMapTest<Integer, String> test = new HashMapTest<>();

    test.put(11, "qqq");
    test.put(12, "www");

    System.out.println(test.get(11));
    System.out.println(test.get(12));
    System.out.println(test.get(13));
    test.size();
//    test.clear();
    test.remove(11);
    System.out.println(test.get(11));

  }

  public V put(Object key, Object text) {
    return putVal(hash(key), key, text);
  }

  public V putVal(int hash, Object key, Object value) {
    size++;
    int i = 0;
    i = hash % keyTexts.length;
    keyTexts[i] = new Node(hash, key, value, null);
    return null;
  }


  public V get(Object key) {
    V tempValue = null;
    for (int i = 0; i < keyTexts.length; i++) {
      if (keyTexts[i] != null) {
        if (keyTexts[i].getKey() == key) {
          tempValue = (V) keyTexts[i].getValue();
        }
      }
    }
    return tempValue;
  }

  @Override
  public void remove(Object key) {
    for (int i = 0; i < keyTexts.length; i++) {
      if (keyTexts[i] != null) {
        if (keyTexts[i].getKey() == key) {
          keyTexts[i] = null;
          size--;
        }
      }
    }
  }

  @Override
  public void clear() {
    size = 0;
    for (int i = 0; i < keyTexts.length; i++) {
      keyTexts[i] = null;
    }

  }

  @Override
  public void size() {
    System.out.println(size);
  }
}




