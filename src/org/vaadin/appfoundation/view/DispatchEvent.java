package org.vaadin.appfoundation.view;

/**
 * Event class which contains information about which event has been or is being
 * activated.
 * 
 * @author Kim
 * 
 */
public class DispatchEvent {

    private final ViewItem item;

    private final Object[] params;

    /**
     * 
     * @param item
     *            The ViewItem object of the view that is being activated
     */
    public DispatchEvent(ViewItem item, Object... params) {
        this.item = item;
        this.params = params;
    }

    /**
     * Get the ViewItem that is the target of the event.
     * 
     * @return
     */
    public ViewItem getViewItem() {
        return item;
    }

    /**
     * Get the parameters which are used for activating the view.
     * 
     * @return
     */
    public Object[] getActivationParameters() {
        return params;
    }

}