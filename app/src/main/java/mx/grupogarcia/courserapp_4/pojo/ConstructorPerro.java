package mx.grupogarcia.courserapp_4.pojo;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;



import mx.grupogarcia.courserapp_4.db.ConstantesBasesDatos;
import mx.grupogarcia.courserapp_4.db.BaseDatos;

/**
 * Created by Luis Garcia  on 17/09/2016.
 */

public class ConstructorPerro {

    private Context context;
    private static final int TOP = 1;

    public ConstructorPerro(Context context)
    {
        this.context = context;
    }

    public ArrayList<Perro>obtenerTop()
    {
        BaseDatos bd = new BaseDatos(context);
        return bd.obtenerTop();
    }

    public void insertarPerro(Perro perro)
    {
        BaseDatos bd = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBasesDatos.TABLE_PERRO_NOMBRE,perro.getNombre());
        contentValues.put(ConstantesBasesDatos.TABLE_PERRO_NUMERO_LIKES,perro.getLikes());
        contentValues.put(ConstantesBasesDatos.TABLE_PERRO_FOTO,perro.getFoto());
        contentValues.put(ConstantesBasesDatos.TABLE_PERRO_PERRO_ID,perro.getId());
        contentValues.put(ConstantesBasesDatos.TABLE_PERRO_TOP,TOP);
        bd.insertarPerro(contentValues);
    }

    public void checarPerro(Perro perro)
    {
        BaseDatos bd = new BaseDatos(context);
        int i = bd.checarPerro(perro);
        if(i>0)
        {
            bd.mueveTopPerros(i);
            bd.primerLugarTop(perro);
        }
        else
        {
            bd.mueveTodosPerros();
            insertarPerro(perro);
        }
        bd.close();
    }
}
