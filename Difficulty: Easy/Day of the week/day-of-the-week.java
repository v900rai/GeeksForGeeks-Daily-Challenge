// User function Template for Java

class Solution {
    static String getDayOfWeek(int d, int m, int y) {
        // code here
            String days[] = { "Saturday", "Sunday",    "Monday",   "Tuesday",

                         "Wednesday", "Thursday", "Friday" };

                         

        if(m<3){

            m+=12;

            y-=1;

        }

        

        int k=y%100;

        int j=y/100;

        int day=((d+(((m+1)*26)/10)+k+(k/4)+(j/4))+(5*j))%7;

        

        return days[day];

    }
    }

