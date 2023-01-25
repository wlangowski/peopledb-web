package pl.wojciechlangowski.peopledbweb.web.model;

public class LemProductStatistics {


    private int givenHourlyRate;
    private int suggestedHourlyRate;
    private int givenTactTime;
    private int suggestedTactTime;
    private int xlsxTactTime;
    private int cleanRoomTime;
    private boolean automatic;
    private String _id;
    private String partNumber;
    private int __v;

    public LemProductStatistics() {
    }

    public LemProductStatistics(int givenHourlyRate, int suggestedHourlyRate, int givenTactTime, int suggestedTactTime, int xlsxTactTime, int cleanRoomTime, boolean automatic, String _id, String partNumber, int __v) {
        this.givenHourlyRate = givenHourlyRate;
        this.suggestedHourlyRate = suggestedHourlyRate;
        this.givenTactTime = givenTactTime;
        this.suggestedTactTime = suggestedTactTime;
        this.xlsxTactTime = xlsxTactTime;
        this.cleanRoomTime = cleanRoomTime;
        this.automatic = automatic;
        this._id = _id;
        this.partNumber = partNumber;
        this.__v = __v;
    }

    public int getGivenHourlyRate() {
        return givenHourlyRate;
    }

    public int getSuggestedHourlyRate() {
        return suggestedHourlyRate;
    }

    public int getGivenTactTime() {
        return givenTactTime;
    }

    public int getSuggestedTactTime() {
        return suggestedTactTime;
    }

    public int getXlsxTactTime() {
        return xlsxTactTime;
    }

    public int getCleanRoomTime() {
        return cleanRoomTime;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public String get_id() {
        return _id;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public int get__v() {
        return __v;
    }

    @Override
    public String toString() {
        return "LemProductStatistics{" +
                "givenHourlyRate=" + givenHourlyRate +
                ", suggestedHourlyRate=" + suggestedHourlyRate +
                ", givenTactTime=" + givenTactTime +
                ", suggestedTactTime=" + suggestedTactTime +
                ", xlsxTactTime=" + xlsxTactTime +
                ", cleanRoomTime=" + cleanRoomTime +
                ", automatic=" + automatic +
                ", _id='" + _id + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", __v=" + __v +
                '}';
    }
}



