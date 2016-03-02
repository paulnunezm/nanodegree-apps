package com.nunez.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CoordinatorLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (CoordinatorLayout) findViewById(R.id.cordinator_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.btn_spotify).setOnClickListener(this);
        findViewById(R.id.btn_scores).setOnClickListener(this);
        findViewById(R.id.btn_bigger).setOnClickListener(this);
        findViewById(R.id.btn_library).setOnClickListener(this);
        findViewById(R.id.btn_reader).setOnClickListener(this);
        findViewById(R.id.btn_my_app).setOnClickListener(this);


//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
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

    public void showSnackBar(String msg, View v){
        Snackbar.make(v, "This button will launch my " +msg +" app", Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        switch (id){
            case R.id.btn_spotify:
                showSnackBar("Spotify", v);
                break;

            case R.id.btn_scores:
                showSnackBar("Scores", v);
                break;

            case R.id.btn_library:
                showSnackBar("Library", v);
                break;

            case R.id.btn_bigger:
                showSnackBar("Build it bigger", v);
                break;

            case R.id.btn_reader:
                showSnackBar("XYZ Reader", v);
                break;

            case R.id.btn_my_app:
                showSnackBar("Own", v);
                break;
        }
    }
}
