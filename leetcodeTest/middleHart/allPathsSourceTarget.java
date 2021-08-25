package middleHart;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcodeTest
 * @description: 797. 所有可能的路径
 * @author: Fuwen
 * @create: 2021-08-25 22:09
 **/
public class allPathsSourceTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // 1. DFS
        List<List<Integer>> ans = new ArrayList<>();
        dfs(graph,0,new ArrayList<Integer>(){{add(0);}},ans);
        return ans;
    }
    public void dfs(int[][] graph,int idx,List<Integer> temp,List<List<Integer>> ans){
        if (idx==graph.length-1){
            ans.add(new ArrayList<>(temp));
            temp=new ArrayList<Integer>();
            return;
        }
        for (int next : graph[idx]){
            temp.add(next);
            dfs(graph,next,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}
