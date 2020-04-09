package mocking;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class PersonTest{
	// While doing unit testing using junit you will come across places 
	//where you want to mock classes.Mocking is done when you invoke 
	//methods of a class that has external communication like database
	//calls or rest calls. Through mocking you can explicitly define 
	//the return value of methods without actually executing the steps of the method
	  
		
	//For explanation purpose let’s suppose runInGround(String location) method returns
	//the value by checking a database value which is an external communication. This 
	//particular method is invoked inside isPlay() method of the same Person class and
	//affects the return value of isPlay() method.	
	
	@Test
  public void playTest1() {
    Person person = new Person("name", 15);

	//Mockito provides option to create spy on real objects. When spy is called, then
	//actual method of real object is called.
    
    Person spyPerson = Mockito.spy(person);

    //	doReturn(...) when(...) does not call the method at all.

    Mockito.doReturn(false).when(spyPerson).runInGround("ground");
   
    // Assert.assertEquals() methods checks that the two objects are equals or not.
    //If they are not, an AssertionError without a message is thrown.
    Assert.assertEquals(false, spyPerson.isPlay());
  }

	@Test
	public void playTest2() {
	//When you call a method of the mock object, it returns a specified value but
	//it doesn’t do anything you defined in the class.
		
		Person person = Mockito.mock(Person.class);
	//when(...) thenReturn(...) makes a real method call just before the specified 
	//value will be returned. So if the called method throws an Exception you have
	//to deal with it / mock it etc. Of course you still get your result (what you
	//define in thenReturn(...))

		Mockito.when(person.runInGround("ground")).thenReturn(false);
		
	
	    Assert.assertEquals(false, person.isPlay());


	}
}