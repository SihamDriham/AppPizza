// DetailsActivity.java
package com.example.tp2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tp2.classes.Produit;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produit);

        // Récupérer l'intent et les données du produit
        Intent intent = getIntent();
        Produit produit = (Produit) intent.getSerializableExtra("produit");

        // Lier les vues à l'interface utilisateur
        ImageView imageView = findViewById(R.id.produit_image);
        TextView nameTextView = findViewById(R.id.produit_nom);
        TextView descriptionTextView = findViewById(R.id.produit_description);
        TextView detailsTextView = findViewById(R.id.produit_ingredients);

        // Mettre à jour les vues avec les détails du produit
        imageView.setImageResource(produit.getPhoto());
        nameTextView.setText(produit.getNom());
        descriptionTextView.setText(produit.getDescription());
        detailsTextView.setText(produit.getDetaisIngred());
    }
}

