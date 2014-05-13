package com.example.menus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MenuDemo extends Activity implements OnMenuItemSelectedListener{
	
	//Global Variables
	private CustomMenu cMenu;
	public static final int MENU_ITEM_1 = 1;
	public static final int MENU_ITEM_2 = 2;
	public static final int MENU_ITEM_3 = 3;
	public static final int MENU_ITEM_4 = 4;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_demo);
		
		//Initialize the menu
		cMenu = new CustomMenu(this, this, getLayoutInflater());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_demo, menu);
		return true;
	}

}
