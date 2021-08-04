package LinkedList;

public class MyLinkedList<T> {

    private Node<T> fstNode;
    private Node<T> lastNode;
    private int size = 0;

    public static void main(String[] args) {
        MyLinkedList<String> stringList = new MyLinkedList<>();
        stringList.addLast("first");
        stringList.addLast("second");
        stringList.addLast("third");
        stringList.addLast("The most first");
//        System.out.println(stringList.size());
//        System.out.println(stringList.getFirst());
//        System.out.println(stringList.getLast());
        System.out.println(stringList.get(0));
//        stringList.clear();
        stringList.remove(1);
        System.out.println(stringList.get(1));
        //      System.out.println(stringList.get(1));
    }

    public void addLast(T t) {
        Node<T> l = lastNode;
        Node<T> newNode = new Node<>(l, t, null);
        lastNode = newNode;
        if (l == null) {
            fstNode = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public void addFirst(T t) {
        Node<T> f = fstNode;
        Node<T> newNode = new Node<>(null, t, f);
        fstNode = newNode;
        if (f == null) {
            lastNode = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }

    public T get(int index) {
        Node<T> target = fstNode;
        for (int i = 0; i < index; i++) {
            target = target.getNext();
        }
        return target.item;
    }

    public void clear() {
        Node<T> clearTarget = fstNode;
        for (int i = 0; i < size; i++) {
            Node<T> next = clearTarget.next;
            clearTarget.item = null;
            clearTarget.next = null;
            clearTarget.prev = null;
            clearTarget = next;
        }
        size = 0;
        fstNode = lastNode = null;
    }

    public void remove(int index) {
        Node<T> oper = fstNode;
        for (int i = 0; i < index; i++) {
            oper = oper.next;
        }
        if (index == 0) {
            fstNode = oper.next;
        } else {
            oper.prev.next = oper.next;
        }

        size--;
    }

    public Integer size() {
        return size;
    }

    public Object getFirst() {
        Node<T> f = fstNode;
        return f.item;
    }

    public Object getLast() {
        Node<T> l = lastNode;
        return l.item;
    }

    class Node<E> {
        private E item;
        private Node<E> next;
        private Node<E> prev;

        Node(Node<E> prev, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        public E getItem() {
            return item;
        }

        public void setItem(E item) {
            this.item = item;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }


    }
}