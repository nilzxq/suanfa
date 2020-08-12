package leetcode.技巧题;

/**
 *
 * 逆向思维
 * @Author nilzxq
 * @Date 2020-08-12 15:18
 */
public class 矩阵重叠 {
    public boolean isRectangleOverlap(int[] rec1,int[] rec2){
        return !(rec1[2] <= rec2[0] ||   // left
                rec1[3] <= rec2[1] ||   // bottom
                rec1[0] >= rec2[2] ||   // right
                rec1[1] >= rec2[3]);    // top
    }
}
