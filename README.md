# 📚 Object-Oriented Programming (OOPs) Concepts Repository

This repository contains examples and implementations of fundamental Object-Oriented Programming concepts in Java.  
It is designed to help understand and practice key OOP principles through practical coding exercises.

---

## 🔧 Tech Stack

- **Language:** Java
- **Tools:** JDK, IntelliJ IDEA/Eclipse/any Java IDE, Maven (optional)

---

## ✨ Concepts Covered

- Classes and Objects  
- Inheritance  
- Polymorphism (Compile-time and Runtime)  
- Encapsulation  
- Abstraction  
- Interfaces and Abstract Classes  
- Constructors and Overloading  
- Method Overriding and Overloading  
- Access Modifiers (private, protected, public)  
- Exception Handling (if included)  
- Packages and Import Statements

---

OOPS Concepts
WHAT IS OOPS?
Object oriented programming (OOP) is a core of Java programming which is used for designing a program using classes and object.
OOPS can also be characterized as data controlling for accessing the
code.
The basic concept of OOPS is used to create objects and
manipulate (modification) this object is to get an expected result.
NOTE:- Object Oriented Programming Concepts are very important. Without having an idea about OOPS concepts, you will not be able to design systems in the object-oriented programming model. It simplifies software development and maintenance.

WHAT ARE THE VARIOUS OOPS CONCEPTS IN JAVA?
1)Class
2) Object
3) Encapsulation
4) Polymorphism
5) Inheritance
6) Abstraction
7) Association
8) Composition
9) Interface

WHAT ARE THE PRINCIPLES OF OOPS?
1) Encapsulation
2) Inheritance
3) Polymorphism
4) Abstraction

NOTE:- Concepts and Pillars are the different things. We have 9 main concepts in java and we have 4 pillars in java.

WHAT ARE THE BENEFITS OF USING OOPS CONCEPT:-
*There are several benefits to use OOPS in Java.*

1) Re-usability:-

When we say re-usability, it means write once and use it multiple times
i.e. reusing some facilities (code) rather than writing it again and again,
which can be achieved by using OOPS concept.
We can use it (code) n number of times whenever and wherever it is
required.
2) Data redundancy (repetitions):-

It is one of the greatest advantages in OOPS this is the condition which
is created at the data storage when some piece of code (data) is held at
2 different places.
If we want to use similar functionalities in multiple classes, we can write a common class definition which will be shared among both the class.
3) Code maintenance:-

It is easy to modify and maintain an existing code as new object which
will be created with small difference from the existing
It is time saving.
4) Security:-

Encapsulation and abstraction are used to filter out limited exposure
which means we are providing only necessary data to view as we have
to maintain the security.
5) Easy troubleshooting:-

Everything in OOPS is an object, we can use this object to interchange
or to remove to meet the users need.
6) Design benefits:-

Once a stable base class is created, the new class which is derived from base class may have less errors and bugs.
Let’s discuss above each OOPS concepts with a real-world example :-

1. CLASS
A class is a set of objects which shares common properties and common behavior.
It is not a real world entity, It is just a template or blueprint from which objects are created. In short, a class is the specification or template of an object.
A class in java can contain data members, methods, constructors, nested classes, interfaces, blocks, etc.
A real-world example is Circle. Let’s look at an example of a class and analyze its various parts in a below diagram. This example declares the class Circle, which has the member-
variables — pi_value, diameter and radius of type Double
methods — getArea() and getPerimeter()
class Circle {

  double pi, diameter, radius;  // Variables which defines properties of circle

  public static void getArea() {  //Methods which defines behaviour of circle
      // Method body
  }

  public static void getPerimeter() {
      // Method body
  }

