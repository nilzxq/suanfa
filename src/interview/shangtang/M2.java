package interview.shangtang;


import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-18 20:01
 */
public class M2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ax=sc.nextDouble();
        double ay=sc.nextDouble();
        int num=sc.nextInt();
        double[][] grid=new double[num][2];
        for(int i=0;i<num;i++){
            grid[i][0]=sc.nextDouble();
            grid[i][1]=sc.nextDouble();
            sc.nextLine();
        }
        System.out.println(dist(ax,ay,grid)/num);
    }

    public static double dist(double ax,double ay,double[][] grid){
        double x=0,y=0;
        double res=0;
        for(int i=0;i<grid.length;i++){
            if(i!=grid.length-1){
                 x=grid[i+1][0]-grid[i][0];
                 y=grid[i+1][1]-grid[i][0];
            }else if(i==grid.length-1){
                 x=grid[i][0]-grid[0][0];
                y=grid[i][1]-grid[0][0];
            }
            double a=ax-grid[i][0];
            double b=ay-grid[i][1];
            double sx=x*a+y*b;
            double dis=x*x+y*y;
            double Dx=grid[i][0];
            double Dy=grid[i][1];
            if(dis!=0){
                double t=sx/dis;
                if(t>=1){
                    Dx=i+1==grid.length-1?grid[i][0]:grid[i+1][0];
                    Dy=i+1==grid.length-1?grid[i][1]:grid[i+1][1];
                }else if(t>0){
                    Dx=grid[i][0]+x*t;
                    Dy=grid[i][1]+y*t;
                }else{
                    Dx=grid[i][0];
                    Dy=grid[i][1];
                }
            }
            double resx=Dx-ax,resy=Dy-ay;
            res+=Math.sqrt(resx*resx+resy*resy);
        }
        return res;
    }
}
