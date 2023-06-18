package unit18.myexceptions.ownexceptions;


class Person {
    private String name;
    private final int MAX_LENGTH = 5;


    /**
     * @param name: name of a person
     * throws StringLengthException
     */
    public Person(String name) {
        if (name.length() >= MAX_LENGTH) {
            throw new StringLengthException();
        }
        this.name = name;
    }
}
