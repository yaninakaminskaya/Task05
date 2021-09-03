package psps;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronym;
	private String adress;
	private int card;
	private int bank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronym() {
		return patronym;
	}

	public void setPatronym(String patronym) {
		this.patronym = patronym;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}

	public int getBank() {
		return bank;
	}

	public void setBank(int bank) {
		this.bank = bank;
	}

	public Customer(int id, String surname, String name, String patronym, String adress, int card,
			int bank) {

		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronym = patronym;
		this.adress = adress;
		this.card = card;
		this.bank = bank;

	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronym=" + patronym
				+ ", adress=" + adress + ", card=" + card + ", card=" + bank + "]";
	}

}
