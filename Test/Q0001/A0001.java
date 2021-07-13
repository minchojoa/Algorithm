public class A0001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[] = new int[10];

		for(int i = 1 ; i < 1001 ; i++) {
			String strNum = Integer.toString(i);
			for(int j = 0 ; j < strNum.length(); j++) {
				int temp = Character.getNumericValue(strNum.charAt(j));
				count[temp]++;
//				System.out.println(strNum.charAt(j));
			}
		}

		for(int i = 0 ; i < count.length ; i++) {
			System.out.println(i+"의 갯수: " + count[i]);
		}

	}

}
