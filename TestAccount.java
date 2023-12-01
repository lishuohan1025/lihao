package com.hspedu.encap;

public class TestAccount {
    public static void main(String[] args){
        Account account = new Account();
        account.setPwd("123456");
        account.setName("lishimisi");
        account.setBalance(60);
        account.showInfo();
    }
}
