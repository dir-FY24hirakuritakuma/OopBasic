package company;



public class Enginer extends Employee{
    String programmingLanguage;
    
    public Enginer(String name, Department department, String position,int employeedId, String programmnigLanguage) {
        super(name, department, position, employeedId);
        this.programmingLanguage = programmnigLanguage;
    }
    
    public void developSoftware() {
        System.out.println("ソフトウェアを開発します。名前：" + name + "、プログラミング言語：" + programmingLanguage);
        
    }
    
    @Override
    public void joinMeeting(){
    department.meeting();
    System.out.println("→技術的な準備を行い、上記の会議に参加します。名前：" + name);

} 
}
