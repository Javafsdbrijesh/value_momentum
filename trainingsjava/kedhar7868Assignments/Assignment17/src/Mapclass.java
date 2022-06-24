
import java.util.Map;
import java.util.HashMap;

class Mapclass
{
	public static void main(String[] arg)
	{
		Map<String,String> gfg = new HashMap<String,String>();
	
		
		gfg.put("Company", "Valuemomentum");
		gfg.put("Location", "Loaction@Hyderabad");
		gfg.put("Designation", "Softyware Engineer");
		gfg.put("Skills", "JAva,Cloud");
		
		
		for (Map.Entry<String,String> entry : gfg.entrySet())
			System.out.println("Key = " + entry.getKey() +
							", Value = " + entry.getValue());
	}
}
