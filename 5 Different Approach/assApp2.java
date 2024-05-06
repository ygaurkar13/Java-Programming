 class SY2022bit021{
    public int getValidRegistrationsCount0Approach2(String reg[]) {
        int count = 0;
        for (int i = 0; i < reg.length; i++) {
            String temp = reg[i];
            if (temp.length() == 10) {
                String temp1 = temp.substring(0, 4); // Fix substring length
                       int num = Integer.parseInt(temp1);
                // if (temp1.equals("2022") || temp1.equals("2023") || temp1.equals("2024")) {
                       if(num>=2000 && num<=2024){
                    temp1 = temp.substring(4, 7); // Fix substring length
                    	if (temp1.equals("BIT") || temp1.equals("BCS") || temp1.equals("BCE") || temp1.equals("BME")) {
                        	temp1 = temp.substring(7, 10); // Fix substring length
                        	int Roll_no=100*(temp1.charAt(2) -'0') + 10*(temp1.charAt(1) -'0' + 1*(temp1.charAt(0)-'0'); //character by character from substring checking for creating and saving in Roll number 
                        	if(Roll_no<=50){
                        		count++;
                        }
                   
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String A[] = { "2022BME001", "2022BCE003","2023BCS000"};
        SY2022bit021 y = new SY2022bit021(); // Use the corrected class name
        int count = y.getValidRegistrationsCount(A);
        System.out.println(count);
    }
}
