package net.agusharyanto.learnbasicview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class BasicViews3Activity extends AppCompatActivity {
       String[] presidents = {
            "Dwight D. Eisenhower",
            "John F. Kennedy",
            "Lyndon B. Johnson",
            "Richard Nixon",
            "Gerald Ford",
            "Jimmy Carter",
            "Ronald Reagan",
            "George H. W. Bush",
            "Bill Clinton",
            "George W. Bush",
            "Barack Obama"
    };

    String[] presidentsri = {
            "Sukarno",
            "Suharto",
            "Habibi",
            "Abdurahman Wahid",
            "Megawati",
            "Susilo Bambang Yudoyono",
            "Joko Widodo"

    };

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basicview3);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_dropdown_item_1line, presidents);

        AutoCompleteTextView textView = (AutoCompleteTextView)
            findViewById(R.id.txtCountries);

        textView.setThreshold(2);
        textView.setAdapter(adapter);

        ArrayAdapter<String> adapterri = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, presidentsri);

        AutoCompleteTextView textViewri = (AutoCompleteTextView)
                findViewById(R.id.txtPresidenRI);

        textViewri.setThreshold(2);
        textViewri.setAdapter(adapterri);

    }
}