package com.example.espressosameids

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemClickListener
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(),OnItemClickListener {
    private val TAG = MainActivity::class.java.simpleName + "lihlk"
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var myResArray: Array<String>
     lateinit var listView:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView=findViewById(R.id.listView)
        myResArray = getResources().getStringArray(R.array.item_list);
        adapter =
             ArrayAdapter <String>(this, android.R.layout.simple_list_item_1, myResArray);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        Log.d(TAG, "dsfsadfsxccc: ");
    }


    override fun onItemClick(p0: AdapterView<*>?, view: View?, i: Int, p3: Long) {
        var tv =view?.findViewById<TextView> (android.R.id.text1);
        tv?.setText(myResArray[i] + " clicked");
        Toast.makeText(this, myResArray[i], Toast.LENGTH_SHORT).show();
    }
}