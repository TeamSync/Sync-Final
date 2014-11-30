/**
 * 
 */
package com.syncteam.sync;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * @author Jessica
 *this method is the one that should be able to populate the layout, using an array
 *we can create an Array within the .java file for the received videos button
 *whenever anything resembling the right format comes through, it accepts it
 */
public class ScrollThroughTextMessages {

	private ListView lv;
	
	public void onCreate(Bundle saveInstanecState){
		setContentView(R.layout.our_layout); //need to find out what our layout name is
		
		lv = (ListView)findViewById(R.id.your_list_view_id);
		
		//Instanciating an array list (you don't need to do this,
		//you already have your).
		
		List<String> your_array_list = new ArrayList<String>();
		
		//this is where we for loop in teh received SMS messages
		
		while (SMS exists)
		{
			if 
			{
				//SMS message is in the right format
			}
		}
		
		//your_array_list.add("foo"); //what should really be here?
		//your_array_list.add("bar");
		
		//This is the array adapter, it takes the context of the activity as a
		//first parameter, the type of list view as a second
		//and the array as a third
		
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this, 
                android.R.layout.simple_list_item_1,
                your_array_list );
		
				lv.setAdapter(arrayAdapter);

				
		
		

	}

}


