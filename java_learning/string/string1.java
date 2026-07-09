import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class string1{

public static void main(String[] args){
       
Scanner sc = new Scanner(System.in);


String name ="deeksha garg";
// System.out.println(name);

//string are immjtable in nature , means you can not change them
String n ="deeksha"; // deeksha is assigned to n
// System.out.println(n);
n ="garg"; //here i m not changing the object deeksha of n, but given it garg also as a mmodification
// System.out.println(n);

String a ="deeksha";
String b ="deeksha";
// System.out.println(a == b); 
//true -- refernce to the same place in heap



String x = new String ("deeksha");
String y = new String ("deeksha");
// System.out.println(x == y);
//  //false -- refernce is differnt, have diff location in heap

// System.out.println(x.equals(y));
//  //true -- only for comparing the value not care  about refernece- it is a method-- even if u add space it give false == " deeksha "


//calling by indexing---
// System.out.println(x.charAt(0)); //d
// System.out.println(Arrays.toString(new int[]{1,2,3,4,5,6}));




// float experiments-----
// float aa = 456.2345f;
// System.out.printf("formatted number : %.2f", aa); 
// System.out.println(); 
// System.out.println(Math.PI); 
// System.out.printf("pie : %.3f",Math.PI); //upto 3 decimal points
// System.out.println(); 




// //string -- write like c++

// System.out.printf("Hello my name is %s and I am %s" , "deeksha" , "cool"); //upto 3 decimal points
// System.out.println(); 



//string concepts----------------------

// System.out.println("a" + "b"); //adding strings here -- ab
// System.out.println('a' +'b'); // here adding ASCII values 195
// System.out.println('a' + 3); // here adding ASCII values 100
// System.out.println((char)('a' + 3)); // here converting to character

// //it is same as after a few steps : "a" + "1"
// System.out.println("a" + 3); //integer will be converted to integer that will cal toString()

// System.out.println("kunal" + new ArrayList<>());
// System.out.println("kunal" + new Integer(45));



//series a to z --
String series = "";// adding char to string
for(int i =0 ; i<26 ; i++){
    char ch = (char)('a' + i) ; //we will get ASCII value and change it to character
    // System.out.println(ch);
    series += ch;
}
System.out.println(series + "");











    }
}