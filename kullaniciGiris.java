import java.util.Scanner;


public class kullaniciGiris {
    public static void main(String[] args) {

        String userName, password, newPassword;

        Scanner imp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = imp.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        password = imp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı");

            //Şifrenin yanlış olduğu durum
        }else if ((userName.equals("patika")) && !(password.equals("java123"))){
            System.out.println("Hatalı şifre\nŞifre değişikliği yapmak istermisiniz\n1-Evet\n2-Hayır");
            newPassword = imp.nextLine();

            if(newPassword.equals("1")){
                System.out.println("Yeni şifrenizi giriniz (Eskisi ile aynı olmamasına dikkat ediniz) : ");
                newPassword =imp.nextLine();

                if (!newPassword.equals("java123")){
                    System.out.println("Tebrikler şifrenizi başarılı bir şekilde değiştirdiniz");
                }else{
                    System.out.println("Şifreniz eskisiyle aynı olamaz");
                }
            }else if (newPassword.equals("2")){
                System.out.println("Kullanıcı giriş sayfasından ayrılıyorsunuz");
            }

        }
    }
}