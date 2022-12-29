package interview.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class FindSubstrings {

	String[] solution(String[] words, String[] parts) {
		String[] returnString = new String[words.length];
		return returnString;
	}
	
	class TrieNode {
		char c;
		SortedSet<TrieNode> children = new TreeSet<>();
		
		public TrieNode(char c) {
			this.c = c;
		}
		
		public void addNode(TrieNode trieNode) {
			children.add(trieNode);
		}
	}
	
    String[] solution0(String[] words, String[] parts) {
        parts = sortPartsByLength(parts);
        String[] returnString = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String each = words[i];
            List<String> matchingStrings = new ArrayList<>();
            int max = 0;
            for (String eachParts : parts) {
                if (eachParts.length() < max){
                    break;
                }
                int startingPosition = each.indexOf(eachParts);

                if (startingPosition > -1) {
                    String candidateString = String.format("%s[%s]",each.substring(0, startingPosition),each.substring(startingPosition, startingPosition + eachParts.length()));
                    if (startingPosition + eachParts.length() < each.length()) {
                        candidateString = String.format("%s%s",candidateString,each.substring(startingPosition + eachParts.length()));
                    }
                    if (eachParts.length()> max) {
                        matchingStrings.clear();
                        max = eachParts.length();
                        matchingStrings.add(candidateString);
                    }else if (eachParts.length() == max){
                        matchingStrings.add(candidateString);
                    }
                }
            }


            if (matchingStrings.isEmpty()) {
                returnString[i] = words[i];
            }else{
                Collections.sort(matchingStrings);
                returnString[i] = matchingStrings.get(0);
            }

        }
        return returnString;
    }

    public String[] sortPartsByLength(String[] parts) {
        Comparator<String> partsComparator = (a, b) -> {
            if (a.length() > b.length()) {
                return -1;
            } else if (a.length() < b.length()) {
                return 1;
            }
            return 0;
        };

        List<String> partsList = Arrays.asList(parts);
        Collections.sort(partsList, partsComparator);
        return partsList.toArray(new String[0]);
    }

}
