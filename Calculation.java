public static int multiply(int a, int b) {
    if (a != 0 && b != 0 && a > Integer.MAX_VALUE / b) {
        throw new ArithmeticException("Integer overflow");
    }
    return a * b;
}
