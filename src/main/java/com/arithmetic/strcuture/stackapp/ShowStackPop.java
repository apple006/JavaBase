package com.arithmetic.strcuture.stackapp;

import com.arithmetic.strcuture.stacks.LinkStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by https://github.com/kuangcp on 17-8-22  下午3:02
 * TODO 对进栈的数据  输出所有的出栈结果
 */
public class ShowStackPop {
    private LinkStack datas = new LinkStack();
    private LinkStack status = new LinkStack();
    private static List<String> results = new ArrayList<>();

    public void init(){
        for(int i=0;i<6;i++){
            datas.push(i);
        }
    }

    public void deal(String temp){
        if(!this.status.isEmpty()){
            temp += status.pop();
            deal(new String(temp));
        }
        if(!this.datas.isEmpty()){
            status.push(this.datas.pop());
            deal(new String(temp));
        }
        if (status.isEmpty()){
            results.add(temp.toString());
        }

    }

    public static void main(String[]s){
        ShowStackPop pops = new ShowStackPop();
        pops.init();
        pops.deal("");
        for(String line : results){
            System.out.println(line);
        }
    }
}