  public static void getRadius() {
      // Method body
  }
}
2. OBJECT
An object is a real-world entity, that has state and behavior
and it has been created for a specific purpose.
In the real-world, an object can be imagined exactly as it is.
( for eg.: Marker, duster, remote, AC, projector)
Object is a block of memory, which is created at the run-time and it is
stored inside the heap memory.
An object consist of 2 parts:-
1) State/property/attribute
2) Behavior/actions
Attributes are used to define the object’s and behavior specify how the object is used.
An object is not just a product of a class, it also contains the data
members and the methods of that class.
Ex.
1) Marker:-

2) Remote:-


NOTE:-
- Object class is super class in Java.
- Child class can inherit properties of object class.

Let’s look at an example of a object.
This example declares the class Car, which has the members-
-Properties — brand, model, ecapacity,mileage,wheel, seats, doors
-behavior — getBrandDetails(), setSpeed();
class Car {

  String brand, model;
  double ecapacity, mileage;
  int wheels, seats, doors;

  public static void main(String[] args) {

    Car a=new Car();
    a.brand="Suzuki";
    a.model="Brezza";
    a.ecapacity=1500;
    a.mileage=20.4;
    a.wheels=4;
    a.seats=5;
    a.doors=5;
  }
  
  public void getBrandDetails() {
    System.out.println("Brand: "+a.brand);
    System.out.println("Model: "+a.model);
    System.out.println("Ecapacity: "+a.ecapacity);
    System.out.println("Milage: "+a.mileage);
    System.out.println("Wheels: "+a.wheels);
    System.out.println("Seats: "+a.seats);
    System.out.println("Doors: "+a.doors);
  }

  public void setSpeed() {
    //Method body
  }
}
Object creation statement:-
Syntax:- [class_name] [var_name] = new [class_name]();


Object Creation Statement Example
Difference Between Object and Class

Difference between Object and Class
3. ENCAPSULATION
It is a process of binding or wrapping the data members (states/
properties /variables) and member functions (behaviors /actions)
together representing as a single unit is known as Encapsulation.
WHAT IS DATA HIDING:-
The process of redirecting the direct access to the attributes of a class
and provides a secure and indirect access to the properties with the
help of behaviors of that class is known as Data hiding.


Encapsulation
WHY WE NEED ENCAPSULATION?
1) We can achieve security by hiding the data, with the help of private
modifier restricting the direct access.
2) getter and setter method provide read only or write only access.
3) It helps us to keep related field and methods together which makes our
code cleaner and easy to read

STEPS TO ACHIEVE ENCAPSULATION:-
1) Declare the variable of a class as private.
2) Provide public getter (to get data) and setter (to set data) methods to
modify and view the variables.

NOTE:- getter and setter is not a inbuilt functions in JAVA, it is an industrial convention to use get and set.
- getter is used to get the values
-setter is used to set the values

Let’s look at an example of Encapsulation.
This example declares the variable a & b as private. For accessing the values of a & b in other class, we have to use getters and setters.
class Demo1 {
  private int a;
  private int b;

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a=a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b=b;
  }
}

class Demo2  {
  
  public static void main(String[] args) {

    Demo1 ab=new Demo1();
    ab.setA(100);
    ab.setB(200);
    System.out.println("value of a = "+ab.getA());
    System.out.println("value of b = "+ab.getB());
   
  }
}
Output :-
Value of a = 100
Value of b = 200

NOTE:-
- For the security purpose, we should not give direct access to the
properties of a class.
- But the user should be able to read or modify the data members with
the help of behaviors (methods).
- private modifier specify that the member can only be accessible within the
same class.
- Members that are declared private can be accessed outside the class if
public getter methods are present.

Let’s look at the second example of Encapsulation. This example is related to the login page details

import java.util.Scanner;

class Snapchat {
    private String un;
    private String pass;
    private String email;
    private String dob;
    private long mobile;

    Scanner sc = new Scanner(System.in);

    Snapchat(String un, String pass, String email, String dob, long mobile) {
        this.un = un;
        this.pass = pass;
        this.email = email;
        this.dob = dob;
        this.mobile = mobile;
        System.out.println("Account created successfully");
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        this.un = un;
        System.out.println("username change Successfully");
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
        System.out.println("change pass Successfully");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("change email Successfully");
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
        System.out.println("change dob successfully");
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
        System.out.println("Account login Successfully");
    }

