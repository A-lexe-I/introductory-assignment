package Task;

public class Parse extends Calc{
    int number1(String n1) {
        int numeral1 = Integer.parseInt(n1);
        return numeral1;
    }

    int number2(String n2) {
        int numeral2 = Integer.parseInt(n2);
        return numeral2;
    }
    public int numes(String a, String b) {
        Parse ARAB = new Parse();
        int x;
        int y;
        x = ARAB.number1(a);
        y = ARAB.number2(b);
        char op = Operation.op();
        int result;
        if (x >= 0 && x <= 10 && y >= 0 && y <= 10) {
            result = Operation.Result(x, y, op);
            return result;
        } else
            return 101;
    }
    int changenumes(String A) {
        int number1or2;
        switch (A) {
            case "I":
                number1or2 = 1;
                break;
            case "II":
                number1or2 = 2;
                break;
            case "III":
                number1or2 = 3;
                break;
            case "IV":
                number1or2 = 4;
                break;
            case "V":
                number1or2 = 5;
                break;
            case "VI":
                number1or2 = 6;
                break;
            case "VII":
                number1or2 = 7;
                break;
            case "VIII":
                number1or2 = 8;
                break;
            case "IX":
                number1or2 = 9;
                break;
            case "X":
                number1or2 = 10;
                break;
            default:
                number1or2 = 0;
        }
        return number1or2;
    }
    public String result(String a, String b) {
        int x = changenumes(a);
        int y = changenumes(b);
        if (x > 0 && y > 0) {
            char Op = Operation.op();
            int result = Operation.Result(x, y, Op);
            if (result > 0 && result <= 100) {
                return roman(result);
            } else return null;
        } else return null;
    }

    String roman(int inndex) {
        String[] r = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String z = r[inndex];
        return z;
    }
}
