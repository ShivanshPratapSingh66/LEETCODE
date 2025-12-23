class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i == s.length() - 1 && s.charAt(i) == 'I')
                sum += 1;
            else if (i == s.length() - 1 && s.charAt(i) == 'X')
                sum += 10;
            else if (i == s.length() - 1 && s.charAt(i) == 'C')
                sum += 100;
            else {
                switch (s.charAt(i)) {
                       
                    case 'I' -> {
                        if (s.charAt(i + 1) == 'V') {
                            sum += 4;
                            i++;
                        } else if (s.charAt(i + 1) == 'X') {
                            sum += 9;
                            i++;
                        } else
                            sum += 1;
                    }
                    //......................................
                    case 'X' -> {
                        if (s.charAt(i + 1) == 'L') {
                            sum += 40;
                            i++;
                        } else if (s.charAt(i + 1) == 'C') {
                            sum += 90;
                            i++;
                        } else
                            sum += 10;
                    }
                  //..............................................
                    case 'C' -> {
                        if (s.charAt(i + 1) == 'D') {
                            sum += 400;
                            i++;
                        } else if (s.charAt(i + 1) == 'M') {
                            sum += 900;
                            i++;
                        } else
                            sum += 100;
                    }
                    //........................................................
                     case 'V' -> sum += 5;
                      case 'L' -> sum += 50;
                     case 'D' -> sum += 500;
                     case 'M' -> sum += 1000;
                  
                }// switch loop ends here  
            } //.. else ends here  
        }
        return sum;

    }
}
