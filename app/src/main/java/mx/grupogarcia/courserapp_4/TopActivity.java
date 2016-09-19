package mx.grupogarcia.courserapp_4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;

import java.util.ArrayList;



import mx.grupogarcia.courserapp_4.pojo.Perro;
import mx.grupogarcia.courserapp_4.adapter.PerroAdaptador;
import mx.grupogarcia.courserapp_4.presentador.TopActivityPresentador;
import mx.grupogarcia.courserapp_4.presentador.ITopActivityPresentador;


public class TopActivity extends AppCompatActivity implements ITopActivity{
    ArrayList<Perro> perros;
    private RecyclerView listaPerros;

    private ITopActivityPresentador presentador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        Toolbar miAccionBar = (Toolbar) findViewById(R.id.miAccionBar);
        setSupportActionBar(miAccionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaPerros =   (RecyclerView)  findViewById(R.id.rvPerros);
        presentador=new TopActivityPresentador(this, getApplicationContext());


    }



    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayout.VERTICAL);
        listaPerros.setLayoutManager(llm);
    }

    @Override
    public PerroAdaptador crearAdaptador(ArrayList<Perro> perros) {
         PerroAdaptador adaptador;adaptador= new PerroAdaptador(perros,this);
        return adaptador;
    }

    @Override
    public void inicializarAdaptador(PerroAdaptador perroAdaptador) {
        listaPerros.setAdapter(perroAdaptador);
    }
}
