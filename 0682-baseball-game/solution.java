

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> score = new Stack<>();
        
        for (String op : operations) {
            if (op.equals("+")) {
                int top = score.pop();
                int newScore = top + score.peek();
                score.push(top); 
                score.push(newScore);
            } 
            else if (op.equals("D")) {
                score.push(2 * score.peek());
            } 
            else if (op.equals("C")) {
                score.pop();
            } 
            else {
                score.push(Integer.parseInt(op));
            }
        }
        
        // Sum up all the scores left in the stack
        int totalSum = 0;
        for (int temp : score) {
            totalSum += temp;
        }
        
        return totalSum;
    }
}
