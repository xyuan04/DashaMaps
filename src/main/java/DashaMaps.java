public abstract class DashaMaps implements HashMapX {
    SinglyLinkedList<String, String>[] linkedLists = new SinglyLinkedList[26];

    public DashaMaps() {
        for(int i = 0; i < 26; i++) {
            linkedLists[i] = new SinglyLinkedList<String, String>();
            linkedLists[i].addNode(new Node<String, String>(String.valueOf((char)('a' + i)), null));
        }
    }

    public abstract void set(String key, String value);

    public abstract String delete(String key);

    public abstract String get(String key);

    public boolean isEmpty() {
        return size() == 0;
    }

    public long size() {
        return linkedLists.length;
    }

    public int findIndex(String newKey) {
        for(int i = 0; i < linkedLists.length; i++) {
            if(linkedLists[i].head.key.equals(newKey)) {
                return i;
            }
        }
        return -1;
    }
}
