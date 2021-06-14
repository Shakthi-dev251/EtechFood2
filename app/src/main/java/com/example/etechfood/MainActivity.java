package com.example.etechfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.etechfood.AdministratorUser.AdministratorSignInActivity;
import com.example.etechfood.ClientUser.ClientUserSignInActivity;
import com.example.etechfood.RestaurantUser.RestaurantSignInActivity;
import com.example.etechfood.RiderUser.RiderSignInActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MaterialButton clientUser, restaurantUser, riderUser, administratorUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clientUser = findViewById(R.id.btn_client_SignIn);
        clientUser.setOnClickListener(this);

        restaurantUser = findViewById(R.id.btn_restaurant_SignIn);
        restaurantUser.setOnClickListener(this);

        riderUser = findViewById(R.id.btn_rider_SignIn);
        riderUser.setOnClickListener(this);

        administratorUser = findViewById(R.id.btn_administrator_SignIn);
        administratorUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view == clientUser){
            Intent clientUser = new Intent(MainActivity.this, ClientUserSignInActivity.class);
            startActivity(clientUser);

        }else if (view == restaurantUser){
            Intent restaurantUser = new Intent(MainActivity.this, RestaurantSignInActivity.class);
            startActivity(restaurantUser);

        }else if (view == riderUser){
            Intent riderUser = new Intent(MainActivity.this, RiderSignInActivity.class);
            startActivity(riderUser);

        }else if (view == administratorUser){
            Intent administratorUser = new Intent(MainActivity.this, AdministratorSignInActivity.class);
            startActivity(administratorUser);

        }

    }
}