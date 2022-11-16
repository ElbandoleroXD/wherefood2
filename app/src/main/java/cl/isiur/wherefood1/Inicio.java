package cl.isiur.wherefood1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void sendSensor(View view){
        Intent intent = new Intent(Inicio.this, SensoresActivity.class);
        startActivity(intent);
    }
    public void sendMap(View view){
        Intent intent = new Intent(Inicio.this, map.class);
        startActivity(intent);
    }

}