class Example {
    int One() {
        return 1;
    }

    int Two() {
        return 2;
    }

    @SuppressWarnings("NumericOverflow")
    int DivideByZero() {
        return 3 / 0;
    }
}
