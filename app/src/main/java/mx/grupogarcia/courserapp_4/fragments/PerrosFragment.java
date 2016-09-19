package mx.grupogarcia.courserapp_4.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;


import mx.grupogarcia.courserapp_4.pojo.Perro;
import mx.grupogarcia.courserapp_4.adapter.PerroAdaptador;
import mx.grupogarcia.courserapp_4.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerrosFragment extends Fragment {
    ArrayList<Perro> perros;
    private RecyclerView listaPerros;

    public PerrosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perros, container, false);
        listaPerros =   (RecyclerView)  v.findViewById(R.id.rvPerros);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayout.VERTICAL);
        listaPerros.setLayoutManager(llm);

        inicializarPerros();
        inicializarAdaptador();
        return v;
    }

    public void inicializarPerros()
    {
        perros =    new ArrayList<Perro>();
        perros.add(new Perro("Karsi",1,R.drawable.perro6,0));
        perros.add(new Perro("Taco",6,R.drawable.perro5,1));
        perros.add(new Perro("Princesa",7,R.drawable.perro7,2));
        perros.add(new Perro("Flaca",3,R.drawable.perro11,3));
        perros.add(new Perro("Luna",3,R.drawable.perro8,4));
    }

    public PerroAdaptador adaptador;
    public void inicializarAdaptador()
    {
        adaptador = new PerroAdaptador(perros,getActivity());
        listaPerros.setAdapter(adaptador);
    }

}
