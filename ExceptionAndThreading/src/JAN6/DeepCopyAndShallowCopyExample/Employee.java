package JAN6.DeepCopyAndShallowCopyExample;

public class Employee implements Cloneable{
    private int id;
    private String name;
    private String company_name;
//    private Address address;  // remove for primitive

    public Employee(int id, String name, String company_name) { //, Address address) // remove for primitive
        super();
        this.id = id;
        this.name = name;
        this.company_name = company_name;
      //  this.address = address;   // remove for primitive
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company_name='" + company_name + '\'' +
              //  ", address=" + address + // remove for primitive
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException { //this is for deep copy;
        Employee emp =(Employee) super.clone();
     //   emp.setAddress((Address) address.clone()); // remove for primitive
        return emp;
//        return super.clone();
    }
//     @Override
//   protected Object clone() throws CloneNotSupportedException { //this is for shallow copy;
//
//      return super.clone();
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

  /*  public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/
}
