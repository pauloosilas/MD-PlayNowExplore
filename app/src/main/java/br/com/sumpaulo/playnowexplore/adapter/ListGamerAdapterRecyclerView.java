package br.com.sumpaulo.playnowexplore.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import br.com.sumpaulo.playnowexplore.R;
import br.com.sumpaulo.playnowexplore.model.Game;

/**
 * Created by paulo on 09/07/17.
 */

public class ListGamerAdapterRecyclerView extends RecyclerView.Adapter<ListGamerAdapterRecyclerView.GamesViewHolder> {

    private ArrayList<Game> listGames;
    private int resource;
    private Activity activity;

    public ListGamerAdapterRecyclerView(ArrayList<Game> listGames, int resource, Activity activity){
        this.listGames = listGames;
        this.resource = resource;
        this.activity  = activity;
    }

    @Override
    public GamesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        return new GamesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GamesViewHolder holder, int position) {
        Game game = listGames.get(position);

       // holder.imgGame.setImageResource(game.getImage());
    }

    @Override
    public int getItemCount() {
        return listGames.size();

    }

    public class GamesViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgGame;

        public GamesViewHolder(View itemView){
            super(itemView);

            imgGame = (ImageView) itemView.findViewById(R.id.user_imageGame);
        }
    }
}
