package class_5java;
// to use super keyword we need inheritence otherwise it will not work and super keyword can never be used as the last statement it should be used at first to be operable otherwise it will give error
//super keyword calls the super class or parent class 
//here at the time of object creation puppy is invoked which has super keyword that calls dog which again has super keyword which calls the animal class and animal class's print statement gets executed then it goes to left over print statement of dog class then it goes to left over print statement of puppy class at the end 
class Animal
	{
		Animal()
		{
		System.out.println("Animal is created - Base Class");
		}
	}

class Dog extends Animal
{
	Dog()
	{
	super();//calling the super class constructor
	System.out.println("Dog is created - sub class1");
	}
}
class Puppy extends Dog{
	Puppy(){
		super();//calling the super class constructor
		System.out.println("Puppy is created - sub class2");
	}
}


public class CW_4SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Puppy p = new Puppy();
     
	}

}
