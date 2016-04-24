package com.sample.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.function.*;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    interface Person{

        int getAge();
    }

    public void init(){

        System.out.println("Hello Lambda");


        // master comment check on master check differences

        Comparator<String> comparator2 = (String s1, String s2) -> Integer.compare(s2.length(), s1.length());
        Runnable r = () -> {
            int i = 0;
            while(i++ < 10){
                System.out.println("It works");
            }
        };	// end Runnable

        Person p = () -> {
            return 8;
        };

//        Consumer<String> printer = s -> System.out.println(s);

    } // end method init()

    public void printBranchName(String branchName){

            Toast.makeText(this, "This is the new branch: ".concat(branchName) , Toast.LENGTH_LONG).show();
    } // end method printBrachName

    public void builderBranch(){
        
    }
}
