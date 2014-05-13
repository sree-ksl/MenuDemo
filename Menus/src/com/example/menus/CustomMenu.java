package com.example.menus;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.widget.PopupWindow;

//This class manages the menu items and pop up window

public class CustomMenu {
	
	//some global variables
	private ArrayList<CustomMenuItem> menuItems;
	private OnMenuItemSelectedListener mListener = null;
	private Context context = null;
	private LayoutInflater layoutInflater = null;
	private PopupWindow popupWindow = null;
	private boolean isShowing = false;
	private boolean hideOnSelect = true;
	private int mRows = 0;
	private int mItemsPerLineInPotraitOrientation = 3;
	private int mItemsPerLineInLandscapeOrientation = 6;
	
	//Interface for returning item clicked
	public interface OnMenuItemSelectedListener{
		public void MenuItemSelectedEvent(CustomMenuItem selection);
	}
	
	//Method to determine if menu is currently displayed to user 
	public boolean isShowing(){
		return isShowing;
	}
	
	//Control menu closing after an item is selected
	public void setHideOnSelect(boolean doHideOnSelect){
		hideOnSelect = doHideOnSelect;
	}
	
	//Method to decide how many menu items on one single line(mostly for landscape orientation)
	public void setItemsPerLineInLandscapeOrientation(int count){
		mItemsPerLineInLandscapeOrientation = count;
	}
	
	//method to assign menu items.can be called only when menu is hidden
	public synchronized void setMenuItems(ArrayList<CustomMenuItem> items) throws Exception{
		if(isShowing){
			throw new Exception("Menu list may not be modified when menu is displayed");
		}
		menuItems = items;
		}
	
	
	

}
