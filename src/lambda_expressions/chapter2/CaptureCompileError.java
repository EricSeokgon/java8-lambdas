package lambda_expressions.chapter2;

import javax.swing.*;

/**
 * Project: java8-lambdas
 * FileName: CaptureCompileError
 * Date: 2016-07-21
 * Time: 오전 8:37
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class CaptureCompileError {
    private JButton button;

    public void error() {
        String name = getUserName();
        name = formatUserName(name);
        // Uncommenting this line should cause a compile error:
        // button.addActionListener(event -> System.out.println("hi " + name));
    }

    private String formatUserName(String name) {
        return name.toLowerCase();
    }

    private String getUserName() {
        return "RICHARD";
    }
}