    public long getMobile() {
        System.out.println("enter your pass:");
        String pass1 = sc.next();

        if (this.pass.equals(pass1)) {
            return mobile;
        } else {
            System.out.println("incorrect getPass");
        }
        return 0;
    }
}

class SnapchatDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Snapchat a = new Snapchat("ABC", "Shubh123", "Shubhamyadav7350@gmail.com", "15/09/1999", 1234567890);

        for (;;) {
            System.out.println("1.GET UN 2.SET UN 3.GET PASS 4.SET PASS 5.GET EMAIL 6.SET EMAIL 7.GET DOB 8.SET DOB");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println(a.getUn());
                    break;
                case 2:
                    a.setUn("Piyush");
                    break;
                case 3:
                    a.setPass("Piyush123");
                    break;
                case 4:
                    System.out.println(a.getPass());
                    break;
                case 5:
                    a.setEmail("piyush123@gmail.com");
                    break;
                case 6:
                    System.out.println(a.getEmail());
                    break;
                case 7:
                    a.setDob("29/12/1999");
                    break;
                case 8:
                    System.out.println(a.getDob());
                    break;
                case 9:
                    a.setMobile(1234567890);
                    break;
                case 10:
                    System.out.println(a.getMobile());
                    break;
                case 11:
                    System.exit(0);
            }
        }
    }
}
RELATIONSHIP
Relationship in Java means different relations between 2 or more
classes.
It means that an instance (object) of a class that has a reference to the
an instance of another class or the other instance of the same class.
Relationships are classified into 2 types:-
1) Has a relationship
2) Is a relationship

Type of Relationship
Has a relationship:-
— It is an association between 2 or more objects such that they are
dependent on each other is known as Has a relationship / Association.
— When an object of one class is created as a data member (variable)
inside another class, it is called as Has a Relationship.
— In other words, a relationship in which an object of one class has a
reference to an object of another class.
— Has a relationship is also known as Association.
Real-time example for the association: -

class Vehicle {
    String company;
    double price;
    String mfd;

    Vehicle(String company, double price, String mfd) {
        this.company = company;
        this.price = price;
        this.mfd = mfd;
    }

    public void displayVehicle() {
        System.out.println("Vehicle details");
        System.out.println("COMPANY NAME : " + this.company);
        System.out.println("Vehicle price : " + this.price + " rs");
        System.out.println("MFD : " + this.mfd);
    }

}

class Brand extends Vehicle {
    String model;
    String color;
    int cc;

    Brand(String model, String color, int cc, String company, double price, String mfd) {
        super(company, price, mfd);
        this.model = model;
        this.color = color;
        this.cc = cc;
    }

    public void displayBrand() {
        System.out.println("Brand Details");
        System.out.println("Model name : " + this.model);
        System.out.println("color : " + this.model);
        System.out.println("cc :" + this.cc);
    }
}

class Driver {
    public static void main(String[] args) {
        Brand b = new Brand("thar", "black", 1400, "mahindra", 1600000, "22/12/22");
        b.displayVehicle();
        b.displayBrand();
    }
}
The association is classified as: -
1) Composition
2) Aggregation

1) Composition: -
It is an association between 2 objects, that is one cannot exist without
another.
- Ex. car and engine, fish and water, computer and CPU, AC and
compressor, human and brain.
class Main {

  public static void main(String[] args) {
    Main2 main2=new Main2(30, 40);
    main2.main1.displayMain1();
    main2.displayMain2();
  }
}

class Main1 {

  int a;
  int b;
  
  Main1(int a, int b) {
    this.a=a;
    this.b=b;
  }

  public void displayMain1() {
    System.out.println("A: "+this.a);
    System.out.println("B: "+this.b);
  }
}

