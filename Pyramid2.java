

// fd3ba60bd40b4f7d\redhat.java\jdt_ws\Patterns_2c150408\bin' 'Pyramid2' 
//     **
//    ****
//   ******
//  ********
// **********

public class Pyramid2 {

    public static void main(String[] args) {
        
        for(int i =1;i<=5;i++)
        {
            for(int j =1; j<=5-i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
