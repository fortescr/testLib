package test;

import java.util.ArrayList;
import java.util.List;

import org.jsonConvert.JSONValue;

public class Test 
{
	public static void main(String[] args) 
	{
		new Test();
	}

	public Test()
	{
		List<Person> persons = new ArrayList<Person>();
		Person person = new Person(1, "rodrigo" ,"fortes");
		Address adress = new Address("Rua Santos Saraiva", "Florianópolis");
		person.setAdress(adress);
		List<String> l = new ArrayList<>();
		l.add("test01");
		l.add("test02");
		l.add("test03");
		person.setTest(l);
		
		persons.add(person);
		person = new Person(2, "joara" ,"araújo");
		person.setAdress(adress);
		persons.add(person);
		person = new Person(3, "lola" ,"crazy");
		person.setAdress(adress);
		persons.add(person);		
		
		System.out.println(JSONValue.toJSONFile(persons, "/Users/"+System.getProperty("user.name")+"/Documents/json.js"));
		System.out.println(JSONValue.toJSONString(persons));
	}

}
