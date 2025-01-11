package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
<<<<<<< HEAD
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","Sayan@123");
=======
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","AyushVish");
>>>>>>> 471959db23a560b752a60583527e6fb5f7d5e842
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
