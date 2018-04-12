package com.example.user.testcustomlistview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] title = {"이름1", "이름2", "이름3", "이름4", "이름5", "이름6", "이름7", "이름8", "이름9", "이름10"};
        String[] explain = {"설명1", "설명2", "설명3", "설명4", "설명5", "설명6", "설명7", "설명8", "설명9", "설명10"};

        ListView listview ;
        ListAdapter adapter;

        // Adapter 생성
        adapter = new ListAdapter() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(adapter);


        for(int i=0; i<title.length; i++){
            adapter.addItem(ContextCompat.getDrawable(this, R.drawable.image03),
                    title[i], explain[i]) ;
        }

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ListItem li = (ListItem) adapterView.getItemAtPosition(i);
                String title = li.getTitle();
                Toast.makeText(MainActivity.this, title, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
