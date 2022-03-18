import org.junit.Test;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testSolve(){
        Main main = new Main();
        int n; int[][] forces;
        n=3;
        forces = new int [][]{
                {5,1,-2},
                {-2,6,8},
                {-3,-7,-6}
        };     //Sum = {0,0,0}
        assertEquals("YES", main.solve(n,forces));

        n=5;
        forces = new int[][] {
                {0,1,5},
                {-100,6,35},
                {8,-7,100},
                {85,100,-48},
                {7,6,-93}
        };     //Sum = {0,0,-1}
        assertEquals("NO", main.solve(n,forces));

        n=1;
        forces = new int[][] {
                        {-100,100,0}
        };     //Sum = {-100,100,0}
        assertEquals("NO", main.solve(n,forces));

        n=1;
        forces = new int[][] {
                {0,0,0}
        };     //Sum = {0,0,0}
        assertEquals("YES", main.solve(n,forces));

    }
}


//
//
//
//    private Hashtable<Integer, int[][]> testcases = new Hashtable();
//
//    public void testSolve(){
//        Main main = new Main();
//        testcases.put(3, new int[][] {
//                {5,1,-2},
//                {-2,6,8},
//                {-3,-7,-6}
//        });     //Sum = {0,0,0}
//
//        testcases.put(5, new int[][] {
//                {0,1,5},
//                {-100,6,35},
//                {8,-7,100},
//                {85,100,-48},
//                {7,6,-93}
//        });     //Sum = {0,0,-1}
//
////        testcases.put(1, new int[][] {
////                        {-100,100,0}
////        });     //Sum = {-100,100,0}
//
//        testcases.put(1, new int[][] {
//                {0,0,0}
//        });     //Sum = {0,0,0}
//
//
//        for (Enumeration k = testcases.keys(); k.hasMoreElements();){
//
//        }
//    }