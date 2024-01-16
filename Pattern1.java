

// fd3ba60bd40b4f7d\redhat.java\jdt_ws\Patterns_2c150408\bin' 'Pattern1' 
//  * * * * 
//   * * *
//    * *
//     *

public class Pattern1 {

    public static void main(String[] args) {
        
        for(int i = 1; i<=5; i++)
        {
            for(int j = 1;j<=5;j++)
            {
                if(i>j)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
    
}