class Main2 {

  int c;
  int d;
  Main1 main1 = new Main1(10, 20);

  Main2(int c, int d){
    this.c=c;
    this.d=d;
  }

  public void displayMain2() {
    System.out.println("C: "+this.c);
    System.out.println("D: "+this.d);
  }
}
Output:-
A: 10
B: 20
C: 30
D: 40

2) Aggregation:-
Aggregation is also known as late binding/lazy instantiation.
The instance of a dependent object is not implicitly created with the
help of a non-static initializers.
Instance of a method is created and reference of a dependent object
gets created only when the method is called for execution.
class Main {

  public static void main(String[] args) {
    Main2 main2=new Main(30, 40);
    main2.createMain1();
    main2.displayMain2();
    main2.main1.displayMain2();
  }
}

class Main1 {
  
  int a;
  int b;

  Main1(int a, int b){
    this.a=a;
    this.b=b;
  }

  public void displayMain1() {
    System.out.println("Main1 class");
    System.out.println("A:-"+this.a);
    System.out.println("B:-"+this.b);
  }
}

class Main2 {
  
  int c;
  int d;
  Main1 main1;

  Main1(int c, int d){
    this.c=c;
    this.d=d;
  }
  
  public void displayMain2() {
    System.out.println("Main2 class");
    System.out.println("C:-"+this.c);
    System.out.println("D:-"+this.d);
  }

  public void createMain1() {
    main1=new Main1(10, 20);
  }
}
OUTPUT:-
Main2 class
C:-30
D:-40
Main1 class
A:-10
B:-20

3) INHERITANCE:-
Inheritance in java is a mechanism in which one object acquires all the
properties and behavior of a parent object.
The idea behind inheritance in java is that we can create new classes
that are built upon existing classes.
When we inherit a class, we can reuse methods and fields of the parent
class. More ever we can add new methods and fields in our current class
also.
Inheritance represents Is a relationship, which is also known as Parent
child relationship.
Why we use inheritance?
1) Re-usability
2) Time consumption is less.
3) Code sharing
4) Data redundancy

Terminologies used in inheritance:-

1) Class : Class is a blueprint from which objects are created.

2) Child class/sub class : A sub class is a class which inherits the other class, it is also called as extended class/derived class.

3) Super class/parent class - Super class is a class from where a sub class inherits the features (functionalities), it is also known as base class.

4) Re-usability - Re-usability is a mechanism which fancily takes us to reuse the fields and methods of the existing class when we create a new class.

class Parent {
  String a;
  String b;

  Parent(String a,String b){
    this.a=a;
    this.b=b;
  }

  public void displayParent() {
    System.out.println(this.a);
    System.out.println(this.b);
  }

  public void m1() {
    System.out.println("From parent class m1()");
  }
}

class Child extends Parent{

  Child(){ 
    super("Parent", "Base");
  }

  public void m2() {
    System.out.println("From child class m3()");
  }

  public statis void main(String[] args) {
    Child child = new Child();
    child.m1();
    child.m2();
  }
}
NOTE:- With the help of child class references, we can use all the members of child class as well as parent class.

extends keyword:-
- The extends keyword indicates that the extended class inherits/
acquires all the properties and behavior of the base class.
- The keyword basically establishes a relationship of an inheritance
among classes.
- If a class extends another class, then we say that it has acquired all the
properties and behavior of the parent class.

Types of inheritance:-
1) Single-level inheritance
2) Multi-level inheritance
3) Hierarchical inheritance
4) Multiple inheritance (not supported in Java in classes)
5) Hybrid inheritance (partly supported in Java in classes)


Types of Inheritance
1) Single-level inheritance
- Single-level inheritance can be achieved by making one class as a child
of another.

class Dept {
  String name, hod;
  int labs, staff;

  Dept(String name,String hod,int labs,int staff){
    this.name=name;
    this.hod=hod;
    this.labs=labs;
    this.staff=staff;
  }

