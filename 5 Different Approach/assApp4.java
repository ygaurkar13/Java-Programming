 class SY2022bit021{
    public int getValidRegistrationsCount50Approach4(String reg[]) {
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
                        	String minNumber ="000" ;
                        	String maxNumber ="050" ;
                        		int first =minNumber.hashCode();
                        		int second =maxNumber.hashCode();
                        		int  rollNumber=temp1.hashCode();
                        			if(rollNumber>first && rollNumber<=second){
                        			count++;
                        			}                        
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
