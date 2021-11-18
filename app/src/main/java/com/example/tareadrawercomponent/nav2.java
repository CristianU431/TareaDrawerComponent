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
 * Use the {@link nav2#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class nav2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav2.
     */
    // TODO: Rename and change types and number of parameters
    public static nav2 newInstance(String param1, String param2) {
        nav2 fragment = new nav2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public nav2() {
        // Required empty public constructor
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
        View view = inflater.inflate(R.layout.fragment_nav2, container, false);

        tv1 = view.findViewById(R.id.tvTitulo);
        tv2 = view.findViewById(R.id.tvTexto);

        tv1.setText("El Coliseo de Roma");
        tv2.setText("Es un anfiteatro de la época del imperio Romano, construido en el siglo I D.C, en el centro de Roma. Aquí se realizaban luchas entre gladiadores y algunos otros espectáculos públicos y tenía una capacidad para 50,000 personas. Para evitar las enormes filas que se forman en la puerta del Coliseo prácticamente durante todo el año, recomendamos comprar tu ticket por adelantado. Además al comprar la entrada al Coliseo, tenés el derecho de entrar en el foro romano, el centro de la vida cívica y económica de la Roma Republicana. ");

        btn1 = view.findViewById(R.id.btnAnterior2);
        btn2 = view.findViewById(R.id.btnHome2);
        btn3 = view.findViewById(R.id.btnSiguiente2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Llamando al fragmento de navegacion
                Navigation.findNavController(view).navigate(R.id.maravillasModernasFragment);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Llamando al fragmento de navegacion
                Navigation.findNavController(view).navigate(R.id.maravillasModernasFragment);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Llamando al fragmento de navegacion
                Navigation.findNavController(view).navigate(R.id.nav3);
            }
        });

        return view;
    }
}