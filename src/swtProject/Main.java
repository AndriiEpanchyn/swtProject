package swtProject;

import org.eclipse.swt.widgets.*;

public class Main {
    public static void main(String[] args) {
	Display display = new Display();
	Shell mainWindow = new WindowBuilder().build(display);
	UserInterface calc = new UserInterface(mainWindow);
	calc.run();

	// Proceed_window
	mainWindow.open();
	while (!mainWindow.isDisposed()) {
	    if (!display.readAndDispatch())
		display.sleep();
	}
	display.dispose();
    }
}