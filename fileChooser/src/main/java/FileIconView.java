import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;
import java.io.File;


/**
 * Created by ScorpionOrange on 2016/09/26.
 * A file view that dispalys an icon for all files that match a file filter.
 */
public class FileIconView extends FileView {
    private FileFilter filter;
    private Icon icon;

    /**
     * Constructs a FileIconView.
     * @param aFilter a file filter--all files that this filter accepts will be shown with the icon.
     * @param anIcon--the icon shown with all accepted files.
     */
    public FileIconView(FileFilter aFilter, Icon anIcon){
        filter = aFilter;
        icon = anIcon;
    }

    public Icon getIcon(File file){
        if( !file.isDirectory() && filter.accept(file)) {
            return icon;
        }
        else {
            return null;
        }
    }
}
