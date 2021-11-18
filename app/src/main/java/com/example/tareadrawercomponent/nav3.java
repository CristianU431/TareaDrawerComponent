package com.example.tareadrawercomponent;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nav3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class nav3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public nav3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav3.
     */
    // TODO: Rename and change types and number of parameters
    public static nav3 newInstance(String param1, String param2) {
        nav3 fragment = new nav3();
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
    private ImageButton btn1,btn2,btn3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nav3, container, false);

        tv1 = view.findViewById(R.id.tvTitulo);
        tv2 = view.findViewById(R.id.tvTexto);

        tv1.setText("La estatua Cristo Redentor");
        tv2.setText("La estatua también se conoce como Cristo de Corcovado por estar ubicada encima del cerro de Corcovado. El Cristo se encuentra parado, con los brazos abiertos y mirando hacia la ciudad y el puerto de Río de Janeiro, en Brasil. La gigantesca escultura de 30 metros de altura y 1.200 toneladas, es la escultura Art Decó más famosa del mundo.");

        btn1 = view.findViewById(R.id.btnAnterior3);
        btn2 = view.findViewById(R.id.btnHome3);
        btn3 = view.findViewById(R.id.btnSiguiente3);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Llamando al fragmento de navegacion
                Navigation.findNavController(view).navigate(R.id.nav2);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Llamando al fragmento de navegacion
                Navigation.findNavController(view).navigate(R.id.maravillasModernasFragment);
            }
        });
        /*btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Llamando al fragmento de navegacion
                Navigation.findNavController(view).navigate(R.id.nav3);
            }
        });*/

        return view;
    }
}