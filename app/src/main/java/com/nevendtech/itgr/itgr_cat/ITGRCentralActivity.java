package com.nevendtech.itgr.itgr_cat;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class ITGRCentralActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itgrcentral);

        Spinner spnMain = (Spinner) findViewById(R.id.spnSelectMain);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adaptMain = ArrayAdapter.createFromResource(this,
                R.array.ITGRCA_Main_Array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adaptMain.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spnMain.setAdapter(adaptMain);

        Spinner spnSecond = (Spinner) findViewById(R.id.spnSelectSecond);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adaptSecond = ArrayAdapter.createFromResource(this,
                R.array.ITGRCA_Second_Array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adaptSecond.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spnSecond.setAdapter(adaptSecond);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_itgrcentral, menu);
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
}
