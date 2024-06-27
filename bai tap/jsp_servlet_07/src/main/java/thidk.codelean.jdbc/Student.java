package thidk.codelean.jdbc;

public class Student {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String image;
	private double price;



	public Student(String firstName, String lastName, String email, String image, double price) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.image = image;
		this.price = price;
	}

	public Student(int id, String firstName, String lastName, String email, String image, double price) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.image = image;
		this.price = price;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() { return image; }

	public void setImage(String image) { this.image = image; }

	public double getPrice() { return price;  }

	public void setPrice(double price) { this.price = price; }


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ",image=" + image + ", price=" + price + "]";
	}	
}
