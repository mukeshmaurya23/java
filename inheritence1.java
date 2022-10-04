class account{
    private String accountNo;
    private String name;
    private String Address;
    private String phoneNo;
    private String DOB;

    public String getAccount(){
        return accountNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return Address;
    }
    public String setAddress(String Address){
        return this.Address=Address;
    }
    public String getDob(){
        return DOB;
    }
    
    public String getPhoneNo() {
        return phoneNo;
    }
    public String setPhone(String phoneNo){
        return this.phoneNo= phoneNo;
    }

    public account(String accountNo,String phoneNo,String name,String Address,String DOB){
            this.accountNo=accountNo;
            this.phoneNo=phoneNo;
            this.name=name;
            this.Address=Address;
            this.DOB=DOB;
    }

}
class savingAccount extends account{
    super()

}
class loanAccount extends account{

}

public class inheritence1 {
    public static void main(String[] args) {
        
    }
}
