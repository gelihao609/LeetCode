import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringWithConcatenationOfAllWords {
	public List<Integer> findSubstring(String s, String[] words) {
        /* use DFS to try the words step into step for fitting. need to repeatly new hashtables
        HashSet<Integer> result = new HashSet<Integer>();
        if(words.length==0) return result;
        else{
            int len = words[0].length();
            ArrayList<String> wordlist = new ArrayList<String>(Arrays.asList(words));
            //int delta=1;
            for(int i=0;i<s.length()-len*words.length+1;i++)
            {
                helper(result,wordlist,s,i,len,i);
            }
        return new ArrayList<Integer>(result);
        }
    }
    private HashMap<String,Integer> getMap(List<String> words)
    {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<words.size();i++)
            {
                map.put(words.get(i),i);
            }
        return map;
    }
    
    private void helper(HashSet<Integer> result, List<String> words, String s, int charPos,  int len, int origin_index)
    {
        
        if(words.size()==0) result.add(origin_index);
        else{
                Map<String,Integer> map=getMap(words);
                if(map.containsKey(s.substring(charPos,charPos+len)))
                {
                    words.remove(s.substring(charPos,charPos+len));
                    helper(result, words,s,charPos+len,len,origin_index);
                    words.add(s.substring(charPos,charPos+len));
                }
                
            }*/
        //establish a hashMap contains all the words and counts
        HashMap<String,Integer> wordList = new HashMap<String,Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++)
        {
            if(!wordList.containsKey(words[i])) wordList.put(words[i],1);
            else wordList.put(words[i],wordList.get(words[i])+1);
        }
        int len = words[0].length();
        int num = words.length;
        //iterate through string
        for(int i=0;i<s.length()-len*num+1;i++)
        {
           HashMap<String,Integer> tempList = new HashMap<String,Integer>(wordList);
           int wordCounter=0;
           if(tempList.containsKey(s.substring(i,i+len))&&tempList.get(s.substring(i,i+len))>0)
           {
               tempList.put(s.substring(i,i+len),tempList.get(s.substring(i,i+len))-1);
               wordCounter++;
               //iterate through the substring
               for(int ii=1;ii<=num-1;ii++)
               {
                   if(tempList.containsKey(s.substring(i+ii*len,i+(ii+1)*len))&&tempList.get(s.substring(i+ii*len,i+(ii+1)*len))>0)
                   {
                      tempList.put(s.substring(i+ii*len,i+(ii+1)*len),tempList.get(s.substring(i+ii*len,i+(ii+1)*len))-1);
                        wordCounter++;
                   }
                    else break;
               }
               if(wordCounter==num) result.add(i);
           }
        }
        return result;
    }
}
