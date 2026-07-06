package test;

import bankApp.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
   private Account shukuratAccount;
   @BeforeEach
    public void setUp() {
      shukuratAccount = new Account();
    }
    @Test
    public void deposit200inEmptyAccount_BalanceIs200(){
       assertEquals(0, shukuratAccount.getBalance());
       shukuratAccount.deposit(200);
       assertEquals(200, shukuratAccount.getBalance());
    }
    @Test
    public void depositMinus50InEmptyAccount_BalanceIsZero(){
       assertEquals(0, shukuratAccount.getBalance());
       shukuratAccount.deposit(-50);
       assertEquals(0, shukuratAccount.getBalance());
    }

    @Test
    public void testAccountPin(){
       int pin = 1234;
       Account shukuratAccount = new Account();
     assertEquals(1234, shukuratAccount.accountPin(pin));
    }
    @Test
    public void withdraw50InEmptyAccount_BalanceIsZero(){
       assertEquals(0, shukuratAccount.getBalance());
       shukuratAccount.withdraw(50);
       assertEquals(0, shukuratAccount.getBalance());
    }
@Test
    public void withdraw200InAccount_BalanceIs500(){
       shukuratAccount.deposit(500);
       assertEquals(500, shukuratAccount.getBalance());
       shukuratAccount.withdraw(200);
       assertEquals(300, shukuratAccount.getBalance());

}

@Test
    public void withdraw500InAccountWithPin(){
       shukuratAccount.deposit(500);
       shukuratAccount.accountPin(1234);
       assertEquals(500, shukuratAccount.getBalance());
}
@Test
}
