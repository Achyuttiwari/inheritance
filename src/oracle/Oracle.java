//single inheritance in java
package oracle;

public class Oracle extends SM {
    void dbms()
    {
        System.out.println("sql..");
    }

    public static void main(String[] args) {
        Oracle obj = new Oracle();
        obj.dbms();
        obj.java();
    }

}
class SM{
    void java()
    {
        System.out.println("java program..");
    }
}
