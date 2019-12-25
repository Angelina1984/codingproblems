import org.json.simple.JSONObject;

import java.util.*;
import java.lang.*;

public class FlattenNestedDictionary {

    public static void main(String[] args) {
        JSONObject dict = new JSONObject();
        JSONObject bar = new JSONObject();
        JSONObject foo = new JSONObject();
        JSONObject result = new JSONObject ();

        dict.put("key", 3);
        dict.put("foo", foo);

        foo.put("a", 5);
        foo.put("bar", bar);

        bar.put("baz", 8);
        flattenNestedDictionary(dict, result, "");

        System.out.println(result.toJSONString());
    }
    
    public static void flattenNestedDictionary(JSONObject dict, JSONObject result, String appender){    
      Iterator iterator = dict.entrySet().iterator();      
      while(iterator.hasNext()){      
          Map.Entry<String, JSONObject> entry = (Map.Entry<String, JSONObject>) iterator.next();        
          if(entry.getValue() instanceof JSONObject){
            flattenNestedDictionary(entry.getValue(), result, appender + entry.getKey() + ".");
          } else {
              result.put(appender + entry.getKey(), entry.getValue());
          }
       }
    }
