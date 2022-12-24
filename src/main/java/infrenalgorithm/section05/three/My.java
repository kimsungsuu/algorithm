package infrenalgorithm.section05.three;

import java.util.Scanner;
import java.util.Stack;

public class My {

    public int solution(int n, int m, int[][] board, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < 2; i++){
            int p = moves[i];
            for(int j = 1; j <= n; j++){
                if(board[j][p] != 0) {
                    stack.push(board[j][p]);
                    board[j][p] = 0;
                    break;
                }
            }

        }

        for(int i = 2; i < moves.length; i++){
            int p = moves[i];
            for(int j = 1; j <= n; j++){
                if(board[j][p] != 0) {

                    if(stack.peek() != board[j][p]) stack.push(board[j][p]);
                    else {
                        stack.pop();
                        answer += 2;
                    }

                    board[j][p] = 0;
                    break;
                }
            }
//            System.out.println(stack.get(i-2) + " " + stack.get(i-1));

        }

        System.out.println(stack);
        return answer;

    }

    public static void main(String[] args) {
        My T = new My();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] board = new int[n+1][n+1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
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
