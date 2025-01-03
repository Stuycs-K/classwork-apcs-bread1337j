

class bebra{
	int x;
	String val;
	public bebra(int n, String s){
		x = n;
		val = s;
	}
}

public class toWords {

	static bebra[] map = new bebra[]{
		new bebra(1, "one"),
		new bebra(2, "two"),
		new bebra(3, "three"),
		new bebra(4, "four"),
		new bebra(5, "five"),
		new bebra(6, "six"),
		new bebra(7, "seven"),
		new bebra(8, "eight"),
		new bebra(9, "nine"),
		new bebra(10, "ten"),
		new bebra(11, "eleven"),
		new bebra(12, "twelve"), //base 10 language look inside numbers base 12
		//missing the 10s, could definitely implement in code but will not do that
		new bebra(100, "hundred"),
		new bebra(1000, "thousand"),
		new bebra(1000000, "million")
	};

	//static Map<Integer, String> base12 = new HashMap<Integer, String>();
	//base12.put(Integer.valueOf(1), "one"); 
	//base12.put(2, "two"); base12.put(3, "three"); base12.put(4, "four"); base12.put(5, "five"); base12.put(6, "six"); base12.put(7, "seven"); base12.put(8, "eight"); base12.put(9, "nine"); base12.put(10, "ten"); base12.put(11, "eleven"); base12.put(12, "twelve");

	public static String toWords(int n){
		StringBuilder out = new StringBuilder();
		for(int i=map.length-1; i>=0; i--){
			if(n/map[i].x > 0){
				out.append(" ");
				//out.append(base12.get(n / map[i].x));
				for(int j=0; j<10; j++){
					if((n/map[i].x) == j){
						out.append(map[j-1].val);
						out.append(" ");
					}
				}

				out.append(map[i].val);
				n-=map[i].x;
			}
		}
		return "" + out;
	}
	public static void main(String[] args){
		System.out.println(toWords(342));
	}
}
