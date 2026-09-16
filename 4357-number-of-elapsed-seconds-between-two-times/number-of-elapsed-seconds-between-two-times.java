class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

        int starthr = (startTime.charAt(0) - '0') * 10 
                    + (startTime.charAt(1) - '0');

        int startmin = (startTime.charAt(3) - '0') * 10 
                     + (startTime.charAt(4) - '0');

        int startsec = (startTime.charAt(6) - '0') * 10 
                     + (startTime.charAt(7) - '0');


        int endhr = (endTime.charAt(0) - '0') * 10 
                  + (endTime.charAt(1) - '0');

        int endmin = (endTime.charAt(3) - '0') * 10 
                   + (endTime.charAt(4) - '0');

        int endsec = (endTime.charAt(6) - '0') * 10 
                   + (endTime.charAt(7) - '0');


        return (endhr - starthr) * 3600
             + (endmin - startmin) * 60
             + (endsec - startsec);
    }
}