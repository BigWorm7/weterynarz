package com.pt2.weterynarz;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> zwierzeta;
    private ListView listView;
    private ArrayAdapter<String> arrayAdapter;
    private SeekBar seekBar;
    private  int[] wiek;
    private TextView textViewWiek;
    private  TextView textViewfinal;
    private EditText imie;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        zwierzeta = new ArrayList<>();
        zwierzeta.add("pies");
        zwierzeta.add("kot");
        zwierzeta.add("swinka morska");
        listView = findViewById(R.id.lista);
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, zwierzeta);
        listView.setAdapter(arrayAdapter);
        seekBar = findViewById(R.id.seekBar);
        wiek = new int[]{18, 20, 9};
        textViewWiek = findViewById(R.id.textView5);
        textViewfinal = findViewById(R.id.textView6);
        imie = findViewById(R.id.imie);
        button = findViewById(R.id.button);
        String zwierze;

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        // i to klikniete element listy
                        Toast.makeText(MainActivity.this, zwierzeta.get(i), Toast.LENGTH_SHORT).show();
                        seekBar.setMax(wiek[i]);
                        zwierze = zwierzeta.get(i);
                    }
                }
        );
        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        textViewWiek.setText("Ile lat?: "+i);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textViewfinal.setText(imie +", "+zwierzeta.get(i));
                    }
                }
        );
    }
}