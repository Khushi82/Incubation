package com.epam.incubation;

interface FirstName {

	void firstName(String ffName, String mfName);

}

interface LastName {
	void lastName(String flName, String mlName);
}

class Child implements FirstName, LastName {

	String fatherFirstName, motherLastName, fatherLastName, motherFirstName;
	String childName, childFirstName, childLastName;

	@Override
	public void lastName(String flName, String mlName) {

		this.fatherLastName = flName;
		this.motherLastName = mlName;

	}

	@Override
	public void firstName(String ffName, String mfName) {

		this.fatherFirstName = ffName;
		this.motherFirstName = mfName;
	}

	public String getChildName() {

		if (motherLastName == fatherLastName)
			childLastName = motherLastName;
		else
			childLastName = motherLastName +" "+ fatherLastName;
		childFirstName = fatherFirstName.substring(0, 3) + motherFirstName.substring(0, 3);

		childName = childFirstName +" "+ childLastName;

		return childName;
	}

}

public class MultipleInheritance {

	public static void main(String[] args) {

		Child child = new Child();
		child.firstName("John", "Danereys");
		child.lastName("Targereyn", "Targareyn");
		String childName = child.getChildName();
		System.out.println(childName);
		child.firstName("Sansa", "Tyrion");
		child.lastName("Stark", "Lannister");
		System.out.println(child.getChildName());
	}

}
