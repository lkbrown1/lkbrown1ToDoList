package com.example.lkbrown1todolist;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Archive extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.archive_task);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.archive, menu);
		return true;
	}
	
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
	public void Main_Menu(MenuItem menu){
		Toast.makeText(this, "Main Menu", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(this, MainActivity.class);
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
