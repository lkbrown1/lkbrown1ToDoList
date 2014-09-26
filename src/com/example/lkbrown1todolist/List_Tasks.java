/* lkbrown1ToDoList: Write down all your to-do items and check them off when they are done
Copyright (C) 2014  Leah Brown lkbrown1@ualberta.ca

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

/*
 * List Tasks: Creates the Add Task Menu
 * Adds Tasks To an ListArray
 * 
 */
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
	 //declaring variables
	 EditText editText; 
	 Button button;
	 ListView listView;
	 ArrayList<String> arrayList;
	 ArrayAdapter<String> arrayAdapter;
	 
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		//Creating the List
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_task);
		 editText = (EditText) findViewById(R.id.addTaskTextBox);
		  button = (Button) findViewById(R.id.addButtonScreen);
		  listView = (ListView) findViewById(R.id.addList);
		  arrayList = new ArrayList<String>();//initialize array list
		  arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
		  
		  listView.setAdapter(arrayAdapter);
		  listView.setOnItemClickListener(new OnItemClickListener() {
		   
			  
		   //adds Task to the List
		   @Override
		   public void onItemClick(AdapterView parent, View v, int arg2, long arg3) {
		    String item = arrayList.get(arg2);
		    Toast.makeText(getApplicationContext(), item, 0).show();
		   }
		  });
		  button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				String item = editText.getText().toString();
				arrayList.add(item);
				arrayAdapter.notifyDataSetChanged();
             	editText.setText("");
             	
             // The following code was modified from  https://developer.android.com/training/basics/data-storage/files.html
             	String filename = "myfile";
             	FileOutputStream outputStream;           	
             	File file = new File(getFilesDir(), filename); 
             	try {
             	  outputStream = openFileOutput(filename, Context.MODE_PRIVATE); 
             	  outputStream.write(item.getBytes()); 
             	  outputStream.close();
             	} catch (Exception e) {
             	  e.printStackTrace();
             	} 
				
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

