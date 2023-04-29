package hr;
public class Customer {
    public static void main(String args[]){
        int sum = 0;
        for( int i = 0 ; (i%2==0  &&  i<=5) ; i++) {
            sum = sum + i;
        }

        System.out.println("Sum is: "+sum);
    }
}

