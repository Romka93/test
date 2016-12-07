package work;

public class test {
		//змінні для інкапсуляції даних
		private int i;
		private String str;
		private static String s1;		
		private static String s2;
		
		static{
			s1 ="default"; 
			s2 ="default 2";
		}
		public test()
		{
			i = 0;
			str = "default";
		}
		public test(int i, String str)
		{
			this.i=i;
			this.str =str;
		}
		public int getI() {
			return i;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + i;
			result = prime * result + ((str == null) ? 0 : str.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			test other = (test) obj;
			if (i != other.i)
				return false;
			if (str == null) {
				if (other.str != null)
					return false;
			} else if (!str.equals(other.str))
				return false;
			return true;
		}
		public void setI(int i) {
			this.i = i;
		}
		public String getStr() {
			return str;
		}
		public void setStr(String str) {
			this.str = str;
		}
		public  static void print()
		{
			System.out.println("This is static method "+ s1+","+s2 );
		}
		
		public String toString() {
			return "test [i=" + i + ", str=" + str + "]";
		}
		
}
