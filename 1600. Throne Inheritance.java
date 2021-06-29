class ThroneInheritance {
    class Person {
        public String name;
        public List<Person> children;
        public boolean ifDead;

        public Person(String name) {
            this.name = name;
            this.children = new ArrayList<>();
            this.ifDead = false;
        }
    }

    private Person person;
    private Map<String, Person> personMap;

    public ThroneInheritance(String kingName) {
        this.person = new Person(kingName);
        personMap = new HashMap<>();
        personMap.put(kingName, this.person);
    }
    
    public void birth(String parentName, String childName) {
        Person temp = new Person(childName);

        personMap.put(childName, temp);
    }
    
    public void death(String name) {
        personMap.get(name).ifDead = true;

    }
    
    public List<String> getInheritanceOrder() {
        List<String> inheritanceOrder = new ArrayList<String>();
        getInheritanceOrderHeler(this.person, inheritanceOrder);

        return inheritanceOrder;
    }

    public void getInheritanceOrderHeler(Person person, List<String> inheritanceOrder) {
        if (!person.ifDead) {
            inheritanceOrder.add(person.name);
        }

        for (Person child : person.children) {
            getInheritanceOrderHeler(child, inheritanceOrder);
        }
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */