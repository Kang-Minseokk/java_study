class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Person person = (Person) other;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return age == person.age;
    }

    @Override
    public String toString() {
        return "Person[" + name + ", " + age + "]";
    }


    Person p1 = new Person("John", 33);
    Person p2 = new Person("John", 33);
}