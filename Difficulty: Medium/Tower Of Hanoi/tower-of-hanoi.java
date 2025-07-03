class Solution {
    public static int towerOfHanoi(int n, int sou, int aux, int des) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int moves=towerOfHanoi(n-1,sou,des,aux);
        moves+=1;
        moves+=towerOfHanoi(n-1,aux,sou,des);
    
        return moves;
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int totalMoves=towerOfHanoi(n,1,2,3);
    }
}
