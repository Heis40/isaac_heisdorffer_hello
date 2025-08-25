public class HelloWorld 
{
      
    String name; 
    //String message;
    private int age;
    

    public HelloWorld(String name) 
    { 
    //this.name = name;
    this(name, 0, null); 
    } 

    public HelloWorld(String name, int age, String message)
    {
     this.name = name;
     this.age = age; 
     //this.message = message;
     //if (message != null)
     //{
      //  greet(message);
     //}
    }

    //add Introduce method
    public void introduce()
    {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }
    
    public void greet() 
    { 
        System.out.println("Hello, " + name + "!"); 
    } 
    
    //overload greet method
    public void greet(String message) 
    { 
        System.out.println(message + ", " + name + "!"); 
    }

    public static void main(String[] args) 
    { 
        HelloWorld student = new HelloWorld("Isaac",21,"Good Morning");  
        student.introduce();
        student.greet(); 
        student.greet("Good Morning");
    } 
}
