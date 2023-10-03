package com.jorge.dia2102323;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class listAdapter extends BaseAdapter {
   //donde esta ubicado en la aplicacion
    Context contexto;
    String[] nombres,mensajes,horaUltimoMensaje,numeroTelefono,pais;
    //para identificar la clase
    int idImagen;
    LayoutInflater inflater;

    public listAdapter(Context contexto, String[] nombre, String[] mensajes, String[] horaUltimoMensaje, String[] numeroTelefono, String[] pais, int idImagen) {
        this.contexto = contexto;
        this.nombres = nombre;
        this.mensajes = mensajes;
        this.horaUltimoMensaje = horaUltimoMensaje;
        this.numeroTelefono = numeroTelefono;
        this.pais = pais;
        this.idImagen = idImagen;
        inflater = LayoutInflater.from(contexto);
    }

    @Override
    //para saber cuantos datos llegaron en el arreglo nopmbres
    public int getCount(){return nombres.length;}//devuelve el numero de datos que se reciberon

    @Override
    //regresa un objeto vacio y recibe la cantidad de datos i
    public Object getItem(int i){return null;}

    @Override
    public  long getItemId(int i){return 0;}

    @Override
    //obtener la vista (la parte GRAFICA)
    public View getView(int i, View vista, ViewGroup vistaAgrupada){
        vista = inflater.inflate(R.layout.list_item,null);
        ImageView fotoPerfil = vista.findViewById(R.id.)
        return vista;
    }

}
