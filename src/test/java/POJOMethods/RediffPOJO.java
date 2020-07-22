package POJOMethods;

public class RediffPOJO {
    private String group;
    private String prevClose;
    private String currentPrice;
    private Integer prcChange;

    public RediffPOJO(String group, String prevClose, String currentPrice, Integer prcChange) {
        this.group = group;
        this.prevClose = prevClose;
        this.currentPrice = currentPrice;
        this.prcChange = prcChange;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPrevClose() {
        return prevClose;
    }

    public void setPrevClose(String prevClose) {
        this.prevClose = prevClose;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getPrcChange() {
        return prcChange;
    }

    public void setPrcChange(Integer prcChange) {
        this.prcChange = prcChange;
    }
}
