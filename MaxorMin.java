

public class MaxorMin { 



public static int getMaxValue(int[] arrayofName) {
  int  maxValue = arrayofName[0];
    for (int i = 1; i < arrayofName.length; i++) {
        if (arrayofName[i] > maxValue) {
            maxValue = arrayofName[i];
        }
    }
    return maxValue;
}


public static int getMinValue(int[] arrayofName) {
  int  minValue = arrayofName[0];
    for (int i = 1; i < arrayofName.length; i++) {
        if (arrayofName[i] < minValue) {
          minValue = arrayofName[i];
        }
    }
    return minValue;
}

  public static void main(String[] args) { 
       //instantiation 
       // show all operations here on myCalculator Object 

//getMinValue(arrayofName);
//getMaxValue(arrayofName);

int[] arrayofName;
Arrays.sort(arrayofName);
System.out.println("Minimum = " + arrayofName[0]);
System.out.println("Maximum = " + arrayofName[arrayofName.length-1]);


  /*    	MaxorMin john = new MaxorMin();
		john.getMinValue(5);
		john.getMaxValue(5);
      	System.out.println(john.minValue());
      	System.out.println(john.maxValue());*/
      }
  


}
