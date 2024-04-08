package Ex_0408;

class Boiler{
    private int temp; //현재온도

    public void setTemp(int temp){ //setter
        this.temp=temp;
    }
    public int getTemp(){ //getter
        return temp;
    }

    public Boiler(){
        temp=0;
    }
    public Boiler(int temp){
        this.temp=temp;
    }
    public int tempUp(){
        return ++temp;
    }
    public int tempDown() {
        return --temp;
    }
    public int tempUpDown(int temp){
        return this.temp+=temp;
    }

}
public class BoilerTest {
    public static void main(String[] args) {

        Boiler t1=new Boiler();
        System.out.println("T1의 현재온도="+t1.getTemp()+"도");
        t1.setTemp(1);
        System.out.println("T1의 현재온도="+t1.getTemp()+"도");

       /* Boiler t2 = new Boiler(10);
        System.out.println("T2의 현재온도="+t2.temp+"도");
        System.out.println("T2의 현재온도="+t2.tempUpDown(10)+"도");
*/
    }
}


