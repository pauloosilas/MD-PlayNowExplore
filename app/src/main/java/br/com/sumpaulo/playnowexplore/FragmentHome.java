package br.com.sumpaulo.playnowexplore;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import br.com.sumpaulo.playnowexplore.adapter.ListGamerAdapterRecyclerView;
import br.com.sumpaulo.playnowexplore.model.Game;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment {

    private ArrayList<Game> listGames;

    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView pictureGames = (RecyclerView)   view.findViewById(R.id.rv_user_games);

        LinearLayoutManager linearLm = new LinearLayoutManager(getContext());

        pictureGames.setLayoutManager(linearLm);

        ListGamerAdapterRecyclerView listGamerAdapterRecyclerView =
                new ListGamerAdapterRecyclerView(buildList(),R.layout.user_games_favorites,(Activity) getContext());

        pictureGames.setAdapter(listGamerAdapterRecyclerView);
        return view;
    }

    private ArrayList<Game> buildList(){
        ArrayList<Game> lista = new ArrayList<>();

        lista.add(new Game(R.id.user_imageGame));
        lista.add(new Game(R.id.user_imageGame));
        lista.add(new Game(R.id.user_imageGame));
        lista.add(new Game(R.id.user_imageGame));
        return lista;
    }

}