  public void displayDept() {
    System.out.println("Dept details");
    System.out.println("Dept name: "+this.name);
    System.out.println("HOD name: "+this.hod);
    System.out.println("No. of labs: "+this.labs);
    System.out.println("No. of staff: "+this.staff);
  }

  public void rules() {
    System.out.println("Rules");
    System.out.println("Attendance should be more than 75%");
    System.out.println("Id card mandatory");
    System.out.println("Uniform is not mandatory on Wednesday");
  }
}

class Mech extends Dept{

  int stud, subj;

  Mech(int stud, int subj,String name,String hod,int labs,int staff){
    super(name, hod, stud, subj);
    this.stud=stud;
    this.subj=subj;
  }

  public void displayMech() {
    System.out.println("No. of students: "+this.stud);
    System.out.println("No. of subj: "+this.subj);
  }

  public void subj() {
    System.out.println("Subject names");
    System.out.println("Design of machine");
  }
}

class Driver2 {
    
  public static void main(String[] args) {
    Mech m=new Mech(2000,45,"Mech","ABC",15,50);
    m.displayDept();
    m.displayMech();
    m.rules();
    m.subj();
  }
}
2) Multi-level inheritance:-
- The multi-level inheritance includes the involvement of at least 3or
more than 3 classes.
- One class inherits the features from a parent class and the newly
created child class became the base class for another new class.

class State{
 
  String name1="Maharashtra";
  int countOfCity=30;
}

class City extends State{
  
  String name2="Pune";
  int countOfArea=40;
}

class Area extends City{
  
  String name3="Deccan";
  int countOfColony=10;
}

class Driver {
  
  public static void main(String[] args) {
    Area a=new Area();
    System.out.println("State name: "+a.name1);
    System.out.println("Number of cities: "+a.countOfCity);
    System.out.println("City name: "+a.name2);
    System.out.println("Number of areas: "+a.countOfArea);
    System.out.println("Area name: "+a.name3);
    System.out.println("Number of colonies: "+a.countOfColony);
  }
}
3) Hierarchical inheritance:-
- Hierarchical inheritance in Java is a type of inheritance in which the same
class is inherited by more than one class.
- In other words, when several classes inherit the feature from the same
class this type of inheritance is said to be Hierarchical inheritance.

class Vehicle {

  double price = 600000;
  
  public void exShwPrice() {
    System.out.println("Ex-showroom price"+price+"Rs");
  }
}

class Mh extends Vehicle {
  
  public void mhPrice() {
    double tax = 0.18;
    double mh = (price*tax)+price;
    System.out.println("MH price: "+mh+"Rs");
  }
}

class Dl extends Vehicle{
  
  public void dlPrice() {
    double tax = 0.22;
    double dl = (price*tax)+price;
    System.out.println("DL price: "+dl+"Rs");
  }
}

class Pb extends Vehicle{

  public void pbPrice() {
    double tax=0.20;
    double pb = (price*tax)+price;
    System.out.println("PB price: "+pb+"Rs");
  }
}

class DriverVehicle {
  
  public static void main(String[] args) {
    Mh a=new Mh();
    a.mhPrice();
    Dl b=new Dl();
    b.dlPrice();
    Pb c=new Pb();
    c.pbPrice();
  }
}
OUTPUT:-
MH price: 708000.0Rs
DL price: 732000.0Rs
PB price: 720000.0Rs

4) Multiple inheritance:-
- Multiple inheritance in Java is the capability of creating a single class
with multiple super classes.
- Multiple inheritance in Java has some limitations which are known as
Diamond problem.
- The diamond problem is an ambiguity (confusion) that occurs while object creation, which parent class constructor needs to be called? And if 2
the super class has the same method signature, which method needs to be
called for execution?
- Therefore, the creators of Java instead of resolving the problem they
restricted multiple inheritances.
- Therefore, in Java, 1 class can extend only 1 class.

