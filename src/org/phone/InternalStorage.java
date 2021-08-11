package org.phone;

public class InternalStorage {
	private void processorName() {
		System.out.println("processorName:octa-core");

	}
private void ramSize() {
	System.out.println("ramSize:64GB");

}
public static void main(String[] args) {
	InternalStorage i = new InternalStorage();
	i.processorName();
	i.ramSize();
	
	ExternalStorage e = new ExternalStorage();
	e.size();
}
}
