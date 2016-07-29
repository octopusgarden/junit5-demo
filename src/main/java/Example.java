class Example {
    int One() {
        return 1;
    }

    @SuppressWarnings("NumericOverflow")
    int DivideByZero() {
        return 3 / 0;
    }
}
