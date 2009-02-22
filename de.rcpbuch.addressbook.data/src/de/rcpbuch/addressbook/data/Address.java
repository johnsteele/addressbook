package de.rcpbuch.addressbook.data;

public class Address {

	private final int id;
	private String name, street, zip, city;

	public Address(int id, String name, String street, String zip, String city) {
		this.id = id;
		this.name = name;
		this.street = street;
		this.zip = zip;
		this.city = city;
	}

	public Address(Address adr) {
		this.id = adr.id;
		this.name = adr.name;
		this.street = adr.street;
		this.zip = adr.zip;
		this.city = adr.city;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (id != other.id)
			return false;
		return true;
	}

}