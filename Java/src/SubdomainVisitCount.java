import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String domain: cpdomains) {
            int space = domain.indexOf(' ');
            int visits = Integer.valueOf(domain.substring(0, space));

            String s = domain.substring(space + 1);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.') {
                    String d = s.substring(i + 1);
                    map.put(d, map.getOrDefault(d, 0 ) + visits);
                    }
                }
            map.put(s, map.getOrDefault(s, 0 ) + visits);
            }

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : map.entrySet()){
            result.add(pair.getValue() + " " + pair.getKey());
        }
        return result;

    }
    public static void main(String[] args){
        SubdomainVisitCount s = new SubdomainVisitCount();
        String[] input = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        s.subdomainVisits(input);
    }
}
