package in.mamga.reminder.weather.clock.time.world.recyclerviewsample;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * <h1>VerticalRecyclerAdapter</h1>
 * <p>
 * <p>Vertical Recycler adapter for main class. Takes a list of {@link VerticalItem} as
 * parameters and inflates a  horizontal recyclerview using {@link HorizontalRecyclerAdapter}</p>
 *
 * @author Shailesh
 * @version 1.0
 * @since 2017 -04-06
 */

public class VerticalRecyclerAdapter extends RecyclerView.Adapter<VerticalRecyclerAdapter.VerticalItemViewHolder> {

    //vertical items
    List<VerticalItem> verticalItems;

    public VerticalRecyclerAdapter(@NonNull List<VerticalItem> verticalItems) {
        this.verticalItems = verticalItems;
    }

    @Override
    public VerticalItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vertical_recycler_view, parent, false);
        VerticalItemViewHolder holder = new VerticalItemViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(VerticalRecyclerAdapter.VerticalItemViewHolder holder, int position) {
        //horizontal recyclerView is filled here
        HorizontalRecyclerAdapter horizontalAdapter = new HorizontalRecyclerAdapter(verticalItems.get(position).getHorizontalItems());
        holder.rvHorizontal.setAdapter(horizontalAdapter);
    }

    @Override
    public int getItemCount() {
        return verticalItems.size();
    }

    public class VerticalItemViewHolder extends RecyclerView.ViewHolder {
        public RecyclerView rvHorizontal;

        public VerticalItemViewHolder(View itemView) {
            super(itemView);
            rvHorizontal = (RecyclerView) itemView.findViewById(R.id.rvHorizontal);
            rvHorizontal.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
        }

    }
}