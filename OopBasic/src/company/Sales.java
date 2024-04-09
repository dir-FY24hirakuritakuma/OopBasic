package company;

public class Sales extends Employee{
    //コンストラクター
    public Sales(String name, Department department, String position, int emeployeeId) {
        super(name, department, position, emeployeeId);
    }

    //会議に参加するメソッド
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("" + department.getName() + "" + name);
    }
}
