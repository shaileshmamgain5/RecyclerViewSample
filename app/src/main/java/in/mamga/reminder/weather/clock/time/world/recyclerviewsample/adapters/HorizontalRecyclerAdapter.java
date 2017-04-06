package in.mamga.reminder.weather.clock.time.world.recyclerviewsample.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import in.mamga.reminder.weather.clock.time.world.recyclerviewsample.R;
import in.mamga.reminder.weather.clock.time.world.recyclerviewsample.model.HorizontalItem;

/**
 * <h1>HorizontalRecyclerAdapter</h1>
 * <p>
 * <p>Horizontal Recycler adapter for items in {@link VerticalRecyclerAdapter}.
 * Takes a list of {@link HorizontalItem} as parameters</p>
 *
 * @author Shailesh
 * @version 1.0
 * @since 2017 -04-06
 */

public class HorizontalRecyclerAdapter extends RecyclerView.Adapter<HorizontalRecyclerAdapter.HorizontalItemViewHolder> {


    List<HorizontalItem> horizontalItems;

    public HorizontalRecyclerAdapter(@NonNull List<HorizontalItem> horizontalItems) {
        this.horizontalItems = horizontalItems;
    }

    @Override
    public HorizontalItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horizontal_recycler_view, parent, false);
        HorizontalItemViewHolder holder = new HorizontalItemViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(HorizontalItemViewHolder holder, int position) {
        holder.tvHorizontalItem.setText(horizontalItems.get(position).getRandomNum() + "");
    }

    @Override
    public int getItemCount() {
        return horizontalItems.size();
    }

    public class HorizontalItemViewHolder extends RecyclerView.ViewHolder {
        public TextView tvHorizontalItem;

        public HorizontalItemViewHolder(View itemView) {
            super(itemView);
            tvHorizontalItem = (TextView)itemView.findViewById(R.id.tvHorizontalItem);

        }

    }
}