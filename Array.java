public class Array{
public static void main(String [] args){
    int [] intArray;
    intArray = new int[]{1,2,3,4,5};
    //if you don't know all Array elements, just say int[5] to declare 5 elements


    for (int i = 0; i < intArray.length; i++){
        System.out.println("Element at index " + i + 
        " : "+ intArray[i]);
    }
}
}