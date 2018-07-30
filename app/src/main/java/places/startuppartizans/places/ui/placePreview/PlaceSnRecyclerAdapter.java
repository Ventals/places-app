package places.startuppartizans.places.ui.placePreview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import places.startuppartizans.places.entity.PlaceSn;
import places.startuppartizans.places.R;

public class PlaceSnRecyclerAdapter extends RecyclerView.Adapter<PlaceSnRecyclerAdapter.PlaceViewHolder> {

    List<PlaceSn> snList = new ArrayList<>();

    public void setData(List<PlaceSn> snList){
        this.snList = snList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.place_sn_item, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        PlaceSn model = snList.get(position);
        holder.bind(model);
    }

    @Override
    public int getItemCount() {
        return snList.size();
    }

    class PlaceViewHolder extends RecyclerView.ViewHolder{
        TextView snName, snNumber;

        public PlaceViewHolder(View itemView) {
            super(itemView);
            snName = itemView.findViewById(R.id.sn_name);
            snNumber = itemView.findViewById(R.id.sn_number);
        }

        public void bind(PlaceSn model){
            snName.setText(model.getSnName());
            snNumber.setText(model.getSnNumber());
        }

    }

}
