class Solution {
    public int romanToInt(String s) {
    int[] array = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'I') {
                array[i] = 1;
            }

            if (s.charAt(i) == 'V') {
                array[i] = 5;
            }

            if (s.charAt(i) == 'X') {
                array[i] = 10;
            }

            if (s.charAt(i) == 'L') {
                array[i] = 50;
            }
            

            if (s.charAt(i) == 'C') {
                array[i] = 100;
            }

            if (s.charAt(i) == 'D') {
                array[i] = 500;
            }

            if (s.charAt(i) == 'M') {
                array[i] = 1000;
            }
        }
            int sum = 0;
        for(int i = 0; i < array.length - 1 ; i++) {
            if (array[i] < array[i + 1]) {
                sum-=array[i];
            }
            else {
                sum += array[i];
            }
        }
        sum += array[array.length - 1];
        
        return sum;
    }

    }
