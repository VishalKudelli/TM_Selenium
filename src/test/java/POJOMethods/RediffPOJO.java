package POJOMethods;

public class RediffPOJO {
    private String group;
    private String prevClose;
    private String currentPrice;
    private String prcChange;

    public RediffPOJO(String group, String prevClose, String currentPrice, String prcChange) {
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

    public String getPrcChange() {
        return prcChange;
    }

    public void setPrcChange(String prcChange) {
        this.prcChange = prcChange;
    }
}
