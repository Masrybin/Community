package com.bin.bean;

public class Page {
    //当前页码
    private int current = 1;
    //显示上限
    private int limit = 10;
    //数据总数（用于计算页数）
    private int rows;
    //查询路径（复用分页链接）
    private String path="/index";

    public Page() {
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1)
            this.current = current;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (1 <= limit && limit <= 50)
            this.limit = limit;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0)
            this.rows = rows;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getOffset() {
        return current * limit - limit;
    }

    //获取总的页数
    public int getTotal() {
        if (rows % limit == 0)
            return rows / limit;
        else return rows / limit + 1;
    }

    //获取起始页
    public int getFrom() {
        if (current >= 2)
            return current - 2;
        else return 1;
    }

    //获取结束页
    public int getTo() {
        if (current > getTotal() - 2)
            return getTotal();
        else
            return current + 2;
    }
}
