package app.balada;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import app.balada.adapter.EventoPromocaoRecyclerAdapter;

public class EventoActivity extends BaseActivity {

    public FrameLayout framePrecos;
    public FrameLayout framePromocoes;
    public FrameLayout frameSobre;
    public RecyclerView recyclerView;
    public TextView txtPrecos;
    public TextView txtPromocoes;
    public TextView txtSobre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);
        this.frameSobre = ((FrameLayout) findViewById(R.id.FrameSobre));
        this.framePrecos = ((FrameLayout) findViewById(R.id.FramePrecos));
        this.framePromocoes = ((FrameLayout) findViewById(R.id.FramePromocoes));

        this.txtSobre = ((TextView) findViewById(R.id.txtSobre));
        this.txtPrecos = ((TextView) findViewById(R.id.txtPrecos));
        this.txtPromocoes = ((TextView) findViewById(R.id.txtPromocoes));

        this.recyclerView = ((RecyclerView) findViewById(R.id.RecyclerViewPromocoes));
        EventoPromocaoRecyclerAdapter localPromocaoRecyclerAdapter = new EventoPromocaoRecyclerAdapter(this);
        this.recyclerView.setAdapter(localPromocaoRecyclerAdapter);
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        menuEventoChange(this.txtSobre);
    }

    public void favoritar(View paramView) {
        Toast.makeText(getApplicationContext(), "Favoritado", Toast.LENGTH_SHORT).show();
    }

    public void menuEventoChange(View paramView) {
        String str = paramView.getTag().toString();
        Toast.makeText(getApplicationContext(), "Clicou em: " + str, Toast.LENGTH_SHORT).show();

        this.frameSobre.setVisibility(View.GONE);
        this.framePrecos.setVisibility(View.GONE);
        this.framePromocoes.setVisibility(View.GONE);

        this.txtSobre.setTextColor(Color.parseColor("#686868"));
        this.txtPrecos.setTextColor(Color.parseColor("#686868"));
        this.txtPromocoes.setTextColor(Color.parseColor("#686868"));

        switch (str) {
            case "sobre":
                this.txtSobre.setTextColor(Color.parseColor("#2eb187"));
                this.frameSobre.setVisibility(View.VISIBLE);
                break;
            case "precos":
                this.txtPrecos.setTextColor(Color.parseColor("#2eb187"));
                this.framePrecos.setVisibility(View.VISIBLE);
                break;
            case "promocoes":
                this.txtPromocoes.setTextColor(Color.parseColor("#2eb187"));
                this.framePromocoes.setVisibility(View.VISIBLE);
                break;
            case "fotos":
                break;
        }
    }
}
