package learn01;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Assignment operators
        int c = 15;
        System.out.println("\nAssignment Operators:");
        System.out.println("Simple Assignment: c = " + c);
        c += 5;
        System.out.println("Add and Assign: c += 5 : c = " + c);
        c -= 3;
        System.out.println("Subtract and Assign: c -= 3 : c = " + c);
        c *= 2;
        System.out.println("Multiply and Assign: c *= 2 : c = " + c);
        c /= 4;
        System.out.println("Divide and Assign: c /= 4 : c = " + c);
        c %= 2;
        System.out.println("Modulus and Assign: c %= 2 : c = " + c);

        // Increment and Decrement operators
        int d = 8;
        System.out.println("\nIncrement and Decrement Operators:");
        System.out.println("Initial value of d: " + d);
        d++;
        System.out.println("Post-increment: d++ : d = " + d);
        ++d;
        System.out.println("Pre-increment: ++d : d = " + d);
        d--;
        System.out.println("Post-decrement: d-- : d = " + d);
        --d;
        System.out.println("Pre-decrement: --d : d = " + d);

        // Relational operators
        System.out.println("\nRelational Operators:");
        int x = 10, y = 20;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Equal to: x == y : " + (x == y));
        System.out.println("Not equal to: x != y : " + (x != y));
        System.out.println("Greater than: x > y : " + (x > y));
        System.out.println("Less than: x < y : " + (x < y));
        System.out.println("Greater than or equal to: x >= y : " + (x >= y));
        System.out.println("Less than or equal to: x <= y : " + (x <= y));

        // Logical operators
        boolean p = true, q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("p = " + p + ", q = " + q);
        System.out.println("Logical AND: p && q : " + (p && q));
        System.out.println("Logical OR: p || q : " + (p || q));
        System.out.println("Logical NOT: !p : " + !p);

        // Bitwise operators
        int m = 5, n = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("m = " + m + ", n = " + n);
        System.out.println("Bitwise AND: m & n : " + (m & n));
        System.out.println("Bitwise OR: m | n : " + (m | n));
        System.out.println("Bitwise XOR: m ^ n : " + (m ^ n));
        System.out.println("Bitwise NOT: ~m : " + (~m));
        System.out.println("Left Shift: m << 1 : " + (m << 1));
        System.out.println("Right Shift: m >> 1 : " + (m >> 1));

        // Conditional (Ternary) operator
        int num1 = 10, num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("\nConditional (Ternary) Operator:");
        System.out.println("Max of " + num1 + " and " + num2 + " is: " + max);
    }
}
