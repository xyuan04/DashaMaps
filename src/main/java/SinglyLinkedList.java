public class SinglyLinkedList<Key extends Comparable<Key>, Value extends Comparable<Value>> {
    public Node<Key, Value> head = null;
    public Node<Key, Value> tail = null;

    public void addNode(Node<Key, Value> newNode) {

        if(head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void removeNode(int index) {
        if(index == 0 && head.next != null) {
            head = head.next;
        }

        if(index == 0 && head.next == null) {
            head = null;
        }

        Node<Key, Value> current = head;
        Node<Key, Value> previous = head;
        int counter = 0;

        while(current != null && counter != index) {
            previous = current;
            current = current.next;
            counter++;
        }
        if(head != null) {
            previous.next = current.next;
        }
    }

    public boolean contains(Key element) {
        Node<Key, Value> current = head;

        while(current != null) {
            if(current.key.equals(element)) {return true;}
            current = current.next;
        }
        return false;
    }

    public int find(Key element) {
        int counter = 0;
        Node<Key, Value> current = head;

        while(current != null && !current.key.equals(element)) {
            current = current.next;
            counter++;
        }
        if(current == null) {
            return -1;
        } else return counter;
    }

    public int size() {
        int counter = 0;
        Node<Key, Value> current = head;

        while(current != null) {
            //System.out.println(current);
            current = current.next;
            counter++;
        }
        return counter;
    }

    public Value get(Key key) {
        Node<Key, Value> current = head;

        while(current != null) {
            if(current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public SinglyLinkedList<Key, Value> copy(SinglyLinkedList<Key, Value> original) {
        SinglyLinkedList<Key, Value> newList = new SinglyLinkedList<Key, Value>();
        Node<Key, Value> current = original.head;

        while(current != null) {
            newList.addNode(current);
            current = current.next;
        }
        return newList;
    }

    public SinglyLinkedList<Key, Value> sort(SinglyLinkedList<Key, Value> original) {
        Node<Key, Value> current = original.head;
        Node<Key, Value> index;
        Key temp;

        if(current == null) {return null;}

        while(current != null) {
            index = current.next;

            while(index != null) {
                if(current.key.compareTo(index.key) > 0) {
                    temp = current.key;
                    current.key = index.key;
                    index.key = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
        return original;
    }

    public SinglyLinkedList<Key, Value> reverse(SinglyLinkedList<Key, Value> original) {
        Node<Key, Value> previous = null;
        Node<Key, Value> next;
        Node<Key, Value> current = original.head;

        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        original.head = previous;
        return original;
    }

}

