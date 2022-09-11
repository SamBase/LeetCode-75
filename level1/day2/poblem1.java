import java.util.Dictionary;
import java.util.Hashtable;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        //check length
        if(S.length != T.length) return false;

        Dictionary dic = new Hashtable<>();
        for (int i = 0; i < S.length; i++) {
            if(dic.get(S[i]) == null){
                dic.put(S[i], T[i]);
            }else if(dic.get(S[i]) != T[i]) {
                return false
            }
        }
        return true;
    }
}