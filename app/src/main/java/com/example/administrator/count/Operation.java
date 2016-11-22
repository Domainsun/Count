package com.example.administrator.count;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/22.
 */
public class Operation {


    public ArrayList<String> fenge(String s) {

        ArrayList<String> arrayList = new ArrayList<String>();
        int begin = 0;
        int i = 0;
        for (i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '+' || c == '-' || c == '*' || c == '/') {
                arrayList.add(s.substring(begin, i));
                arrayList.add(c + "");
                begin = i + 1;

            }

        }
        arrayList.add(s.substring(begin, i));
        return arrayList;
    }




    public double muldiv(ArrayList<String> arrayslist) {

        ArrayList<String> list = new ArrayList<String>();

        Double sum = null;

        for (int i = 1; i < arrayslist.size(); i += 2) {

            switch (arrayslist.get(i)) {
                case "+":
                    if (sum == null) {
                        list.add(arrayslist.get(i - 1));
                        list.add(arrayslist.get(i));
                    } else if (sum != null) {
                        list.add(sum + "");
                        list.add(arrayslist.get(i));
                        sum = null;
                    }

                    break;
                case "-":
                    if (sum == null) {
                        list.add(arrayslist.get(i - 1));
                        list.add(arrayslist.get(i));
                    } else if (sum != null) {
                        list.add(sum + "");
                        list.add(arrayslist.get(i));
                        sum = null;
                    }
                    break;

                case "*":
                    if (sum == null) {

                        sum = Double.parseDouble(arrayslist.get(i - 1)) * Double.parseDouble(arrayslist.get(i + 1));
                        // list.add(sum);

                    } else if (sum != null) {
                        sum = sum * Double.parseDouble(arrayslist.get(i + 1));
                        // int j=list.size()-1;
                        // list.remove(j);
                        // list.add(sum);
                    }

                    break;
                case "/":

                    if (sum == null) {

                        sum = Double.parseDouble((String) arrayslist.get(i - 1))
                                / Double.parseDouble((String) arrayslist.get(i + 1));
                        // list.add(sum);

                    } else if (sum != null) {
                        sum = sum / Double.parseDouble((String) arrayslist.get(i + 1));
                        // int j=list.size()-1;
                        // list.remove(j);
                        // list.add(sum);
                    }

                    break;

                default:
                    System.out.println("请输入 + - * /");
                    System.out.println("程序退出");
                    System.exit(0);
                    break;
            }

            if (i == arrayslist.size() - 2) {
                if (sum != null) {
                    list.add(sum + "");
                } else if (sum == null) {
                    // list.add(arrayslist.get(i));
                    list.add(arrayslist.get(i + 1));
                }
            }
        }

        // 4 + 4

        System.out.println("乘除后:" + list);

        Double sum1 = Double.parseDouble((String) list.get(0));

        for (int i = 1; i < list.size(); i += 2) {

            if ("+".equals(list.get(i))) {
                sum1 = sum1 + Double.parseDouble(list.get(i + 1));

            } else if ("-".equals(list.get(i))) {
                sum1 -= Double.parseDouble((String) list.get(i + 1));
            }
        }

        System.out.println(sum1);

        return sum1;
    }





}

