package Recursion;
import java.util.*;
public class getMazePathJumps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        ArrayList<String> ans = getmazepathjumps(1, 1, m, n);
        System.out.println(ans);
    }
    //sr-> source row
    //sc-> source column
    //dr-> destination row
    //dc-> destination column
    //ms-> move size
    public static ArrayList<String> getmazepathjumps(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        //horizontal move
        ArrayList<String> paths = new ArrayList<String>();
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths=getmazepathjumps(sr,sc+ms,dr,dc);
            for(String hpath : hpaths){
                paths.add("h"+ms+hpath);
            }
        }
        //vertical move
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths=getmazepathjumps(sr+ms,sc,dr,dc);
            for(String vpath : vpaths){
                paths.add("v"+ms+vpath);
            }
        }
        //diagonal move
        for (int ms = 1; ms <= dc - sc && ms<= dr- sr; ms++) {
            ArrayList<String> dpaths=getmazepathjumps(sr+ms,sc+ms,dr,dc);
            for(String dpath : dpaths){
                paths.add("d"+ms+dpath);
            }
        }
        return paths;
    }
}
/*
input
3
3
output :
[h1h1v1v1, h1h1v2, h1v1h1v1, h1v1v1h1, h1v1d1, h1v2h1, h1d1v1, h2v1v1, h2v2, v1h1h1v1, v1h1v1h1, v1h1d1, v1h2v1, v1v1h1h1, v1v1h2, v1d1h1, v2h1h1, v2h2, d1h1v1, d1v1h1, d1d1, d2]

 */