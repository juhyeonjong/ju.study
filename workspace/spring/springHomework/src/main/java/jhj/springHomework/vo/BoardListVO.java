package jhj.springHomework.vo;

public class BoardListVO extends BoardVO {
	private String mname;
	private int Search;
	private String SearchText;

	public String getSearchText() {
		return SearchText;
	}

	public void setSearchText(String searchText) {
		SearchText = searchText;
	}

	public int getSearch() {
		return Search;
	}

	public void setSearch(int search) {
		Search = search;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}
}
