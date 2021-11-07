package smartcity.AttributeClass;

import java.util.ArrayList;
import java.util.List;

public class Resident extends Person{
    private String residentID;
    private String residentApartmentNumber;
    private String residentBeginDay;
    List<Resident> ListResident=new ArrayList<>();

    public Resident(String personName, String personGender, String personBirthday,
                    String personHomeTown, String personIC, String personJob, String personPhoneNumber,
                    String residentID, String residentApartmentNumber, String residentBeginDay) {
        super(personName, personGender, personBirthday, personHomeTown, personIC,
                personJob, personPhoneNumber);

        this.residentID = residentID;
        this.residentApartmentNumber = residentApartmentNumber;
        this.residentBeginDay = residentBeginDay;
    }

    public Resident() {
        ListResident.add(new Resident("Nguyen Van A", "Nam","12/11/2001","Ha Noi",
                "1234745478","Công an","012256789", "Ab1234","Ada1236764", "12/10/2020"));

        ListResident.add(new Resident("Nguyen Van Nghiem", "Nam","12/11/2001","Ha Noi",
                "1235678","Công an","063632312", "Ab1234","Ada12356564", "12/10/2020"));
        ListResident.add(new Resident("Nguyen Thi B", "Nu","12/11/2001","Ha Noi",
                "12347578","Công an","01245356789", "Ab1234","Ada1544564", "12/10/2020"));
        ListResident.add(new Resident("Nguyen Van B", "Nam","01/01/2001","Ha Noi",
                "12345778","Công an","0123456789", "Ab1234","Ada156574564", "12/10/2020"));
    }
    public String getResidentID() {
        return residentID;
    }

    public void setResidentID(String residentID) {
        this.residentID = residentID;
    }

    public String getResidentApartmentNumber() {
        return residentApartmentNumber;
    }

    public void setResidentApartmentNumber(String residentApartmentNumber) {
        this.residentApartmentNumber = residentApartmentNumber;
    }

    public String getResidentBeginDay() {
        return residentBeginDay;
    }

    public void setResidentBeginDay(String residentBeginDay) {
        this.residentBeginDay = residentBeginDay;
    }
    // tim kiem chua
    public boolean SearchByName(String name, Resident r){
        if(r.getPersonName().contains(name)) {
            return true;
        }
        return false;
    }
    //tim kiem chinh xac
    public boolean SearchByID(String ID, Resident r){
        if(r.getResidentID().equals(ID))
            return true;
        return false;
    }
    //tim kiem chinh xac
    public boolean SearchByApartment(String ApartmentNumber, Resident r){
        if(r.getResidentApartmentNumber().equals(ApartmentNumber))
            return true;
        return false;
    }
    //tim kiem chinh xac
    public boolean SearchByIC(String IC, Resident r){
        if(r.getPersonIC().equals(IC))
            return true;
        return false;
    }
    //tim kiem khong chinh xac so dien thoai
    public boolean SearchByPhoneNumber(String PhoneNumber, Resident r){
        if(r.getPersonPhoneNumber().contains(PhoneNumber))
            return true;
        return false;
    }

    public ArrayList<Resident> SearchResident(String name, String ID, String ApartmentNumber,
                                              String IC, String PhoneNumber){
        ArrayList<Resident> list= new ArrayList<>();
        for(Resident r: ListResident){
            if((name==""||SearchByName(name, r))&&(ID==""||SearchByID(ID, r))&&(ApartmentNumber==""||SearchByApartment(ApartmentNumber, r))&&
                    (IC==""||SearchByIC(IC, r))&&(PhoneNumber==""||SearchByPhoneNumber(PhoneNumber, r))){
                list.add(r);
            }
        }
        return list;
    }

    /*
    Tìm kiếm:
        ------ comment đầy đủ khi code ------
        Tên -> tìm kiếm có trong
        ID  -> chính xác
        Số căn hộ -> chính xác
        CMND -> chính xác
        SỐ ĐT -> chính xác
    Thêm
        Kiểm tra các thuộc tính có bị trùng + Dữ liệu đầu vào
        Tất cả các thuộc tính

    */
}