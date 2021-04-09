public class DashaMapOne extends DashaMaps {

    private String hashFunctionOne(String input) {
        if (input.length() > 0) {
            return String.valueOf(input.charAt(0)).toLowerCase();
        }
        return null;
    }

    public void set(String key, String value) {
        String keyHash = hashFunctionOne(key);
        Node<String, String> newValue = new Node<String, String>(key, value);
        this.linkedLists[findIndex(keyHash)].addNode(newValue);
    }

    public String delete(String key) {
        return null;
    }

    public String get(String key) {
        String keyHash = hashFunctionOne(key);
        return this.linkedLists[findIndex(keyHash)].get(key);
    }
}
