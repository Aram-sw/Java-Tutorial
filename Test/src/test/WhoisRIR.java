/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Alaa-sw
 * 27.02.2018
 */

public enum WhoisRIR 
{
    ARIN("whois.arin.net"),
    RIPE("whois.ripe.net"),
    APNIC("whois.apnic.net"),
    AFRINIC("whois.afrinic.net"),
    LACNIC("whois.lacnic.net"),
    JPNIC("whois.nic.ad.jp"),
    KRNIC("whois.nic.or.kr"),
    CNNIC("ipwhois.cnnic.cn"),
    UNKNOWN("");
    
    private final String url;
    
    WhoisRIR(String url)
    {
       this.url=url;
    }
    
    public String url()
    {
        return url;
    }
    
}

