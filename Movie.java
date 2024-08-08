class Movie{
    private String mname;
    private String aname;
    private int ryear;

    public Movie(String mname, String aname, int ryear) {
        this.mname = mname;
        this.aname = aname;
        this.ryear = ryear;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        mname = mname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        aname = aname;
    }

    public int getRyear() {
        return ryear;
    }

    public void setRyear(int ryear) {
        this.ryear = ryear;
    }


    
}