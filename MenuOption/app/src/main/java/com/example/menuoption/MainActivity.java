package com.example.menuoption;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();

        if (item.getItemId() == R.id.search_item) {
            // do your code
            return true;
        } else if (item.getItemId() == R.id.upload_item) {
            // do your code
            return true;
        } else if (item.getItemId() == R.id.copy_item) {
            // do your code
            return true;
        } else if (item.getItemId() == R.id.print_item) {
            // do your code
            return true;
        } else if (item.getItemId() == R.id.share_item) {
            // do your code
            return true;
        } else if (item.getItemId() == R.id.bookmark_item) {
            // do your code
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
