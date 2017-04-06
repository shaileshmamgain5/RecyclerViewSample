package in.mamga.reminder.weather.clock.time.world.recyclerviewsample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;


/**
 * <h1>MainActivity</h1>
 * <p>
 * <p>Parent class containing Vertical Recycler View. First it
 * Generates a list of  {@link VerticalItem} for dummy data.
 * Then it uses a {@link VerticalRecyclerAdapter} to fill main RecyclerView.
 *
 * {@link VerticalRecyclerAdapter} used {@link HorizontalRecyclerAdapter} internally
 * to show horizontal items</p>
 *
 * @author Shailesh
 * @version 1.0
 * @since 2017 -04-06
 */
public class MainActivity extends AppCompatActivity {
    //Vertical items to be shown
    ArrayList<VerticalItem> verticalItems;
    //Vertical recycler View for main content
    RecyclerView rvVertical;
    //Adapter for rvVertical
    VerticalRecyclerAdapter verticalRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        intitializeData();
        initViews();
    }

    /**
     * Initialises Dummy data for recyler View
     */
    private void intitializeData() {
        verticalItems = new ArrayList<VerticalItem>();
        for (int i = 0; i < 10; i++) {
            verticalItems.add(new VerticalItem());
        }
    }

    /**
     * Initializes recycler view with data
     * Fab button is added to refresh data
     */
    private void initViews() {
        //we refresh the data once fab is clicked
        FloatingActionButton fabRefresh = (FloatingActionButton) findViewById(R.id.fabRefresh);

        rvVertical = (RecyclerView) findViewById(R.id.rvVertical);
        rvVertical.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        if (verticalItems == null) {
            verticalItems = new ArrayList<VerticalItem>();
        }

        verticalRecyclerAdapter = new VerticalRecyclerAdapter(verticalItems);

        rvVertical.setAdapter(verticalRecyclerAdapter);
        //also make the fab visible as data can be refreshed now
        fabRefresh.setVisibility(View.VISIBLE);


        fabRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verticalItems != null) {
                    verticalItems.clear();
                }
                for (int i = 0; i < 10; i++) {
                    verticalItems.add(new VerticalItem());
                }
                if (verticalRecyclerAdapter != null) {
                    verticalRecyclerAdapter.notifyDataSetChanged();
                }
            }
        });

    }

}
