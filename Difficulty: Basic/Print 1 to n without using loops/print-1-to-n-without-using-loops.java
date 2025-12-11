

//User function Template for Java
class Solution{
    static void printTillN(int N){
        // i konw very well recursion
        
        // vishal rai
        if(N==0){
            return ;
        }
        //System.out.println(N); //print
        printTillN(N-1);
        System.out.print(N+" ");
    }
}