package com.example.infgra.view.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.infgra.R;
import com.example.infgra.adapter.CardViewAdapter;
import com.example.infgra.moda.Image;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile,container,false);
        //toolbar
        showToolBar("",false,view);
        //recycleview
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_profile);
        //layout manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        //el adapter
        CardViewAdapter cardViewAdapter = new CardViewAdapter(buildImages(),R.layout.cardview_image,getActivity());
        recyclerView.setAdapter(cardViewAdapter);
        return view;
    }
    public void showToolBar(String titulo,boolean botonsubir, View view){
        Toolbar toolbar = view.findViewById(R.id.toolbar_profile);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonsubir);

    }
    //crear lista de imagenes
    public ArrayList<Image> buildImages(){
        ArrayList<Image> images= new ArrayList<>();

        images.add(new Image("https://r1.abcimg.es/resizer/resizer.php?imagen=https%3A%2F%2Fstatic1.abc.es%2Fmedia%2Fpeliculas%2F000%2F000%2F094%2Fciudad-de-dios-2.jpg&nuevoancho=620&medio=abc","Erick Benavides", "2 dias","1000 me gusta"));
        images.add(new Image("https://www.caracteristicas.co/wp-content/uploads/2018/08/bolivia-1-e1578092100691.jpg","Alvaro Erick", "22dias","10 me gusta"));
        images.add(new Image("https://diarionuevosur.com/wp-content/uploads/2019/07/paisaje1.jpg","Karol G", "12 dias","100 me gusta"));
        images.add(new Image("https://www.tolomahotel.com/wp-content/uploads/2015/06/carreteras-bolivia-cochabamba2.jpg","Becky G", "11 dias","123 me gusta"));
        images.add(new Image("https://www.sinfronteras.com.bo/wp-content/uploads/2020/02/HUMEDALES2.jpg","Daddy Yankee", "6 dias","456 me gusta"));
        images.add(new Image("https://www.telesurtv.net/__export/1573591032358/sites/telesur/img/2019/11/12/marcha-en-argentina-apoyo-evo-morales-1-compressor.jpg","Evo Morales", "8 dias","123 me gusta"));
        images.add(new Image("https://s.rfi.fr/media/display/902827e2-0fb0-11ea-80a9-005056a99247/w:980/p:16x9/2019-11-03t234425z_65357148_rc13475f9780_rtrmadp_3_bolivia-election.webp","Carlos Mesa", "4 dias","756 me gusta"));
        images.add(new Image("https://static1.evcdn.net/images/reduction/1422733_w-1540_h-870_q-80_m-crop.jpg","Manfred Reyes", "11 dias","728 me gusta"));
        images.add(new Image("https://bitacorasdeviaje.com/wp-content/uploads/2016/05/Tips_para_viajar_a_Bolivia.jpg","Pepito Lindo", "1 dias","178 me gusta"));
        images.add(new Image("https://www.turismodeobservacion.com/media/fotografias/paisaje-urbano-nocturno-de-la-paz-bolivia-92998-xl.jpg","Debora Gaaa", "8 dias","465 me gusta"));

        return  images;
    }
}