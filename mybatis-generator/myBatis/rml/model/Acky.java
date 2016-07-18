package rml.model;

public class Acky {
    private String appName;

    private String downcntTotal;

    private String col3;

    private String tags;

    private String col5;

    private Integer lang;

    private String author;

    private Integer bizcatId;

    private String col9;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public String getDowncntTotal() {
        return downcntTotal;
    }

    public void setDowncntTotal(String downcntTotal) {
        this.downcntTotal = downcntTotal == null ? null : downcntTotal.trim();
    }

    public String getCol3() {
        return col3;
    }

    public void setCol3(String col3) {
        this.col3 = col3 == null ? null : col3.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getCol5() {
        return col5;
    }

    public void setCol5(String col5) {
        this.col5 = col5 == null ? null : col5.trim();
    }

    public Integer getLang() {
        return lang;
    }

    public void setLang(Integer lang) {
        this.lang = lang;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getBizcatId() {
        return bizcatId;
    }

    public void setBizcatId(Integer bizcatId) {
        this.bizcatId = bizcatId;
    }

    public String getCol9() {
        return col9;
    }

    public void setCol9(String col9) {
        this.col9 = col9 == null ? null : col9.trim();
    }
}