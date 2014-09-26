
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


/*Main Activity
 *Displays Main Screen On Startup. 
 *Creates Action Bar for Main Screen.  
 */

package com.example.lkbrown1todolist;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends Activity {
	 
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
   
}


@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
}

//Creates Action Bar
public void List_Tasks(MenuItem menu){
	Toast.makeText(this, "Add Tasks", Toast.LENGTH_SHORT).show();
	Intent intent = new Intent(this, List_Tasks.class);
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





