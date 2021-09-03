package psps;

public class Train {

	private String whereToGo;
	private int trainNumber;
	private int whenGoes;

	public Train(String whereToGo, int trainNumber, int whenGoes) {
		this.whereToGo = whereToGo;
		this.trainNumber = trainNumber;
		this.whenGoes = whenGoes;

	}

	public String getWhereToGo() {
		return whereToGo;
	}

	public void setWhereToGo(String whereToGo) {
		this.whereToGo = whereToGo;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getWhenGoes() {
		return whenGoes;
	}

	public void setWhenGoes(int whenGoes) {
		this.whenGoes = whenGoes;
	}

	@Override
	public String toString() {
		return "Train [whereToGo=" + whereToGo + ", trainNumber=" + trainNumber + ", whenGoes=" + whenGoes + "]";
	}

}
