package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity; // Import the AppCompatActivity class

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayAdapter<String> aAdapter; // Specify the type for ArrayAdapter
    private String[] users = { "MD Zuleyenine Ibne Noman", "Kazi Swati", "Arcturus", "Praveen Alavala", "Madav Sai", "Hamsika Yemineni"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.userlist);
        aAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, users);
        mListView.setAdapter(aAdapter);
    }
}
