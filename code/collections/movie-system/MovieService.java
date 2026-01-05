package com.itheima.chap01.demo8test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieService {
    // 4. 准备一个集合容器，存储全部上架的电影数据
    private static List<Movie> movies = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            // 3. 准备操作界面：GUI界面/cmd命令界面
            System.out.println("====电影信息操作系统====");
            System.out.println("1. 上架");
            System.out.println("2. 下架某个电影");
            System.out.println("3. 查询某个电影");
            System.out.println("4. 封杀某个明星");
            System.out.println("5. 退出");
            System.out.println("6. 显示所有电影");
            System.out.println("7. 修改某个电影");
            System.out.println("请您输入操作命令：");
            String command = sc.next();
            switch (command) {
                case "1":
                    // 上架：独立功能独立成方法
                    addMovie();
                    break;
                case "2":
                    // 下架某个电影
                    removeMovie();
                    break;
                case "3":
                    // 查询某个电影
                    queryMovie();
                    break;
                case "4":
                    // 封杀某个明星
                    deleteStar();
                    break;
                case "5":
                    System.out.println("退出成功！");
                    return;
                case "6":
                    // 显示所有电影
                    queryAllMovies();
                    break;
                case "7":
                    // 修改某个电影
                    updateMovie();
                    break;
                default:
                    System.out.println("输入的命令有误，请重新输入！");
            }
        }
    }

    /**
     * 修改某个电影
     */
    private void updateMovie() {
        System.out.println("====修改电影====");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                // 呈现电影信息
                System.out.println(movie.getName() + " " + movie.getActor() + " " + movie.getPrice() + " " + movie.getScore());
                // 修改电影信息，输入1,2,3,4，修改对应的数据
                // 添加死循环
                while (true) {
                    System.out.println("请选择修改的数据：");
                    System.out.println("1. 修改电影名称");
                    System.out.println("2. 修改主演");
                    System.out.println("3. 修改价格");
                    System.out.println("4. 修改评分");
                    System.out.println("5. 修改完成，返回上一环节");
                    int index = sc.nextInt();
                    switch (index) {
                        case 1:
                            System.out.println("请输入新的电影名称：");
                            movie.setName(sc.next());
                            break;
                        case 2:
                            System.out.println("请输入新的主演：");
                            movie.setActor(sc.next());
                            break;
                        case 3:
                           System.out.println("请输入新的价格：");
                           movie.setPrice(sc.nextDouble());
                           break;
                        case 4:
                           System.out.println("请输入新的评分：");
                           movie.setScore(sc.nextDouble());
                           break;
                        case 5:
                           System.out.println("结束修改");
                           return;
                    default:
                    }
                    System.out.println("修改成功！");
                }
            }
        }
    }

    /**
     * 显示所有电影
     */
    private void queryAllMovies() {
        System.out.println("====展示所有电影====");
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " " + movie.getActor() + " " + movie.getPrice() + " " + movie.getScore());
        }
    }

    /**
     * 封杀某个明星
     */

    private void deleteStar() {
        System.out.println("====封杀明星====");
        System.out.println("请输入明星名称：");
        String star = sc.next();

        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (movie.getActor().contains(star)) {
                movies.remove(movie);
                System.out.println("封杀成功！");
                i--;
            }
        }
        // 展示全部电影
        queryAllMovies();
    }

    /**
     * 根据电影名称下架电影
     */

    private void removeMovie() {
        System.out.println("====下架电影====");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            movies.remove(movie);
            System.out.println("下架成功！");
        } else {
            System.out.println("没有找到该电影！");
        }
    }

    /**
     * 根据电影名称查询某部电影对象展示出来
     */
    private void queryMovie() {
        System.out.println("====查询电影====");
        System.out.println("请输入电影名称：");
        String name = sc.next();
        // 根据电影名称查询电影对象返回，展示这个对象数据
        Movie movie = queryMovieByName(name);
        if (movie != null) {
            System.out.println(movie.getName() + " " + movie.getActor() + " " + movie.getPrice() + " " + movie.getScore());
        } else {
            System.out.println("没有找到该电影！");
        }
    }

    // 根据电影名称查询电影对象返回
    private Movie queryMovieByName(String name) {
        for (Movie movie : movies) {
            if (movie.getName().equals(name)) {
                return movie;  // 找到这个电影对象
            }
        }
        return null;  // 没有找到这个电影对象
    }

    /**
     * 上架电影
     */

    private void addMovie() {
        System.out.println("====上架电影====");
        // 分析：每点击一次上架电影，其实就是新增一部电影。每部电影是一个电影对象封装数据。
        // 1. 创建电影对象，封装这部电影信息
        Movie movie = new Movie();

        // 2. 给电影对象注入数据
        System.out.println("请输入电影名称：");
        movie.setName(sc.next());
        System.out.println("请输入电影主演：");
        movie.setActor(sc.next());
        System.out.println("请输入电影价格：");
        movie.setPrice(sc.nextDouble());
        System.out.println("请输入电影评分：");
        movie.setScore(sc.nextDouble());

        // 3. 把电影对象添加到集合中
        movies.add(movie);
        System.out.println("上架成功！");
    }
}
