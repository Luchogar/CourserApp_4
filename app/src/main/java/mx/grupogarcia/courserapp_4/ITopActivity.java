package mx.grupogarcia.courserapp_4;

import java.util.ArrayList;

import mx.grupogarcia.courserapp_4.adapter.PerroAdaptador;
import mx.grupogarcia.courserapp_4.pojo.Perro;


/**
 * Created by Luis Garcia  on 17/09/2016.
 */

public interface ITopActivity {
    public void generarLinearLayoutVertical();
    public PerroAdaptador crearAdaptador(ArrayList<Perro> perros);
    public void inicializarAdaptador(PerroAdaptador perroAdaptador);
}
