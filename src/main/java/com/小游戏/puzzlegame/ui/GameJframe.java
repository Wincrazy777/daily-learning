package com.小游戏.puzzlegame.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJframe extends JFrame implements KeyListener, ActionListener {
    //创建一个二维数组
    //用来管理数据
    //加载图片的时候，会根据二维数组的数据进行加载
    int[][] data = new int[4][4];

    //记录空白方块的位置
    int x = 0;
    int y = 0;

    //定义一个二维数组，存储正确的数据。
    int[][] win = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,0}
    };

    //定义变量用来统计步数
    int step = 0;

    //创建条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reloginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accoutItem = new JMenuItem("彩蛋");
    //创建更换图片
    JMenu changeImage = new JMenu("更换图片");
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");
    //定义一个变量，记录当前展示图片的路径
    String imagePath = "puzzlegame/image/animal\\animal3\\";



    //游戏主界面
    public GameJframe() {
        this.setSize(603, 680);
        this.setTitle("拼图 v1.0");
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initData();

        //初始化图片
        initImage();

        this.setVisible(true);
    }

    private void initData() {
        //1.打乱
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        //给二维数组添加数据
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i/4;
                y = i%4;
            }
            data[i/4][i%4] = tempArr[i];
        }
    }

    //初始化图片
    //添加图片的时候，需要二维数组中管理的数据添加图片
    private void initImage() {
        //清空版本已经出现的所有图片
        this.getContentPane().removeAll();
        if (victory()){
            //如果返回ture
            JLabel winJLbael = new JLabel(new ImageIcon("puzzlegame/image/win.png"));
            winJLbael.setBounds(203,283,197,73);
            this.getContentPane().add(winJLbael);
        }

        JLabel stepcount = new JLabel("步数："+step);
        stepcount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepcount);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //获取当前要加载的图片编号
                int number = data[i][j];
                JLabel jLabel1 = new JLabel(new ImageIcon(imagePath+number+".jpg"));
                jLabel1.setBounds(105 * j + 83, 105 * i +134, 105, 105);
                //给图片添加边框
                jLabel1.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jLabel1);
            }
        }


        //创建一个图片ImageIcon的对象
        //ImageIcon icon1 = new ImageIcon("C:\\Users\\wincrazy\\IdeaProjects\\oop-interface\\puzzlegame/image/animal\\animal3\\1.jpg");
        //创建一个JLabel的对象（管理容器）
        //JLabel jLabel1 = new JLabel(new ImageIcon("C:\\Users\\wincrazy\\IdeaProjects\\oop-interface\\puzzlegame/image/animal\\animal3\\1.jpg"));
        //指定图片位置
        //jLabel1.setBounds(0, 0, 105, 105);
        //吧管理容器添加到界面中
        //this.add(jLabel1);
        //this.getContentPane().add(jLabel1);
        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzlegame/image/background.png"));
        background.setBounds(40,40,500,560);
        //把背景图片添加到界面中
        this.getContentPane().add(background);

        //刷新界面
        this.getContentPane().repaint();


    }

    private void initJMenuBar() {
        //初始化菜单
        JMenuBar jMenuBar = new JMenuBar();
        //创建选项
        JMenu funcionJmenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于我们");


        //4.把美女，动物，运动添加到更换图片中
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        //5.将条目添加到菜单中
        funcionJmenu.add(changeImage);
        funcionJmenu.add(replayItem);
        funcionJmenu.add(reloginItem);
        funcionJmenu.add(closeItem);

        aboutJmenu.add(accoutItem);

        //6.把功能，关于我们添加到JMenuBar当中
        jMenuBar.add(funcionJmenu);
        jMenuBar.add(aboutJmenu);

        //7.把整个菜单JMenuBar添加到整个页面中中
        this.setJMenuBar(jMenuBar);





        //给条目绑定事件
        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accoutItem.addActionListener(this);

        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);




        //将菜单添加到菜单栏中
        jMenuBar.add(funcionJmenu);
        jMenuBar.add(aboutJmenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消居中放置
        this.setLayout(null);
        //给界面增加键盘监听事件
        this.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        System.out.println(code);
        if (code == 84){
            //把界面中所有图片全部删除
            this.getContentPane().removeAll();
            //加载一张完整的图片
            JLabel all = new JLabel(new ImageIcon(imagePath+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //添加背景图片
            JLabel background = new JLabel(new ImageIcon("puzzlegame/image/background.png"));
            background.setBounds(40,40,500,560);
            //把背景图片添加到界面中
            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        //判断游戏是否胜利，如果胜利，此方法直接结束，不要继续执行下面的代码
        if (victory()){
            // 结束方法
            return;
        }




        //对上下左右进行判断
        //左37，上38.右39，下40
        if (code == 37 || code == 65) {
            System.out.println("向左移动");
            if (y == 3){
                //空白方块已经再最下方了，下面已经没有办法移动了
                return;
            }
            data[x][y] = data[x][y+1];
            data[x][y+1] = 0;
            y++;
            //计数器自增
            step++;
            //调用方法安最新的数字加载图片
            initImage();
        }else if (code == 38 || code == 87) {
            System.out.println("向上移动");
            if (x == 3){
                return;
            }
            data[x][y] = data[x+1][y];
            data[x+1][y] = 0;
            x++;
            step++;
            //调用方法安最新的数字加载图片
            initImage();
        }else if (code == 39 || code == 68) {
            System.out.println("向右移动");
            if (y == 0){
                return;
            }
            data[x][y] = data[x][y-1];
            data[x][y-1]=0 ;
            y--;
            step++;
            //调用方法安最新的数字加载图片
            initImage();
        }else if (code == 40 || code == 83) {
            System.out.println("向下移动");
            if (x == 0){
                return;
            }
            data[x][y] = data[x-1][y];
            data[x-1][y] = 0;
            x--;
            step++;
            //调用方法安最新的数字加载图片
            initImage();
        }else if (code == 84) {
            initImage();
        } else if (code ==109) {
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            initImage();
        }
    }

    //判断data数组中的数据
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            //i:表示data索引
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]){
                    //只要有一个不一样都返回false
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前被点击的条目对象
        Object obj = e.getSource();
        if (obj == replayItem){
            System.out.println("重新游戏");

            //计步器清零
            step = 0;
            //打乱
            initData();
            //重新加载图片
            initImage();



        }else if (obj == reloginItem){
            System.out.println("重新登录");
            //关闭当前游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFarme();


        }else if (obj == closeItem){
            System.out.println("关闭游戏");
            //关闭虚拟机
            System.exit(0);


        }else if (obj == accoutItem){
            System.out.println("彩蛋");

            //创建一个弹窗对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("puzzlegame/image/kk.png"));
            //设置图片的位置
            jLabel.setBounds(0,0,258,258);
            //把图片添加到弹窗中
            jDialog.getContentPane().add(jLabel);
            //设置弹窗的大小
            jDialog.setSize(344,344);
            //设置弹窗标题
            jDialog.setTitle("彩蛋");
            //设置弹窗置顶
            jDialog.setAlwaysOnTop(true);
            //设置弹窗居中
            jDialog.setLocationRelativeTo(null);
            //弹窗不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //弹窗显示
            jDialog.setVisible(true);
        } else if (obj == girl) {
            System.out.println("切换到美女图片");
            Random random = new Random();
            int choice = random.nextInt(13);
            switch (choice){
                case 0:
                    imagePath = "puzzlegame/image/girl\\girl1\\";
                    break;
                case 1:
                    imagePath = "puzzlegame/image/girl\\girl2\\";
                    break;
                case 2:
                    imagePath = "puzzlegame/image/girl\\girl3\\";
                    break;
                case 3:
                    imagePath = "puzzlegame/image/girl\\girl4\\";
                    break;
                case 4:
                    imagePath = "puzzlegame/image/girl\\girl5\\";
                    break;
                case 5:
                    imagePath = "puzzlegame/image/girl\\girl6\\";
                    break;
                case 6:
                    imagePath = "puzzlegame/image/girl\\girl7\\";
                    break;
                case 7:
                    imagePath = "puzzlegame/image/girl\\girl8\\";
                    break;
                case 8:
                    imagePath = "puzzlegame/image/girl\\girl9\\";
                    break;
                case 9:
                    imagePath = "puzzlegame/image/girl\\girl10\\";
                    break;
                case 10:
                    imagePath = "puzzlegame/image/girl\\girl11\\";
                    break;
                case 11:
                    imagePath = "puzzlegame/image/girl\\girl12\\";
                    break;
                case 12:
                    imagePath = "puzzlegame/image/girl\\girl13\\";
                    break;
            }
            initData();
            initImage();
        } else if (obj == animal) {
            System.out.println("切换为动物图片");
            Random random = new Random();
            int choice = random.nextInt(13);
            switch (choice){
                case 0:
                    imagePath = "puzzlegame/image/animal\\animal1\\";
                    break;
                case 1:
                    imagePath = "puzzlegame/image/animal\\animal2\\";
                    break;
                case 2:
                    imagePath = "puzzlegame/image/animal\\animal3\\";
                    break;
                case 3:
                    imagePath = "puzzlegame/image/animal\\animal4\\";
                    break;
                case 4:
                    imagePath = "puzzlegame/image/animal\\animal5\\";
                    break;
                case 5:
                    imagePath = "puzzlegame/image/animal\\animal6\\";
                    break;
                case 6:
                    imagePath = "puzzlegame/image/animal\\animal7\\";
                    break;
                case 7:
                    imagePath = "puzzlegame/image/animal\\animal8\\";
                    break;
                case 8:
                    imagePath = "puzzlegame/image/animal\\animal9\\";
                    break;
                case 9:
                    imagePath = "puzzlegame/image/animal\\animal10\\";
                    break;
                case 10:
                    imagePath = "puzzlegame/image/animal\\animal11\\";
                    break;
                case 11:
                    imagePath = "puzzlegame/image/animal\\animal12\\";
                    break;
                case 12:
                    imagePath = "puzzlegame/image/animal\\animal13\\";
                    break;
            }
            initData();
            initImage();
        }else if (obj == sport) {
            System.out.println("切换为运动图片");
            Random random = new Random();
            int choice = random.nextInt(13);
            switch (choice){
                case 0:
                    imagePath = "puzzlegame/image/sport\\sport1\\";
                    break;
                case 1:
                    imagePath = "puzzlegame/image/sport\\sport2\\";
                    break;
                case 2:
                    imagePath = "puzzlegame/image/sport\\sport3\\";
                    break;
                case 3:
                    imagePath = "puzzlegame/image/sport\\sport4\\";
                    break;
                case 4:
                    imagePath = "puzzlegame/image/sport\\sport5\\";
                    break;
                case 5:
                    imagePath = "puzzlegame/image/sport\\sport6\\";
                    break;
                case 6:
                    imagePath = "puzzlegame/image/sport\\sport7\\";
                    break;
                case 7:
                    imagePath = "puzzlegame/image/sport\\sport8\\";
                    break;
                case 8:
                    imagePath = "puzzlegame/image/sport\\sport9\\";
                    break;
                case 9:
                    imagePath = "puzzlegame/image/sport\\sport10\\";
                    break;
                case 10:
                    imagePath = "puzzlegame/image/sport\\sport11\\";
                    break;
                case 11:
                    imagePath = "puzzlegame/image/sport\\sport12\\";
                    break;
                case 12:
                    imagePath = "puzzlegame/image/sport\\sport13\\";
                    break;
            }
            initData(); // 重新初始化数据
            initImage(); // 重新加载图片
        }
    }
}
