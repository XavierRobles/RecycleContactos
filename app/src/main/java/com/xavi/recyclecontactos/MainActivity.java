package com.xavi.recyclecontactos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Contactos c1= new Contactos("Pepe","fonsi" ,"Pepe@gmail.com", 23);
        Contactos c2= new Contactos("Ana","Anastasia", "Ana@gmail.com", 23);
        Contactos c3= new Contactos("Lolo","lola", "Lolo@gmail.com", 23);
        Contactos c4= new Contactos("Filomena", "helada" ,"Filomena@gmail.com", 23);
        Contactos c5= new Contactos("Toño","toña" ,"toño@gmail.com", 23);
        Contactos c6= new Contactos("Mari", "mara","Mari@gmail.com", 23);
        Contactos c7= new Contactos("Jorge", "Ballesteros","Jorge@gmail.com", 23);
        Contactos c8= new Contactos("Xavi", "robles" ,"Xavi@gmail.com", 23);
        Contactos c9= new Contactos("almer", "ia","Almer@gmail.com", 23);
        Contactos c10= new Contactos("Miguel", "parra","Miguel@gmail.com", 23);

        ArrayList<Contactos> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);
        lista.add(c6);
        lista.add(c7);
        lista.add(c8);
        lista.add(c9);
        lista.add(c10);

        RecyclerView rec = findViewById(R.id.mi_recicle);
        RecyclerView.LayoutManager gestor = new LinearLayoutManager(this);
        MiAdaptador adaptador = new MiAdaptador(lista);
        rec.setLayoutManager(gestor);
        rec.setAdapter(adaptador);
    }
}