package creational.singleton.model;

public class Version {

	private final int mayor;
	private final int menor;
	private final int revision;


	private static Version instance;

	public synchronized static Version getInstance() {

		if(instance == null)
			return new Version();

		return instance;
	}

	private Version() {
		this.mayor = 1;
		this.menor = 1;
		this.revision = 1;
	}

	public int getMayor() {
		return mayor;
	}

	public int getMenor() {
		return menor;
	}

	public int getRevision() {
		return revision;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	@Override
	public String toString() {
		return "Version{" +
			"mayor=" + mayor +
			", menor=" + menor +
			", revision=" + revision +
			'}';
	}
}
