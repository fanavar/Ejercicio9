package cl.awakelab.ejercicio9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        ImageView selectedImage = findViewById(R.id.selectedImage);
        Button backButton = findViewById(R.id.backButton);

        int imageId = getIntent().getIntExtra("image",0);
        selectedImage.setImageResource(imageId);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}