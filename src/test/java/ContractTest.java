class ContractTest implements EqualsContract<Person>, ComparableContract<Person> {

    @Override
    public Person createValue() {
        return new Person("foo");
    }

    @Override
    public Person createNotEqualValue() {
        return new Person("baz");
    }

    @Override
    public Person createSmallerValue() {
        return new Person("baz");
    }

}