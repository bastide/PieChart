package piechart;

import javax.swing.JLabel;

/**
 * A MVC View of a Percentage as a label.
 * This is not a MVC Controller, so it does not allow to change the Percentage value
 * This class implements PercentageListener, to be informed of changes in the Percentage
 * This class does not need a reference to the model, since it is passed as a parameter
 * in the notification.
 */
public class PercentageLabel extends JLabel implements PercentageView {
	/**
	 * Called by the Model (Percentage) when a change occurs
	 */
	public void notify(PercentageModel model) {
		setText("" + Math.round(model.getValue() * 100) + "%");
	}
}
