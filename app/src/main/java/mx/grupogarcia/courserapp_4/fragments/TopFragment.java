package mx.grupogarcia.courserapp_4.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


import mx.grupogarcia.courserapp_4.adapter.MiPerroAdaptador;
import mx.grupogarcia.courserapp_4.R;
import mx.grupogarcia.courserapp_4.pojo.MiPerro;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment {

    ArrayList<MiPerro> miPerros;
    private RecyclerView listaPerros;
    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_top, container, false);
        listaPerros =(RecyclerView) v.findViewById(R.id.rvMiPerro);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),2);

        listaPerros.setLayoutManager(glm);
        inicializarPerros();
        inicializarAdaptador();
        return v;
    }

    public void inicializarPerros()
    {
        miPerros =    new ArrayList<MiPerro>();
        miPerros.add(new MiPerro(R.drawable.perro5,3));
        miPerros.add(new MiPerro(R.drawable.perro7,4));
        miPerros.add(new MiPerro(R.drawable.perro3,5));
        miPerros.add(new MiPerro(R.drawable.perro9,2));
        miPerros.add(new MiPerro(R.drawable.perro2,3));
    }

    public MiPerroAdaptador adaptador;
    public void inicializarAdaptador()
    {
        adaptador = new MiPerroAdaptador(miPerros,getActivity());
        listaPerros.setAdapter(adaptador);
    }

}
