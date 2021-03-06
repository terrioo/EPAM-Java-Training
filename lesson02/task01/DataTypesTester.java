package Lection2;

public class DataTypesTester {
    public static void testByte(){
        System.out.println("\n!!!!   DATA TYPE - BYTE   !!!!\n");
        byte a = 5, b = 2, c;
        System.out.println("\n***** Arithmetical Operators *****");
/*Для типа byte нет своих версий нижеследующих операций, т.к в выражениях он расширяется до типа int.
Требуется приведение выражения к типу byte, например, c = (byte)(a + b).
c = a + b;          // addition
c = a - b;         // subtraction
c = a * b;         // multiplication
c = a / b;         // division
c = a % b;         // modulus
c = -a;            // unary minus
c = +a;            // unary plus
*/
// addition
        c = (byte)(a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
// subtraction
        c = (byte)(a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
// multiplication
        c = (byte)(a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
// division
        c = (byte)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
// modulus
        c = (byte)(a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 5;
// unary minus
        c = (byte)-a;
        System.out.printf("-%d = %d\n", a, c);
// unary plus
        c = (byte)+a;
        System.out.printf("+%d = %d\n", a, c);
// prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
// postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
// prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
// postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
/*Для типа byte нет своих версий нижеследующих бинарных операций, требуется приведение выражения к типу byte,
например,  c = (byte) (a & b).
c = a & b;   // bitwise AND
c = a | b;   // bitwise OR
c = a ^ b;   // bitwise XOR
c = ~a;      // bitwise unary compliment
c = a << 1;  // left shift
c = a >> 1;  // right shift
c = a >>> 1; // zero fill right shift
c = a >>> 1; // zero fill right shift
*/
        a = 5;
        c = (byte)(a & b); // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte)(a | b); // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte)(a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (byte)~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        c = (byte)(a << 1); // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));


        c = (byte)(a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = -5;
        c = (byte)(a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = 5;
        c = (byte)(a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = -5;
        c = (byte)(a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        a = 5;
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
// c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
// greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
// greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
// less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);


// less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
// equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
// logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,

                (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,

                (a > b) & (a > 0));

// logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,

                (a >= b) || (b != 0));

// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,

                (a >= b) | (b != 0));

// logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,

                (a >= b) ^ (b != 0));

// logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,

                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        int in = 10;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (byte) in;
        System.out.printf("byte = int: c = (byte)%d --> c = %d\n", in, c);
        c = (byte) sh;
        System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte) ch;
        System.out.printf("byte = char: cf = (byte)'%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);

        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
// c = (byte)bool;
        System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n",
                bool);
        System.out.println(" ");
    }
    public static void testShort(){
        System.out.println("\n!!!!   DATA TYPE - SHORT   !!!!\n");
        short a = 5, b = 2, c;
        System.out.println("\n***** Arithmetical Operators *****");
/*Для типа short нет своих версий нижеследующих операций, т.к в выражениях он расширяется до типа int.
Требуется приведение выражения к типу short, например, c = (short)(a + b).
c = a + b;          // addition
c = a - b;         // subtraction
c = a * b;         // multiplication
c = a / b;         // division
c = a % b;         // modulus
c = -a;            // unary minus
c = +a;            // unary plus
*/
// addition
        c = (short)(a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
// subtraction
        c = (short)(a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
// multiplication
        c = (short)(a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
// division
        c = (short)(a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
// modulus
        c = (short)(a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);

        a = 5;
// unary minus
        c = (short)-a;
        System.out.printf("-%d = %d\n", a, c);
// unary plus
        c = (short)+a;
        System.out.printf("+%d = %d\n", a, c);
// prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
// postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
// prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
// postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
/*Для типа short нет своих версий нижеследующих бинарных операций, требуется приведение выражения к типу short,
например,  c = (short) (a & b).
c = a & b;   // bitwise AND
c = a | b;   // bitwise OR
c = a ^ b;   // bitwise XOR
c = ~a;      // bitwise unary compliment
c = a << 1;  // left shift
c = a >> 1;  // right shift
c = a >>> 1; // zero fill right shift
c = a >>> 1; // zero fill right shift
*/
        a = 5;
        c = (short)(a & b); // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b),  Integer.toBinaryString(c));

        c = (short)(a | b); // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short)(a ^ b); // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (short)~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        c = (short)(a << 1); // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));


        c = (short)(a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = -5;
        c = (short)(a >> 1); // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = 5;
        c = (short)(a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = -5;
        c = (short)(a >>> 1); // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));
        System.out.println("\n***** Assignment Operators *****");
        a = 5;
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
// c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
// greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
// greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
// less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);


// less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
// equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
// logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,

                (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,

                (a > b) & (a > 0));

// logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,

                (a >= b) || (b != 0));

// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,

                (a >= b) | (b != 0));

// logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,

                (a >= b) ^ (b != 0));

// logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,

                (a > b ? a : b));
        System.out.println("\nType Cast Operator:"); //
        byte bt = 1;
        int in = 10;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("short = byte: c = (short)%d --> c = %d\n", bt, c);
        c = (short) in;
        System.out.printf("short = int: c = (short)%d --> c = %d\n", in, c);
        c = (short) ch;
        System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
// c = (short) bool;
        System.out.printf("short = boolean: c = (short)%b --> Compile Error\n",
                bool);
        System.out.println(" ");
    }
    public static void testInt(){
        System.out.println("\n!!!!   DATA TYPE - INT   !!!!\n");
        int a = 5, b = 2, c;
        System.out.println("\n***** Arithmetical Operators *****");
// addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
// subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
// multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
// division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
// modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        System.out.println(" ");
        a = 5;
// unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
// unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
// prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
// postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
// prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
// postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        a = 5;
        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));


        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
// c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
// greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
// greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
// less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);


// less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
// equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
// logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,

                (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,

                (a > b) & (a > 0));

// logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,

                (a >= b) || (b != 0));

// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,

                (a >= b) | (b != 0));

// logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,

                (a >= b) ^ (b != 0));

// logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,

                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("int = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
// c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n",
                bool);
        System.out.println(" ");
    }
    public static void testLong(){
        System.out.println("\n!!!!   DATA TYPE - LONG   !!!!\n");
        long a = 5, b = 2, c;
        System.out.println("\n***** Arithmetical Operators *****");
// addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
// subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
// multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
// division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
// modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);

        System.out.println(" ");
        a = 5;
// unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
// unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
// prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
// postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
// prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
// postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
        a = 5;
        c = a & b; // bitwise AND
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = a | b; // bitwise OR
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = a ^ b; // bitwise XOR
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        c = ~a; // bitwise unary compliment
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a),

                Long.toBinaryString(c));

