package component;

/**
 *
 * @author RAVEN
 */
public interface TableActionEvent {

    public void onPlus(int row);

    public void onDelete(int row);

    public void onMinor(int row);
}
