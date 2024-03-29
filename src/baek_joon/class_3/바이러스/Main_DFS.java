package baek_joon.class_3.바이러스;

import java.util.Scanner;

// 인접 행렬

/**
 * @Point count가 Null일 수도 있음
 * 감염되는 대상이 없을 수 있음
 * 인접행렬 할당할 때 Edge 기준으로 할당하지 않았다.
 * Count 출력을 print(dfs)로 해야했다.
 */
public class Main_DFS {

    static boolean[] visited;
    static int[][] matrix;
    static int count;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //노드 수 (컴퓨터)
        int n = sc.nextInt();
        //엣지 수
        int edge = sc.nextInt();

        // 엣지를 기준으로 인접 행렬 할당
        matrix = new int[n + 1][n + 1];
        for (int i = 1; i <= edge; i++) {
            int v1, v2;
            v1 = sc.nextInt();
            v2 = sc.nextInt();
            matrix[v1][v2] = 1;
            matrix[v2][v1] = 1;
        }

        /**
         * @Point: 1과 연결되어 있는가 , 1과 연결된 노드들과 연결된 또 다른 노드들 개수 카운트
         * 1을 시작노드로 dfs >> 연결된 모든 노드(컴퓨터)들을 끝까지 탐색해야 하므로
         * DFS 인접 행렬 재귀로 구현
         **/
        visited = new boolean[n + 1];

        // 시작 노드
        int start = 1;



        if (dfs(start) == 0) {
            System.out.println("0");
        } else {
            System.out.print(dfs(start));
        }

    }

    // DFS 인접행렬 재귀 구현
    private static int dfs(int Node) {
        // 방문 체크
        visited[Node] = true;
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[Node][i] == 1 && !visited[i]) {
                count++;
                dfs(i);
            }
        }
        if (count == 0) {
            return 0;
        }
        return count;
    }
}
