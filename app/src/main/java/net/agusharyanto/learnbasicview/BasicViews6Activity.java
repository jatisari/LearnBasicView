package net.agusharyanto.learnbasicview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class BasicViews6Activity extends AppCompatActivity {
	String[] presidents;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.basicview6);

		presidents =
				getResources().getStringArray(R.array.presidents_array);
		Spinner s1 = (Spinner) findViewById(R.id.spinner1);

		/*
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, presidents);
        */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, presidents);
        
		s1.setAdapter(adapter);
		s1.setOnItemSelectedListener(new OnItemSelectedListener()
		{
			@Override
			public void onItemSelected(AdapterView<?> arg0, 
			View arg1, int arg2, long arg3)
			{
				int index = arg0.getSelectedItemPosition();
				Toast.makeText(getBaseContext(),
						"You have selected item : " + presidents[index],
						Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) { }
		});
	}
}