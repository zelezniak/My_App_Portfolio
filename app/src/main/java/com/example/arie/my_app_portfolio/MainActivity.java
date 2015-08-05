package com.example.arie.my_app_portfolio;

import android.graphics.Color;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {
        Button button = (Button)view;
        String buttonName = getResources().getResourceEntryName(button.getId());
        if (buttonName.equalsIgnoreCase("media_streamer")){
            sendToast("Spotify Streamer");
        }else if (buttonName.equalsIgnoreCase("super_duo1")){
            sendToast("Scores");
        }else if (buttonName.equalsIgnoreCase("super_duo2")){
            sendToast("Library");
        }else if (buttonName.equalsIgnoreCase("ant_terminator")){
            sendToast("Build It Bigger");
        }
        else if (buttonName.equalsIgnoreCase("materialize")){
            sendToast("XYZ Reader");
        }else
            sendToast("Capstone");







    }

    private void sendToast(String str){
        Toast.makeText(MainActivity.this,"This button will launch my "+ str +" app!" , Toast.LENGTH_SHORT).show();
    }
}
