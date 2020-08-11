package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年5月9日 下午8:32:09
*类说明
*/


//作者：hlxing
//链接：https://leetcode-cn.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/solution/qing-xi-tu-jie-mo-neng-de-qian-zhui-he-by-hlxing/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
public class Problem_1292_BinarySearch_MaxSideLength {

	//二维前缀和
	public static int maxSideLength(int[][] mat,int threshold) {
		int m=mat.length,n=mat[0].length;
		int[][] dp=new int[m+1][n+1];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				dp[i][j]=mat[i-1][j-1]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
			}
		}
		int ans=0;
		for(int k=1;k<=Math.min(m, n);k++) {
			for(int i=1;i<=m;i++) {
				for(int j=1;j<=n;j++) {
					if(i-k<0||j-k<0) {
						continue;
					}
					int result=dp[i][j]-dp[i-k][j]-dp[i][j-k]+dp[i-k][j-k];
					if(result<=threshold) {
						ans=Math.max(ans, k);
					}
				}
			}

		}
		return ans;
	}

	//前缀和和二分
	static int m;
	static int n;
	static int[][] dp;
	public static int maxSideLength1(int[][] mat,int threshold) {
		m=mat.length;
		n=mat[0].length;
		dp=new int[m+1][n+1];
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				dp[i][j]=mat[i-1][j-1]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
			}
		}
		int ans=0;
		int left=0,right=Math.min(m,n);
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(help(mid,threshold)) {
				left=mid+1;
				ans=mid;
			}else {
				right=mid-1;
			}
		}
		return ans;
	}

    public static int maxSideLength2(int[][] mat, int threshold) {
        m = mat.length;
        n = mat[0].length;
        dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = mat[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            }
        }
        int l = 0, h = Math.min(m, n);
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (l == h || l + 1 == h) {
                break;
            }
            if (help(mid, threshold)) {
                l = mid;
            } else {
                h = mid - 1;
            }
        }
        if (help(h, threshold)) {
            return h;
        } else {
            return l;
        }
    }


	public static boolean help(int k,int threshold) {
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(i-k<0||j-k<0) {
					continue;
				}
				if(dp[i][j]-dp[i-k][j]-dp[i][j-k]+dp[i-k][j-k]<=threshold) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] mat= {{1,1,3,2,4,3,2},{1,1,3,2,4,3,2},{1,1,3,2,4,3,2}};
		int threshold=4;
		System.out.println(maxSideLength(mat,threshold));
		System.out.println(maxSideLength1(mat,threshold));
		System.out.println(maxSideLength2(mat,threshold));
	}

}
