import java.util.Arrays;

public class Bird {
    private String sciName;
    private String comName;
    private String speciesCode;
    private String category;
    private int taxonOrder;
    private String[] bandingCodes;
    private String[] comNameCodes;
    private String[] sciNameCodes;
    private String order;
    private String familyCode;
    private String familyCOmName;
    private String familySciName;

    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getSpeciesCode() {
        return speciesCode;
    }

    public void setSpeciesCode(String speciesCode) {
        this.speciesCode = speciesCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getTaxonOrder() {
        return taxonOrder;
    }

    public void setTaxonOrder(int taxonOrder) {
        this.taxonOrder = taxonOrder;
    }

    public String[] getBandingCodes() {
        return bandingCodes;
    }

    public void setBandingCodes(String[] bandingCodes) {
        this.bandingCodes = bandingCodes;
    }

    public String[] getComNameCodes() {
        return comNameCodes;
    }

    public void setComNameCodes(String[] comNameCodes) {
        this.comNameCodes = comNameCodes;
    }

    public String[] getSciNameCodes() {
        return sciNameCodes;
    }

    public void setSciNameCodes(String[] sciNameCodes) {
        this.sciNameCodes = sciNameCodes;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getFamilyCode() {
        return familyCode;
    }

    public void setFamilyCode(String familyCode) {
        this.familyCode = familyCode;
    }

    public String getFamilyCOmName() {
        return familyCOmName;
    }

    public void setFamilyCOmName(String familyCOmName) {
        this.familyCOmName = familyCOmName;
    }

    public String getFamilySciName() {
        return familySciName;
    }

    public void setFamilySciName(String familySciName) {
        this.familySciName = familySciName;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "sciName='" + sciName + '\'' +
                ", comName='" + comName + '\'' +
                ", speciesCode='" + speciesCode + '\'' +
                ", category='" + category + '\'' +
                ", taxonOrder=" + taxonOrder +
                ", bandingCodes=" + Arrays.toString(bandingCodes) +
                ", comNameCodes=" + Arrays.toString(comNameCodes) +
                ", sciNameCodes=" + Arrays.toString(sciNameCodes) +
                ", order='" + order + '\'' +
                ", familyCode='" + familyCode + '\'' +
                ", familyCOmName='" + familyCOmName + '\'' +
                ", familySciName='" + familySciName + '\'' +
                '}';
    }
}
