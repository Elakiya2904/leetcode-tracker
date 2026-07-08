// Last updated: 7/8/2026, 3:56:17 PM
class Solution {
    public String getHappyString(int n, int k) {
        List<String> res = new ArrayList<>();
        backtrack(n, "", res);
        Collections.sort(res);
        return k <= res.size() ? res.get(k - 1) : "";
    }
    
    private void backtrack(int n, String current, List<String> res) {
        if (current.length() == n) {
            res.add(current);
            return;
        }
        
        for (char c : new char[]{'a','b','c'}) {
            if (current.isEmpty() || current.charAt(current.length() - 1) != c) {
                backtrack(n, current + c, res);
            }
        }
    }
}
