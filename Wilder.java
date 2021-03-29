package java_quete6;

public class Wilder {
	//atributes
	private String firstname;
	private boolean aware;

	//Const
	public Wilder (String firstname, boolean aware)
	{
		this.setFirstname(firstname);
		this.setAware(aware);
	}
	
	//
	public String whoAmI() {
		if (aware)
		{
			return "Je m'appelle "+ getFirstname() +" et je suis aware";
		}
		return "Je m'appelle "+ getFirstname() +" et je ne suis pas aware";
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}
}
