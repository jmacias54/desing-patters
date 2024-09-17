package creational.prototype;

public interface IPrototype<T extends IPrototype> extends Cloneable {

	public T clone();

	public T deepClone();

}
