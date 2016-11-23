package Utilities;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class factor 
{
	public static String inNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN);
	public static ArrayList<String> url = new ArrayList<String>();
	public static ArrayList<String> string = new ArrayList<String>();
	public static ArrayList<String> icon = new ArrayList<String>();
	public static Actions action;
	
	public static String inSheet="";
	public static String returnUrl="";
	public static String postComment ="";
	public static String found = new String();
	public static ArrayList<String> newFound = new ArrayList<String>();
	
	public static void clear()
	{
		factor.url.clear();
		factor.string.clear();
		factor.icon.clear();
	}
}
