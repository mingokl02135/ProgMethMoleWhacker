package application;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class BlockPane extends TilePane {
	public BlockPane() {
		setPrefRows(4);
		setPrefColumns(3);
		setTileAlignment(Pos.CENTER);
		setHgap(3.5);
		setVgap(3.5);
	}
}
