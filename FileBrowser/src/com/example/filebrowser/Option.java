package com.example.filebrowser;

public class Option implements Comparable<Option> {
	private String sdname;
	private String sddata;
	private String sdpath;
	     
	    public Option(String n,String d,String p)
	    {
	        sdname = n;
	        sddata = d;
	        sdpath = p;
	    }
	    public String getName()
	    {
	        return sdname;}
	    public String getData() 
	    {
	        return sddata;
	    }
	    public String getPath()
	    {
	        return sdpath;
	    }
	    @Override
	    public int compareTo(Option o) {
	        if(this.sdname != null)
	            return this.sdname.toLowerCase().compareTo(o.getName().toLowerCase());
	        else
	            throw new IllegalArgumentException();
	    }
	}



