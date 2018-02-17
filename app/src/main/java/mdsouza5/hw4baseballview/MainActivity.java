package mdsouza5.hw4baseballview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String ListItemsName[] = new String[]{"Astros", "Cubs", "Dodgers", "Giants", "Mets", "Phillies",
            "Redsox", "Royals", "Whitesox", "Yankees"};
    Integer ImageName[] = {R.drawable.astros, R.drawable.cubs, R.drawable.dodgers, R.drawable.giants, R.drawable.mets,
            R.drawable.phillies, R.drawable.redsox, R.drawable.royals, R.drawable.whitesox, R.drawable.yankees};
    String ListItemsDescription[] = new String[]{"2017 World Series Champions", "2016 World Series Champions", "1988 World Series Champions", "2014 World Series Champions",
            "1986 World Series Champions", "2008 World Series Champions", "2013 World Series Champions", "2015 World Series Champions", "2005 World Series Champions",
            "2009 World Series Champions"};

    ListView listView;
    ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.teamlistview);
        listAdapter = new CustomListAdapter(MainActivity.this, ListItemsName, ListItemsDescription, ImageName);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), ListItemsName[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}
