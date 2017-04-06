package in.mamga.reminder.weather.clock.time.world.recyclerviewsample.model;

import java.util.Random;

import in.mamga.reminder.weather.clock.time.world.recyclerviewsample.adapters.HorizontalRecyclerAdapter;
import in.mamga.reminder.weather.clock.time.world.recyclerviewsample.adapters.VerticalRecyclerAdapter;

/**
 * <h1>HorizontalItem</h1>
 * <p>
 * <p>Model class for item in horizontal array.
 * To be used inside {@link HorizontalRecyclerAdapter}.
 * Generates random value at its constructor. Alternatively number generation could be
 * dont at {@link VerticalRecyclerAdapter}</p>
 *
 * @author Shailesh
 * @version 1.0
 * @since 2017 -04-06
 */

public class HorizontalItem {
    private int randomNum;

    public HorizontalItem() {
        Random r = new Random();
        setRandomNum(1000 + r.nextInt(9000));
    }

    public int getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }
}
