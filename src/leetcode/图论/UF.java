package leetcode.图论;

/**
 * @Author nilzxq
 * @Date 2020-09-11 12:56
 */
public class UF {
    private int count;
    private int[] parent;
    private int[] size;
    public UF(int n){
        this.count=n;
        parent=new int[n];
        size=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            size[i]=1;
        }
    }

    public void union(int p,int q){
        int rootP=find(p);
        int rootQ=find(q);
        if(rootP==rootQ){
            return;
        }
        if(size[rootP]>size[rootQ]){
            parent[rootQ]=rootP;
            size[rootQ]+=size[rootP];
        }else{
            parent[rootP]=rootQ;
            size[rootP]+=size[rootQ];
        }
        count--;
    }

    public boolean connected(int p,int q){
        return find(p)==find(q);
    }

    public int find(int x){
        while(parent[x]!=x){
            parent[x]=parent[parent[x]];
            x=parent[x];
        }
        return x;
    }

    public int count(){
        return count;
    }

    public boolean equationsPossible(String[] equations){
        //26个英文字母
        UF uf=new UF(26);
        //先让相等的字母形成连通图
        for(String eq:equations){
            if(eq.charAt(1)=='='){
                char x=eq.charAt(0);
                char y=eq.charAt(3);
                if(uf.connected(x-'a',y-'a')){
                    return false;
                }
            }
        }
        return true;
    }
}