4)POLYMORPHISM:-
The dictionary definition of polymorphism refers to a principle in
biology in which a species can have different forms or stages.
This principle can also be applied to object-oriented programming like
Java.
Polymorphism is derived from a Greek word:-
Poly means many and morph means forms
Polymorphism stands for one name and many forms
Ex. Polytechnic, polyhouse, polyclinic, etc.
Polymorphism is classified into 2 types:-

Types of Polymorphism
1) Compile time polymorphism /static polymorphism /early binding:-

If the binding is achieved at the compile time and some behavior is
executed is known as Compile time polymorphism.
Note:- Binding means an association of the method call statement to the method
definition.

Types of Compile time polymorphism:-
A. Method overloading
B. Constructor overloading
C. Method shadowing:- same method signature for a static method.

a) Method overloading:-
- If more than 1 method is created with the same name and different formal arguments in the same class is known as Method overloading.
- Ex. split(), indexOf(), lastIndexOf(), append(), insert(), replace(),
substring().

class Main {

  public static void main(String[] args) {
    Demo6.m1();
    Demo6.m1(10);
    Demo6.m1(10,20);
    Demo6.m1(10,20,30);
  }
}

class Demo6 {
  
  public static void m1() {
    System.out.println("From no argument ()");
  }

  public static void m1(int a) {
    System.out.println("From 1 argument ()");
  }

  public static void m1(int a, int b) {
    System.out.println("From 2 argument ()");
  }
  
  public static void m1(int a, int b, int c) {
    System.out.println("From 3 argument ()");
  }
}
b) Constructor overloading:-
- A class having more than 1 constructor with different formal arguments
is known as Constructor overloading

class Main{
  public static void main(String[] args) {
    Demo8 a=new Demo8();
    Demo8 b=new Demo8(10);
    Demo8 c=new Demo8(10,20);
    Demo8 d=new Demo8(10,20,30);
  }
}

class Demo8 {
  
  Demo8() {
    System.out.println("From no argument ()");
  }

  Demo8(int a) {
    System.out.println("From 1 argument ()");
  }
  
  Demo8(int a, int b) {
    System.out.println("From 2 argument ()");
  }

  Demo8(int a, int b, int c) {
    System.out.println("From 3 argument ()");
  }
}
c) Method shadowing:-
- If a sub-class and super class have the static method with the same
signature is known as Method shadowing.

Note:-
Which method of implementation gets executed depending on what?
In method shadowing, binding is done at the compile time, the
execution of the method depends upon the reference type (class name).

class Parent {
  
  public static String m1() {
    System.out.println("From Parent m1()");  //this method is hidden or shadowed
    return null;
  }
}

class Child extends Parent {

  public static String m1() {
    System.out.println("From Child m1()");
    return null;
  }
}

class Driver {
 
  public static void main(String[] args) {
    Child.m1();
  }
}
Note:-
- The return type should be the same for primitive datatype.
- The return type can be same or it should be covariant for non-primitive
datatype.
- Method shadowing is applicable only for static methods.

d) Variable shadowing:-
- If a super class and sub-class have a variable with the same name then it is
known as Variable shadowing.
- The variable which is used depends on the reference type.

class SuperClass {
  String name="Super class";
  }

class SubClass extends SuperClass {
  String name="Sub class";
  }

class Driver13 {
  
  public static void main(String[] args) {
    SuperClass sp=new SubClass();
    System.out.println(sp.name); // here SuperClass variable is shadowed
    SubClass sb=(SubClass)sp;    // for accessing SuperClass variable 
    System.out.println(sb.name); 
  }
}
2) Run time polymorphism /dynamic polymorphism /late binding:-
- If the binding is achieved at the run time, then it is known as Run time
polymorphism.
- Run time polymorphism is achieved by method overriding.

a) Method overriding:-
- If a super class and subclass have non-static methods with the same
method signature it is known as Method overriding.

class Rbi {
  
  public void roi() {                  //overridden method
    System.out.println("RBI: 7.0%");
  }
}

