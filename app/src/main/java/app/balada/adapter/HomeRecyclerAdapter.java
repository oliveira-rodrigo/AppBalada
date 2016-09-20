package app.balada.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import app.balada.EventoActivity;
import app.balada.R;
import app.balada.viewholder.HomeRecyclerViewHolder;

/**
 * Created by olive on 31/08/2016.
 */
public class HomeRecyclerAdapter extends RecyclerView.Adapter {

    String[] name = {"Androidwarriors", "Stackoverflow", "Developer Android", "AndroidHive",
            "Slidenerd", "TheNewBoston", "Truiton", "HmkCode", "JavaTpoint", "Javapeper"};
    Context context;
    LayoutInflater inflater;

    public HomeRecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public HomeRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list_home, parent, false);

        HomeRecyclerViewHolder viewHolder = new HomeRecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ((HomeRecyclerViewHolder)holder).tv1.setText(name[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "This is position " + position, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, EventoActivity.class);
                context.startActivity(intent);
            }
        });
    }

    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            HomeRecyclerViewHolder vholder = (HomeRecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();

            Toast.makeText(context, "This is position " + position, Toast.LENGTH_LONG).show();
        }
    };

    @Override
    public int getItemCount() {
        return name.length;
    }
}
