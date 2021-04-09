import org.junit.Test;

import static org.junit.Assert.*;

public class DashaMapOneTest {

    @Test
    public void test() {
        DashaMapOne dash = new DashaMapOne();

        dash.set("Apple", "5");
        dash.set("Freedom", "10");
        dash.set("f", "1");

        for(int i = 0; i < dash.linkedLists.length; i++) {
            Node current = dash.linkedLists[i].head;
            while(current != null) {
                System.out.println(current);
                current = current.next;
            }
        }

        System.out.println(dash.get("Apple"));
    }

}