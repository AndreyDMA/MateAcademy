package Calc;

public class Convert {

        public int stringToInt(String letter){
            int num=0;
            switch (letter){
                case "I": num = 1; break;
                case "II": num = 2; break;
                case "III": num = 3; break;
                case "IV": num = 4; break;
                case "V": num = 5; break;
                case "VI": num = 6; break;
                case "VII": num = 7; break;
                case "VIII": num = 8; break;
                case "IX": num = 9; break;
                case "X": num = 10; break;
                default: System.out.println("Error! Type number from I to X.");
            }
            return num;
        }
        public String intToString(int res){
            String let=null;
            String letR=null;
            int var=0;
            if (res<=10){
                var = res;
            }
            else if (res>10){
                var = res % 10;
            }
            switch (var){
                case 1: let = "I"; break;
                case 2: let = "II"; break;
                case 3: let ="III" ; break;
                case 4: let = "IV"; break;
                case 5: let = "V"; break;
                case 6: let = "VI"; break;
                case 7: let = "VII"; break;
                case 8: let ="VIII" ; break;
                case 9: let = "IX"; break;
                case 10: let = "X"; break;
                default: let = "null";
            }
            int i = res / 10;
            switch (i){
                case 1: letR = "X" + let; break;
                case 2: letR = "XX" + let; break;
                case 3: letR = "XXX" + let ; break;
                case 4: letR = "XL" + let; break;
                case 5: letR = "L" + let; break;
                case 6: letR = "LX" + let; break;
                case 7: letR = "LXX" + let; break;
                case 8: letR = "LXXX" + let; break;
                case 9: letR = "XC" + let; break;
                case 10: letR = "C"; break;
            }
            return letR;
        }
}
