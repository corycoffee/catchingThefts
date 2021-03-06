package catchingThefts.main.models;

import catchingThefts.main.helper.OutputStringBuilder;

public class Grid {

	int _size;
	String[] _grid;

	public Grid(int size) {
		_size = size;
		buildGrid();
	}

	void clearGrid() {
		int len = _grid.length;
		for (int i = 0; i < len; i++) {
			_grid[i] = getEmptyCol(len);
		}
	}

	String getEmptyCol(int length) {
		String col = "";
		for (int j = 0; j < length; j++) {
			col += '-';
		}
		return col;
	}

	void buildGrid() {
		_grid = new String[_size];
		clearGrid();
	}

	public boolean update(Player[] players) {
		clearGrid();
		setNewPosition(players[0]);
		setNewPosition(players[1]);
		return true;
	}
	
	void setNewPosition(Player player) {

		for (int line = 0; line < _grid.length; line++) {
			if (player.getY() != line) 
				continue;

			// find row-point (x)
			char[] cells = _grid[line].toCharArray();
			for (int point = 0; point < cells.length; point++) {
				if (player.getX() != point) 
					continue;
				// set new line with player at grid
				cells[point] = player.getName();
				_grid[line] = OutputStringBuilder.charArrTo(cells);
				break;
			}
		}
	}
	
	
	public int getSize() {
		return _size;
	}

	public String[] getGrid() {
		return _grid;
	}
}
