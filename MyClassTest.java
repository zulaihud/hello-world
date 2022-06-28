public class MyClass { 
    public String id, name; 
    public int age; 
    public String getId() { 
    return id; 
    } 
     
    public void setId(String id) { 
    this.id = id; 
    } 
    public String getName () { 
    return name; 
    }
   
    
    public void setName (String name) { 
    this.name = name; 
    } 
    public int getAge () { 
    return age; 
    } 
    public void setAge (int age) { 
    this.age = age; 
    } 
}
   
   
   
public class MyClassTest { 
     
    public static void main (String[] args) { 
    MyClass myClass = new MyClass(); 
    myClass.setId ("064002100022"); 
    myClass.setName ("Dimas Humam Arif"); 
    myClass.setAge (19); 
    System.out.println("ID : " + myClass.getId()); 
    System.out.println("Name : " + myClass.getName()); 
    System.out.println("Age : " + myClass.getAge()); 
    } 
}
   