// Last updated: 7/8/2026, 3:57:04 PM
class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer>s1=new Stack<>();
       for(String op:operations){
        if(op.equals("+")){
            int last=s1.pop();
            int add=last+s1.peek();
            s1.push(last);
            s1.push(add);
        }
        else if(op.equals("D")){
            s1.push(s1.peek()*2);
        }
        else if(op.equals("C")){
            s1.pop();
        }
        else{
            s1.push(Integer.parseInt(op));
        }
       }
       int sum=0;
       while(!s1.isEmpty()){
        sum+=s1.pop();
       } 
       return sum;
    }
}