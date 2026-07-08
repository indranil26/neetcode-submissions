class Solution {
    public boolean isAnagram(String s, String t) {
       int[] f1=freqArray(s);
       int[] f2=freqArray(t);
       return Arrays.equals(f1,f2);
    }

    public int[] freqArray(String s){
       int[] freq=new int[26];
       for(int i=0;i<s.length();i++){
         freq[s.charAt(i)-'a']++;
       }
       return freq;
    }
}
