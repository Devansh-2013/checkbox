package com.example.myapplicationcheckbox;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private CheckBox cs,pubg,valo,apex,gta;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        cs=(CheckBox) findViewById(R.id.csgo);
        pubg=(CheckBox) findViewById(R.id.pubg);
        valo=(CheckBox) findViewById(R.id.valo);
        apex=(CheckBox) findViewById(R.id.apex);
        gta=(CheckBox) findViewById(R.id.gta);

        button= (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str ="Games you play ";
                if(cs.isChecked())
                {
                    str += "Csgo ";
                }
                if(pubg.isChecked())
                {
                    str += "Pubg ";
                }
                if(gta.isChecked())
                {
                    str += "Gta ";
                }
                if(valo.isChecked())
                {
                    str += "Valorant ";
                }
                if(apex.isChecked())
                {
                    str += "Apex ";
                }
                Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}