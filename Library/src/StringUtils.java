
public class StringUtils {
	public static boolean included(String word, String searched) {
		String w = word.toUpperCase();
		String s = searched.toUpperCase();
		String t = s.trim();
		if(w.contains(t)) {
			return true;
		}
		return false;
	}

}
