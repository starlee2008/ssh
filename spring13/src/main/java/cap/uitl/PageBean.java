package cap.util;

import java.util.List;

public class PageBean {
    //结果集
    private List list;
    //每页多少条数据
    private int pageSize;
    //第几页
    private int pageNo;
    //查询总记录数
    private int totalRecords;

    /**
     * 计算总的页面数
     *
     * @return
     */
    public int getTotalPages() {
        if (totalRecords % pageSize == 0) {
            return totalRecords / pageSize;
        } else {
            return totalRecords / pageSize + 1;
        }
    }

    /**
     * 取得首页
     *
     * @return
     */
    public int getTopPageNo() {
        return 1;
    }

    /**
     * 上一页
     *
     * @return
     */
    public int getPreviousPageNo() {
        if (pageNo <= 1) {
            return 1;
        }
        return pageNo - 1;

    }

    /**
     * 取得尾页
     *
     * @return
     */
    public int getBottomPageNo() {
        return getTotalPages();
    }

    /**
     * 下一页
     *
     * @return
     */
    public int getNextPageNo() {
        if (pageNo >= getBottomPageNo())
            return getBottomPageNo();
        return pageNo + 1;

    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }
}
