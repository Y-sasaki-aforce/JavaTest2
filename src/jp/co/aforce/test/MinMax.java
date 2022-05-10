package jp.co.aforce.test;

public class MinMax {

	int getMaxValue( int a, int b, int c )
	    	{
	   		int maximum;
	   		maximum = a;
	   		if ( maximum < b ) maximum = b;
	  		if ( maximum < c ) maximum = c;
	  		return maximum;
	   	}


	int getMinValue( int a, int b, int c )
	{
		int minumum;
		minumum = a;
		if ( minumum > b ) minumum = b;
		if ( minumum > c ) minumum = c;
		return minumum;
	}

}
