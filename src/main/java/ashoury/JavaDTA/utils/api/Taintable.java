package ashoury.JavaDTA.agent;

public interface Taintable {
	void setTaint(boolean value, String className);

	String getTaintSource();

	boolean isTainted();
}
