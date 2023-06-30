class Solution {
    public String intToRoman(int num) {
        String finalans="";
        if(num>0){
        String val = Integer.toString(num);
        for(int i = 0 ; i <= val.length() -1 ; i++){
            String temp="";
            if(val.length() == 4){
                    if(i == 3){
                        temp = values(Integer.parseInt(Character.toString(val.charAt(i))));
                    }
                    else if(i == 2){
                        temp = values(Integer.parseInt(Character.toString(val.charAt(i)))*10);
                    }
                    else if(i == 1){
                        temp = values(Integer.parseInt(Character.toString(val.charAt(i)))*100);
                    }
                    else if(i == 0){
                        temp = values(Integer.parseInt(Character.toString(val.charAt(i)))*1000);
                    }
            }
            if(val.length() == 3){
                    if(i == 2){
                        temp = values(Integer.parseInt(Character.toString(val.charAt(i))));
                    }
                    else if(i == 1){
                        temp = values(Integer.parseInt(Character.toString(val.charAt(i)))*10);
                    }
                    else if(i == 0){
                        temp = values(Integer.parseInt(Character.toString(val.charAt(i)))*100);
                    }
            }
            else if(val.length() == 2){
                 if(i == 1){
                        temp = values(Integer.parseInt(Character.toString(val.charAt(i))));
                    }
                else if(i == 0){
                        temp = values(Integer.parseInt(Character.toString(val.charAt(i)))*10);
                    }
            }
            else if(val.length() == 1){
                        temp = values(Integer.parseInt(Character.toString(val.charAt(i)))); 
            }


            System.out.println(temp);
            finalans += temp; 
        }
        System.out.println(finalans);
        }
        return finalans;
    }

    public String values(int num){
        String val="";
        if(num == 1){
            val = "I";    
        }
        else if (num == 2){
            val = "II";
        }
        else if (num == 3){
            val = "III";
             
        }
        else if (num == 4){
            val = "IV";
             
        }
        else if (num == 5){
            val = "V";
             
        }
        else if (num == 6){
            val = "VI";
             
        }
        else if (num == 7){
            val = "VII";
             
        }
        else if (num == 8){
            val = "VIII";
             
        }
        else if (num == 9){
            val = "IX";
             
        }
        else if (num == 10){
            val = "X";
             
        }
        else if (num == 20){
            val = "XX";
             
        }
        else if (num == 30){
            val = "XXX";
             
        }
        else if (num == 40){
            val = "XL";
             
        }
        else if (num == 50){
            val = "L";
             
        }
        else if (num == 60){
            val = "LX";
             
        }
        else if (num == 70){
            val = "LXX";
             
        }
        else if (num == 80){
            val = "LXXX";
             
        }
        else if (num == 90){
            val = "XC";
             
        }
        else if (num == 100){
            val = "C";
             
        }
        else if (num == 200){
            val = "CC";
             
        }
        else if (num == 300){
            val = "CCC";
             
        }
        else if (num == 400){
            val = "CD";
             
        }
        else if (num == 500){
            val = "D";
             
        }
        else if (num == 600){
            val = "DC";
             
        }
        else if (num == 700){
            val = "DCC";
             
        }
        else if (num == 800){
            val = "DCCC";
        }
        else if (num == 900){
            val = "CM";
        }
        else if (num == 1000){
            val = "M";
        }
        else if (num == 2000){
            val = "MM";
        }
        else if (num == 3000){
            val = "MMM";
        }
            return val;
    }
}
