package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123" ;
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw+" :Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 : "+pw+"  : FAILED: Expected INVALID but got " + result1);
        }

        // Test case 2 : รหัสผ่านทั้งหมดเป็นตัวเลข  , ตัวอักษรทั้งหมดเป็นเล็ก , ทั้งหมดเป็นตัวใหญ่ จะ WEAK
           pw  = "123456789" ;
           PasswordStrength result2 = PasswordValidator.validate(pw);
           if (result2 == PasswordStrength.WEAK){
            System.out.println("Test Case 2 : "+pw+" : Passed : All Number password is WEAK.");
           }else {
            System.out.println("Test Case 2 : "+pw+" : FAILED : Expected INVALID but got"+result2);
           }


           pw = "orangejuice" ;
           PasswordStrength result3 =  PasswordValidator.validate(pw);
           if (result3 == PasswordStrength.WEAK){
            System.out.println("Test Case 3 : "+pw+" : Passed : All password Lowercase is WEAK.");
          } else {
            System.out.println("Test Case 3 : "+pw+" : FAILED : Expected INVALID but got"+result3);
          }

          pw = "ORANGEJUICE" ;
           PasswordStrength result4 =  PasswordValidator.validate(pw);
           if (result4 == PasswordStrength.WEAK){
            System.out.println("Test Case 4 : "+pw+" : Passed : All password UPPERcase is WEAK.");
          } else {
            System.out.println("Test Case 4 : "+pw+" : FAILED : Expected INVALID but got"+result4);
          }

        
         // Test Case 3 : รหัสทัั้งหมดเป็นตัวเลขและ ตัวเล็กหริอตัวใหญ่  จะ MEDIUM 
           pw = "orangejuice1234" ;
           PasswordStrength result5 =  PasswordValidator.validate(pw);
           if (result5 == PasswordStrength.MEDIUM){
            System.out.println("Test Case 5 : "+pw+" : Passed : All password Lowercase AND Number is MEDIUM.");
          } else {
            System.out.println("Test Case 5 : "+pw+" : FAILED : Expected INVALID but got"+result5);
          }

           pw = "ORANGEJUICE1234";
           PasswordStrength result6 =  PasswordValidator.validate(pw);
           if (result6 == PasswordStrength.MEDIUM){
            System.out.println("Test Case 6 : "+pw+" : Passed : All password UPPERcase AND Number is MEDIUM.");
          } else {
            System.out.println("Test Case 6 : "+pw+" : FAILED : Expected INVALID but got"+result6);
          }

          // Test Case 4 : รหัสทัั้งหมดเป็นตัวเลขและ ตัวเล็กและตัวใหญ่  จะ STRONG
          pw = "Orangejuce1234";
          PasswordStrength result7 =  PasswordValidator.validate(pw);
           if (result7 == PasswordStrength.STRONG){
            System.out.println("Test Case 7 : "+pw+" : Passed : All password UPPERcase Lowercase AND Number is STRONG.");
          } else {
            System.out.println("Test Case 7 : "+pw+" : FAILED : Expected INVALID but got"+result7);
          }
          
            
          






        
        
           


        // --- เขียน Test Case อื่นๆ ต่อ ---
       

        System.out.println("--------------------------------");
    }
}
