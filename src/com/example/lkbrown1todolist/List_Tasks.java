package com.example.lkbrown1todolist;


import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class List_Tasks extends Activity  {
	 //testing
	 EditText et;
	 Button b;
	 ListView lv;
	 ArrayList<String> al;
	 ArrayAdapter<String> aa;
	 
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_task);
		 et = (EditText) findViewById(R.id.addTaskTextBox);
		  b = (Button) findViewById(R.id.addButtonScreen);
		  lv = (ListView) findViewById(R.id.addList);
		  al = new ArrayList<String>();//initialize array list
		  aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, al);
		  
		  lv.setAdapter(aa);
		  lv.setOnItemClickListener(new OnItemClickListener() {
		   @Override
		   public void onItemClick(AdapterView parent, View v, int arg2, long arg3) {
		    String item = al.get(arg2);
		    Toast.makeText(getApplicationContext(), item, 0).show();
		   }
		  });
		  b.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				String item = et.getText().toString();
				al.add(item);
				aa.notifyDataSetChanged();
             	et.setText("");
             	
             	String filename = "myfile";// used this line from here to // from  https://developer.android.com/training/basics/data-storage/files.html
             	FileOutputStream outputStream;

             	
             	File file = new File(getFilesDir(), filename); 
             	
             	
             	try {
             	  outputStream = openFileOutput(filename, Context.MODE_PRIVATE); 
             	  outputStream.write(item.getBytes()); 
             	  outputStream.close();
             	} catch (Exception e) {
             	  e.printStackTrace();
             	} //
				
			}

			
		  });
		  

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list__tasks, menu);
		
		return true;
	}


	
	public void Main_Menu(MenuItem menu){
		Toast.makeText(this, "Main Menu", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

	public void Email(MenuItem menu){
		Toast.makeText(this, "Email Tasks", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, Email.class);
		startActivity(intent);
		
	}
	public void Archive(MenuItem menu){
		Toast.makeText(this, "Archive", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, Archive.class);
		startActivity(intent);
	}
	
	

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
       
        return super.onOptionsItemSelected(item);
    }
}

