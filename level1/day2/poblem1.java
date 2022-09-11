//205. Isomorphic Strings
import java.util.Dictionary;
import java.util.Hashtable;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();

        //check length
        if(S.length != T.length) return false;

        Dictionary dicS = new Hashtable<>();
        Dictionary dicT = new Hashtable<>();
        for (int i = 0; i < S.length; i++) {
            if(dicS.get(S[i]) == null){
                dicS.put(S[i], T[i]);
            }
            if(dicT.get(T[i]) == null){
                dicT.put(T[i], S[i]);
            }
            if(dicS.get(S[i]).toString().charAt(0) != T[i] || dicT.get(T[i]).toString().charAt(0) != S[i]) {
                return false;
            }
        }
        return true;
    }
}