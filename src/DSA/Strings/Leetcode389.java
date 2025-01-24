class Solution {
    public char findTheDifference(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i = 0 ; i<ch2.length ; i++){
            if(i<ch1.length && ch1[i]!=ch2[i]){
                return ch2[i];
            }
        }
        return ch2[ch2.length-1];
    }
}
