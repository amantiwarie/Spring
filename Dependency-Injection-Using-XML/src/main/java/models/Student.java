package models;


public class Student {
    String name;
    int rollNo;
    Address address;

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void display(){
        System.out.print("Name" +name +"\n"
                         +"RollNo"+rollNo +"\n"
                           +"Address"+address.toString() );
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + ", address=" + address + "}";
    }
}
