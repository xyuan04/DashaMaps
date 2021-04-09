public class Node<Key extends Comparable<Key>, Value extends Comparable<Value>> {
    public Key key;
    public Value value;
    public Node<Key, Value> next;

    public Node(Key key, Value value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return String.format("Key : %s, Value: %s", key, value);
    }
}
