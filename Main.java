import java.util.*;
public class Main {
	
	 public static int[] readArray(int[] numArray) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++) {
            array[i]=sc.nextInt();
        }
        return array;
    }
    
    public static void printArray(int[] numArray) {
        int n=numArray.length;
        for(int i=0;i<n;i++) {
            System.out.println(numArray[i]);
        }
    }
    
    public static int searchArray(int[] numArray,int element) {
    	int position=-1;
    	for(int i=0;i<numArray.length;i++)
    	{
    		if(numArray[i]==element) {
    			position=i+1;
    		}
    	}
		return position; 
    }
    
    public static int[] sortArray(int[] numArray) {
    	Arrays.sort(numArray);
    	return numArray;
    }
    
    public static int[] insertArray(int[] numArray,int element,int position) {
    	int n=numArray.length;
    	int[] newArray=new int[n+1];
    	if(position<0 || position>n+1) {
    		return numArray;
    	}
    	for(int i=0;i<n+1;i++) {
    		if(i<position-1) {
    			newArray[i]=numArray[i];
    		}
    		else if(i==position-1) {
    			newArray[i]=element;
    		}
    		else {
    			newArray[i]=numArray[i-1];
    		}
    		
    	}
    	return newArray;
    	
    	
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello, World!");
        int[] numArray=new int[100];
        //reading
        numArray=readArray(numArray);
        //printing
        printArray(numArray);
        //searching
        int pos=searchArray(numArray,3);
        System.out.println(pos);
        //sorting
        numArray=sortArray(numArray);
        printArray(numArray);
        //Inserting
        
        int element=sc.nextInt();
        int position=sc.nextInt();
        numArray=insertArray(numArray,element,position);
        printArray(numArray);
        
	}
}