class Sbi extends Rbi{
  
  public void roi() {                  //overriding method
    System.out.println("SBI: 8.5%");
  }
}

class Hdfc extends Rbi{

  public void roi() {
    System.out.println("HDFC:7.7%");
  }
}

class Icici extends Rbi{
  
  public void roi() {
    System.out.println("ICICI:7.9%");
  }
}

class Driver5{
  
  public static void main(String[] args) {
    Rbi a=new Sbi();
    a.roi(); 
    Rbi b=new Hdfc();
    b.roi(); 
    Rbi c=new Icici();
    c.roi();
  }
}  
Note:-
- The method present in parent class is called as overridden method.
- The method present in child class is called as overriding method.

RULES TO ACHIEVE METHOD OVERRIDING:-
1) Is a relationship (inheritance) being mandatory.
2) It is applicable only for non-static methods.
3) The signature of subclass method and super class method should be the
same.
4) The return type of subclass and super class methods should be the same
until version 1.4
5) But from the version 1.5, but for non-primitive return type, it can be a
covariant return type.

b) Method hiding:-
When a super class and sub class is having a same method signature,
the method in the super class will be hidden by one of the methods
which is present in sub class, this mechanism is known as Method
hiding.

class Gold{
  
  public void gst() {                
    System.out.println("MH:5.5%");
  }
}

class Pune extends Gold{

  public void gst() {
    System.out.println("Pune:4.4%");
  }
}

class Mumbai extends Gold{

  public void gst() {
    System.out.println("Mumbai:3.8%");
  }
}

class Nagpur extends Gold{

  public void gst() {
    System.out.println("Nagpur:6.1%");
  }
}

class Driver {
  
  public static void main(String[] args) {
    Gold a=new Pune();
    a.gst(); 
    Gold b=new Mumbai();
    b.gst(); 
    Gold c=new Nagpur();
    c.gst(); 
  }
}
4)ABSTRACTION:-
The process of hiding the implementation details and showing only the
features are known as Abstraction.
In abstraction, we provide partial implantation.
It is a design process that helps the service specifier (customer) to
provide the most essential features of the project without providing the
implementation details are known as Abstraction.

WHAT IS AN ABSTRACT METHOD?
- Method declared without body (no implementation) with an abstract
modifier or keyword in its method declaration is known as Abstract
method.
- In other words, if we want a class to contain particular method but we
want the actual implementation of the method to be determined by its
child classes, then we declare the method in parent class as Abstract.
- We cannot have an implementation (body) for an abstract method.
- Semicolon at the end of method declaration is mandatory.
- If a class contains a single abstract method in it, it is mandatory to
declare that class as abstract.
- And also, the derived classes (child classes) should have the methods in
it (overriding).

abstract class Demo1{
  
  public void m1() {
    System.out.println("Method with implementation");
  }
  
  public abstract void m2();
  
  abstract void m3();
}
HOW MANY WAYS WE CAN ACHIEVE ABSTRACTION?
- We can achieve abstraction in two ways


Types of Abstraction
1. with the help of ABSTRACT CLASS.
2. with the help of INTERFACE.

A class that contains abstract keyword in its declaration is known as
Abstract class.

Note:-
- An abstract class may or may not contain any abstract methods
(methods without implementation).
- But if a class has at least 1 abstract method then it is mandatory the
class must be declared as abstract.
- And if a class is declared as abstract it cannot be instantiated (object
creation).
- To use an abstract class, we must inherit it from another class (child
class), by providing implementation to its abstract methods.
- We can inherit an abstract class but we must provide implementation to
all the abstract methods present in it.

2)INTERFACE:-
An interface in Java language is an abstract type that is used to describe
the behaviors (methods) that classes must implement.
An interface is a reference type which is similar to a class, it is a collection of abstract methods. Along with abstract methods and interfaces may also contain constants, default, static methods, and nested types.
Method body exists only for the default static method.
An interface keyword is used to declare an interface.

