// Last updated: 7/8/2026, 3:55:47 PM
class Solution {
    public int maxDistance(String moves) {
        int x=0,y=0,q=0;
        for (char ch:moves.toCharArray()){
            if(ch=='U')y++;
            else if(ch=='D')y--;
            else if(ch=='R')x++;
            else if(ch=='L')x--;
            else q++;
        }
        int dist=Math.abs(x)+Math.abs(y);
        return dist+q;
    }
}