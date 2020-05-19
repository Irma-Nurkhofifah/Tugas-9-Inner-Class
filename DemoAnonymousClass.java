package anonymous_class;

/*nama : Irma Nurkhofifah M.
Stb  : 13020180096
kelas: B2
waktu : Jumat, 15 Mei 2020
 */
public class DemoAnonymousClass {
  public static void main(String[] args){
    Thread anonymous = new Thread(){
      @Override
      public void run(){
        System.out.println("This is example anonymous class in Java");
      }
    };
    anonymous.start();
  }
}
