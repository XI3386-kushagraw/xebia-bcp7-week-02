import java.util.ArrayList;
import java.util.List;

class Animal {  
    
	public void print() {  
         System.out.println("Animal");  
    }  
}  

class Dog extends Animal {  
    
	public void print() {  
         System.out.println("Dog");  
    }  
}  

class Cat extends Animal {  
	
    public void print() {  
         System.out.println("Cat");  
    }  
}  

public class EnhancedForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EnhancedForEx ef = new EnhancedForEx();  
        
		List<Animal> animals = new ArrayList();  
		
		Animal animal = new Animal();  
		animals.add(animal);  
		animal = new Dog();  
		animals.add(animal);  
		animal = new Cat();  
		animals.add(animal);  
		animal = new Dog();  
		animals.add(animal);  
		animal = new Cat();  
		animals.add(animal);  
		animal = new Dog();  
		animals.add(animal);  
		animal = new Animal();  
		animals.add(animal);  
		animal = new Animal();  
		animals.add(animal);  
		 
		for(Animal anim: animals) {  
			anim.print();  
		}  

	}

}
