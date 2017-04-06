package in.mamga.reminder.weather.clock.time.world.recyclerviewsample;

import java.util.ArrayList;
import java.util.Random;

/**
 * <h1>VerticalItem</h1>
 * <p>
 * <p>Model class for item in Vertical list.
 * To be used inside {@link VerticalRecyclerAdapter}.
 * Generates a list of horizontal Items atusing random value at its constructor.
 * Alternatively number generation could be don2 at {@link MainActivity}</p>
 *
 * @author Shailesh
 * @version 1.0
 * @since 2017 -04-06
 */

public class VerticalItem {

    private ArrayList<HorizontalItem> horizontalItems;

    public VerticalItem() {
        horizontalItems = new ArrayList<HorizontalItem>();
        Random r = new Random();
        int  numOfElements = 1 + r.nextInt(9);

        for (int i = 0; i < numOfElements ; i++) {
            horizontalItems.add(new HorizontalItem());
        }
    }

    public ArrayList<HorizontalItem> getHorizontalItems() {
        return horizontalItems;
    }

    public void setHorizontalItems(ArrayList<HorizontalItem> horizontalItems) {
        this.horizontalItems = horizontalItems;
    }
}
