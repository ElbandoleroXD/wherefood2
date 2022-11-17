package cl.isiur.wherefood1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendInicio(View view){
        Intent intent = new Intent(this, Inicio.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Bienvenido Usuario", Toast.LENGTH_LONG).show();
    }
}