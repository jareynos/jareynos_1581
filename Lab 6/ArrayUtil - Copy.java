public class ArrayUtil {


 public static String[] resize( String[] array){
 String[] value= new String[array.length*2];
 for(int x=0;x<value.length;x++){
 if(x<array.length){
 value[x]=array[x];
 }else{
 value[x]=null;
 }
 }
 return value;
 }
 public static String[] add(String element, String[] array){
 for(int x=0;x<array.length;x++){
 if (array[x]==null){
 array[x]=element;
 return array;
 }
 }
 String newArray[]=new String[array.length*2];
 for(int x=0;x<array.length;x++){
 newArray[x]=array[x];
 }
 newArray[array.length]=element;
 return newArray;
 }
 public static boolean contains(String element, String[] array){
 int value=0;
 for(int x=0;x<array.length;x++){
 if(element.equals(array[x]))
 value=1;}

 if(value==1){
 return true;
 }
 return false;}
 public static int findMinValue(int[] array){
 int min=array[0];
 for(int num : array){
 if(num<min)min=num;
 }
 return min;
 }
 public static int findMaxValue(int[] array){
 int max=array[0];
 for(int num : array){
 if(num>max)max=num;
 }
 return max;
 }

}