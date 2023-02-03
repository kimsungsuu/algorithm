package infrenalgorithm.test;



public class Main {
    public int[] DFS(int n){

        int[] answer = new int[n];

        answer[0] = 1;
        answer[1] = 1;

        for(int i = 2; i < n; i++){
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();

        for(int x : T.DFS(10)) System.out.print(x + " ");
    }
}