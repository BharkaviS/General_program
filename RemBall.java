/*

There are n balloons and m kids wearing a particular jersey number.Each balloon has a number written on it.
The kids can burst the balloon divisible by their jersey number.Return the remaining balloon number and if no balloons remain,
then print -1

Input:
15 3
30 77 66 76 85 21 53 97 42 53 83 83 60 19 67
4 7 1

Output:
-1

Input:
5 2
1 2 3 4 5
2 3

Output:
1 5

*/














import java.io.*;
import java.util.*;

public class RemBall{
  public int[] Rem(int m,int mstart,int n,int[] arr,int[] jer){

    int k=0,l=0,i=0;
    if(m==0){

      return arr;
    }
    int newarr[] = new int[n];
    int div = jer[mstart];
    mstart++;

    for(i=0;i<n;i++){
      if(arr[i]%div!=0){
        newarr[l++]=arr[i];
      }
    }

    return Rem(m-1,mstart,l,newarr,jer);
  }
  public static void main(String args[]){
    int n,m,i;
    int[] arr = new int[1001];
    int[] jer= new int[1001];
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    for(i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for(i=0;i<m;i++){
      jer[i]=sc.nextInt();
    }
    RemBall r = new RemBall();
    int[] a = r.Rem(m,0,n,arr,jer);
    int c=0;
      for(i=0;i<a.length;i++){
        if(a[i]!=0){
        System.out.print(a[i]+" ");
        c=1;
      }
      }
      if(c==0){
        System.out.print("-1");
      }


  }
}
