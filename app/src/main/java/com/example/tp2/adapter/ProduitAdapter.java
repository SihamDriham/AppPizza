package com.example.tp2.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tp2.R;
import com.example.tp2.classes.Produit;

import java.util.List;

public class ProduitAdapter extends BaseAdapter {

    private List<Produit> produits ;
    private LayoutInflater inflater ;

    public ProduitAdapter(List<Produit> produits, Activity activity){
        this.produits = produits;
        //permet d'obtenir un service système Android, dans ce cas, le LayoutInflater qui sera utilisé pour créer les éléments visuels à afficher dans la liste.
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int i) {
        return produits.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if (view == null) {
            view = inflater.inflate(R.layout.item, null);
            holder = new ViewHolder();
            holder.nom = view.findViewById(R.id.recipeTitle);
            holder.nbrIngred = view.findViewById(R.id.servingText);
            holder.time = view.findViewById(R.id.timeText);
            holder.imag = view.findViewById(R.id.pizzaImage);
            view.setTag(holder); // Associer le ViewHolder à la vue pour la réutiliser
        } else {
            holder = (ViewHolder) view.getTag();
        }

        Produit produit = produits.get(i);
        holder.nom.setText(produit.getNom());
        holder.nbrIngred.setText(produit.getNbrIngredients() + "");
        holder.time.setText(produit.getDuree());
        holder.imag.setImageResource(produit.getPhoto());

        return view;
    }

    static class ViewHolder {
        TextView nom;
        TextView nbrIngred;
        TextView time;
        ImageView imag;
    }
}
