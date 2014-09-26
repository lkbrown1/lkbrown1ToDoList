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
 * Email: Creates an Email Screen
 */

package com.example.lkbrown1todolist;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Email extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout. email_task);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.email, menu);
		return true;
	}
	
	//Creates the Action Bar
	
	public void List_Tasks(MenuItem menu){
		Toast.makeText(this, "Add Tasks", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, List_Tasks.class);
		startActivity(intent);
		
	}

	public void Main_Menu(MenuItem menu){
		Toast.makeText(this, "Main Menu", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, MainActivity.class);
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

	   