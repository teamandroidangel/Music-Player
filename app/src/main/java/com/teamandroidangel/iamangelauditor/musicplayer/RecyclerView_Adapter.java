package com.teamandroidangel.iamangelauditor.musicplayer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.teamandroidangel.iamangelauditor.musicplayer.R;

import java.util.Collections;
import java.util.List;

/**
 * Created by iamangelauditor on 03/12/2017.
 */

public class RecyclerView_Adapter extends RecyclerView.Adapter<ViewHolder> {
    List<Music> list = Collections.emptyList();
    Context context;
    public RecyclerView_Adapter(List<Music> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(list.get(position).getTitle());
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
class ViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    ImageView play_pause;
    ViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        play_pause = itemView.findViewById(R.id.play_pause);
    }
}
