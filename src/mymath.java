public class mymath {

    double add (double num1,double num2) {
        double answer = num1 + num2;
        return answer;
    }

    double subtract (double num1,double num2) {
        double answer = num1 + -num2;
        return answer;
    }
    double multiply (double num1,double num2) {
        double x = (double) num2;
        double answer = 0;
        while (x != 0) {
            answer = num1+answer;
            x = subtract(x, 1);
        }
        return answer;
    }
    double divid (double num1,double num2) {
        double answer = 0;
        double h = num1;
        while (subtract(h, num2) > 0) {
            h = subtract(h, num2);
            answer ++;
        }
        return answer;
    }
    double leftOver (double num1,double num2) {
        double h = num1;
        while (subtract(h, num2) > 0) {
            h = subtract(h, num2);
        }
        return h;
    }
    double power (double num1,double num2) {
        double x = (double) num2;
        double answer = 1;
        while (x != 0) {
            answer = multiply(num1, answer);
            x = subtract(x, 1);
        }
        return answer;
    }
    double squareRoot (double num) {
        double holder;
        double answer = divid(num, 2);
        do {
        holder = answer;
        answer = divid((holder + (divid(num, holder))) , 2);
        }
        while (subtract(holder,answer) > 0);
        return answer;
    }
    double absolutevalue (double num) {
        double answer;
        if (num >= 0) {
            answer = num;
        }
        else {
            answer = -num;
        }
        return answer;
    }



//int
    int add (int num1,int num2) {
        int answer = num1 + num2;
        return answer;
    }

    int subtract (int num1,int num2) {
        int answer = num1 + -num2;
        return answer;
    }
    int multiply (int num1,int num2) {
        int x = (int) num2;
        int answer = 0;
        while (x != 0) {
            answer = num1+answer;
            x = subtract(x, 1);
        }
        return answer;
    }
    int divid (int num1,int num2) {
        int answer = 0;
        int h = num1;
        while (subtract(h, num2) > 0) {
            h = subtract(h, num2);
            answer ++;
        }
        return answer;
    }
    int leftOver (int num1,int num2) {
        int h = num1;
        while (subtract(h, num2) > 0) {
            h = subtract(h, num2);
        }
        return h;
    }
    int power (int num1,int num2) {
        int x = (int) num2;
        int answer = 1;
        while (x != 0) {
            answer = multiply(num1, answer);
            x = subtract(x, 1);
        }
        return answer;
    }
    int squareRoot (int num) {
        int holder;
        int answer = divid(num, 2);
        do {
        holder = answer;
        answer = divid((holder + (divid(num, holder))) , 2);
        }
        while (subtract(holder,answer) > 0);
        return answer;
    }
    int absolutevalue (int num) {
        int answer;
        if (num >= 0) {
            answer = num;
        }
        else {
            answer = -num;
        }
        return answer;
    }
}
