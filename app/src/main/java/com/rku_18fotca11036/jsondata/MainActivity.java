package com.rku_18fotca11036.jsondata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lstJson;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstJson = findViewById(R.id.lstJson);

        list = new ArrayList<String>();


//         String stringJson = getResources().getString(R.string.jsondata);
//        try
//        {
//
//            JSONObject jsonObject = new JSONObject(stringJson);
//
//            JSONArray jsonArray = jsonObject.getJSONArray("vehical");
//
//            for(int i = 0; i < jsonArray.length(); i++)
//            {
//                list.add(jsonArray.getString(i));
//            }
//
//
//        } catch (JSONException e)
//        {
//            e.printStackTrace();
//        }




        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                //3
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                list
        );

        generateData();
        lstJson.setAdapter(adapter);





    }

    private void generateData() {

        String stringJson = getResources().getString(R.string.jsondata);
        try
        {

            JSONObject jsonObject = new JSONObject(stringJson);

            JSONArray jsonArray = jsonObject.getJSONArray("vehical");

            for(int i = 0; i < jsonArray.length(); i++)
            {
                list.add(jsonArray.getString(i));
            }


        } catch (JSONException e)
        {
            e.printStackTrace();
        }

    }


}