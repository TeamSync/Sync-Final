package com.syncteam.sync;

import android.app.Application;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tutorial2 extends ListActivity {
	
	String classNames[] = { "main", "stuff2", "Sweet", "TutorialOne"};
	//This will be replaced with arrayFinal[]... 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, classNames));
		//setContentView(R.layout.received_list);
	}
	
	//All of the code after this comment only redirects objects on the list to actual methods.. its not relevant
	
	/*protected void onListItemClick(ListView lv, View v, int position, long id)
	{
		super.onListItemClick(lv, v, position, id);
		String openClass = classNames[position];
		//Setting up a class object.. 
		try
		{
			Class selected = Class.forName("com.syncteam.sync" + openClass);
			Intent selectedIntent = new Intent(this, selected);
			startActivity(selectedIntent);
		} 
		catch (ClassNotFoundException e)
				{
			e.printStackTrace();
				}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
