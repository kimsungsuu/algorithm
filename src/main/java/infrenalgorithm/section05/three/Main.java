package infrenalgorithm.section05.three;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(int n, int m, int[][] board, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int pos : moves){
            for(int i = 0; i < board.length; i++){
                if(board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer += 2;
                        stack.pop();
                    }else stack.push(tmp);
                    break;
                }
            }
        }



        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] board = new int[n+1][n+1];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];

        for(int i = 0; i < m; i++){
            moves[i] = in.nextInt();
        }

        System.out.print(T.solution(n, m, board, moves));
    }
}
