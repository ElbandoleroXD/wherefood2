package cl.isiur.wherefood1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SensoresActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensores);
    }
    public void openProximity(View view) {
        startActivity(new Intent( this, ProximityActivity.class));
    }
    public void openGyroscope(View view) {
        startActivity(new Intent(this, GyroscopeActivity.class));
    }
    public void openRotationVector(View view) {
        startActivity(new Intent(this, RotationVectorActivity.class));
    }
}