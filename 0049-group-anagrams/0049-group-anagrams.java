 class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String,List<String>> Map= new HashMap<>();
         for(String str : strs)
         {
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!Map.containsKey(key)){
            Map.put(key,new ArrayList<>());
            }
            Map.get(key).add(str);
         }
         return new ArrayList<>(Map.values());
    }
}