        c = a << 1; // left shift
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a),

                Long.toBinaryString(c));


        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),

                Long.toBinaryString(c));

        a = -5;
        c = a >> 1; // right shift
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a),

                Long.toBinaryString(c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),

                Long.toBinaryString(c));

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a),

                Long.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
// c %= 0; --> Arithmetical Exception
// c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);
        System.out.println("\n***** Relational Operators *****");
// greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
// greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
// less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
// less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
// equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
// logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,

                (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,

                (a > b) & (a > 0));

// logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,

                (a >= b) || (b != 0));

// bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,

                (a >= b) | (b != 0));

// logical XOR
        System.out.printf("(%d >= %d) ^ (%d != 0) --> %b\n", a, b, b,

                (a >= b) ^ (b != 0));

// logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:"); //
        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,

                (a > b ? a : b));

        System.out.println("\nType Cast Operator:"); //
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        int in = 10;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("long = byte: c = %d --> c = %d\n", bt, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = in;
        System.out.printf("long = int: c = %d --> c = %d\n", in, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
// c = (long) bool;
        System.out.printf("long = boolean: c = (long)%b --> Compile Error\n",
                bool);
        System.out.println(" ");
    }
    public static void testChar(){
        System.out.println("\n!!!!   DATA TYPE - CHAR   !!!!\n");
        char a = '\u0056', b = '\u0031', c;
        System.out.println("\n***** Arithmetical Operators *****");
/* Для нижеследующих операций требуется приведение выражения к типу char,
например, c = (char)(a + b).
c = a + b;          // addition
c = a - b;         // subtraction
c = a * b;         // multiplication
c = a / b;         // division
c = a % b;         // modulus
c = -a;            // unary minus
c = +a;            // unary plus
*/
// addition
        c = (char)(a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);
// subtraction
        c = (char)(a - b);
        System.out.printf("%c - %c = %c\n", a, b, c);
// multiplication
        c = (char)(a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);
// division
        c = (char)(a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);
// modulus
        c = (char)(a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);

        a = '\u0056';
// unary minus
        c = (char)-a;
        System.out.printf("-%c = %c\n", a, c);
// unary plus
        c = (char)+a;
        System.out.printf("+%c = %c\n", a, c);
// prefix increment
        a = '\u0056';
        System.out.printf("++%c = %c\n", a, ++a);
// postfix increment
        a = '\u0056';
        System.out.printf("%c++ = %c\n", a, a++);
// prefix decrement
        a = '\u0056';
        System.out.printf("--%c = %c\n", a, --a);
// postfix decrement
        a = '\u0056';
        System.out.printf("%c-- = %c\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");
/* Для нижеследующих операций требуется приведение выражения к типу char,
например,  c = (char) (a & b).
c = a & b;   // bitwise AND
c = a | b;   // bitwise OR
c = a ^ b;   // bitwise XOR
c = ~a;      // bitwise unary compliment
c = a << 1;  // left shift
c = a >> 1;  // right shift
c = a >>> 1; // zero fill right shift
c = a >>> 1; // zero fill right shift
*/
        a = '\u0056';
        c = (char)(a & b); // bitwise AND
        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));
        c = (char)(a | b); // bitwise OR
        System.out.printf("%c | %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char)(a ^ b); // bitwise XOR
        System.out.printf("%c ^ %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        c = (char)~a; // bitwise unary compliment
        System.out.printf("~%c = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        c = (char)(a << 1); // left shift
        System.out.printf("%c << 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));


        c = (char)(a >> 1); // right shift
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = (char)-a;
        c = (char)(a >> 1); // right shift
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = '\u0056';
        c = (char)(a >>> 1); // zero fill right shift
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        a = (char)-a;
        c = (char)(a >>> 1); // zero fill right shift
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),

                Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        a = '\u0056';
        c = '\u0031';
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        c = '\u0031';
        System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
        System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
        System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        a = '\u0056';
        b = '\u0031';
        // greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
// greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
// less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
// less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
// equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
// logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a,

                (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a,

                (a > b) & (a > 0));

// logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b,

                (a >= b) || (b != 0));

// bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b,

                (a >= b) | (b != 0));

// logical XOR
        System.out.printf("(%c >= %c) ^ (%c != 0) --> %b\n", a, b, b,

                (a >= b) ^ (b != 0));

// logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:"); //
        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b,

                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");
        byte bt = 68;
        short sh = -32000;
        int in = 200;
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (char)bt;
        System.out.printf("char = byte: c = %d --> c = %c\n", bt, c);
        c = (char)sh;
        System.out.printf("char = short: c = %d --> c = %c\n", sh, c);
        c = (char)in;
        System.out.printf("char = int: c = '%c' --> c = %c\n", in, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (char)%f --> c = %c\n", d, c);
// c = (char)bool;
        System.out.printf("char = boolean: c = (char)%b --> Compile Error\n",
                bool);
        System.out.println(" ");
    }
    public static void testDouble(){
        System.out.println("\n!!!!   DATA TYPE - DOUBLE   !!!!\n");
        double a = 5.60, b = 2.34, c;
        System.out.println("\n***** Arithmetical Operators *****");
// addition
        c = a + b;
        System.out.printf("%.3f + %.3f = %.3f\n", a, b, c);
// subtraction
        c = a - b;
        System.out.printf("%.3f - %.3f = %.3f\n", a, b, c);
// multiplication
        c = a * b;
        System.out.printf("%.3f * %.3f = %.3f\n", a, b, c);
// division
        c = a / b;
        System.out.printf("%.3f / %.3f = %.3f\n", a, b, c);
// modulus
        c = a % b;
        System.out.printf("%.3f %% %.3f = %.3f\n", a, b, c);

        System.out.println(" ");
        a = 5.60;
// unary minus
        c = -a;
        System.out.printf("-%.3f = %.3f\n", a, c);
// unary plus
        c = +a;
        System.out.printf("+%.3f = %.3f\n", a, c);
// prefix increment
        a = 5.60;
        System.out.printf("++%.3f = %.3f\n", a, ++a);
// postfix increment
        a = 5.60;
        System.out.printf("%.3f++ = %.3f\n", a, a++);
// prefix decrement
        a = 5.60;
        System.out.printf("--%.3f = %.3f\n", a, --a);
// postfix decrement
        a = 5.60;
        System.out.printf("%.3f-- = %.3f\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
// Для переменных типа double побитовые операции не определены
        System.out.println("Для переменных типа double побитовые операции не определены");
        System.out.println("\n***** Assignment Operators *****");
/* Для переменных типа double операции сдвига и операции присваивания побитового "AND", "OR" и "XOR"  не определены.
c |= a;
c &= a;
c ^= a;
c >>= 1;
c <<= 1;
c >>>= 1;
*/
        c = 7.45;
        System.out.printf("%.3f += %.3f --> c = %.3f\n", c, a, c += a);
        System.out.printf("%.3f -= %.3f --> c = %.3f\n", c, a, c -= a);
        System.out.printf("%.3f *= %.3f --> c = %.3f\n", c, a, c *= a);
        System.out.printf("%.3f /= %.3f --> c = %.3f\n", c, a, c /= a);
        System.out.printf("%.3f %%= %.3f --> c = %.3f\n", c, a, c %= a);
// При операциях c %= 0 и c /= 0  исключения не возникают

        System.out.println("\n***** Relational Operators *****");
// greater than
        System.out.printf("%.3f > %.3f --> %b\n", a, b, a > b);
// greater than or equal to
        System.out.printf("%.3f >= %.3f --> %b\n", a, b, a >= b);
// less than
        System.out.printf("%.3f < %.3f --> %b\n", a, b, a < b);
// less than or equal to
        System.out.printf("%.3f <= %.3f --> %b\n", a, b, a <= b);
// equal to
        System.out.printf("%.3f == %.3f --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%.3f != %.3f --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");
// logical AND
        System.out.printf("(%.3f > %.3f) && (%.3f > 0) --> %b\n", a, b, a,

                (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%.3f > %.3f) & (%.3f > 0) --> %b\n", a, b, a,

                (a > b) & (a > 0));

// logical OR
        System.out.printf("(%.3f >= %.3f) || (%.3f != 0) --> %b\n", a, b, b,

                (a >= b) || (b != 0));

// bitwise logical OR
        System.out.printf("(%.3f >= %.3f) | (%.3f != 0) --> %b\n", a, b, b,

                (a >= b) | (b != 0));

// logical XOR
        System.out.printf("(%.3f >= %.3f) ^ (%.3f != 0) --> %b\n", a, b, b,

                (a >= b) ^ (b != 0));

// logical NOT
        System.out.printf("!(%.3f >= %.3f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%.3f > %.3f ? %.3f : %.3f --> %.3f\n", a, b, a, b,

                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        int in = 10;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        float f = 1.9f;
        boolean bool = true;
        c = bt;
        System.out.printf("double = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("double = long: c = %d --> c = %f\n", l, c);
        c = f;
        System.out.printf("double = float: c = %f --> c = %f\n", f, c);
        c = in;
        System.out.printf("double = int: c = %d --> c = %f\n", in, c);
// c = (double) bool;
        System.out.printf("int = boolean: c = (%b --> Compile Error\n",
                bool);
        System.out.println(" ");
    }
    public static void testFloat(){
        System.out.println("\n!!!!   DATA TYPE - FLOAT   !!!!\n");
        float a = 5.60f, b = 2.34f, c;
        System.out.println("\n***** Arithmetical Operators *****");
// addition
        c = a + b;
        System.out.printf("%.3f + %.3f = %.3f\n", a, b, c);
// subtraction
        c = a - b;
        System.out.printf("%.3f - %.3f = %.3f\n", a, b, c);
// multiplication
        c = a * b;
        System.out.printf("%.3f * %.3f = %.3f\n", a, b, c);
// division
        c = a / b;
        System.out.printf("%.3f / %.3f = %.3f\n", a, b, c);
// modulus
        c = a % b;
        System.out.printf("%.3f %% %.3f = %.3f\n", a, b, c);

        System.out.println(" ");
        a = 5.60f;
// unary minus
        c = -a;
        System.out.printf("-%.3f = %.3f\n", a, c);
// unary plus
        c = +a;
        System.out.printf("+%.3f = %.3f\n", a, c);
// prefix increment
        a = 5.60f;
        System.out.printf("++%.3f = %.3f\n", a, ++a);
// postfix increment
        a = 5.60f;
        System.out.printf("%.3f++ = %.3f\n", a, a++);
// prefix decrement
        a = 5.60f;
        System.out.printf("--%.3f = %.3f\n", a, --a);
// postfix decrement
        a = 5.60f;
        System.out.printf("%.3f-- = %.3f\n", a, a--);
        System.out.println("\n***** Bitwise Operators *****");
// Для переменных типа float побитовые операции не определены
        System.out.println("Для переменных типа float побитовые операции не определены");
        System.out.println("\n***** Assignment Operators *****");
/* Для переменных типа float операции сдвига и операции присваивания побитового "AND", "OR" и "XOR"  не определены.
c |= a;
c &= a;
c ^= a;
c >>= 1;
c <<= 1;
c >>>= 1;
*/
        c = 7.45f;
        System.out.printf("%.3f += %.3f --> c = %.3f\n", c, a, c += a);
        System.out.printf("%.3f -= %.3f --> c = %.3f\n", c, a, c -= a);
        System.out.printf("%.3f *= %.3f --> c = %.3f\n", c, a, c *= a);
        System.out.printf("%.3f /= %.3f --> c = %.3f\n", c, a, c /= a);
        System.out.printf("%.3f %%= %.3f --> c = %.3f\n", c, a, c %= a);
// При операциях c %= 0 и c /= 0  исключения не возникают

        System.out.println("\n***** Relational Operators *****");
// greater than
        System.out.printf("%.3f > %.3f --> %b\n", a, b, a > b);
// greater than or equal to
        System.out.printf("%.3f >= %.3f --> %b\n", a, b, a >= b);
// less than
        System.out.printf("%.3f < %.3f --> %b\n", a, b, a < b);
// less than or equal to
        System.out.printf("%.3f <= %.3f --> %b\n", a, b, a <= b);
// equal to
        System.out.printf("%.3f == %.3f --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%.3f != %.3f --> %b\n", a, b, a != b);


        System.out.println("\n***** Logical Operations *****");
// logical AND
        System.out.printf("(%.3f > %.3f) && (%.3f > 0) --> %b\n", a, b, a,

                (a > b) && (a > 0));

// bitwise logical AND
        System.out.printf("(%.3f > %.3f) & (%.3f > 0) --> %b\n", a, b, a,

                (a > b) & (a > 0));

// logical OR
        System.out.printf("(%.3f >= %.3f) || (%.3f != 0) --> %b\n", a, b, b,

                (a >= b) || (b != 0));

// bitwise logical OR
        System.out.printf("(%.3f >= %.3f) | (%.3f != 0) --> %b\n", a, b, b,

                (a >= b) | (b != 0));

// logical XOR
        System.out.printf("(%.3f >= %.3f) ^ (%.3f != 0) --> %b\n", a, b, b,

                (a >= b) ^ (b != 0));

// logical NOT
        System.out.printf("!(%.3f >= %.3f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%.3f > %.3f ? %.3f : %.3f --> %.3f\n", a, b, a, b,

                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");
        byte bt = 1;
        int in = 10;
        short sh = -32000;
        char ch = '\u0002';
        long l = 100000000000000000L;
        double d = 123456789.625;
        boolean bool = true;
        c = bt;
        System.out.printf("float = byte: c = %d --> c = %f\n", bt, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("float = long: c = %d --> c = %f\n", l, c);
        c = (float) d;
        System.out.printf("float = float: c = (float)%f --> c = %f\n", d, c);
        c = in;
        System.out.printf("float = int: c = %d --> c = %f\n", in, c);
// c = (double) bool;
        System.out.printf("int = boolean: c = (%b --> Compile Error\n",
                bool);
        System.out.println(" ");
    }
    public static void testBoolean(){
        System.out.println("\n!!!!   DATA TYPE - BOOLEAN   !!!!\n");
        boolean a = true, b = false, c;
        System.out.println("\n***** Arithmetical Operators *****");
        // Над типом boolean не определён ни один математический оператор.
// c = a + b; // addition
// c = a - b; // subtraction
// c = a * b; // multiplication
// c = a / b; // division
// c = a % b; // modulus
// c = -a; // unary minus
// c = +a; // unary plus
// c = ++a; // prefix increment
// c = a++; // postfix increment
// c = --a; // prefix decrement
// c = a--; // postfix decrement
        System.out.println("\n***** Bitwise Operators *****");
        // Над типом boolean определено часть побитовых операций (а также операций
        // составного присваивания), которые аналогичны по действию и результату
        // соответствующим логическим операциям.
        c = a & b; // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b; // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b; // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
// c = ~a; // bitwise unary compliment
// c = a << 1; // left shift
// c = a >> 1; //right shift
// c = a >>> 1; // zero fill right shift
        System.out.println("\n***** Assignment Operators *****");
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);
// c += a;
// c -= a;
// c *= a;
// c /= a;
// c %= a;
// c >>= 1;
// c <<= 1;
// c >>>= 1;
        System.out.println("\n***** Relational Operators *****");
        //Переменные типа boolean можно сравнивать только на
        // равенство и неравенство.
// equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
// not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);
// c = a > b; // greater than
// c = a >= b; // greater than or equal to
// c = a < b; // less than
// c = a <= b; // less than or equal to
        System.out.println("\n***** Logical Operations *****");
        c = a && b; // logical AND
        System.out.printf("%b && %b = %b\n", a, b, c);
        c = a || b; // logical OR
        System.out.printf("%b || %b = %b\n", a, b, c);
        c = a ^ b; // logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
// logical NOT
        System.out.printf("!%b --> %b\n", a, !a);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
        System.out.println("\nType Cast Operator:");

// byte bt = 1;
// short sh = -32000;
// char ch = '\u0002';
// long l = 100000000000000000L;
// float f = 1.9f;
// double d = 123456789.625;
        boolean bool = true;
        // Значение типа boolean нельзя преобразовать ни к какому типу, а также его
        //нельзя получить ни из какого типа.
//c = (boolean) bt;
//c = (boolean) sh;
//c = (boolean) ch;
//c = (boolean) l;
//c = (boolean) f;
//c = (boolean) d;
        c = bool;
        System.out.println(" ");
    }
    public static void testString() {
        System.out.println("\n!!!!   DATA TYPE - STRING   !!!!\n");
        String a = "Good ", b = "morning", c;
        System.out.println("\nArithmetical Operators: ");
/* Допустимо только сложение строк (конкатенация).
Над типом String  следующие математические операторы не определены:
c = a - b; // subtraction
c = a * b; // multiplication
c = a / b; // division
c = a % b; // modulus
c = -a; // unary minus
c = +a; // unary plus
c = ++a; // prefix increment
c = a++; // postfix increment
c = --a; // prefix decrement
c = a--; // postfix decrement
*/
// addition
        c = a + b;
        System.out.printf("%s + %s = %s\n", a, b, c);
        System.out.println("\n***** Bitwise Operators *****");
// Для типа String бинарные операции не определены.
        System.out.println(" Bitwise Operators are not defined for data type String.");
        System.out.println("\n***** Assignment Operators *****");
/* Для типа String следующие операторы присвоения не опредлены:
c |= a;
c &= a;
c ^= a;
c += a;
c -= a;
c *= a;
c /= a;
c %= a;
c >>= 1;
c <<= 1;
c >>>= 1;
 */
        a = "Good "; b = "morning";
        System.out.printf("%s += %s --> c = %s\n", c, a, c += a);
        System.out.println("\n***** Relational Operators *****");
// Переменные типа String можно сравнивать только на равенство и неравенство.
// При этом будут сравниваться ссылки на объект типа String:
        System.out.println("Сравнение ссылок объектов типа String");
        c = "evening";
        System.out.printf("%s == %s --> c = %s\n", c, a, c == a);
        c = "evening";
        System.out.printf("%s != %s --> c = %s\n", c, a, c != a);
// НО! Можно сравнить объекты:
        System.out.println("Сравнение объектов типа String (непосредственное сравнение строк)");
        c = "Good ";
        System.out.printf("%s == %s --> c = %s\n", c, a, c.equals(a));
        c = "evening";
        System.out.printf("%s != %s --> c = %s\n", c, a, !c.equals(a));
        System.out.println("\n***** Logical Operations *****");
// logical AND
        System.out.printf("(%s == %s) && (%s != %s) --> %b\n", a, c, a, b,

                (c.equals(a)) && (!b.equals(a)));

// bitwise logical AND
        System.out.printf("(%s == %s) & (%s != %s) --> %b\n", a, c, a, b,

                (c.equals(a)) && (!b.equals(a)));

// logical OR
        System.out.printf("(%s == %s) || (%s != %s) --> %b\n", a, c, a, b,

                (c.equals(a)) && (!b.equals(a)));

// bitwise logical OR
        System.out.printf("(%s == %s) | (%s != %s) --> %b\n", a, c, a, b,

                (c.equals(a)) && (!b.equals(a)));

// logical XOR
        System.out.printf("(%s == %s) ^ (%s != %s) --> %b\n", a, c, a, b,

                (c.equals(a)) && (!b.equals(a)));

// logical NOT
        System.out.printf("!(%s == %s) --> %b\n", a, b, !b.equals(a));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf("%s = %s ? %s : %s --> %s\n", a, b, a, b,

                (c.equals(a) ? "Строки одинаковы" : "Строки различны"));
        System.out.println("\nType Cast Operator:");
// Приведение чисел и символов к типу String
        byte bt = 1;
        short sh = -32000;
        int in = 10;
        char ch = 'a';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = Byte.toString(bt);
        System.out.printf("String = byte: c = %s --> c = %s\n", bt, c);
        c = Short.toString(sh);
        System.out.printf("String = short: c = %s --> c = %s\n", sh, c);
        c = Character.toString(ch);
        System.out.printf("String = char: c = '%s' --> c = %s\n", ch, c);
        c = Integer.toString(in);
        System.out.printf("String = int: c = '%s' --> c = %s\n", in, c);
        c = Long.toString(l);
        System.out.printf("String = long: c = %s --> c = %s\n", l, c);
        c = Float.toString(f);
        System.out.printf("String = float: c = %s --> c = %s\n", f, c);
        c = Double.toString(d);
        System.out.printf("String = double: c = %s --> c = %s\n", d, c);
        System.out.printf("String = boolean: c = %s --> Compile Error\n", bool);
    }
    public static void testStudent(){
        System.out.println("\n!!!!   DATA TYPE - STUDENT  !!!!\n");
        Student student1 = new Student("Anton",30);
        Student student2 = new Student("Valentin",27);
        Student student3 = student1;
        System.out.println ("student1: "+student1);
        System.out.println ("student2: "+student2);
        System.out.println ("student3: "+student3);
        System.out.println("\n***** Arithmetical Operators *****");
        System.out.println(" Arithmetical Operators are not defined for data type Student.");
        System.out.println("\n***** Bitwise Operators *****");
        System.out.println(" Bitwise Operators are not defined for data type Student.");
        System.out.println("\n***** Assignment Operators *****");
        System.out.println(" Assignment Operators are not defined for data type Student.");
        System.out.println("\n***** Relational Operators *****");
// Объекты типа Student можно сравнивать только на равенство и неравенство
 /*       System.out.println("Сравнение ссылок объектов типа Student: student1 и student3");
        // equal to
        System.out.println(student1.toString() + " == " + student3.toString() + " ---> " + (student1 == student3));

        // not equal to
        System.out.println(student3.toString() + " !== " + student3.toString() + " ---> " + (student1 != student3));
 */
        System.out.println("Сравнение объектов типа Student: student1 и student3");
        // equal to
        System.out.println("Объекты student1 и student3 равны (student1 = student3)?  --> " +

                student1.equals(student3));
        // not equal to
        System.out.println("Объекты student1 и student3 не равны (student1 != student3)? --> " +

                !student1.equals(student3));
        System.out.println("\n***** Logical Operations *****");
// logical AND
        System.out.printf("(student1 == student3) && (student1!= student2) --> %b\n",

                (student1.equals(student3)) && (!student1.equals(student2)));

// bitwise logical AND
        System.out.printf("(student1 == student3) & (student1!= student2) --> %b\n",

                (student1.equals(student3)) && (!student1.equals(student2)));

// logical OR
        System.out.printf("(student1 == student3) || (student1!= student2) --> %b\n",

                (student1.equals(student3)) && (!student1.equals(student2)));

// bitwise logical OR
        System.out.printf("(student1 == student3) | (student1!= student2) --> %b\n",

                (student1.equals(student3)) && (!student1.equals(student2)));

// logical XOR
        System.out.printf("(student1 == student3) ^ (student1!= student2) --> %b\n",

                (student1.equals(student3)) && (!student1.equals(student2)));

// logical NOT
        System.out.printf("!(student1 == student3) --> %b\n", !student1.equals(student3));
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
       System.out.printf("student1 == student3 ? Это один и тот же студент : Студенты разные --> %s\n",

                (student1.equals(student3) ? "Это один и тот же студент" : "Студенты разные"));
        System.out.println("\n***** instanceOf Operator *****");
// К какому классу принадлежит объект типа Student
        System.out.printf("Принадлежит ли объект student1 классу Student? --> %b\n", student1 instanceof Student);


    }
}
