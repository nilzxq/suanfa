package blog;


/**
 * blog:
 * https://maimai.cn/article/detail?fid=282008996&from=single_feed&share_user=http%3A%2F%2Fi9.taou.com%2Fmaimai%2Fp%2F3551%2F6064_74_r19NhTNtVkThdN-a160
 * @author ZXQ20
 *
 */
public class EightQueen {
 //棋盘格子的范围，以及皇后数量
public static final int MAX_NUM=8;
//二维数组作为棋盘 
//由于这里使用的是int数组，int的初始值是0，代表没有落子。当有皇后放置的时候，对应的元素值改为1。
public int chessBoard[][]=new int[MAX_NUM][MAX_NUM];
//检查落子是否符合规则
public boolean Check(int x,int y) {
	for(int i=0;i<y;i++) {
		//检查纵向
		if(chessBoard[x][i]==1) {
			return false;
		}
		//检查左侧斜向
		if(x-1-i>=0&&chessBoard[x-i-1][y-i-1]==1) {
			return false;
		}
		//检查右侧斜向
		if(x+1+i<MAX_NUM&&chessBoard[x+1+i][y-1-i]==1) {
			return false;
		}
	}
	return true;
}

//递归回溯
public boolean settleQueen(int y) {
	//行数超过8，说明已经找到答案
	if(y==MAX_NUM) {
		return true;
	}
	//遍历当前行，逐一格子验证
	for(int i=0;i<MAX_NUM;i++) {
		//为当前行清零，以免在回溯的时候出现脏数据
		for(int x=0;x<MAX_NUM;x++) {
			chessBoard[x][y]=0;
		}
		//检查是否符合规则，如果符合，更改元素值并进一步递归
		if(Check(i, y)) {
			chessBoard[i][y]=1;
			//递归如果返回true，说明下层已经找到解决，无需继续循环
			if(settleQueen(y+1)) {
				return true;
			}
		}
	}
	return false;
}

//打印棋盘
public void printChessBoard() {
	for(int j=0;j<MAX_NUM;j++) {
		for(int i=0;i<MAX_NUM;i++) {
			System.out.print(chessBoard[i][j]);
		}
		System.out.println();
	}
}

public static void main(String[] args) {
	EightQueen queen8=new EightQueen();
	queen8.settleQueen(0);
	queen8.printChessBoard();
}
}
