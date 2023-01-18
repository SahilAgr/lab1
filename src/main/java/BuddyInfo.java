public class BuddyInfo {
    public static String name;
    public static String address;
    public static String phoneNum;

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        BuddyInfo.address = address;
    }

    public BuddyInfo(String name, String address, String phoneNum) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}