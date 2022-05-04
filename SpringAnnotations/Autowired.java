// used to auto-wire spring bean on setter methods, constructor and instance variable. It injects object dependency implicitly.

@Component

public class Employee{

private Person person;

@Autowired

public Employee(Person person){
    this.person = Person
}