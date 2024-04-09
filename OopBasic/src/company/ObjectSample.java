package company;

public class ObjectSample {

    public static void main(String[] args) {
        //インスタンスの作成
        
        var department = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100);
        
        //インスタンスメソッドの呼び出し
       employee.report();
        employee.report(2);
        employee.joinMeeting();
       
        
        //一行開ける
        System.out.println("");
        
        //インスタンスの作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Enginer("田中", devDepartment, "一般社員", 88,"Java");
        
        //インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        //一行開ける
        System.out.println("");
        
        //ポリモーフィズムの確認
        Employee projectMnager = new Enginer("佐藤", devDepartment, "PM", 99, "Java");
        
        //インスタンスメソッドの呼び出し
        projectMnager.report();
        projectMnager.joinMeeting();
        if (projectMnager instanceof Enginer) {
            ((Enginer) projectMnager).developSoftware();
            
         //追記
         System.out.println("");
         
         var parttimeWorker = new ParttimeWorker("太田", department);
         
         ((Workable) employee).work();
         ((Workable) engineer).work();
         ((Workable) projectMnager).work();
         ((Workable) parttimeWorker).work();
            
        }
        
        

}
}
