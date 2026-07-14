
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, ArrayList<String>> map=new HashMap<>();
         for(int i=0;i<strs.length;i++){
            String sortedString=sortString(strs[i]);
            if(!map.containsKey(sortedString)){
               map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(strs[i]);
         }
         return new ArrayList<>(map.values());
    }

    public String sortString(String str){
        char[] sortedCharArray=str.toCharArray();
        Arrays.sort(sortedCharArray);
        String sortedStr=new String(sortedCharArray);
        return sortedStr;
    }
}