PROPERTIES OF AN INTERFACE:-
1) An interface is implicitly abstract that is we do not need to provide
an abstract keyword that declaring an interface.
2) Each method in interface is also implicitly abstract so abstract keyword
is not needed.
3) Methods in an interface are by default public.
4) We cannot create an object of an interface.
5) Global Variables created in an interface is by default static and final.

AN INTERFACE IS SIMILAR TO A CLASS IN FOLLOWING WAYS:-
1) An interface can contain any number of methods.
2) Interface file is saved with a .java extension, with a name of an interface
matching with the file name.
3) The byte code of interface is in .class extension.

AN INTERFACE IS DIFFERENT FROM A CLASS IN FOLLOWING WAYS:-
1) We cannot instantiate an interface.
2) An interface does not contain any constructor.
3) All the methods in an interface are by default abstract.
4) An interface cannot contain instance fields.
5) An interface can consist of default and static methods.
6) An interface cannot be extended by a class, it is implemented by it.

interface Interf{
  void m1();
  }

class Implementation implements Interf{
  public void m1(){
    System.out.println("Implementation for m1()");
  }
  
  public static void main(String[] args) {
    Implementation i = new Implementation();
    i.m1();
  }
}
EXTENDING OF INTERFACE:-
- An interface can extend another interface. Similarly, in a way that a
class can extend another class.
- extends keyword is used to extend an interface, and the child interface
inherits the methods of the parent interface.

interface HomePage{
void product();
}

interface ProDesc extends HomePage{
void desc();
void spec();
void price();
}

interface BuyNow extends ProDesc{
void seller();
}

interface Payment extends BuyNow{
void cod();
}

class Flipkart{
  public static void main(String[] args) {
    Flipkart f=new Flipkart();
    f.product();
    f.desc();
    f.spec();
    f.seller();
    f.price();
    f.cod();
  }
  
  public void product() {
    System.out.println("Product: Water bottle");
  }

  public void cod() {
    System.out.println("You have selected COD option");
  }

  public void price() {
    System.out.println("Price: Rs:150/-");
  }

  public void desc() {
    System.out.println("*** Description ***");
    System.out.println("Highly reliable product");
    System.out.println("Material: Plastic");
    System.out.println("High strength");
  }

  public void seller() {
    System.out.println("Seller: ABC Enterprises");
  }

  public void spec() {
    System.out.println("*** Specifications ***");
    System.out.println("Weight: 200gm");
    System.out.println("Colour: Black");
  }
}
OUTPUT:-
Product: Water bottle
*** Description ***
Highly reliable product
Material: Plastic
High strength
*** Specifications ***
Weight: 200gm
Colour: Black
Seller: ABC Enterprises
Price: Rs:150/-
You have selected COD option

Note:- Multiple inheritance is possible in interface because,
1) Non static methods are abstract and they do not have any body, hence
that is why there is no ambiguity (confusion).
2) Static methods of an interface cannot be inherited that is why no
ambiguity.
3) Interface does not have any constructor that is why there is no
ambiguity in super call statement.

WHAT ARE THE TYPES OF INTERFACES ?
1) TAGGED INTERFACE:-
- An interface which does not certain any abstract method, fields,
constants is known as Marker or Tagged interface.
- It may contain static methods.

Interface Marker{
  public static m1(){
    //method body
  }
}
FUNCTIONAL INTERFACE:-
- An interface that contains only one abstract method in it is known as
Functional interface.
- It can have any number of default, static methods but can contain only
one abstract method.

interface Functional {
  int a=10;
  int b=50;

  public static void m1() {
    System.out.println("From m1()");
  }
  
  void m2();
}





## 📦 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/Shashankshekhar05/OOPs.git
cd OOPs
📫 Contact
GitHub: Shashankshekhar05

LinkedIn: shashankshekhar05
⭐ Thanks for exploring the OOPs concepts repository! Keep coding and learning!
