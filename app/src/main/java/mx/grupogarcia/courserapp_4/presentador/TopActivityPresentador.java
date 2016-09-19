package mx.grupogarcia.courserapp_4.presentador;

import android.content.Context;

import java.util.ArrayList;



import mx.grupogarcia.courserapp_4.pojo.Perro;
import mx.grupogarcia.courserapp_4.ITopActivity;
import mx.grupogarcia.courserapp_4.pojo.ConstructorPerro;

/**
 * Created by Luis Garcia  on 17/09/2016.
 */

public class TopActivityPresentador implements ITopActivityPresentador{

    private ITopActivity iTopActivity;
    private Context context;
    private ConstructorPerro constructorPerro;
    private ArrayList<Perro>perros;

    public TopActivityPresentador(ITopActivity iTopActivity, Context context)
    {
        this.iTopActivity=iTopActivity;
        this.context=context;
        obtenerPerros();
    }


    @Override
    public void obtenerPerros() {
        constructorPerro = new ConstructorPerro(context);
        perros=constructorPerro.obtenerTop();
        mostrarPerrosRV();
    }

    @Override
    public void mostrarPerrosRV() {
        iTopActivity.inicializarAdaptador(iTopActivity.crearAdaptador(perros));
        iTopActivity.generarLinearLayoutVertical();
    }
}
