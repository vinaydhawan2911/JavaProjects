package firstproject;

import firstproject.Helpers.HashTest;
import firstproject.Helpers.MainFrame;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        MainFrame mainFrame = new MainFrame();
        mainFrame.init();

        //HashTests Example
        HashTest hashtest = new HashTest();

        hashtest.test01();

    }
}
