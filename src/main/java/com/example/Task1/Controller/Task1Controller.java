package com.example.Task1.Controller;

import com.example.Task1.entity.CalcEntity;
import com.example.Task1.repo.Task1Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class Task1Controller {
    @Autowired
    Task1Repo task1Repo;
    @ResponseBody
    @RequestMapping("/calc")
    public int Calc(@RequestBody  CalcEntity calc)
    {
        String operator= calc.getOperator();
        int inp1= calc.getInp1();
        int inp2= calc.getInp2();
        int result= calc.getResult();
        if(operator.equals("+")){
            result=inp1+inp2;
        }
        if(operator.equals("-"))
        {
            result=inp1-inp2;
        }
        if(operator.equals("/")){
        result=inp1-inp2;
    }
        if(operator.equals("*")){
        result=inp1*inp2;
    }
        CalcEntity calculate=new CalcEntity(inp1,inp2,operator,result);

        task1Repo.save(calculate);
        return  result;

    }
   //   @RequestMapping
  //  public String home(){
    //    return "input";
      //}

}
