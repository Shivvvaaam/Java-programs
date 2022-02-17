package arrays;

public class Rotatearray {
    public static void rotateLeft(int array[], int d, int n)   
{   
for (int i = 0; i < d; i++)   
//calling function without passing the number of rotations  
rotateArrayByOne(array, n);   
}   
public static void rotateArrayByOne(int array[], int n)   
{   
int i, temp;   
//temporary array to store the newly created array  
temp = array[0];   
for (i = 0; i < n - 1; i++)   
//shifts array element to the left by 1  
array[i] = array[i + 1];  
array[i] = temp;   
}   
public static void main(String args[])   
{   
//array to rotate  
int array[] = { 11, 22, 33, 44, 55, 66, 77 };   
//number of rotations to be performed  
//we can change the number of rotations accordingly  
int r = 1;  
//determines the length of array  
int n = array.length;  
System.out.println("Array before rotation: ");   
for(int i = 0 ; i < n ; i++)  
{  
//prints array before rotation  
System.out.print(array[i]+ " ");   
}  
System.out.println();  
rotateLeft(array, r, n);   
System.out.println("\nArray after left rotation: ");   
for(int i = 0 ; i < n ; i++)  
{  
//prints array after performing rotation      
System.out.print(array[i] + " ");  
}   
}   
}  