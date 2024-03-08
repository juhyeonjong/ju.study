package jhj.springHomework.vo;

public class PageMakerVO extends PageVO{

	/* 시작 페이지 */
    private int startPage;
    
    /* 끝 페이지 */
    private int endPage;
    
    /* 이전 페이지, 다음 페이지 존재유무 */
    private boolean prev, next;
    
    /*전체 게시물 수*/
    private int total;
    
    /* 현재 페이지, 페이지당 게시물 표시수 정보 */
    private PageVO vo;
    
    private int aa;
    
    public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

	//현재 페이지와 총 개시물 수를 받는 경우 생성자
    public PageMakerVO(PageVO vo, int total) {
    	
    	/* 마지막 페이지 */
        this.endPage = (int)(Math.ceil(vo.getPageNum()/10.0))*10;
        System.out.println(endPage+"마");
        /* 시작 페이지 */
        this.startPage = this.endPage - 9;
        System.out.println(startPage+"ㅇ");
        /* 전체 마지막 페이지 */
        int realEnd = (int)(Math.ceil(total * 1.0/vo.getAmount()));
        System.out.println(realEnd+"진짜");
        /* 전체 마지막 페이지(realend)가 화면에 보이는 마지막페이지(endPage)보다 작은 경우, 보이는 페이지(endPage) 값 조정 */
        if(realEnd < this.endPage) {
            this.endPage = realEnd;
        }
        
        /* 시작 페이지(startPage)값이 1보다 큰 경우 true */
        this.prev = this.startPage > 1;
        
        /* 마지막 페이지(endPage)값이 1보다 큰 경우 true */
        this.next = this.endPage < realEnd;
        
        aa = vo.getPageNum();
    }

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public PageVO getVo() {
		return vo;
	}

	public void setVo(PageVO vo) {
		this.vo = vo;
	}

	
	
	@Override
	public String toString() {
		return "PageMakerVO [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", total=" + total + ", vo=" + vo + "]";
	}
    
    
    
    
    
	
}
