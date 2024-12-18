import  java.io.*;
import  java.util.*;

public  class   first {
    public   static   void   main(String[]    args)   throws   IOException    {
        ArrayList<long[]>      intrvls       =    new   ArrayList<>();
        for (int P=2;P<=10;P++) {
            long   pwr=1;
            for (int    i=1;i<P;i++) pwr*=10;
            long T=5*pwr; 
            long rpt = (pwr-1)/9; 
            long lent=5*rpt;
            long start=T-lent;
            long end=T-1;
            intrvls.add(  new    long[]{start,end});
        }

        BufferedReader    br=new BufferedReader(new InputStreamReader(System.in));
        int  T    =Integer.parseInt(br.readLine());
        for(int _i=0;_i<T;_i++) {
            long N= Long.parseLong(br.readLine());
            long ct =0;
            if(  N>=2){
                for(long[]interval:intrvls) {
                    long start=interval[0];
                    long end=interval[1];
                    if(end<2)continue;
                    if(start>N)continue;
                    long from=Math.max(start,2);
                    long to=  Math.min(end,N);
                    if(to>=from) {
                        ct+=(to-from+1);
                    }
                }
            }
            System.out.println(ct);
        }
    }
}
