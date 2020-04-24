package com.andrian.topuniversityjabar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class ListUniversityAdapter extends RecyclerView.Adapter<ListUniversityAdapter.ListViewHolder> {
    private ArrayList<University> listUniversity;

    public ListUniversityAdapter(ArrayList<University> listUniversity) {
        this.listUniversity = listUniversity;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.university_row, viewGroup,false);
        return new ListViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull final ListUniversityAdapter.ListViewHolder holder, int position) {
        University university = listUniversity.get(position);
        Glide.with(holder.itemView.getContext())
                .load(university.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(university.getName());
        holder.tvDetails.setText(university.getDetail());
        holder.tvPeringkat.setText(university.getPeringkat());
        holder.tvKlaster.setText(university.getKlaster());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Nama = listUniversity.get(holder.getAdapterPosition()).getName();
                String Details = listUniversity.get(holder.getAdapterPosition()).getDetail();
                String Peringkat = listUniversity.get(holder.getAdapterPosition()).getPeringkat();
                String Klaster = listUniversity.get(holder.getAdapterPosition()).getKlaster();

                Intent intent = new Intent(view.getContext(), Detail.class);
                intent.putExtra("nama", Nama);
                intent.putExtra("image", listUniversity.get(holder.getAdapterPosition()).getPhoto());
                intent.putExtra("details", Details);
                intent.putExtra("peringkat", Peringkat);
                intent.putExtra("klaster", Klaster);
                view.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listUniversity.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName,tvDetails,tvPeringkat,tvKlaster;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetails = itemView.findViewById(R.id.tv_item_detail);
            tvPeringkat = itemView.findViewById(R.id.tv_peringkat);
            tvKlaster = itemView.findViewById(R.id.tv_klaster);


        }
    }
}
