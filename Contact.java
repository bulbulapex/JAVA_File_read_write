public class Contact{
	String name;
	String gender;
	String phone;
	String email;
	String address;
	int age;
	String birthDate;
	
	public Contact(String name, String gender, String phone, String email, String address, int age, String birthDate){
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.age = age;
		this.birthDate = birthDate;
	}
	
	void getContactInfo(){
		System.out.println(" Name : " + name + 
						"\n Gender :" + gender +
						"\n Phone :" + phone +
						"\n Email :" + email +
						"\n Address :" + address +
						"\n Age :" + age +
						"\n Birthdate :" + birthDate );
	}
	
	String contactInfo(){
		return "----------------------------------\n Name : " + name + 
						"\n Gender : " + gender +
						"\n Phone : " + phone +
						"\n Email : " + email +
						"\n Address : " + address +
						"\n Age : " + age +
						"\n Birthdate : " + birthDate +
						"\n----------------------------------\n";
	}
	
}