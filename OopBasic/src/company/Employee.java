package company;

public class Employee {
        String name;
        String department;
        String position;
        int employeeID;
        
        public Employee(String name, String department, String position,int employeeID) { 
            this.name = name;
            this.department = department;
            this.position = position;
            this.employeeID = employeeID;
            
            // TODO 自動生成されたコンストラクター・スタブ
        }
        
        public void report(int times) {
            System.out.println(times + "回目の報告をします。役職：" + position + "名前" + name);
        }
        
        public void report() {
            report(1);
        }

}
