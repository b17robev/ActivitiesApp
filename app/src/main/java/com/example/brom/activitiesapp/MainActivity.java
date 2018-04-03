package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mountainLocations = {"Alps","Alps","Alaska"};
    private int[] mountainHeights ={4478,4808,6190};
    // Create ArrayLists from the raw data above and use these lists when populating your ListView.

    List<String> mountain_Names = new ArrayList<>(Arrays.asList(mountainNames));
    List<String> mountain_Locations = new ArrayList<>(Arrays.asList(mountainLocations));
    //List<Integer> mountain_Heights = new ArrayList<Integer>(mountainHeights);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> listData = new ArrayList<>(Arrays.asList(mountainNames));

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), R.layout.list_item_text_view,
                R.id.item_textview, mountainNames);

        final ListView myListView = (ListView)findViewById(R.id.mylist);
        myListView.setAdapter(adapter);

        //Setup Click event
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                Intent intent = new Intent(myListView.getContext(), detaljer.class);
                Bundle extras = new Bundle();

                String name = mountain_Names.get(position);
                String location = mountain_Locations.get(position);
                //String height = mountain_Heights.get(position);
                String message = "hello";
                extras.putString("EXTRA_NAME", name);
                extras.putString("EXTRA_LOCATION", location);;
                myListView.getContext().startActivity(intent);

            }
        });


        // 1. Create a ListView as in previous assignment
        // 2. Create a new activity named "MountainDetailsActivity
        // 3. Create a new Layout file for the MountainDetailsActivity called
        //    "activity_mountaindetails". MountainDetailsActivity must have MainActivity as its
        //    ´parent activity.
        // 4. The layout file created in step 3 must have a LinearLayout
        // 5. The layout file created in step 3 must be able to display
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 6. When tapping on a list item: create an Intent that includes
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 7. Display the MountainDetailsActivity with the data from the Intent created in step
        //    6
        // 8. From the MountainDetailsActivity you should have an option to "go back" using an
        //    left arro button. This is done by letting the MainActivity be the parent activity to
        //    MountainDetailsActivity.
    }
}
