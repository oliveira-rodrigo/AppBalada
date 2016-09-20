package app.balada.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.joanzapata.iconify.widget.IconTextView;

import app.balada.R;

/**
 * Created by olive on 31/08/2016.
 */
public class HomeRecyclerViewHolder
        extends RecyclerView.ViewHolder
        implements View.OnCreateContextMenuListener{

    public TextView tv1, tv2, tv3;
    ImageView imageView;
    IconTextView imageViewCtxMenu;

    public HomeRecyclerViewHolder(View itemView) {
        super(itemView);

        tv1 = (TextView) itemView.findViewById(R.id.titulo);
        tv2 = (TextView) itemView.findViewById(R.id.data_evento);
        tv3 = (TextView) itemView.findViewById(R.id.descricao);
        imageView = (ImageView) itemView.findViewById(R.id.logo);
        imageViewCtxMenu = (IconTextView) itemView.findViewById(R.id.context_menu);
        imageViewCtxMenu.setOnCreateContextMenuListener(this);

        //itemView.setOnLongClickListener(this);
    }

    public void onLongClick(){

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {

        //menu.setHeaderTitle("Select The Action");
        menu.add(0, v.getId(), 0, "Confirmar presença");//groupId, itemId, order, title
        menu.add(0, v.getId(), 0, "Favoritar");
        menu.add(0, v.getId(), 0, "Denunciar esse evento");
        menu.add(1, v.getId(), 0, "Cancelar");

    }

    /*@Override
    public boolean onMenuItemClick(MenuItem item) {
        // Menu Item Clicked!
        //Toast.makeText(RecyclerViewHolder.this, item.getTitle(), Toast.LENGTH_LONG).show();
        return true;
    }*/
}

