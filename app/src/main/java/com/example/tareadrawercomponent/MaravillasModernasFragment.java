package com.example.tareadrawercomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MaravillasModernasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MaravillasModernasFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MaravillasModernasFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MaravillasModernasFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MaravillasModernasFragment newInstance(String param1, String param2) {
        MaravillasModernasFragment fragment = new MaravillasModernasFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    // **************************************************
    //Declarar variables para las maravillas
    private TextView tv1,tv2;
    private ImageButton btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_maravillas_modernas, container, false);

        tv1 = view.findViewById(R.id.tvTitulo);
        tv2 = view.findViewById(R.id.tvTexto);

        tv1.setText("Chichén Itzá");
        tv2.setText("Es una legendaria ciudad Maya, construida aproximadamente en el año 525 d.C., que se encuentra en el sur de México, en el Estado de Yucatán y en el municipio de Tinum, a 190 km de Cancún. Es una joya de la arquitectura ancestral. Lo que más llama la atención es el templo Kukulkán, una gran estructura piramidal que tiene 24 metros de altura y escalinatas en sus cuatro puntos cardinales.");

        btn1 = view.findViewById(R.id.btnSiguiente);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Llamando al fragmento de navegacion
                Navigation.findNavController(view).navigate(R.id.nav2);
            }
        });


        return view;
    }
}