import java.util.*;


public class PowerSet {

    List<String> ans = new ArrayList<>();

    public void solve(String s, int idx, String curr) {

        if(idx == s.length()){
            ans.add(curr);
            return;
        }
        solve(s, idx + 1, curr);
        solve(s, idx + 1, curr + s.charAt(idx));

    }
    public List<String> AllPossibleStrings(String s) {

        solve(s, 0, "");
        Collections.sort(ans);
        return ans;
    }
}