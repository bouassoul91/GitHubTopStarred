package com.gmail.bouassoul91.gittopsatrred;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gmail.bouassoul91.gittopsatrred.model.Item;
import com.squareup.picasso.Picasso;

import java.util.List;

import jp.wasabeef.picasso.transformations.RoundedCornersTransformation;

/**
 * Created by macbookair on 20/12/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> items;
    private Context context;

    final int radius = 5;
    final int margin = 5;


    public ItemAdapter(Context applicationContext, List<Item> itemArrayList) {
        this.context = applicationContext;
        this.items = itemArrayList;
    }

    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_user, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemAdapter.ViewHolder viewHolder, int i) {
        viewHolder.repoName.setText(items.get(i).getRepoName());
        viewHolder.githublink1.setText(items.get(i).getHtmlUrl());
        viewHolder.description.setText(items.get(i).getDescription());
        viewHolder.stars.setText(items.get(i).getStars());
        viewHolder.title.setText(items.get(i).getOwner().getLogin());

        Picasso.with(context)
                .load(items.get(i).getOwner().getAvatarUrl())
                .transform(new RoundedCornersTransformation(50, 4))
                .placeholder(R.drawable.load)
                .into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, githublink1, description, stars, repoName;
        private ImageView imageView;


        public ViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.repo_des);
            githublink1 = (TextView) view.findViewById(R.id.githublink1);
            stars = (TextView) view.findViewById(R.id.stars);
            repoName = (TextView) view.findViewById(R.id.repo_name);

            imageView = (ImageView) view.findViewById(R.id.cover);
        }
    }

}
