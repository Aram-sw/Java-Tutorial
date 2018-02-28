/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userstatus;

import userstatus.User.Net;
import userstatus.User.WhoisRIR;

/**
 *
 * @author Administrator
 */

class User 
{
  public enum UserStatus {
    PENDING,
    ACTIVE,
    INACTIVE,
    DELETED;
}
  UserStatus user;
  
  public enum WhoisRIR {
    ARIN("whois.arin.net"),
    RIPE("whois.ripe.net"),
    APNIC("whois.apnic.net"),
    AFRINIC("whois.afrinic.net"),
    LACNIC("whois.lacnic.net"),
    JPNIC("whois.nic.ad.jp"),
    KRNIC("whois.nic.or.kr"),
    CNNIC("ipwhois.cnnic.cn"),
    UNKNOWN("");

    private String url;

    WhoisRIR(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
  
  public enum  Net {
  A(5),
  B(10),
  C(20);
  
  private Integer w;
  
  Net(Integer w)
  {
    this.w=w;
  }
  
  public Integer w(){
    return w;
  }
  
  }
}

public class UserStatus {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
        User u = new User();
        u.user = User.UserStatus.ACTIVE;
        System.out.println("Status :"+ u.user);
        
        System.out.println("Url :"+ WhoisRIR.ARIN.url());
        
        System.out.println("Price :"+ Net.A.w());
    }
    
}
