import java.util.*;

// This question could have been done with a stack as well


class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < mat.length; i++){
            queue.offer(i);
        }
        
        while(queue.size() > 1){
            int personA = queue.poll();
            int personB = queue.poll();
            if(mat[personA][personB] == 1){
                queue.offer(personB);
            }
            else{
                queue.offer(personA);
            }
        }
        
        if(queue.isEmpty()){
            return -1;
        }
        
        int celebrityCandidate = queue.poll();
        
        for(int i = 0; i < mat.length; i++){
            if(i != celebrityCandidate && (mat[i][celebrityCandidate] == 0 || mat[celebrityCandidate][i] == 1)){
                return -1;
            }
        }
        
        return celebrityCandidate;
    }
}