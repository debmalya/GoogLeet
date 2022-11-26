package daily;

import java.util.Arrays;

public class RectangleArea {
	
	public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int[] x = new int[]{ax1,ax2,bx1,bx2};
        int[] y = new int[]{ay1,ay2,by1,by2};
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        return 
        // area of first rectangle
        (Math.abs(ax2-ax1) * Math.abs(ay2-ay1)) + 
        // area of second rectangle
        (Math.abs(bx2-bx1) * Math.abs(by2-by1)) 
          - (Math.abs(x[2] - x[1])* Math.abs(y[2]-y[1]));
    }

}
