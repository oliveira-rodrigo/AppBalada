package app.balada.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.joanzapata.iconify.widget.IconTextView;

import app.balada.R;

/**
 * Created by olive on 31/08/2016.
 */
public class EventoPromocaoRecyclerViewHolder
        extends RecyclerView.ViewHolder {

    public TextView tvTituloPromocao, tvDescricaoPromocao;
    ImageView ivPromocao;
    IconTextView itvDetalhePromocao;

    public EventoPromocaoRecyclerViewHolder(View itemView) {
        super(itemView);

        tvTituloPromocao = (TextView) itemView.findViewById(R.id.TituloPromocao);
        tvDescricaoPromocao = (TextView) itemView.findViewById(R.id.DescricaoPromocao);
        ivPromocao = (ImageView) itemView.findViewById(R.id.ImagemPromocao);
        itvDetalhePromocao = (IconTextView) itemView.findViewById(R.id.DetalhePromocao);
    }
}

