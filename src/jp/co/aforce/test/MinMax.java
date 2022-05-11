package jp.co.aforce.test;

public class MinMax {

	//最大値の取得
	int getMaxValue( int a, int b, int c )
	    	{
	   		int maximum;
	   		maximum = a;

	   		if ( maximum < b ) {
	   			maximum = b;
	   		}else if( maximum < c ) {
	   			maximum = c;
	   		}
	  		return maximum;
	   	    }

	//最小値の取得
	int getMinValue( int a, int b, int c )
			{
			int minimum;
			minimum = a;

			if ( minimum > b ) {
	   			minimum = b;
	   		}else if( minimum > c ) {
	   			minimum = c;
	   		}
	  		return minimum;
	   	    }

}
