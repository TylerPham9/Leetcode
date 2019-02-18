import java.util.Map;
import java.util.HashMap;


public class EncodeAndDecodeTinyURL {
    Map<Integer, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(longUrl.hashCode(), longUrl);
        String temp = "http://tinyurl.com/"+ longUrl.hashCode();
        return temp;

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/","")));
    }
    public static void main(String[] args){
        EncodeAndDecodeTinyURL codec = new EncodeAndDecodeTinyURL();
        String url = "https://leetcode.com/problems/design-tinyurl";
//        System.out.println(codec.encode(url));
        codec.decode(codec.encode(url));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));